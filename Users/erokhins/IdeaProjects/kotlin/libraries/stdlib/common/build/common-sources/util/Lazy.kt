'kotlin.jvm.JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'InitializedLazyImpl' @ [28:44] ==> public constructor InitializedLazyImpl<out T>(value: T) defined in kotlin.InitializedLazyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'value' @ [28:64] ==> value-parameter value: T defined in kotlin.lazyOf[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [80:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'value' @ [81:93] ==> public abstract val value: T defined in kotlin.Lazy[PropertyDescriptorImpl]

'initializer' @ [111:43] ==> value-parameter initializer: () -> T defined in kotlin.SynchronizedLazyImpl.<init>[ValueParameterDescriptorImpl]

'Volatile' @ [112:5] ==> public constructor Volatile() defined in kotlin.Volatile[ClassConstructorDescriptorImpl]

'UNINITIALIZED_VALUE' @ [112:42] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'lock' @ [114:24] ==> value-parameter lock: Any? = ... defined in kotlin.SynchronizedLazyImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [114:32] ==> <this> defined in kotlin.SynchronizedLazyImpl[LazyClassReceiverParameterDescriptor]

'_value' @ [118:23] ==> @Volatile private final var _value: Any? defined in kotlin.SynchronizedLazyImpl[PropertyDescriptorImpl]

'_v1' @ [119:17] ==> val _v1: Any? defined in kotlin.SynchronizedLazyImpl.<get-value>[LocalVariableDescriptor]

'UNINITIALIZED_VALUE' @ [119:25] ==> private object UNINITIALIZED_VALUE defined in kotlin in file Lazy.kt[FakeCallableDescriptorForObject]

'Suppress' @ [120:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'_v1' @ [121:24] ==> val _v1: Any? defined in kotlin.SynchronizedLazyImpl.<get-value>[LocalVariableDescriptor]

'synchronized' @ [124:20] ==> public header inline fun <R> synchronized(lock: Any, crossinline block: () -> T): T defined in kotlin[SimpleFunctionDescriptorImpl]
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

