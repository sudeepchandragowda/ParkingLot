Ticket in BookMyShow

Ticket
    - id
    - Movie
    - Price
    - Seat
    - Theatre
    - DateTime

Movie
    - Name
    - ReleaseDate
    - Cast
    - Description
    - Trailer
    - Poster

Theater
    - name
    - address
    - NumberOfAudi
    - NumberOfSeats
    - Movies
    - totalRevenueGenerated

Ticket reaching to User
   - String MovieName;
   - String TheatreName;
   - List<String> seatNos;
   - String audiName;
   - int price;
   - DateTime showTime;

TicketDTO -> Data Transfer Object


DTO -
* lighter load on data being transferred
* might lead to exposure of confidential data
*


User -
    - id
    - name
    - profilePic
    - bio
    - userName
    - email
    - password
    - phoneNumber -> verification use
    - List<Post>

UserDTO -
    - name
    - profilePic
    - bio
    - userName
    - List<Post>
