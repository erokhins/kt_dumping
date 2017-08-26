'Volatile' @ [20:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'value' @ [23:19] ==> @Volatile private/*private to this*/ final var value: T? defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue[PropertyDescriptorImpl]

'_v1' @ [24:13] ==> val _v1: T? defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue.get[LocalVariableDescriptor]

'_v1' @ [25:20] ==> val _v1: T? defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue.get[LocalVariableDescriptor]

'synchronized' @ [28:16] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> T): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> T

'lock' @ [28:29] ==> public final val lock: Any defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue[PropertyDescriptorImpl]

'value' @ [29:23] ==> @Volatile private/*private to this*/ final var value: T? defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue[PropertyDescriptorImpl]

'Suppress' @ [31:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (_v2 != null) {
                _v2!!
            }
            else {
                val _v3 = init()
                this.value = _v3
                _v3
            }' @ [32:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T, elseBranch: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T

'_v2' @ [32:17] ==> val _v2: T? defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue.get.<anonymous>[LocalVariableDescriptor]

'_v2' @ [33:17] ==> val _v2: T? defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue.get.<anonymous>[LocalVariableDescriptor]

'invoke' @ [36:27] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'this' @ [37:17] ==> <this> defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue[LazyClassReceiverParameterDescriptor]

'value' @ [37:22] ==> @Volatile private/*private to this*/ final var value: T? defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue[PropertyDescriptorImpl]

'_v3' @ [37:30] ==> val _v3: T defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue.get.<anonymous>[LocalVariableDescriptor]

'_v3' @ [38:17] ==> val _v3: T defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue.get.<anonymous>[LocalVariableDescriptor]

'synchronized' @ [44:9] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'lock' @ [44:23] ==> public final val lock: Any defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue[PropertyDescriptorImpl]

'value' @ [45:13] ==> @Volatile private/*private to this*/ final var value: T? defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue[PropertyDescriptorImpl]

