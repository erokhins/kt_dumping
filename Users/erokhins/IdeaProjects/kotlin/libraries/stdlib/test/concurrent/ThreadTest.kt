'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'Test' @ [13:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newFixedThreadPool' @ [15:30] ==> public open fun newFixedThreadPool(p0: Int): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'CountDownLatch' @ [16:25] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'pool' @ [17:9] ==> val pool: (ExecutorService..ExecutorService?) defined in test.concurrent.ThreadTest.scheduledTask[LocalVariableDescriptor]

'execute' @ [17:14] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'countDown' @ [18:13] ==> val countDown: CountDownLatch defined in test.concurrent.ThreadTest.scheduledTask[LocalVariableDescriptor]

'countDown' @ [18:23] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'assertTrue' @ [20:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'countDown' @ [20:20] ==> val countDown: CountDownLatch defined in test.concurrent.ThreadTest.scheduledTask[LocalVariableDescriptor]

'await' @ [20:30] ==> public open fun await(p0: Long, p1: (TimeUnit..TimeUnit?)): Boolean defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'SECONDS' @ [20:39] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'Test' @ [23:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newFixedThreadPool' @ [25:30] ==> public open fun newFixedThreadPool(p0: Int): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'pool' @ [26:22] ==> val pool: (ExecutorService..ExecutorService?) defined in test.concurrent.ThreadTest.callableInvoke[LocalVariableDescriptor]

'submit' @ [26:27] ==> public final fun <T : (Any..Any?)> submit(p0: (() -> (String..String?)..(() -> (String..String?))?)): (Future<(String..String?)>..Future<(String..String?)>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'assertEquals' @ [29:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (String..String?), actual: (String..String?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.String..kotlin.String?)

'future' @ [29:31] ==> val future: (Future<(String..String?)>..Future<(String..String?)>?) defined in test.concurrent.ThreadTest.callableInvoke[LocalVariableDescriptor]

'get' @ [29:38] ==> public abstract operator fun get(p0: Long, p1: (TimeUnit..TimeUnit?)): (String..String?) defined in java.util.concurrent.Future[JavaMethodDescriptor]

'SECONDS' @ [29:45] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'Test' @ [32:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ThreadLocal' @ [33:17] ==> public constructor ThreadLocal<T : (Any..Any?)>() defined in java.lang.ThreadLocal[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'assertEquals' @ [35:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'v' @ [35:28] ==> val v: ThreadLocal<String> defined in test.concurrent.ThreadTest.threadLocalGetOrSet[LocalVariableDescriptor]

'getOrSet' @ [35:30] ==> @InlineOnly public inline fun <T : Any> ThreadLocal<String>.getOrSet(default: () -> String): String defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'assertEquals' @ [36:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (String..String?), actual: (String..String?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.String..kotlin.String?)

'v' @ [36:28] ==> val v: ThreadLocal<String> defined in test.concurrent.ThreadTest.threadLocalGetOrSet[LocalVariableDescriptor]

'get' @ [36:30] ==> public open fun get(): (String..String?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'assertEquals' @ [37:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'v' @ [37:28] ==> val v: ThreadLocal<String> defined in test.concurrent.ThreadTest.threadLocalGetOrSet[LocalVariableDescriptor]

'getOrSet' @ [37:30] ==> @InlineOnly public inline fun <T : Any> ThreadLocal<String>.getOrSet(default: () -> String): String defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'v' @ [39:9] ==> val v: ThreadLocal<String> defined in test.concurrent.ThreadTest.threadLocalGetOrSet[LocalVariableDescriptor]

'set' @ [39:11] ==> public open fun set(p0: (String..String?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'assertEquals' @ [40:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'v' @ [40:28] ==> val v: ThreadLocal<String> defined in test.concurrent.ThreadTest.threadLocalGetOrSet[LocalVariableDescriptor]

'getOrSet' @ [40:30] ==> @InlineOnly public inline fun <T : Any> ThreadLocal<String>.getOrSet(default: () -> String): String defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'v' @ [42:9] ==> val v: ThreadLocal<String> defined in test.concurrent.ThreadTest.threadLocalGetOrSet[LocalVariableDescriptor]

'set' @ [42:11] ==> public open fun set(p0: (String..String?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'assertEquals' @ [43:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'v' @ [43:28] ==> val v: ThreadLocal<String> defined in test.concurrent.ThreadTest.threadLocalGetOrSet[LocalVariableDescriptor]

'getOrSet' @ [43:30] ==> @InlineOnly public inline fun <T : Any> ThreadLocal<String>.getOrSet(default: () -> String): String defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'ThreadLocal<String>' @ [46:25] ==> public constructor ThreadLocal<T : (Any..Any?)>() defined in java.lang.ThreadLocal[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'assertEquals' @ [50:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'w' @ [50:33] ==> val w: <no name provided> defined in test.concurrent.ThreadTest.threadLocalGetOrSet[LocalVariableDescriptor]

'getOrSet' @ [50:35] ==> @InlineOnly public inline fun <T : Any> ThreadLocal<String>.getOrSet(default: () -> String): String defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

