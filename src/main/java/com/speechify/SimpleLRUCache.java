
package com.speechify;
import java.util.LinkedHashMap;
import java.util.Map;
public class SimpleLRUCache<T> implements LRUCache<T> {


private final int maxItemsCount;
private final Map<String,T> cache;

public SimpleLRUCache(int maxItemsCount){
  this.maxItemsCount = maxItemsCount;
  this.cache = new LinkedHashMap<String,t>(16,0.75f,true)

    {
      Override
      protected boolean removeFEntry(Map.Entry<String,T> eldest)
      {
        return size() > simpleLRUCache.this.maxItemsCount;
      }
    };
}
   Override
  public synchronized T get(String key){
     return cache.get(key);

   }

   Override
  public synchronized void  set(String key, T value){
    cache.put(key,value);

   }

