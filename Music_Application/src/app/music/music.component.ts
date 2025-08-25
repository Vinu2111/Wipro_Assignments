import { Component } from '@angular/core';
import { MaterialModule } from '../material/material.module';
import { FormsModule } from '@angular/forms';


interface Song {
  name: string;
  artist: string;
  album: string;
  duration: string;
  rating: number; // 1-5
}

@Component({
  selector: 'app-music-playlist',
  templateUrl: './music.component.html',
  styleUrls: ['./music.component.css']
})
export class MusicComponent {
  filterText: string = '';
  filterType: 'artist' | 'album' = 'artist';

  songs: Song[] = [
    { name: 'Song 1', artist: 'Artist A', album: 'Album X', duration: '3:30', rating: 5 },
    { name: 'Song 2', artist: 'Artist B', album: 'Album Y', duration: '4:00', rating: 4 },
    { name: 'Song 3', artist: 'Artist A', album: 'Album Z', duration: '2:45', rating: 5 },
    { name: 'Song 4', artist: 'Artist C', album: 'Album X', duration: '3:15', rating: 3 },
    { name: 'Song 5', artist: 'Artist B', album: 'Album Y', duration: '5:00', rating: 4 },
  ];

  get filteredSongs() {
    return this.songs.filter(song =>
      song[this.filterType].toLowerCase().includes(this.filterText.toLowerCase())
    );
  }
}
