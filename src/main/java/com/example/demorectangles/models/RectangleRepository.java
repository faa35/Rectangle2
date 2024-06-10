// package com.example.demorectangles.models;

// import org.springframework.data.jpa.repository.JpaRepository;

// public interface RectangleRepository extends JpaRepository<Rectangle, Long> {
// }


// version2: where it work in the webpage but not in the database
// package com.example.demorectangles.models;

// import org.springframework.data.jpa.repository.JpaRepository;
// import java.util.List;

// public interface RectangleRepository extends JpaRepository<Rectangle, Long> {
//     List<Rectangle> findAllByOrderById();
// }

package com.example.demorectangles.models;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RectangleRepository extends JpaRepository<Rectangle, Long> {
    List<Rectangle> findAllByOrderByIdAsc();
}
