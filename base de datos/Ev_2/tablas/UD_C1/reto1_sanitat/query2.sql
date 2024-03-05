SELECT HOSPITAL.HOSPITAL_COD, HOSPITAL.NOM , HOSPITAL.TELEFON
from HOSPITAL
WHERE
 substring(NOM , 2 , 1) = "A";

-- segunda opción

select *
FROM HOSPITAL
WHERE NOM  like "_a%";
-- que haya 1 carácter delante y los que sean detras