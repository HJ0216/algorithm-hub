select
    id,
    email,
    first_name,
    last_name
from
    developer_infos
where 
    skill_1 = 'Python' || skill_2 = 'Python' || skill_3 = 'Python' 
order by 
    id;