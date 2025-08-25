import { Component, Input } from '@angular/core';

import { MaterialModule } from '../../material/material.module';
import { Movie } from '../../movie/movie.module';


@Component({
  selector: 'app-movie-card',
    imports: [MaterialModule],
  templateUrl: './movie-card.component.html',
  styleUrls: ['./movie-card.component.css']
})
export class MovieCardComponent {
  @Input() movie!: Movie;

  get stars() {
    return Array(5).fill(0).map((_, i) => i < this.movie.rating);
  }
}
