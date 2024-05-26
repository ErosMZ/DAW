select * from Playlist
where PlaylistId in (

	select PlaylistId from PlaylistTrack
	where TrackId in (
    
		select TrackId from Track
        where GenreId in (
        
			select GenreId from Genre
            where Name like "Reggae"
        
        )
    )
)