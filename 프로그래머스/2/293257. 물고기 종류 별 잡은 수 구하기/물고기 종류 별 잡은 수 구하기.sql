select
    count(fi.id) as FISH_COUNT,
    fni.fish_name as FISH_NAME
from
    fish_info fi
join
    fish_name_info fni
on
    fi.fish_type = fni.fish_type
group by
    fni.fish_name
order by
    FISH_COUNT desc;
    