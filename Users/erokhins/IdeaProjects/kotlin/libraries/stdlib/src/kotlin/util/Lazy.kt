'kotlin.jvm.JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'InitializedLazyImpl' @ [28:44] ==> public constructor InitializedLazyImpl<out T>(value: T) defined in kotlin.InitializedLazyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'value' @ [28:64] ==> value-parameter value: T defined in kotlin.lazyOf[ValueParameterDescriptorImpl]

'kotlin.jvm.JvmVersion' @ [39:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'SynchronizedLazyImpl' @ [40:54] ==> public constructor SynchronizedLazyImpl<out T>(initializer: () -> T, lock: Any? = ...) defined in kotlin.SynchronizedLazyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'initializer' @ [40:75] ==> value-parameter initializer: () -> T defined in kotlin.lazy[ValueParameterDescriptorImpl]

'kotlin.jvm.JvmVersion' @ [52:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'when (mode) {
            LazyThreadSafetyMode.SYNCHRONIZED -> SynchronizedLazyImpl(initializer)
            LazyThreadSafetyMode.PUBLICATION -> SafePublicationLazyImpl(initializer)
            LazyThreadSafetyMode.NONE -> UnsafeLazyImpl(initializer)
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Lazy<T>, entry1: Lazy<T>, entry2: Lazy<T>): Lazy<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Lazy<T>

'mode' @ [54:15] ==> value-parameter mode: LazyThreadSafetyMode defined in kotlin.lazy[ValueParameterDescriptorImpl]

'SYNCHRONIZED' @ [55:34] ==> enum entry SYNCHRONIZED defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'SynchronizedLazyImpl' @ [55:50] ==> public constructor SynchronizedLazyImpl<out T>(initializer: () -> T, lock: Any? = ...) defined in kotlin.SynchronizedLazyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'initializer' @ [55:71] ==> value-parameter initializer: () -> T defined in kotlin.lazy[ValueParameterDescriptorImpl]

'PUBLICATION' @ [56:34] ==> enum entry PUBLICATION defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'SafePublicationLazyImpl' @ [56:49] ==> public constructor SafePublicationLazyImpl<out T>(initializer: () -> T) defined in kotlin.SafePublicationLazyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'initializer' @ [56:73] ==> value-parameter initializer: () -> T defined in kotlin.lazy[ValueParameterDescriptorImpl]

'NONE' @ [57:34] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'UnsafeLazyImpl' @ [57:42] ==> public constructor UnsafeLazyImpl<out T>(initializer: () -> T) defined in kotlin.UnsafeLazyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'initializer' @ [57:57] ==> value-parameter initializer: () -> T defined in kotlin.lazy[ValueParameterDescriptorImpl]

'kotlin.jvm.JvmVersion' @ [71:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'SynchronizedLazyImpl' @ [72:66] ==> public constructor SynchronizedLazyImpl<out T>(initializer: () -> T, lock: Any? = ...) defined in kotlin.SynchronizedLazyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'initializer' @ [72:87] ==> value-parameter initializer: () -> T defined in kotlin.lazy[ValueParameterDescriptorImpl]

'lock' @ [72:100] ==> value-parameter lock: Any? defined in kotlin.lazy[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [80:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'value' @ [81:93] ==> public abstract val value: T defined in kotlin.Lazy[PropertyDescriptorImpl]

'initializer' @ [111:43] ==> value-parameter initializer: () -> T defined in kotlin.SynchronizedLazyImpl.<init>[ValueParameterDescriptorImpl]

'Volatile' @ [112:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'UNINITIALIZED_VALUE' @ [112:42] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'lock' @ [114:24] ==> value-parameter lock: Any? = ... defined in kotlin.SynchronizedLazyImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [114:32] ==> <this> defined in kotlin.SynchronizedLazyImpl[LazyClassReceiverParameterDescriptor]

'_value' @ [118:23] ==> @Volatile private final var _value: Any? defined in kotlin.SynchronizedLazyImpl[PropertyDescriptorImpl]

'_v1' @ [119:17] ==> val _v1: Any? defined in kotlin.SynchronizedLazyImpl.<get-value>[LocalVariableDescriptor]

'UNINITIALIZED_VALUE' @ [119:25] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'Suppress' @ [120:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'_v1' @ [121:24] ==> val _v1: Any? defined in kotlin.SynchronizedLazyImpl.<get-value>[LocalVariableDescriptor]

'synchronized' @ [124:20] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> T): T defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> T

'lock' @ [124:33] ==> private final val lock: Any defined in kotlin.SynchronizedLazyImpl[PropertyDescriptorImpl]

'_value' @ [125:27] ==> @Volatile private final var _value: Any? defined in kotlin.SynchronizedLazyImpl[PropertyDescriptorImpl]

'if (_v2 !== UNINITIALIZED_VALUE) {
                    @Suppress("UNCHECKED_CAST") (_v2 as T)
                }
                else {
                    val typedValue = initializer!!()
                    _value = typedValue
                    initializer = null
                    typedValue
                }' @ [126:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T, elseBranch: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T

'_v2' @ [126:21] ==> val _v2: Any? defined in kotlin.SynchronizedLazyImpl.<get-value>.<anonymous>[LocalVariableDescriptor]

'UNINITIALIZED_VALUE' @ [126:29] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'Suppress' @ [127:21] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'_v2' @ [127:50] ==> val _v2: Any? defined in kotlin.SynchronizedLazyImpl.<get-value>.<anonymous>[LocalVariableDescriptor]

'initializer' @ [130:38] ==> private/*private to this*/ final var initializer: (() -> T)? defined in kotlin.SynchronizedLazyImpl[PropertyDescriptorImpl]

'_value' @ [131:21] ==> @Volatile private final var _value: Any? defined in kotlin.SynchronizedLazyImpl[PropertyDescriptorImpl]

'typedValue' @ [131:30] ==> val typedValue: T defined in kotlin.SynchronizedLazyImpl.<get-value>.<anonymous>[LocalVariableDescriptor]

'initializer' @ [132:21] ==> private/*private to this*/ final var initializer: (() -> T)? defined in kotlin.SynchronizedLazyImpl[PropertyDescriptorImpl]

'typedValue' @ [133:21] ==> val typedValue: T defined in kotlin.SynchronizedLazyImpl.<get-value>.<anonymous>[LocalVariableDescriptor]

'_value' @ [138:45] ==> @Volatile private final var _value: Any? defined in kotlin.SynchronizedLazyImpl[PropertyDescriptorImpl]

'UNINITIALIZED_VALUE' @ [138:56] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'if (isInitialized()) value.toString() else "Lazy value not initialized yet."' @ [140:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isInitialized' @ [140:43] ==> public open fun isInitialized(): Boolean defined in kotlin.SynchronizedLazyImpl[SimpleFunctionDescriptorImpl]

'value' @ [140:60] ==> public open val value: T defined in kotlin.SynchronizedLazyImpl[PropertyDescriptorImpl]

'toString' @ [140:66] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'InitializedLazyImpl' @ [142:39] ==> public constructor InitializedLazyImpl<out T>(value: T) defined in kotlin.InitializedLazyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'value' @ [142:59] ==> public open val value: T defined in kotlin.SynchronizedLazyImpl[PropertyDescriptorImpl]

'initializer' @ [147:43] ==> value-parameter initializer: () -> T defined in kotlin.UnsafeLazyImpl.<init>[ValueParameterDescriptorImpl]

'UNINITIALIZED_VALUE' @ [148:32] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'_value' @ [152:17] ==> private final var _value: Any? defined in kotlin.UnsafeLazyImpl[PropertyDescriptorImpl]

'UNINITIALIZED_VALUE' @ [152:28] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'_value' @ [153:17] ==> private final var _value: Any? defined in kotlin.UnsafeLazyImpl[PropertyDescriptorImpl]

'initializer' @ [153:26] ==> private/*private to this*/ final var initializer: (() -> T)? defined in kotlin.UnsafeLazyImpl[PropertyDescriptorImpl]

'initializer' @ [154:17] ==> private/*private to this*/ final var initializer: (() -> T)? defined in kotlin.UnsafeLazyImpl[PropertyDescriptorImpl]

'Suppress' @ [156:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'_value' @ [157:20] ==> private final var _value: Any? defined in kotlin.UnsafeLazyImpl[PropertyDescriptorImpl]

'_value' @ [160:45] ==> private final var _value: Any? defined in kotlin.UnsafeLazyImpl[PropertyDescriptorImpl]

'UNINITIALIZED_VALUE' @ [160:56] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'if (isInitialized()) value.toString() else "Lazy value not initialized yet."' @ [162:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isInitialized' @ [162:43] ==> public open fun isInitialized(): Boolean defined in kotlin.UnsafeLazyImpl[SimpleFunctionDescriptorImpl]

'value' @ [162:60] ==> public open val value: T defined in kotlin.UnsafeLazyImpl[PropertyDescriptorImpl]

'toString' @ [162:66] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'InitializedLazyImpl' @ [164:39] ==> public constructor InitializedLazyImpl<out T>(value: T) defined in kotlin.InitializedLazyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'value' @ [164:59] ==> public open val value: T defined in kotlin.UnsafeLazyImpl[PropertyDescriptorImpl]

'value' @ [171:39] ==> public open val value: T defined in kotlin.InitializedLazyImpl[PropertyDescriptorImpl]

'toString' @ [171:45] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'kotlin.jvm.JvmVersion' @ [175:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'initializer' @ [177:43] ==> value-parameter initializer: () -> T defined in kotlin.SafePublicationLazyImpl.<init>[ValueParameterDescriptorImpl]

'Volatile' @ [178:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'UNINITIALIZED_VALUE' @ [178:42] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'UNINITIALIZED_VALUE' @ [180:30] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'_value' @ [184:17] ==> @Volatile private final var _value: Any? defined in kotlin.SafePublicationLazyImpl[PropertyDescriptorImpl]

'UNINITIALIZED_VALUE' @ [184:28] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'initializer' @ [185:40] ==> private/*private to this*/ final var initializer: (() -> T)? defined in kotlin.SafePublicationLazyImpl[PropertyDescriptorImpl]

'initializerValue' @ [187:21] ==> val initializerValue: (() -> T)? defined in kotlin.SafePublicationLazyImpl.<get-value>[LocalVariableDescriptor]

'invoke' @ [188:36] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'valueUpdater' @ [189:25] ==> private final val valueUpdater: (AtomicReferenceFieldUpdater<(SafePublicationLazyImpl<*>..SafePublicationLazyImpl<*>?), (Any..Any?)>..AtomicReferenceFieldUpdater<(SafePublicationLazyImpl<*>..SafePublicationLazyImpl<*>?), (Any..Any?)>?) defined in kotlin.SafePublicationLazyImpl.Companion[PropertyDescriptorImpl]

'compareAndSet' @ [189:38] ==> public abstract fun compareAndSet(p0: (SafePublicationLazyImpl<*>..SafePublicationLazyImpl<*>?), p1: (Any..Any?), p2: (Any..Any?)): Boolean defined in java.util.concurrent.atomic.AtomicReferenceFieldUpdater[JavaMethodDescriptor]

'this' @ [189:52] ==> <this> defined in kotlin.SafePublicationLazyImpl[LazyClassReceiverParameterDescriptor]

'UNINITIALIZED_VALUE' @ [189:58] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'newValue' @ [189:79] ==> val newValue: T defined in kotlin.SafePublicationLazyImpl.<get-value>[LocalVariableDescriptor]

'initializer' @ [190:25] ==> private/*private to this*/ final var initializer: (() -> T)? defined in kotlin.SafePublicationLazyImpl[PropertyDescriptorImpl]

'Suppress' @ [194:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'_value' @ [195:20] ==> @Volatile private final var _value: Any? defined in kotlin.SafePublicationLazyImpl[PropertyDescriptorImpl]

'_value' @ [198:45] ==> @Volatile private final var _value: Any? defined in kotlin.SafePublicationLazyImpl[PropertyDescriptorImpl]

'UNINITIALIZED_VALUE' @ [198:56] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'if (isInitialized()) value.toString() else "Lazy value not initialized yet."' @ [200:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isInitialized' @ [200:43] ==> public open fun isInitialized(): Boolean defined in kotlin.SafePublicationLazyImpl[SimpleFunctionDescriptorImpl]

'value' @ [200:60] ==> public open val value: T defined in kotlin.SafePublicationLazyImpl[PropertyDescriptorImpl]

'toString' @ [200:66] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'InitializedLazyImpl' @ [202:39] ==> public constructor InitializedLazyImpl<out T>(value: T) defined in kotlin.InitializedLazyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'value' @ [202:59] ==> public open val value: T defined in kotlin.SafePublicationLazyImpl[PropertyDescriptorImpl]

'newUpdater' @ [205:92] ==> public open fun <U : (Any..Any?), W : (Any..Any?)> newUpdater(p0: (Class<(SafePublicationLazyImpl<*>..SafePublicationLazyImpl<*>?)>..Class<(SafePublicationLazyImpl<*>..SafePublicationLazyImpl<*>?)>?), p1: (Class<(Any..Any?)>..Class<(Any..Any?)>?), p2: (String..String?)): (AtomicReferenceFieldUpdater<(SafePublicationLazyImpl<*>..SafePublicationLazyImpl<*>?), (Any..Any?)>..AtomicReferenceFieldUpdater<(SafePublicationLazyImpl<*>..SafePublicationLazyImpl<*>?), (Any..Any?)>?) defined in java.util.concurrent.atomic.AtomicReferenceFieldUpdater[JavaMethodDescriptor]
Inferred types:
    <U : (Any..Any?)> -> SafePublicationLazyImpl<*>
    <W : (Any..Any?)> -> Any

'SafePublicationLazyImpl' @ [206:17] ==> public companion object defined in kotlin.SafePublicationLazyImpl[FakeCallableDescriptorForObject]

'java' @ [206:48] ==> public val <T> KClass<SafePublicationLazyImpl<*>>.java: Class<SafePublicationLazyImpl<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SafePublicationLazyImpl<*>

'Any' @ [207:17] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [207:28] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

