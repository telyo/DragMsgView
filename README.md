# DragMsgView

![GIF](https://github.com/telyo/DragMsgView/blob/144153c35a989b16a69a7a3b4522dbd0a7b6b79f/GIF.gif?raw=true)

仿QQ 消息数量拖拽控件

```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```groovy
dependencies {
	        implementation 'com.github.telyo:DragMsgView:v1.0.1'
	}
```

### 使用

```java

mDragBall = new DragMsgView(this);
  @Override
public void onBindViewHolder(MyHolder holder, int position) {
     TextView tv = holder.itemView.findViewById(R.id.tv);
     tv.setText(date.get(position));
     final TextView dmv = holder.itemView.findViewById(R.id.dmv);
     dmv.setText("99+");
     mDragBall.bingTargetView(dmv, "99+");
  }

```



感谢：

https://blog.csdn.net/qq_31715429/article/details/54386934