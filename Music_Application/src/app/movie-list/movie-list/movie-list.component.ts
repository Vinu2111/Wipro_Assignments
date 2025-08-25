import { Component } from '@angular/core';

import { MaterialModule } from '../../material/material.module';
import { Movie } from '../../movie/movie.module';
import { MovieCardComponent } from "../../movie-card/movie-card/movie-card.component";
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-movie-list',
   imports: [MaterialModule, MovieCardComponent,FormsModule],
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent {
  genres: string[] = ['All', 'Action', 'Comedy', 'Drama', 'Sci-Fi'];

  selectedGenre: string = 'All';

  movies: Movie[] = [
  {
    title: 'Inception',
    poster: 'OIP.webp',  // ✅ Local image path
    genre: 'Sci-Fi',
    rating: 5,
    description: 'A thief who steals corporate secrets through dream-sharing technology.'
  },
  {
    title: 'The Dark Knight',
    poster: 'OIP.webp',
    genre: 'Action',
    rating: 4,
    description: 'Batman faces the Joker in Gotham City.'
  },
  {
    title: 'The Hangover',
    poster: 'OIP.webp',
    genre: 'Comedy',
    rating: 3,
    description: 'Three friends lose their groom in Las Vegas.'
  }
];



  get filteredMovies(): Movie[] {
    if (this.selectedGenre === 'All') return this.movies;
    return this.movies.filter(m => m.genre === this.selectedGenre);
  }

  get averageRating(): number {
    let total = this.movies.reduce((sum, m) => sum + m.rating, 0);
    return (total / this.movies.length).toFixed(1) as unknown as number;
  }
}
