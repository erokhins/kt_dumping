'' @ [22:12] ==> private constructor JvmTarget(description: String) defined in org.jetbrains.kotlin.config.JvmTarget[ClassConstructorDescriptorImpl]

'' @ [23:12] ==> private constructor JvmTarget(description: String) defined in org.jetbrains.kotlin.config.JvmTarget[ClassConstructorDescriptorImpl]

'getValue' @ [26:33] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'when (this) {
            JVM_1_6 -> Opcodes.V1_6
            JVM_1_8 ->
                if (java.lang.Boolean.valueOf(System.getProperty("kotlin.test.substitute.bytecode.1.8.to.1.9"))) Opcodes.V1_9 else Opcodes.V1_8
        }' @ [27:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'this' @ [27:15] ==> <this> defined in org.jetbrains.kotlin.config.JvmTarget[LazyClassReceiverParameterDescriptor]

'JVM_1_6' @ [28:13] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'V1_6' @ [28:32] ==> public const final val V1_6: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'JVM_1_8' @ [29:13] ==> enum entry JVM_1_8 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'if (java.lang.Boolean.valueOf(System.getProperty("kotlin.test.substitute.bytecode.1.8.to.1.9"))) Opcodes.V1_9 else Opcodes.V1_8' @ [30:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'valueOf' @ [30:39] ==> public open fun valueOf(p0: (String..String?)): (Boolean..Boolean?) defined in java.lang.Boolean[JavaMethodDescriptor]

'getProperty' @ [30:54] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'V1_9' @ [30:122] ==> public const final val V1_9: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'V1_8' @ [30:140] ==> public const final val V1_8: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'JvmField' @ [35:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JVM_1_6' @ [36:23] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JvmStatic' @ [38:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'values' @ [39:42] ==> public final fun values(): Array<JvmTarget> defined in org.jetbrains.kotlin.config.JvmTarget[SimpleFunctionDescriptorImpl]

'find' @ [39:51] ==> @InlineOnly public inline fun <T> Array<out JvmTarget>.find(predicate: (JvmTarget) -> Boolean): JvmTarget? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmTarget

'it' @ [39:58] ==> value-parameter it: JvmTarget defined in org.jetbrains.kotlin.config.JvmTarget.Companion.fromString.<anonymous>[ValueParameterDescriptorImpl]

'description' @ [39:61] ==> public open val description: String defined in org.jetbrains.kotlin.config.JvmTarget[PropertyDescriptorImpl]

'string' @ [39:76] ==> value-parameter string: String defined in org.jetbrains.kotlin.config.JvmTarget.Companion.fromString[ValueParameterDescriptorImpl]

'values' @ [42:39] ==> public final fun values(): Array<JvmTarget> defined in org.jetbrains.kotlin.config.JvmTarget[SimpleFunctionDescriptorImpl]

'find' @ [42:48] ==> @InlineOnly public inline fun <T> Array<out JvmTarget>.find(predicate: (JvmTarget) -> Boolean): JvmTarget? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmTarget

'it' @ [42:55] ==> value-parameter it: JvmTarget defined in org.jetbrains.kotlin.config.JvmTarget.Companion.getDescription.<anonymous>[ValueParameterDescriptorImpl]

'bytecodeVersion' @ [42:58] ==> public final val bytecodeVersion: Int defined in org.jetbrains.kotlin.config.JvmTarget[PropertyDescriptorImpl]

'bytecodeVersion' @ [42:77] ==> value-parameter bytecodeVersion: Int defined in org.jetbrains.kotlin.config.JvmTarget.Companion.getDescription[ValueParameterDescriptorImpl]

'description' @ [42:96] ==> public open val description: String defined in org.jetbrains.kotlin.config.JvmTarget[PropertyDescriptorImpl]

'when (bytecodeVersion) {
                       Opcodes.V1_7 -> "1.7"
                       Opcodes.V1_9 -> "1.9"
                       else -> null
                   }' @ [43:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'bytecodeVersion' @ [43:26] ==> value-parameter bytecodeVersion: Int defined in org.jetbrains.kotlin.config.JvmTarget.Companion.getDescription[ValueParameterDescriptorImpl]

'V1_7' @ [44:32] ==> public const final val V1_7: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'V1_9' @ [45:32] ==> public const final val V1_9: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (platformDescription != null) "JVM target $platformDescription"
                    else "JVM bytecode version $bytecodeVersion"' @ [49:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'platformDescription' @ [49:24] ==> val platformDescription: String? defined in org.jetbrains.kotlin.config.JvmTarget.Companion.getDescription[LocalVariableDescriptor]

'platformDescription' @ [49:66] ==> val platformDescription: String? defined in org.jetbrains.kotlin.config.JvmTarget.Companion.getDescription[LocalVariableDescriptor]

'bytecodeVersion' @ [50:49] ==> value-parameter bytecodeVersion: Int defined in org.jetbrains.kotlin.config.JvmTarget.Companion.getDescription[ValueParameterDescriptorImpl]

