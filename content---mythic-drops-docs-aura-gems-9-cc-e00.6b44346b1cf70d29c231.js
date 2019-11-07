(window.webpackJsonp=window.webpackJsonp||[]).push([[4],{155:function(e,t,n){"use strict";n.r(t),n.d(t,"frontMatter",(function(){return o})),n.d(t,"rightToc",(function(){return i})),n.d(t,"default",(function(){return s}));n(58),n(31),n(22),n(23),n(59),n(0);var a=n(179);function r(){return(r=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var a in n)Object.prototype.hasOwnProperty.call(n,a)&&(e[a]=n[a])}return e}).apply(this,arguments)}var o={id:"aura_gems",title:"Aura Gems"},i=[{value:"Use Case",id:"use-case",children:[]},{value:"Buff Self Gem",id:"buff-self-gem",children:[]},{value:"Buff Others Gem",id:"buff-others-gem",children:[]},{value:"Debuff Self Gem",id:"debuff-self-gem",children:[]},{value:"Debuff Others Gem",id:"debuff-others-gem",children:[]}],l={rightToc:i},f="wrapper";function s(e){var t=e.components,n=function(e,t){if(null==e)return{};var n,a,r={},o=Object.keys(e);for(a=0;a<o.length;a++)n=o[a],t.indexOf(n)>=0||(r[n]=e[n]);return r}(e,["components"]);return Object(a.b)(f,r({},l,n,{components:t,mdxType:"MDXLayout"}),Object(a.b)("h2",{id:"use-case"},"Use Case"),Object(a.b)("p",null,"Aura gems are gems that can be used to provide continuous buffs or debuffs. These\nbuffs or debuffs can be applied to the player with the gem or to other entities nearby."),Object(a.b)("p",null,"Auras replenish every 30s."),Object(a.b)("h2",{id:"buff-self-gem"},"Buff Self Gem"),Object(a.b)("p",null,"Below is an example of a Socket Gem that applies a ",Object(a.b)("a",r({parentName:"p"},{href:"https://hub.spigotmc.org/javadocs/spigot/org/bukkit/potion/PotionEffectType.html"}),"potion effect")," that grants increased damage\nto the wielding player."),Object(a.b)("pre",null,Object(a.b)("code",r({parentName:"pre"},{className:"language-yaml"}),'Enraging I:\n  trigger-type: AURA\n  all-of-item-groups:\n    - armor\n  potion-effects:\n    INCREASE_DAMAGE:\n      intensity: 0\n      duration: 30000\n      affects-wielder: true\n  weight: 400\n  prefix: Enraging\n  lore:\n    - "&4Increases damage dealt while item is equipped."\n  family: Rage\n  level: 1\n')),Object(a.b)("h2",{id:"buff-others-gem"},"Buff Others Gem"),Object(a.b)("p",null,"Below is an example of a Socket Gem that applies a ",Object(a.b)("a",r({parentName:"p"},{href:"https://hub.spigotmc.org/javadocs/spigot/org/bukkit/potion/PotionEffectType.html"}),"potion effect")," that grants increased damage\nto other players, but not the wielding player."),Object(a.b)("pre",null,Object(a.b)("code",r({parentName:"pre"},{className:"language-yaml"}),'Enraging I:\n  trigger-type: AURA\n  all-of-item-groups:\n    - armor\n  potion-effects:\n    INCREASE_DAMAGE:\n      intensity: 0\n      duration: 30000\n      affects-wielder: false\n      affects-target: true\n  weight: 400\n  prefix: Enraging\n  lore:\n    - "&4Increases damage dealt by others while item is equipped."\n  family: Rage\n  level: 1\n')),Object(a.b)("h2",{id:"debuff-self-gem"},"Debuff Self Gem"),Object(a.b)("p",null,"Below is an example of a Socket Gem that applies a ",Object(a.b)("a",r({parentName:"p"},{href:"https://hub.spigotmc.org/javadocs/spigot/org/bukkit/potion/PotionEffectType.html"}),"potion effect")," that applies confusion\nto the wielding player."),Object(a.b)("pre",null,Object(a.b)("code",r({parentName:"pre"},{className:"language-yaml"}),'Confusion I:\n  trigger-type: AURA\n  all-of-item-groups:\n    - armor\n  potion-effects:\n    CONFUSION:\n      intensity: 0\n      duration: 30000\n      affects-wielder: true\n  weight: 400\n  prefix: Confusing\n  lore:\n    - "&4Confuses the wielder while item is equipped."\n  family: Psychic\n  level: 1\n')),Object(a.b)("h2",{id:"debuff-others-gem"},"Debuff Others Gem"),Object(a.b)("p",null,"Below is an example of a Socket Gem that applies a ",Object(a.b)("a",r({parentName:"p"},{href:"https://hub.spigotmc.org/javadocs/spigot/org/bukkit/potion/PotionEffectType.html"}),"potion effect")," that applies confusion\nto other players, but not the wielding player."),Object(a.b)("pre",null,Object(a.b)("code",r({parentName:"pre"},{className:"language-yaml"}),'Confusing I:\n  trigger-type: AURA\n  all-of-item-groups:\n    - armor\n  potion-effects:\n    CONFUSION:\n      intensity: 0\n      duration: 30000\n      affects-wielder: false\n      affects-target: true\n  weight: 400\n  prefix: Confusing\n  lore:\n    - "&4Confuses other nearby players while item is equipped."\n  family: Psychic\n  level: 1\n')))}s.isMDXComponent=!0},179:function(e,t,n){"use strict";n.d(t,"a",(function(){return l})),n.d(t,"b",(function(){return c}));var a=n(0),r=n.n(a),o=r.a.createContext({}),i=function(e){var t=r.a.useContext(o),n=t;return e&&(n="function"==typeof e?e(t):Object.assign({},t,e)),n},l=function(e){var t=i(e.components);return r.a.createElement(o.Provider,{value:t},e.children)};var f="mdxType",s={inlineCode:"code",wrapper:function(e){var t=e.children;return r.a.createElement(r.a.Fragment,{},t)}},p=Object(a.forwardRef)((function(e,t){var n=e.components,a=e.mdxType,o=e.originalType,l=e.parentName,f=function(e,t){var n={};for(var a in e)Object.prototype.hasOwnProperty.call(e,a)&&-1===t.indexOf(a)&&(n[a]=e[a]);return n}(e,["components","mdxType","originalType","parentName"]),p=i(n),c=a,u=p[l+"."+c]||p[c]||s[c]||o;return n?r.a.createElement(u,Object.assign({},{ref:t},f,{components:n})):r.a.createElement(u,Object.assign({},{ref:t},f))}));function c(e,t){var n=arguments,a=t&&t.mdxType;if("string"==typeof e||a){var o=n.length,i=new Array(o);i[0]=p;var l={};for(var s in t)hasOwnProperty.call(t,s)&&(l[s]=t[s]);l.originalType=e,l[f]="string"==typeof e?e:a,i[1]=l;for(var c=2;c<o;c++)i[c]=n[c];return r.a.createElement.apply(null,i)}return r.a.createElement.apply(null,n)}p.displayName="MDXCreateElement"}}]);