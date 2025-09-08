select
    it.item_id as ITEM_ID
    , ii.item_name as ITEM_NAME
from
    item_tree it
join
    item_info ii
on
    it.item_id = ii.item_id
where
    it.parent_item_id is null
order by
    ITEM_ID
;