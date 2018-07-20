# DragMsgView
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
	        implementation 'com.github.telyo:DragMsgView:v1.0.0'
	}
```

### 使用

```java
mDragBall = new DragMsgView(this);

mDragBall.bingTargetView(target, "99+");
```

