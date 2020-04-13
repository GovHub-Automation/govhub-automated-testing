<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_(windowNREUM(NREUM))loader_configlicen_db371a</name>
   <tag></tag>
   <elementGuidId>89e936c9-deaf-4b65-86a0-55d051e20297</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//*/text()[normalize-space(.)='']/parent::*</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>dir</name>
      <type>Main</type>
      <value>ltr</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>prefix</name>
      <type>Main</type>
      <value>content: http://purl.org/rss/1.0/modules/content/  dc: http://purl.org/dc/terms/  foaf: http://xmlns.com/foaf/0.1/  og: http://ogp.me/ns#  rdfs: http://www.w3.org/2000/01/rdf-schema#  schema: http://schema.org/  sioc: http://rdfs.org/sioc/ns#  sioct: http://rdfs.org/sioc/types#  skos: http://www.w3.org/2004/02/skos/core#  xsd: http://www.w3.org/2001/XMLSchema# </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value> no-touchevents details js</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    (window.NREUM||(NREUM={})).loader_config={licenseKey:&quot;5360c08ecf&quot;,applicationID:&quot;317737043&quot;};window.NREUM||(NREUM={}),__nr_require=function(e,n,t){function r(t){if(!n[t]){var i=n[t]={exports:{}};e[t][0].call(i.exports,function(n){var i=e[t][1][n];return r(i||n)},i,i.exports)}return n[t].exports}if(&quot;function&quot;==typeof __nr_require)return __nr_require;for(var i=0;i&lt;t.length;i++)r(t[i]);return r}({1:[function(e,n,t){function r(){}function i(e,n,t){return function(){return o(e,[u.now()].concat(f(arguments)),n?null:this,t),n?void 0:this}}var o=e(&quot;handle&quot;),a=e(4),f=e(5),c=e(&quot;ee&quot;).get(&quot;tracer&quot;),u=e(&quot;loader&quot;),s=NREUM;&quot;undefined&quot;==typeof window.newrelic&amp;&amp;(newrelic=s);var p=[&quot;setPageViewName&quot;,&quot;setCustomAttribute&quot;,&quot;setErrorHandler&quot;,&quot;finished&quot;,&quot;addToTrace&quot;,&quot;inlineHit&quot;,&quot;addRelease&quot;],l=&quot;api-&quot;,d=l+&quot;ixn-&quot;;a(p,function(e,n){s[n]=i(l+n,!0,&quot;api&quot;)}),s.addPageAction=i(l+&quot;addPageAction&quot;,!0),s.setCurrentRouteName=i(l+&quot;routeName&quot;,!0),n.exports=newrelic,s.interaction=function(){return(new r).get()};var m=r.prototype={createTracer:function(e,n){var t={},r=this,i=&quot;function&quot;==typeof n;return o(d+&quot;tracer&quot;,[u.now(),e,t],r),function(){if(c.emit((i?&quot;&quot;:&quot;no-&quot;)+&quot;fn-start&quot;,[u.now(),r,i],t),i)try{return n.apply(this,arguments)}catch(e){throw c.emit(&quot;fn-err&quot;,[arguments,this,e],t),e}finally{c.emit(&quot;fn-end&quot;,[u.now()],t)}}}};a(&quot;actionText,setName,setAttribute,save,ignore,onEnd,getContext,end,get&quot;.split(&quot;,&quot;),function(e,n){m[n]=i(d+n)}),newrelic.noticeError=function(e,n){&quot;string&quot;==typeof e&amp;&amp;(e=new Error(e)),o(&quot;err&quot;,[e,u.now(),!1,n])}},{}],2:[function(e,n,t){function r(e,n){var t=e.getEntries();t.forEach(function(e){&quot;first-paint&quot;===e.name?c(&quot;timing&quot;,[&quot;fp&quot;,Math.floor(e.startTime)]):&quot;first-contentful-paint&quot;===e.name&amp;&amp;c(&quot;timing&quot;,[&quot;fcp&quot;,Math.floor(e.startTime)])})}function i(e,n){var t=e.getEntries();t.length>0&amp;&amp;c(&quot;lcp&quot;,[t[t.length-1]])}function o(e){if(e instanceof s&amp;&amp;!l){var n,t=Math.round(e.timeStamp);n=t>1e12?Date.now()-t:u.now()-t,l=!0,c(&quot;timing&quot;,[&quot;fi&quot;,t,{type:e.type,fid:n}])}}if(!(&quot;init&quot;in NREUM&amp;&amp;&quot;page_view_timing&quot;in NREUM.init&amp;&amp;&quot;enabled&quot;in NREUM.init.page_view_timing&amp;&amp;NREUM.init.page_view_timing.enabled===!1)){var a,f,c=e(&quot;handle&quot;),u=e(&quot;loader&quot;),s=NREUM.o.EV;if(&quot;PerformanceObserver&quot;in window&amp;&amp;&quot;function&quot;==typeof window.PerformanceObserver){a=new PerformanceObserver(r),f=new PerformanceObserver(i);try{a.observe({entryTypes:[&quot;paint&quot;]}),f.observe({entryTypes:[&quot;largest-contentful-paint&quot;]})}catch(p){}}if(&quot;addEventListener&quot;in document){var l=!1,d=[&quot;click&quot;,&quot;keydown&quot;,&quot;mousedown&quot;,&quot;pointerdown&quot;,&quot;touchstart&quot;];d.forEach(function(e){document.addEventListener(e,o,!1)})}}},{}],3:[function(e,n,t){function r(e,n){if(!i)return!1;if(e!==i)return!1;if(!n)return!0;if(!o)return!1;for(var t=o.split(&quot;.&quot;),r=n.split(&quot;.&quot;),a=0;a&lt;r.length;a++)if(r[a]!==t[a])return!1;return!0}var i=null,o=null,a=/Version\/(\S+)\s+Safari/;if(navigator.userAgent){var f=navigator.userAgent,c=f.match(a);c&amp;&amp;f.indexOf(&quot;Chrome&quot;)===-1&amp;&amp;f.indexOf(&quot;Chromium&quot;)===-1&amp;&amp;(i=&quot;Safari&quot;,o=c[1])}n.exports={agent:i,version:o,match:r}},{}],4:[function(e,n,t){function r(e,n){var t=[],r=&quot;&quot;,o=0;for(r in e)i.call(e,r)&amp;&amp;(t[o]=n(r,e[r]),o+=1);return t}var i=Object.prototype.hasOwnProperty;n.exports=r},{}],5:[function(e,n,t){function r(e,n,t){n||(n=0),&quot;undefined&quot;==typeof t&amp;&amp;(t=e?e.length:0);for(var r=-1,i=t-n||0,o=Array(i&lt;0?0:i);++r&lt;i;)o[r]=e[n+r];return o}n.exports=r},{}],6:[function(e,n,t){n.exports={exists:&quot;undefined&quot;!=typeof window.performance&amp;&amp;window.performance.timing&amp;&amp;&quot;undefined&quot;!=typeof window.performance.timing.navigationStart}},{}],ee:[function(e,n,t){function r(){}function i(e){function n(e){return e&amp;&amp;e instanceof r?e:e?c(e,f,o):o()}function t(t,r,i,o){if(!l.aborted||o){e&amp;&amp;e(t,r,i);for(var a=n(i),f=v(t),c=f.length,u=0;u&lt;c;u++)f[u].apply(a,r);var p=s[y[t]];return p&amp;&amp;p.push([b,t,r,a]),a}}function d(e,n){h[e]=v(e).concat(n)}function m(e,n){var t=h[e];if(t)for(var r=0;r&lt;t.length;r++)t[r]===n&amp;&amp;t.splice(r,1)}function v(e){return h[e]||[]}function g(e){return p[e]=p[e]||i(t)}function w(e,n){u(e,function(e,t){n=n||&quot;feature&quot;,y[t]=n,n in s||(s[n]=[])})}var h={},y={},b={on:d,addEventListener:d,removeEventListener:m,emit:t,get:g,listeners:v,context:n,buffer:w,abort:a,aborted:!1};return b}function o(){return new r}function a(){(s.api||s.feature)&amp;&amp;(l.aborted=!0,s=l.backlog={})}var f=&quot;nr@context&quot;,c=e(&quot;gos&quot;),u=e(4),s={},p={},l=n.exports=i();l.backlog=s},{}],gos:[function(e,n,t){function r(e,n,t){if(i.call(e,n))return e[n];var r=t();if(Object.defineProperty&amp;&amp;Object.keys)try{return Object.defineProperty(e,n,{value:r,writable:!0,enumerable:!1}),r}catch(o){}return e[n]=r,r}var i=Object.prototype.hasOwnProperty;n.exports=r},{}],handle:[function(e,n,t){function r(e,n,t,r){i.buffer([e],r),i.emit(e,n,t)}var i=e(&quot;ee&quot;).get(&quot;handle&quot;);n.exports=r,r.ee=i},{}],id:[function(e,n,t){function r(e){var n=typeof e;return!e||&quot;object&quot;!==n&amp;&amp;&quot;function&quot;!==n?-1:e===window?0:a(e,o,function(){return i++})}var i=1,o=&quot;nr@id&quot;,a=e(&quot;gos&quot;);n.exports=r},{}],loader:[function(e,n,t){function r(){if(!x++){var e=E.info=NREUM.info,n=d.getElementsByTagName(&quot;script&quot;)[0];if(setTimeout(s.abort,3e4),!(e&amp;&amp;e.licenseKey&amp;&amp;e.applicationID&amp;&amp;n))return s.abort();u(y,function(n,t){e[n]||(e[n]=t)}),c(&quot;mark&quot;,[&quot;onload&quot;,a()+E.offset],null,&quot;api&quot;);var t=d.createElement(&quot;script&quot;);t.src=&quot;https://&quot;+e.agent,n.parentNode.insertBefore(t,n)}}function i(){&quot;complete&quot;===d.readyState&amp;&amp;o()}function o(){c(&quot;mark&quot;,[&quot;domContent&quot;,a()+E.offset],null,&quot;api&quot;)}function a(){return O.exists&amp;&amp;performance.now?Math.round(performance.now()):(f=Math.max((new Date).getTime(),f))-E.offset}var f=(new Date).getTime(),c=e(&quot;handle&quot;),u=e(4),s=e(&quot;ee&quot;),p=e(3),l=window,d=l.document,m=&quot;addEventListener&quot;,v=&quot;attachEvent&quot;,g=l.XMLHttpRequest,w=g&amp;&amp;g.prototype;NREUM.o={ST:setTimeout,SI:l.setImmediate,CT:clearTimeout,XHR:g,REQ:l.Request,EV:l.Event,PR:l.Promise,MO:l.MutationObserver};var h=&quot;&quot;+location,y={beacon:&quot;bam.nr-data.net&quot;,errorBeacon:&quot;bam.nr-data.net&quot;,agent:&quot;js-agent.newrelic.com/nr-1167.min.js&quot;},b=g&amp;&amp;w&amp;&amp;w[m]&amp;&amp;!/CriOS/.test(navigator.userAgent),E=n.exports={offset:f,now:a,origin:h,features:{},xhrWrappable:b,userAgent:p};e(1),e(2),d[m]?(d[m](&quot;DOMContentLoaded&quot;,o,!1),l[m](&quot;load&quot;,r,!1)):(d[v](&quot;onreadystatechange&quot;,i),l[v](&quot;onload&quot;,r)),c(&quot;mark&quot;,[&quot;firstbyte&quot;,f],null,&quot;api&quot;);var x=0,O=e(6)},{}],&quot;wrap-function&quot;:[function(e,n,t){function r(e){return!(e&amp;&amp;e instanceof Function&amp;&amp;e.apply&amp;&amp;!e[a])}var i=e(&quot;ee&quot;),o=e(5),a=&quot;nr@original&quot;,f=Object.prototype.hasOwnProperty,c=!1;n.exports=function(e,n){function t(e,n,t,i){function nrWrapper(){var r,a,f,c;try{a=this,r=o(arguments),f=&quot;function&quot;==typeof t?t(r,a):t||{}}catch(u){l([u,&quot;&quot;,[r,a,i],f])}s(n+&quot;start&quot;,[r,a,i],f);try{return c=e.apply(a,r)}catch(p){throw s(n+&quot;err&quot;,[r,a,p],f),p}finally{s(n+&quot;end&quot;,[r,a,c],f)}}return r(e)?e:(n||(n=&quot;&quot;),nrWrapper[a]=e,p(e,nrWrapper),nrWrapper)}function u(e,n,i,o){i||(i=&quot;&quot;);var a,f,c,u=&quot;-&quot;===i.charAt(0);for(c=0;c&lt;n.length;c++)f=n[c],a=e[f],r(a)||(e[f]=t(a,u?f+i:i,o,f))}function s(t,r,i){if(!c||n){var o=c;c=!0;try{e.emit(t,r,i,n)}catch(a){l([a,t,r,i])}c=o}}function p(e,n){if(Object.defineProperty&amp;&amp;Object.keys)try{var t=Object.keys(e);return t.forEach(function(t){Object.defineProperty(n,t,{get:function(){return e[t]},set:function(n){return e[t]=n,n}})}),n}catch(r){l([r])}for(var i in e)f.call(e,i)&amp;&amp;(n[i]=e[i]);return n}function l(n){try{e.emit(&quot;internal-error&quot;,n)}catch(t){}}return e||(e=i),t.inPlace=u,t.flag=a,t}},{}]},{},[&quot;loader&quot;]);
&lt;meta http-equiv=&quot;Refresh&quot; content=&quot;0; URL=/big_pipe/no-js?destination=/admin/content/document&quot; />






    Replace QA Features.pdf everywhere | Digital Services Georgia
    




    



  #katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}.si-toggle-container {font-family: &quot;Helvetica Neue&quot;,Helvetica,Arial,sans-serif;position: fixed;display: block;background-color: transparent;z-index: 9999;}.si-toggle-container.si-pos-side {min-width: 6px;width: 54px;max-width: 54px;display: block;}.si-toggle-container.si-pos-bottom {min-height: 6px;height: 54px;max-height: 54px;display: block;}.si-toggle-container.si-pos-east {bottom: 50%;right: 1px;}.si-toggle-container.si-pos-south {left: 50%;bottom: 0;}.si-toggle-container.si-pos-east-south {right: 1px;bottom: 25%;}.si-toggle-container.si-pos-west-south {left: 1px;bottom: 25%;}.si-toggle-container.si-pos-west {left: 1px;bottom: 50%;}.si-toggle-container .si-button {border-width: 0;background-color: #fafafa;border-style: none;border-image: none;}.si-toggle-container .si-drag-container {display: inline-block;vertical-align: top;position: relative;}.si-toggle-container .si-drag-container.si-pos-side {height: 100%;width: 6px;}.si-toggle-container .si-drag-container.si-pos-bottom {height: 6px;width: 100%;vertical-align: bottom;display: block;}.si-toggle-container .si-drag-container .si-drag-box {display: block;position: absolute;}.si-toggle-container .si-drag-container .si-drag-box.si-pos-side {cursor: col-resize;width: 6px;height: 44px;top: 50px;margin-top: -22px;}.si-toggle-container .si-drag-container .si-drag-box.si-pos-side.cleared {top: 24px;}.si-toggle-container .si-drag-container .si-drag-box.si-pos-bottom {width: 44px;height: 6px;left: 50px;margin-left: -22px;cursor: row-resize;}.si-toggle-container .si-drag-container .si-drag-box.si-pos-bottom.cleared {left: 24px;}.si-toggle-container .si-drag-container .si-drag-box .si-drag-dots {border-radius: 10px 0 0 10px;background-color: #ededed;}.si-toggle-container .si-drag-container .si-drag-box .si-drag-dots.si-pos-bottom {border-radius: 10px 10px 0 0;width: 44px;height: 6px;}.si-toggle-container .si-drag-container .si-drag-box .si-drag-dots.si-pos-bottom:after {content: &quot;•••&quot;;position: absolute;top: 33%;left: 50%;transform: translate(-50%, -50%);-webkit-transform: translate(-50%, -50%);-ms-transform: translate(-50%, -50%);-moz-transform: translate(-50%, -50%);font-size: 8px;letter-spacing: 2px;margin-left: 2px;}.si-toggle-container .si-drag-container .si-drag-box .si-drag-dots.si-pos-side {height: 44px;width: 6px;}.si-toggle-container .si-drag-container .si-drag-box .si-drag-dots.si-pos-side:after {content: &quot;•••&quot;;position: absolute;top: 50%;left: 33%;transform: translate(-50%, -50%) rotate(90deg);-webkit-transform: translate(-50%, -50%) rotate(90deg);-ms-transform: translate(-50%, -50%) rotate(90deg);-moz-transform: translate(-50%, -50%) rotate(90deg);font-size: 8px;letter-spacing: 2px;margin-top: 2px;}.si-toggle-container .si-drag-container .si-drag-box .si-drag-dots.si-pos-east-south, .si-toggle-container .si-drag-container .si-drag-box .si-drag-dots.si-pos-east {border-radius: 10px 0 0 10px;}.si-toggle-container .si-drag-container .si-drag-box .si-drag-dots.si-pos-west-south, .si-toggle-container .si-drag-container .si-drag-box .si-drag-dots.si-pos-west {border-radius: 0 10px 10px 0;}.si-toggle-container .si-boxes-container {display: inline-block;overflow: hidden;background-color: #fff;box-shadow: 0 1px 16px rgba(0, 0, 0, 0.5);}.si-toggle-container .si-boxes-container.si-pos-side {width: 48px;max-width: 48px;}.si-toggle-container .si-boxes-container.si-pos-bottom {height: 48px;max-height: 48px;display: block;}.si-toggle-container .si-boxes-container .si-topbox {padding: 10px;display: block;}.si-toggle-container .si-boxes-container .si-topbox.si-pos-side {border-bottom: 1px solid #dddddd;}.si-toggle-container .si-boxes-container .si-topbox.si-pos-bottom {border-right: 1px solid #dddddd;display: table-cell;}.si-toggle-container .si-boxes-container .si-topbox > .si-button {display: block;background: none;width: 28px;height: 28px;}.si-toggle-container .si-boxes-container .si-topbox > .si-button.cleared > svg {opacity: 0.25;}.si-toggle-container .si-boxes-container .si-topbox > .si-button > svg {fill: #2dbce2;}.si-toggle-container .si-boxes-container .si-bottom-boxes {background-color: #fafafa;display: block;}.si-toggle-container .si-boxes-container .si-bottom-boxes.cleared {display: none;}.si-toggle-container .si-boxes-container .si-bottom-boxes.si-pos-bottom {display: table-cell;vertical-align: middle;}.si-toggle-container .si-boxes-container .si-bottom-boxes.si-pos-side {padding-bottom: 10px;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-login-box {color: #007a8f;text-decoration: none;text-align: center;vertical-align: middle;height: 48px;width: 48px;font-size: 12px;display: table-cell;text-overflow: ellipsis;overflow: hidden;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container {display: block;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container.si-pos-bottom {display: table;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container {display: block;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container.si-pos-bottom {display: table;height: 100%;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container {display: block;padding: 10px 0 0 0;text-align: center;max-width: 48px;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container.si-pos-bottom {min-width: 36px;padding: 0 0 0 2px;display: table-cell;vertical-align: middle;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container.si-pos-side {width: 48px;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container .si-single-circle {min-width: 10px;max-width: 48px;padding: 3px 7px;border-radius: 10px;display: inline-block;text-align: center;font-weight: 600;vertical-align: middle;white-space: nowrap;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container .si-single-circle.si-issues {background-color: #a93333;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container .si-single-circle.si-notifications {background-color: #008299;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container .si-single-circle.si-recheck {background-color: #eeeeee;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container .si-single-circle.si-recheck > div {width: 16px;height: 16px;display: inline-block;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container .si-single-circle.si-recheck > div > svg {fill: #696969;animation: si-rechecking 2s linear infinite;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container .si-single-circle > div {color: #fff;display: block;font-size: 12px;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container .si-single-circle > div.si-rechecking {width: 16px;height: 16px;display: inline-block;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-container .si-single-circle > div.si-rechecking > svg {fill: #696969;animation: si-rechecking 2s linear infinite;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-text-container {max-width: 36px;display: table;padding-top: 2px;margin: 0 auto;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-text-container.si-pos-bottom {min-width: 36px;max-width: 100px;padding-top: 0;padding-right: 2px;display: table-cell;vertical-align: middle;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-text-container.si-pos-side {width: 36px;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-text-container > div {display: block;font-size: 10px;color: #222222;text-align: center;text-overflow: ellipsis;overflow: hidden;}.si-toggle-container .si-boxes-container .si-bottom-boxes .si-circles-container .si-single-circle-container .si-circle-text-container > div.si-pos-side {max-width: 36px;width: 36px;}.si-toggle-container article, .si-toggle-container aside, .si-toggle-container details, .si-toggle-container figcaption, .si-toggle-container figure, .si-toggle-container footer, .si-toggle-container header, .si-toggle-container hgroup, .si-toggle-container main, .si-toggle-container menu, .si-toggle-container nav, .si-toggle-container section, .si-toggle-container summary {display: block;padding: 0;margin: 0;}.si-toggle-container audio, .si-toggle-container canvas, .si-toggle-container progress, .si-toggle-container video {display: inline-block;vertical-align: baseline;padding: 0;margin: 0;}.si-toggle-container audio:not([controls]) {display: none;height: 0;}.si-toggle-container [hidden], .si-toggle-container template {display: none;}.si-toggle-container a {background-color: transparent;}.si-toggle-container div, .si-toggle-container button {padding: 0;margin: 0;}.si-toggle-container a:active, .si-toggle-container a:hover {outline: 0;}.si-toggle-container abbr[title] {border-bottom: 1px dotted;}.si-toggle-container b, .si-toggle-container strong {font-weight: bold;}.si-toggle-container dfn {font-style: italic;}.si-toggle-container h1 {font-size: 2em;margin: 0.67em 0;}.si-toggle-container mark {background: #ff0;color: #000;}.si-toggle-container small {font-size: 80%;}.si-toggle-container sub {font-size: 75%;line-height: 0;position: relative;vertical-align: baseline;}.si-toggle-container sup {font-size: 75%;line-height: 0;position: relative;vertical-align: baseline;top: -0.5em;}.si-toggle-container sub {bottom: -0.25em;}.si-toggle-container img {border: 0;}.si-toggle-container svg:not(:root) {overflow: hidden;}.si-toggle-container figure {margin: 1em 40px;}.si-toggle-container hr {box-sizing: content-box;height: 0;}.si-toggle-container pre {overflow: auto;}.si-toggle-container code, .si-toggle-container kbd, .si-toggle-container pre, .si-toggle-container samp {font-family: monospace, monospace;font-size: 1em;}.si-toggle-container button, .si-toggle-container input, .si-toggle-container optgroup, .si-toggle-container select, .si-toggle-container textarea {color: inherit;font: inherit;margin: 0;border: none;background: none;}.si-toggle-container button {overflow: visible;text-transform: none;}.si-toggle-container select {text-transform: none;}.si-toggle-container button, .si-toggle-container html input[type=&quot;button&quot;] {-webkit-appearance: button;cursor: pointer;}.si-toggle-container input[type=&quot;reset&quot;], .si-toggle-container input[type=&quot;submit&quot;] {-webkit-appearance: button;cursor: pointer;}.si-toggle-container button[disabled], .si-toggle-container html input[disabled] {cursor: default;}.si-toggle-container button::-moz-focus-inner {border: 0;padding: 0;}.si-toggle-container input {line-height: normal;}.si-toggle-container input::-moz-focus-inner {border: 0;padding: 0;}.si-toggle-container input[type=&quot;checkbox&quot;], .si-toggle-container input[type=&quot;radio&quot;] {box-sizing: border-box;padding: 0;}.si-toggle-container input[type=&quot;number&quot;]::-webkit-inner-spin-button, .si-toggle-container input[type=&quot;number&quot;]::-webkit-outer-spin-button {height: auto;}.si-toggle-container input[type=&quot;search&quot;] {-webkit-appearance: textfield;box-sizing: content-box;}.si-toggle-container input[type=&quot;search&quot;]::-webkit-search-cancel-button, .si-toggle-container input[type=&quot;search&quot;]::-webkit-search-decoration {-webkit-appearance: none;}.si-toggle-container fieldset {border: 1px solid #c0c0c0;margin: 0 2px;padding: 0.35em 0.625em 0.75em;}.si-toggle-container legend {border: 0;padding: 0;}.si-toggle-container textarea {overflow: auto;}.si-toggle-container optgroup {font-weight: bold;}.si-toggle-container table {border-collapse: collapse;border-spacing: 0;}.si-toggle-container td, .si-toggle-container th {padding: 0;}.si-iframe-container {position: fixed;z-index: 9999;background-color: transparent;height: 80%;min-height: 300px;max-width: 640px;min-width: 320px;width: 33%;display: block;border: 1px solid #bbb;overflow: hidden;border-radius: 4px;}.si-iframe-container.si-pos-east, .si-iframe-container.si-pos-east-south {text-align: right;}.si-iframe-container.si-pos-west, .si-iframe-container.si-pos-west-south {text-align: left;}.si-iframe-container.si-pos-west-south {top: 60%;left: 1px;}.si-iframe-container.si-pos-side {transform: translate(0, -50%);-webkit-transform: translate(0, -50%);-ms-transform: translate(0, -50%);-moz-transform: translate(0, -50%);}.si-iframe-container.si-pos-west {left: 1px;top: 50%;}.si-iframe-container.si-pos-east {right: 1px;top: 50%;}.si-iframe-container.si-pos-east-south {top: 60%;right: 1px;}.si-iframe-container.si-pos-south {left: 50%;bottom: 1px;transform: translate(-50%, 0);-webkit-transform: translate(-50%, 0);-ms-transform: translate(-50%, 0);-moz-transform: translate(-50%, 0);}.si-iframe-container .si-iframe-closer {position: absolute;height: 16px;width: 16px;top: 14px;right: 15px;z-index: 9999;cursor: pointer;}.si-iframe-container .si-iframe-closer > svg {fill: #555555;}.si-iframe-container .si-iframe-element {height: 100%;width: 100%;position: relative;border-width: 0;border-image: none;border-style: none;display: block;}@keyframes si-rechecking {to {-webkit-transform: rotate3d(0, 0, 1, 360deg);transform: rotate3d(0, 0, 1, 360deg);-moz-transform: rotate3d(0, 0, 1, 360deg);}}
  
        
      Skip to main content
    
    
  
    Toolbar items
                
        Back to site
              
                
        Manage
        Administration menuToolsIndexFlush all cachesFlush CSS and JavascriptFlush plugins cacheFlush render cacheFlush routing and links cacheFlush static cacheFlush twig cacheFlush views cacheRun cronRun updatesLogoutContentAdd contentAlertBioBook pageCaseContactEmergencyEventFAQHow Do IImportant DateLanding PageListing PageLocationNewsOfficial RecordOpinionOrganizationPSGPress ReleaseProgram or ServiceSubject PageSuper ServiceTopic PageWebformMediaAdd mediaDocumentIconImageOfficial Record HeaderRemote mediaRemote videoSVG ImageMicro-contentAdd micro-contentAccordionAutomatic ListCall To ActionCode BlockHeroHow Do I (Step)Icon ListKnack embedLaserfiche FormLink CollectionPromoQuickbase embedQuoteReponsive iFrameText BlockTileTilesetStructureBlock layoutBooksContent typesAdd content typeAccordionManage fieldsManage form displayManage displayDeleteAlertManage fieldsManage form displayManage displayDeleteAutomatic ListManage fieldsManage form displayManage displayDeleteBioManage fieldsManage form displayManage displayDeleteBook pageManage fieldsManage form displayManage displayDeleteCall To ActionManage fieldsManage form displayManage displayDeleteCaseManage fieldsManage form displayManage displayDeleteCode BlockManage fieldsManage form displayManage displayDeleteContactManage fieldsManage form displayManage displayDeleteEmergencyManage fieldsManage form displayManage displayDeleteEventManage fieldsManage form displayManage displayDeleteFAQManage fieldsManage form displayManage displayDeleteHeroManage fieldsManage form displayManage displayDeleteHow Do I (Step)Manage fieldsManage form displayManage displayDeleteHow Do IManage fieldsManage form displayManage displayDeleteIcon LinkManage fieldsManage form displayManage displayDeleteIcon ListManage fieldsManage form displayManage displayDeleteImportant DateManage fieldsManage form displayManage displayDeleteKnack embedManage fieldsManage form displayManage displayDeleteLanding PageManage fieldsManage form displayManage displayDeleteLaserfiche FormManage fieldsManage form displayManage displayDeleteLink CollectionManage fieldsManage form displayManage displayDeleteListing PageManage fieldsManage form displayManage displayDeleteLocationManage fieldsManage form displayManage displayDeleteNewsManage fieldsManage form displayManage displayDeleteOfficial RecordManage fieldsManage form displayManage displayDeleteOpinionManage fieldsManage form displayManage displayDeleteOrganizationManage fieldsManage form displayManage displayDeletePSGManage fieldsManage form displayManage displayDeletePress ReleaseManage fieldsManage form displayManage displayDeleteProgram or ServiceManage fieldsManage form displayManage displayDeletePromoManage fieldsManage form displayManage displayDeleteQuickbase embedManage fieldsManage form displayManage displayDeleteQuoteManage fieldsManage form displayManage displayDeleteReponsive iFrameManage fieldsManage form displayManage displayDeleteSubject PageManage fieldsManage form displayManage displayDeleteSuper ServiceManage fieldsManage form displayManage displayDeleteText BlockManage fieldsManage form displayManage displayDeleteTileManage fieldsManage form displayManage displayDeleteTilesetManage fieldsManage form displayManage displayDeleteTopic PageManage fieldsManage form displayManage displayDeleteWebformManage fieldsManage form displayManage displayDeleteDisplay modesForm modesAdd form modeView modesAdd view modeMedia typesAdd media typeDocumentManage fieldsManage form displayManage displayDeleteIconManage fieldsManage form displayManage displayDeleteImageManage fieldsManage form displayManage displayDeleteOfficial Record HeaderManage fieldsManage form displayManage displayDeleteRemote mediaManage fieldsManage form displayManage displayDeleteRemote videoManage fieldsManage form displayManage displayDeleteSVG ImageManage fieldsManage form displayManage displayDeleteMenusAdd menuAdministrationAdd linkAgency Footer 1Add linkDeleteAgency Footer 2Add linkDeleteFooterAdd linkMain navigationAdd linkToolsAdd linkUser account menuAdd linkMigrationsMigrate Source UIMigrate Source UI SettingsTaxonomyAdd vocabularyBio TypeManage fieldsManage form displayManage displayDeleteCategoriesManage fieldsManage form displayManage displayDeleteContact TypeManage fieldsManage form displayManage displayDeleteDesign TreatmentManage fieldsManage form displayManage displayDeleteDivision / SectionManage fieldsManage form displayManage displayDeleteDocument TypeManage fieldsManage form displayManage displayDeleteEvent TypeManage fieldsManage form displayManage displayDeleteForm TypeManage fieldsManage form displayManage displayDeleteIcon KeywordsManage fieldsManage form displayManage displayDeleteLink Collection Design TreatmentManage fieldsManage form displayManage displayDeleteLocation AreasManage fieldsManage form displayManage displayDeleteLocation TypeManage fieldsManage form displayManage displayDeleteNews TopicsManage fieldsManage form displayManage displayDeleteNews TypeManage fieldsManage form displayManage displayDeletePSG TopicsManage fieldsManage form displayManage displayDeletePress Release TypeManage fieldsManage form displayManage displayDeleteSearch TermsManage fieldsManage form displayManage displayDeleteService CategoryManage fieldsManage form displayManage displayDeleteViewsAdd viewWebformsAppearanceInstall new themeSettingsBartikGA ForestGA SevenSevenUpdateExtendInstall new moduleUninstall moduleUpdateConfigurationPeopleAccount settingsManage fieldsManage form displayManage displayCAPTCHA module settingsCAPTCHA examplesreCAPTCHAGA User Export (Auth0)User expireSystemAcquia Connector settingsBasic site settingsMail SystemCrazy EggFile metadata managerGeofield Map settingsGoogle AnalyticsShieldWebform Deter SettingsGeocoder configurationCronCron SnitchesBlock Blacklist SettingsSiteimprove PluginAuth0Security Kit settingsContent authoringEntity Usage SettingsEntity browsersEntity clone settingsGA Citation SettingsGA Content Share SettingsGA Document SettingsGA Footer SettingsGA Global SettingsGA Views Block SettingsGoogle Translator SettingsLinkitPathologic configurationSchedulerText formats and editorsText editor embed buttonsUser interfaceEasy BreadcrumbMenu BreadcrumbShortcutsAntibotDevelopmentPerformanceLogging and errorsMaintenance modeConfiguration Split SettingsConfiguration synchronizationImportExportEnvironment Indicator SettingsConfig Role Split SettingsMediaCrop typesFile hashFile systemImage EffectsImage stylesMedia settingsImage toolkitSearch and metadataURL aliasesXML SitemapMetatagSettingsSitemapURL redirectsAdd redirectSettingsRegional and languageRegional settingsDate and time formatsName formatsSecurityPassword PolicyWeb servicesJSON:APILocation Wait TimesMailgunSend test emailRSS publishingWorkflowWorkflowsPeopleAdd userPermissionsRolesAdd roleAdministratorDeleteEdit permissionsAnonymous userEdit permissionsAuthenticated userEdit permissionsCreatorDeleteEdit permissionsEditorDeleteEdit permissionsEditorial AssistantDeleteEdit permissionsEditorial LeadDeleteEdit permissionsEmergency Alerts EditorDeleteEdit permissionsReviewerDeleteEdit permissionsTaxonomy ManagerDeleteEdit permissionsActive UsersReportsAvailable updatesExpiring usersField listUsed in viewsStatus reportViews pluginsWebform pluginsHelpVertical orientation      
                
        Shortcuts
        User-defined shortcutsEdit shortcutsVertical orientation      
                
        
              
                
        Edit

              
                
        Tour

              
                
        Search
        SearchVertical orientation      
                
        jasmyne.epps
        User account actionsView profileEdit profileLog outVertical orientation      
                
        (v124) Prod
        Environment switcherConfigureVertical orientation      
                
        Subscription active (expires 2020/6/30)
              
      
  


      
      
    
        
    
  
    
        
      
    
        
      Digital Services Georgia
    
    

  

    
  

  
    
      
    
  
    
        
    Breadcrumb
    
          
                  Home
              
          
                  QA Features.pdf
              
          
                  Replace &lt;em class=&quot;placeholder&quot;>QA Features.pdf&lt;/em> everywhere
              
        
  

  

  

    
      
        
    
    
          
                  Error message
                    There are security updates available for one or more of your modules or themes. To ensure the security of your server, you should update immediately! See the available updates page for more information.
                
      
    


  

              
    
  
    
      
  Replace QA Features.pdf everywhere


  

  
    
      
  Document QA Features.pdf will be replaced by MCQA Document - Cloning globally. Do you want to continue?This action cannot be undone.The following operations will be performed:Since MCQA Document - Cloning does not have a public URL yet, it will be assigned QA Features.pdf's human-friendly URL, if existing.QA Features.pdf will be moved to the Trash bin after this operation is finished.









  

  

    

  

  

    
    
  {&quot;path&quot;:{&quot;baseUrl&quot;:&quot;\/&quot;,&quot;scriptPath&quot;:null,&quot;pathPrefix&quot;:&quot;&quot;,&quot;currentPath&quot;:&quot;media\/4301\/replace-everywhere&quot;,&quot;currentPathIsAdmin&quot;:true,&quot;isFront&quot;:false,&quot;currentLanguage&quot;:&quot;en&quot;,&quot;currentQuery&quot;:{&quot;destination&quot;:&quot;\/admin\/content\/document&quot;}},&quot;pluralDelimiter&quot;:&quot;\u0003&quot;,&quot;ajaxPageState&quot;:{&quot;libraries&quot;:&quot;acquia_connector\/acquia_connector.icons,admin_toolbar\/search,admin_toolbar\/toolbar.tree,admin_toolbar_tools\/toolbar.icon,big_pipe\/big_pipe,classy\/base,classy\/messages,contextual\/drupal.contextual-links,contextual\/drupal.contextual-toolbar,core\/drupal.active-link,core\/html5shiv,core\/jquery.form,core\/normalize,entity_browser\/common,entity_browser\/modal,environment_indicator\/drupal.environment_indicator,ga_core\/site_improve,genpass\/genpass,seven\/global-styling,shortcut\/drupal.shortcut,siteimprove\/siteimprove,siteimprove\/siteimprove.overlay,toolbar\/toolbar,toolbar\/toolbar.escapeAdmin,tour\/tour,user\/drupal.user.icons&quot;,&quot;theme&quot;:&quot;ga_seven&quot;,&quot;theme_token&quot;:&quot;Ui2rEtNlm6L88x-JHaSStrwKCEVk7yDZiYkmvuxqfzs&quot;},&quot;ajaxTrustedUrl&quot;:{&quot;form_action_p_pvdeGsVG5zNF_XLGPTvYSKCf43t8qZYSwcfZl2uzM&quot;:true,&quot;\/document\/document\/qa-featurespdf\/replace-everywhere?destination=\/admin\/content\/document\u0026ajax_form=1&quot;:true},&quot;bigPipePlaceholderIds&quot;:{&quot;callback=Drupal%5CCore%5CRender%5CElement%5CStatusMessages%3A%3ArenderMessages\u0026args%5B0%5D\u0026token=_HAdUpwWmet0TOTe2PSiJuMntExoshbm1kh2wQzzzAA&quot;:true,&quot;callback=user.toolbar_link_builder%3ArenderToolbarLinks\u0026\u0026token=xssKdKFVFD7N0FUPPcC1C7LrqMHpQFVzUhrI4cOeEgs&quot;:true,&quot;callback=user.toolbar_link_builder%3ArenderDisplayName\u0026\u0026token=-MH2NzEnTzbzMk0ZGfGgoiw7G3j_-Q1ILWBRVhIOKLI&quot;:true},&quot;siteimprove&quot;:{&quot;token&quot;:&quot;0861d71cf15d48128b3fa679d1210f32&quot;,&quot;domain&quot;:{&quot;url&quot;:&quot;https:\/\/test.prod.dsga.codes\/document\/document\/qa-featurespdf\/replace-everywhere&quot;,&quot;auto&quot;:true}},&quot;entity_browser&quot;:{&quot;Ywe_jzWG8EQZ8Sq7bv0sZ8wWufqiFcdWBluiJLMCR-Y&quot;:{&quot;cardinality&quot;:1,&quot;selection_mode&quot;:&quot;selection_append&quot;,&quot;selector&quot;:&quot;#edit-replace-browser-target&quot;,&quot;auto_open&quot;:false},&quot;modal&quot;:{&quot;Ywe_jzWG8EQZ8Sq7bv0sZ8wWufqiFcdWBluiJLMCR-Y&quot;:{&quot;uuid&quot;:&quot;Ywe_jzWG8EQZ8Sq7bv0sZ8wWufqiFcdWBluiJLMCR-Y&quot;,&quot;js_callbacks&quot;:[&quot;Drupal.entityBrowser.selectionCompleted&quot;],&quot;original_path&quot;:&quot;\/media\/4301\/replace-everywhere&quot;,&quot;auto_open&quot;:false}}},&quot;ajax&quot;:{&quot;edit-replace-browser-target&quot;:{&quot;callback&quot;:[&quot;Drupal\\ga_document\\Form\\ReplaceEverywhereForm&quot;,&quot;updateCallback&quot;],&quot;wrapper&quot;:&quot;replacement-ajax-container&quot;,&quot;event&quot;:&quot;entity_browser_value_updated&quot;,&quot;url&quot;:&quot;\/document\/document\/qa-featurespdf\/replace-everywhere?destination=\/admin\/content\/document\u0026ajax_form=1&quot;,&quot;dialogType&quot;:&quot;ajax&quot;,&quot;submit&quot;:{&quot;_triggering_element_name&quot;:&quot;replace_browser[entity_ids]&quot;}},&quot;edit-replace-browser-entity-browser-open-modal&quot;:{&quot;callback&quot;:[{},&quot;openModal&quot;],&quot;event&quot;:&quot;click&quot;,&quot;url&quot;:&quot;\/document\/document\/qa-featurespdf\/replace-everywhere?destination=\/admin\/content\/document\u0026ajax_form=1&quot;,&quot;dialogType&quot;:&quot;ajax&quot;,&quot;submit&quot;:{&quot;_triggering_element_name&quot;:&quot;replace_browser_entity_browser&quot;,&quot;_triggering_element_value&quot;:&quot;Add Document&quot;}}},&quot;toolbar&quot;:{&quot;breakpoints&quot;:{&quot;toolbar.narrow&quot;:&quot;only screen and (min-width: 16.5em)&quot;,&quot;toolbar.standard&quot;:&quot;only screen and (min-width: 38.125em)&quot;,&quot;toolbar.wide&quot;:&quot;only screen and (min-width: 61em)&quot;},&quot;subtreesHash&quot;:&quot;0e0S8k0IZ9iFsM0dpyIrxBW1bsZ4XhQcOwRstfLtChg&quot;},&quot;environmentIndicator&quot;:{&quot;name&quot;:&quot;Prod&quot;,&quot;fgColor&quot;:&quot;#FFF4E7&quot;,&quot;bgColor&quot;:&quot;#B01116&quot;,&quot;addFavicon&quot;:true},&quot;adminToolbarSearch&quot;:{&quot;loadExtraLinks&quot;:true},&quot;user&quot;:{&quot;uid&quot;:&quot;11206&quot;,&quot;permissionsHash&quot;:&quot;f6b5ef0108c805b42eb74df716f272befa20532567a54e62639c6fb5672ac1cb&quot;}}








    
    [{&quot;command&quot;:&quot;insert&quot;,&quot;method&quot;:&quot;replaceWith&quot;,&quot;selector&quot;:&quot;[data-big-pipe-placeholder-id=\u0022callback=user.toolbar_link_builder%3ArenderDisplayName\u0026\u0026token=-MH2NzEnTzbzMk0ZGfGgoiw7G3j_-Q1ILWBRVhIOKLI\u0022]&quot;,&quot;data&quot;:&quot;jasmyne.epps&quot;,&quot;settings&quot;:null}]
        
    [{&quot;command&quot;:&quot;insert&quot;,&quot;method&quot;:&quot;replaceWith&quot;,&quot;selector&quot;:&quot;[data-big-pipe-placeholder-id=\u0022callback=user.toolbar_link_builder%3ArenderToolbarLinks\u0026\u0026token=xssKdKFVFD7N0FUPPcC1C7LrqMHpQFVzUhrI4cOeEgs\u0022]&quot;,&quot;data&quot;:&quot;\u003Cul class=\u0022toolbar-menu\u0022\u003E\u003Cli class=\u0022account\u0022\u003E\u003Ca href=\u0022\/user\u0022 title=\u0022User account\u0022\u003EView profile\u003C\/a\u003E\u003C\/li\u003E\u003Cli class=\u0022account-edit\u0022\u003E\u003Ca href=\u0022\/user\/11206\/edit\u0022 title=\u0022Edit user account\u0022\u003EEdit profile\u003C\/a\u003E\u003C\/li\u003E\u003Cli class=\u0022logout\u0022\u003E\u003Ca href=\u0022\/user\/logout\u0022\u003ELog out\u003C\/a\u003E\u003C\/li\u003E\u003C\/ul\u003E&quot;,&quot;settings&quot;:null}]
        
    [{&quot;command&quot;:&quot;insert&quot;,&quot;method&quot;:&quot;replaceWith&quot;,&quot;selector&quot;:&quot;[data-big-pipe-placeholder-id=\u0022callback=Drupal%5CCore%5CRender%5CElement%5CStatusMessages%3A%3ArenderMessages\u0026args%5B0%5D\u0026token=_HAdUpwWmet0TOTe2PSiJuMntExoshbm1kh2wQzzzAA\u0022]&quot;,&quot;data&quot;:&quot;\u003Cdiv data-drupal-messages\u003E\n    \u003Cdiv role=\u0022contentinfo\u0022 aria-label=\u0022Error message\u0022 class=\u0022messages messages--error\u0022\u003E\n          \u003Cdiv role=\u0022alert\u0022\u003E\n                  \u003Ch2 class=\u0022visually-hidden\u0022\u003EError message\u003C\/h2\u003E\n                    There are security updates available for one or more of your modules or themes. To ensure the security of your server, you should update immediately! See the \u003Ca href=\u0022\/admin\/reports\/updates\u0022\u003Eavailable updates\u003C\/a\u003E page for more information.\n                \u003C\/div\u003E\n      \u003C\/div\u003E\n    \u003C\/div\u003E\n&quot;,&quot;settings&quot;:null}]
    

window.NREUM||(NREUM={});NREUM.info={&quot;beacon&quot;:&quot;bam.nr-data.net&quot;,&quot;licenseKey&quot;:&quot;5360c08ecf&quot;,&quot;applicationID&quot;:&quot;317737043,308637395&quot;,&quot;transactionName&quot;:&quot;NQFQMhAADBZRUBFYCwxLcwUWCA0LH3cXRBQDCG4TEQQQOWRcCl0GAxZ+DwwKIBBZXwFUFk9aQAMMBQcXZFwKXQYDFn4PDAoR&quot;,&quot;queueTime&quot;:0,&quot;applicationTime&quot;:246,&quot;atts&quot;:&quot;GUZTRFgaHxg=&quot;,&quot;errorBeacon&quot;:&quot;bam.nr-data.net&quot;,&quot;agent&quot;:&quot;&quot;}

Tray &quot;Administration menu&quot; opened./html[@class=&quot;no-touchevents details js&quot;]Login</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;no-touchevents details js&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>//*/text()[normalize-space(.)='']/parent::*</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//html</value>
   </webElementXpaths>
</WebElementEntity>
