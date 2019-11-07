(window.webpackJsonp=window.webpackJsonp||[]).push([[7],{147:function(n,e,t){"use strict";t.r(e),t.d(e,"frontMatter",(function(){return i})),t.d(e,"rightToc",(function(){return a})),t.d(e,"default",(function(){return m}));t(58),t(31),t(22),t(23),t(59),t(0);var o=t(179);function r(){return(r=Object.assign||function(n){for(var e=1;e<arguments.length;e++){var t=arguments[e];for(var o in t)Object.prototype.hasOwnProperty.call(t,o)&&(n[o]=t[o])}return n}).apply(this,arguments)}var i={id:"creatureSpawning_yml",title:"creatureSpawning.yml"},a=[{value:"Configuration",id:"configuration",children:[]}],c={rightToc:a},s="wrapper";function m(n){var e=n.components,t=function(n,e){if(null==n)return{};var t,o,r={},i=Object.keys(n);for(o=0;o<i.length;o++)t=i[o],e.indexOf(t)>=0||(r[t]=n[t]);return r}(n,["components"]);return Object(o.b)(s,r({},c,t,{components:e,mdxType:"MDXLayout"}),Object(o.b)("h2",{id:"configuration"},"Configuration"),Object(o.b)("p",null,"MythicDrops has a lot of configuration options. Below is the contents of the\ncreatureSpawning.yml with inline explanations of what each configuration option does."),Object(o.b)("pre",null,Object(o.b)("code",r({parentName:"pre"},{className:"language-yaml"}),'version: 5.0.0\n## Allows toggling whether or not certain types of mob spawns will actually\n## be eligible to receive MythicDrops items. Only works if display-mob-equipment\n## is set to true in config.yml.\nspawnPrevention:\n  ## Should mobs spawned by a spawn egg be prevented from receiving items?\n  spawnEgg: true\n  ## Should mobs spawned by a mob spawner be prevented from receiving items?\n  spawner: true\n  ## Should mobs spawned by a custom reason be prevented from receiving items?\n  ## This would typically be mobs spawned by plugins.\n  custom: true\n  ## Should mobs spawned by reinforcements (zombie mechanic) be prevented from\n  ## receiving items?\n  reinforcements: true\n  ## Allows you to set a Y level per world where mobs will not receive items\n  ## if they spawn above it.\n  ## In the default config, mobs spawned above 255 in a world named "world"\n  ## will not receive items.\n  above-y:\n    world: 255\n## Multiplier against the percentages (item-chance, tiered-item-chance, etc.)\n## from config.yml.\n##\n## Each mob that you want to drop items needs to be included in this section.\n## If the mob is not included in this section, they are treated as having a\n## multiplier of 0.0.\n## Mob names come from this link:\n## https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/EntityType.html\ndropMultipliers:\n  CREEPER: 1.0\n  SKELETON: 1.0\n  SPIDER: 1.0\n  GIANT: 1.0\n  ZOMBIE: 1.0\n  GHAST: 1.0\n  PIG_ZOMBIE: 1.0\n  ENDERMAN: 1.0\n  CAVE_SPIDER: 1.0\n  SILVERFISH: 1.0\n  BLAZE: 1.0\n  MAGMA_CUBE: 1.0\n  ENDER_DRAGON: 1.0\n  WITHER: 1.0\n  WITCH: 1.0\n  DROWNED: 1.0\n  ELDER_GUARDIAN: 1.0\n  HUSK: 1.0\n  SHULKER: 1.0\n  VEX: 1.0\n  WITHER_SKELETON: 1.0\n  PILLAGER: 1.0\n## Controls what tiers of items that a mob can drop.\n##\n## Each mob that you want to drop tiers needs to be included in this section\n## in the below format. Mob names come from this link:\n## https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/EntityType.html\n##\n## MOBNAME:\n## - place tiers\n## - to drop\n## - in a list\ntierDrops:\n  CREEPER:\n    - common\n    - uncommon\n    - rare\n  SKELETON:\n    - common\n    - uncommon\n  SPIDER:\n    - common\n    - uncommon\n  GIANT:\n    - epic\n    - exotic\n  ZOMBIE:\n    - common\n  GHAST:\n    - rare\n    - epic\n  PIG_ZOMBIE:\n    - common\n    - uncommon\n    - rare\n  ENDERMAN:\n    - uncommon\n    - rare\n  CAVE_SPIDER:\n    - common\n    - uncommon\n  SILVERFISH:\n    - common\n  BLAZE:\n    - uncommon\n    - rare\n    - epic\n    - exotic\n  MAGMA_CUBE:\n    - common\n    - uncommon\n    - rare\n    - epic\n  ENDER_DRAGON:\n    - legendary\n  WITHER:\n    - exotic\n    - legendary\n  WITCH:\n    - artisan\n')))}m.isMDXComponent=!0},179:function(n,e,t){"use strict";t.d(e,"a",(function(){return c})),t.d(e,"b",(function(){return p}));var o=t(0),r=t.n(o),i=r.a.createContext({}),a=function(n){var e=r.a.useContext(i),t=e;return n&&(t="function"==typeof n?n(e):Object.assign({},e,n)),t},c=function(n){var e=a(n.components);return r.a.createElement(i.Provider,{value:e},n.children)};var s="mdxType",m={inlineCode:"code",wrapper:function(n){var e=n.children;return r.a.createElement(r.a.Fragment,{},e)}},l=Object(o.forwardRef)((function(n,e){var t=n.components,o=n.mdxType,i=n.originalType,c=n.parentName,s=function(n,e){var t={};for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&-1===e.indexOf(o)&&(t[o]=n[o]);return t}(n,["components","mdxType","originalType","parentName"]),l=a(t),p=o,u=l[c+"."+p]||l[p]||m[p]||i;return t?r.a.createElement(u,Object.assign({},{ref:e},s,{components:t})):r.a.createElement(u,Object.assign({},{ref:e},s))}));function p(n,e){var t=arguments,o=e&&e.mdxType;if("string"==typeof n||o){var i=t.length,a=new Array(i);a[0]=l;var c={};for(var m in e)hasOwnProperty.call(e,m)&&(c[m]=e[m]);c.originalType=n,c[s]="string"==typeof n?n:o,a[1]=c;for(var p=2;p<i;p++)a[p]=t[p];return r.a.createElement.apply(null,a)}return r.a.createElement.apply(null,t)}l.displayName="MDXCreateElement"}}]);