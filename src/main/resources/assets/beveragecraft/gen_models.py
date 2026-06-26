import json
with open('lang/en_us.json') as json_file:
    lang_file=json.load(json_file)

for k in filter(lambda ln:ln.startswith('item.beveragecraft.'),lang_file.keys()):
    k=k[19:]
    with open(f'models/item/{k}.json','w') as out_file:
        json.dump({"parent":"item/generated","textures":{"layer0":f"beveragecraft:item/{k}"}},out_file,indent=2)
    