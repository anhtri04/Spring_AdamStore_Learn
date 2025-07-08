package Spring_AdamStore.repository.sql;

import Spring_AdamStore.constants.FileType;
import Spring_AdamStore.entity.sql.FileEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {

     Page<FileEntity> findAllByFileType(Pageable pageable, FileType fileType);

}
