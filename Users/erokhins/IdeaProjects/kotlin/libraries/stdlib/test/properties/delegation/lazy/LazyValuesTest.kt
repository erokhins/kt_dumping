'lazy' @ [9:14] ==> public fun <T> lazy(initializer: () -> Int): Lazy<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'++' @ [10:9] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [10:11] ==> public final var result: Int defined in test.properties.delegation.lazy.LazyValTest[PropertyDescriptorImpl]

'Test' @ [13:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'a' @ [14:9] ==> public final val a: Int defined in test.properties.delegation.lazy.LazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [15:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [15:20] ==> public final val a: Int defined in test.properties.delegation.lazy.LazyValTest[PropertyDescriptorImpl]

'JvmVersion' @ [19:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'Volatile' @ [21:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'lazy' @ [22:14] ==> public fun <T> lazy(lock: Any?, initializer: () -> Int): Lazy<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'this' @ [22:19] ==> <this> defined in test.properties.delegation.lazy.SynchronizedLazyValTest[LazyClassReceiverParameterDescriptor]

'++' @ [23:9] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [23:11] ==> @Volatile public final var result: Int defined in test.properties.delegation.lazy.SynchronizedLazyValTest[PropertyDescriptorImpl]

'Test' @ [26:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'synchronized' @ [27:9] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Int

'this' @ [27:22] ==> <this> defined in test.properties.delegation.lazy.SynchronizedLazyValTest[LazyClassReceiverParameterDescriptor]

'thread' @ [28:31] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'a' @ [28:40] ==> public final val a: Int defined in test.properties.delegation.lazy.SynchronizedLazyValTest[PropertyDescriptorImpl]

'result' @ [29:13] ==> @Volatile public final var result: Int defined in test.properties.delegation.lazy.SynchronizedLazyValTest[PropertyDescriptorImpl]

'a' @ [30:13] ==> public final val a: Int defined in test.properties.delegation.lazy.SynchronizedLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [32:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [32:20] ==> public final val a: Int defined in test.properties.delegation.lazy.SynchronizedLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [33:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'result' @ [33:20] ==> @Volatile public final var result: Int defined in test.properties.delegation.lazy.SynchronizedLazyValTest[PropertyDescriptorImpl]

'lazy' @ [39:14] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> Int): Lazy<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'NONE' @ [39:40] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'++' @ [40:9] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [40:11] ==> public final var result: Int defined in test.properties.delegation.lazy.UnsafeLazyValTest[PropertyDescriptorImpl]

'Test' @ [43:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'a' @ [44:9] ==> public final val a: Int defined in test.properties.delegation.lazy.UnsafeLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [45:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [45:20] ==> public final val a: Int defined in test.properties.delegation.lazy.UnsafeLazyValTest[PropertyDescriptorImpl]

'lazy' @ [53:20] ==> public fun <T> lazy(initializer: () -> Nothing?): Lazy<Nothing?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing?

'resultA' @ [53:27] ==> public final var resultA: Int defined in test.properties.delegation.lazy.NullableLazyValTest[PropertyDescriptorImpl]

'lazy' @ [54:14] ==> public fun <T> lazy(initializer: () -> String?): Lazy<String?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'foo' @ [54:21] ==> public final fun foo(): String? defined in test.properties.delegation.lazy.NullableLazyValTest[SimpleFunctionDescriptorImpl]

'Test' @ [56:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'a' @ [57:9] ==> public final val a: Int? defined in test.properties.delegation.lazy.NullableLazyValTest[PropertyDescriptorImpl]

'b' @ [58:9] ==> public final val b: String? defined in test.properties.delegation.lazy.NullableLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [60:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [60:20] ==> public final val a: Int? defined in test.properties.delegation.lazy.NullableLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [61:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [61:20] ==> public final val b: String? defined in test.properties.delegation.lazy.NullableLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [62:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'resultA' @ [62:20] ==> public final var resultA: Int defined in test.properties.delegation.lazy.NullableLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [63:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'resultB' @ [63:20] ==> public final var resultB: Int defined in test.properties.delegation.lazy.NullableLazyValTest[PropertyDescriptorImpl]

'resultB' @ [67:9] ==> public final var resultB: Int defined in test.properties.delegation.lazy.NullableLazyValTest[PropertyDescriptorImpl]

'lazy' @ [76:20] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> Nothing?): Lazy<Nothing?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing?

'NONE' @ [76:46] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'resultA' @ [76:54] ==> public final var resultA: Int defined in test.properties.delegation.lazy.UnsafeNullableLazyValTest[PropertyDescriptorImpl]

'lazy' @ [77:14] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> String?): Lazy<String?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'NONE' @ [77:40] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'foo' @ [77:48] ==> public final fun foo(): String? defined in test.properties.delegation.lazy.UnsafeNullableLazyValTest[SimpleFunctionDescriptorImpl]

'Test' @ [79:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'a' @ [80:9] ==> public final val a: Int? defined in test.properties.delegation.lazy.UnsafeNullableLazyValTest[PropertyDescriptorImpl]

'b' @ [81:9] ==> public final val b: String? defined in test.properties.delegation.lazy.UnsafeNullableLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [83:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [83:20] ==> public final val a: Int? defined in test.properties.delegation.lazy.UnsafeNullableLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [84:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [84:20] ==> public final val b: String? defined in test.properties.delegation.lazy.UnsafeNullableLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [85:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'resultA' @ [85:20] ==> public final var resultA: Int defined in test.properties.delegation.lazy.UnsafeNullableLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [86:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'resultB' @ [86:20] ==> public final var resultB: Int defined in test.properties.delegation.lazy.UnsafeNullableLazyValTest[PropertyDescriptorImpl]

'resultB' @ [90:9] ==> public final var resultB: Int defined in test.properties.delegation.lazy.UnsafeNullableLazyValTest[PropertyDescriptorImpl]

'lazy' @ [97:22] ==> public fun <T> lazy(initializer: () -> ClassWithCustomEquality): Lazy<ClassWithCustomEquality> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassWithCustomEquality

'ClassWithCustomEquality' @ [97:29] ==> public constructor ClassWithCustomEquality(onEqualsCalled: () -> Unit) defined in test.properties.delegation.lazy.ClassWithCustomEquality[ClassConstructorDescriptorImpl]

'equalsCalled' @ [97:55] ==> public final var equalsCalled: Int defined in test.properties.delegation.lazy.IdentityEqualsIsUsedToUnescapeLazyValTest[PropertyDescriptorImpl]

'Test' @ [99:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'a' @ [100:9] ==> private final val a: ClassWithCustomEquality defined in test.properties.delegation.lazy.IdentityEqualsIsUsedToUnescapeLazyValTest[PropertyDescriptorImpl]

'a' @ [101:9] ==> private final val a: ClassWithCustomEquality defined in test.properties.delegation.lazy.IdentityEqualsIsUsedToUnescapeLazyValTest[PropertyDescriptorImpl]

'assertTrue' @ [102:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'equalsCalled' @ [102:20] ==> public final var equalsCalled: Int defined in test.properties.delegation.lazy.IdentityEqualsIsUsedToUnescapeLazyValTest[PropertyDescriptorImpl]

'equalsCalled' @ [102:61] ==> public final var equalsCalled: Int defined in test.properties.delegation.lazy.IdentityEqualsIsUsedToUnescapeLazyValTest[PropertyDescriptorImpl]

'invoke' @ [108:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'super' @ [109:16] ==> <this> defined in test.properties.delegation.lazy.ClassWithCustomEquality[LazyClassReceiverParameterDescriptor]

'equals' @ [109:22] ==> public open operator fun equals(other: Any?): Boolean defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'other' @ [109:29] ==> value-parameter other: Any? defined in test.properties.delegation.lazy.ClassWithCustomEquality.equals[ValueParameterDescriptorImpl]

