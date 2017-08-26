'this' @ [25:64] ==> public constructor TypeEnhancementInfo(map: Map<Int, JavaTypeQualifiers>) defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeEnhancementInfo[ClassConstructorDescriptorImpl]

'mapOf' @ [25:69] ==> public fun <K, V> mapOf(vararg pairs: Pair<Int, JavaTypeQualifiers>): Map<Int, JavaTypeQualifiers> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> JavaTypeQualifiers

'pairs' @ [25:76] ==> value-parameter vararg pairs: Pair<Int, JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeEnhancementInfo.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [30:58] ==> public fun <T> emptyList(): List<TypeEnhancementInfo?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeEnhancementInfo?

'JavaTypeQualifiers' @ [34:24] ==> internal constructor JavaTypeQualifiers(nullability: NullabilityQualifier?, mutability: MutabilityQualifier?, isNotNullTypeParameter: Boolean, isNullabilityQualifierForWarning: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[ClassConstructorDescriptorImpl]

'NULLABLE' @ [34:64] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'JavaTypeQualifiers' @ [36:28] ==> internal constructor JavaTypeQualifiers(nullability: NullabilityQualifier?, mutability: MutabilityQualifier?, isNotNullTypeParameter: Boolean, isNullabilityQualifierForWarning: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[ClassConstructorDescriptorImpl]

'NOT_NULL' @ [36:68] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'JavaTypeQualifiers' @ [38:28] ==> internal constructor JavaTypeQualifiers(nullability: NullabilityQualifier?, mutability: MutabilityQualifier?, isNotNullTypeParameter: Boolean, isNullabilityQualifierForWarning: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[ClassConstructorDescriptorImpl]

'NOT_NULL' @ [38:68] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'signatures' @ [40:57] ==> public inline fun <T> signatures(block: SignatureBuildingComponents.() -> Map<String, PredefinedFunctionEnhancementInfo>): Map<String, PredefinedFunctionEnhancementInfo> defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Map<String, PredefinedFunctionEnhancementInfo>

'javaLang' @ [41:20] ==> public final fun javaLang(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaFunction' @ [42:23] ==> public final fun javaFunction(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaFunction' @ [43:22] ==> public final fun javaFunction(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaFunction' @ [44:22] ==> public final fun javaFunction(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaFunction' @ [45:24] ==> public final fun javaFunction(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaFunction' @ [46:24] ==> public final fun javaFunction(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaFunction' @ [47:27] ==> public final fun javaFunction(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaUtil' @ [48:20] ==> public final fun javaUtil(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaUtil' @ [49:22] ==> public final fun javaUtil(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'enhancement' @ [51:5] ==> private inline fun enhancement(block: SignatureEnhancementBuilder.() -> Unit): Map<String, PredefinedFunctionEnhancementInfo> defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[SimpleFunctionDescriptorImpl]

'forClass' @ [52:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'javaUtil' @ [52:18] ==> public final fun javaUtil(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'function' @ [53:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [54:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFConsumer' @ [54:27] ==> val JFConsumer: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [54:39] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [54:53] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [57:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'javaLang' @ [57:18] ==> public final fun javaLang(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'function' @ [58:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'returns' @ [59:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'javaUtil' @ [59:25] ==> public final fun javaUtil(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'NOT_PLATFORM' @ [59:50] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [59:64] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [62:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'javaUtil' @ [62:18] ==> public final fun javaUtil(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'function' @ [63:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [64:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFPredicate' @ [64:27] ==> val JFPredicate: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [64:40] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [64:54] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [65:17] ==> public final fun returns(type: JvmPrimitiveType): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'BOOLEAN' @ [65:25] ==> enum entry BOOLEAN defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'function' @ [67:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'returns' @ [68:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JUStream' @ [68:25] ==> val JUStream: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [68:35] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [68:49] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [70:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'returns' @ [71:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JUStream' @ [71:25] ==> val JUStream: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [71:35] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [71:49] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [74:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'javaUtil' @ [74:18] ==> public final fun javaUtil(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'function' @ [75:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [76:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFUnaryOperator' @ [76:27] ==> val JFUnaryOperator: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [76:44] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [76:58] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [79:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'javaUtil' @ [79:18] ==> public final fun javaUtil(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'function' @ [80:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [81:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFBiConsumer' @ [81:27] ==> val JFBiConsumer: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [81:41] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [81:55] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [81:69] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [83:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [84:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [84:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [84:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [85:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [85:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [85:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [86:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [86:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NULLABLE' @ [86:35] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [88:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [89:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [89:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [89:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [90:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [90:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [90:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [91:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [91:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NULLABLE' @ [91:35] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [94:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [95:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [95:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [95:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [96:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [96:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [96:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [97:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [97:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [97:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [98:17] ==> public final fun returns(type: JvmPrimitiveType): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'BOOLEAN' @ [98:25] ==> enum entry BOOLEAN defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'function' @ [100:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [101:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFBiFunction' @ [101:27] ==> val JFBiFunction: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [101:41] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [101:55] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [101:69] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [101:83] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [103:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [104:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [104:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [104:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [105:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFBiFunction' @ [105:27] ==> val JFBiFunction: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [105:41] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [105:55] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NULLABLE' @ [105:69] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NULLABLE' @ [105:79] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [106:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [106:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NULLABLE' @ [106:35] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [110:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [111:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [111:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [111:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [112:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFFunction' @ [112:27] ==> val JFFunction: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [112:39] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [112:53] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [112:67] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [113:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [113:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [113:35] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [115:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [116:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [116:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [116:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [117:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFBiFunction' @ [117:27] ==> val JFBiFunction: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [117:41] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_PLATFORM' @ [117:55] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_NULLABLE' @ [117:69] ==> private val NOT_NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NULLABLE' @ [117:83] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [118:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [118:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NULLABLE' @ [118:35] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [120:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [121:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [121:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [121:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [122:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [122:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_NULLABLE' @ [122:37] ==> private val NOT_NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [123:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFBiFunction' @ [123:27] ==> val JFBiFunction: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [123:41] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_NULLABLE' @ [123:55] ==> private val NOT_NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_NULLABLE' @ [123:69] ==> private val NOT_NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NULLABLE' @ [123:83] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [124:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [124:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NULLABLE' @ [124:35] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [127:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JUOptional' @ [127:18] ==> val JUOptional: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'function' @ [128:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'returns' @ [129:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JUOptional' @ [129:25] ==> val JUOptional: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [129:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_NULLABLE' @ [129:51] ==> private val NOT_NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [131:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [132:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [132:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_NULLABLE' @ [132:37] ==> private val NOT_NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [133:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JUOptional' @ [133:25] ==> val JUOptional: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [133:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_NULLABLE' @ [133:51] ==> private val NOT_NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [135:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [136:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [136:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NULLABLE' @ [136:37] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [137:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JUOptional' @ [137:25] ==> val JUOptional: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [137:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_NULLABLE' @ [137:51] ==> private val NOT_NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [139:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'returns' @ [140:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [140:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_NULLABLE' @ [140:35] ==> private val NOT_NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'function' @ [142:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [143:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFConsumer' @ [143:27] ==> val JFConsumer: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [143:39] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'NOT_NULLABLE' @ [143:53] ==> private val NOT_NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [147:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'javaLang' @ [147:18] ==> public final fun javaLang(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'function' @ [148:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'returns' @ [149:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [149:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NULLABLE' @ [149:35] ==> private val NULLABLE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [153:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFPredicate' @ [153:18] ==> val JFPredicate: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'function' @ [154:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [155:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [155:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [155:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [156:17] ==> public final fun returns(type: JvmPrimitiveType): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'BOOLEAN' @ [156:25] ==> enum entry BOOLEAN defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'forClass' @ [159:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'javaFunction' @ [159:18] ==> public final fun javaFunction(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'function' @ [160:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [161:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [161:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [161:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [162:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [162:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [162:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [163:17] ==> public final fun returns(type: JvmPrimitiveType): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'BOOLEAN' @ [163:25] ==> enum entry BOOLEAN defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'forClass' @ [166:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFConsumer' @ [166:18] ==> val JFConsumer: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'function' @ [167:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [168:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [168:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [168:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [171:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFBiConsumer' @ [171:18] ==> val JFBiConsumer: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'function' @ [172:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [173:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [173:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [173:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [174:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [174:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [174:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [177:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFFunction' @ [177:18] ==> val JFFunction: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'function' @ [178:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [179:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [179:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [179:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [180:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [180:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [180:35] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [183:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JFBiFunction' @ [183:18] ==> val JFBiFunction: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'function' @ [184:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [185:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [185:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [185:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'parameter' @ [186:17] ==> public final fun parameter(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [186:27] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [186:37] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'returns' @ [187:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [187:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [187:35] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'forClass' @ [190:9] ==> public final inline fun forClass(internalName: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'javaFunction' @ [190:18] ==> public final fun javaFunction(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'function' @ [191:13] ==> public final fun function(name: String, block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[SimpleFunctionDescriptorImpl]

'returns' @ [192:17] ==> public final fun returns(type: String, vararg qualifiers: JavaTypeQualifiers): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'JLObject' @ [192:25] ==> val JLObject: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE.<anonymous>[LocalVariableDescriptor]

'NOT_PLATFORM' @ [192:35] ==> private val NOT_PLATFORM: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'SignatureEnhancementBuilder' @ [200:11] ==> public constructor SignatureEnhancementBuilder() defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[ClassConstructorDescriptorImpl]

'apply' @ [200:41] ==> @InlineOnly public inline fun <T> SignatureEnhancementBuilder.apply(block: SignatureEnhancementBuilder.() -> Unit): SignatureEnhancementBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignatureEnhancementBuilder

'block' @ [200:47] ==> value-parameter block: SignatureEnhancementBuilder.() -> Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancement[ValueParameterDescriptorImpl]

'build' @ [200:54] ==> public final fun build(): Map<String, PredefinedFunctionEnhancementInfo> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[SimpleFunctionDescriptorImpl]

'mutableMapOf' @ [203:30] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, PredefinedFunctionEnhancementInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> PredefinedFunctionEnhancementInfo

'ClassEnhancementBuilder' @ [206:13] ==> public constructor ClassEnhancementBuilder(className: String) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[ClassConstructorDescriptorImpl]

'internalName' @ [206:37] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.forClass[ValueParameterDescriptorImpl]

'invoke' @ [206:51] ==> public abstract operator fun SignatureEnhancementBuilder.ClassEnhancementBuilder.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'signatures' @ [210:13] ==> private final val signatures: MutableMap<String, PredefinedFunctionEnhancementInfo> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[PropertyDescriptorImpl]

'FunctionEnhancementBuilder' @ [210:27] ==> public constructor FunctionEnhancementBuilder(functionName: String) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[ClassConstructorDescriptorImpl]

'name' @ [210:54] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function[ValueParameterDescriptorImpl]

'apply' @ [210:60] ==> @InlineOnly public inline fun <T> SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.apply(block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit): SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionEnhancementBuilder

'block' @ [210:66] ==> value-parameter block: SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.() -> Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function[ValueParameterDescriptorImpl]

'build' @ [210:73] ==> public final fun build(): Pair<String, PredefinedFunctionEnhancementInfo> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[SimpleFunctionDescriptorImpl]

'mutableListOf' @ [214:38] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Pair<String, TypeEnhancementInfo?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, TypeEnhancementInfo?>

'to' @ [215:74] ==> public infix fun <A, B> String.to(that: Nothing?): Pair<String, Nothing?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Nothing?

'parameters' @ [218:17] ==> private final val parameters: MutableList<Pair<String, TypeEnhancementInfo?>> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[PropertyDescriptorImpl]

'type' @ [218:31] ==> value-parameter type: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.parameter[ValueParameterDescriptorImpl]

'if (pairs.isEmpty()) null else TypeEnhancementInfo(*pairs)' @ [219:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeEnhancementInfo?, elseBranch: TypeEnhancementInfo?): TypeEnhancementInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeEnhancementInfo?

'pairs' @ [219:29] ==> value-parameter vararg pairs: Pair<Int, JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.parameter[ValueParameterDescriptorImpl]

'isEmpty' @ [219:35] ==> @InlineOnly public inline fun <T> Array<out Pair<Int, JavaTypeQualifiers>>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, JavaTypeQualifiers>

'TypeEnhancementInfo' @ [219:56] ==> public constructor TypeEnhancementInfo(vararg pairs: Pair<Int, JavaTypeQualifiers>) defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeEnhancementInfo[ClassConstructorDescriptorImpl]

'pairs' @ [219:77] ==> value-parameter vararg pairs: Pair<Int, JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.parameter[ValueParameterDescriptorImpl]

'parameters' @ [222:17] ==> private final val parameters: MutableList<Pair<String, TypeEnhancementInfo?>> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[PropertyDescriptorImpl]

'type' @ [222:31] ==> value-parameter type: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.parameter[ValueParameterDescriptorImpl]

'if (qualifiers.isEmpty()) null else TypeEnhancementInfo(qualifiers.withIndex().associateBy({it.index}, {it.value}))' @ [223:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeEnhancementInfo?, elseBranch: TypeEnhancementInfo?): TypeEnhancementInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeEnhancementInfo?

'qualifiers' @ [223:29] ==> value-parameter vararg qualifiers: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.parameter[ValueParameterDescriptorImpl]

'isEmpty' @ [223:40] ==> @InlineOnly public inline fun <T> Array<out JavaTypeQualifiers>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeQualifiers

'TypeEnhancementInfo' @ [223:61] ==> public constructor TypeEnhancementInfo(map: Map<Int, JavaTypeQualifiers>) defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeEnhancementInfo[ClassConstructorDescriptorImpl]

'qualifiers' @ [223:81] ==> value-parameter vararg qualifiers: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.parameter[ValueParameterDescriptorImpl]

'withIndex' @ [223:92] ==> public fun <T> Array<out JavaTypeQualifiers>.withIndex(): Iterable<IndexedValue<JavaTypeQualifiers>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeQualifiers

'associateBy' @ [223:104] ==> public inline fun <T, K, V> Iterable<IndexedValue<JavaTypeQualifiers>>.associateBy(keySelector: (IndexedValue<JavaTypeQualifiers>) -> Int, valueTransform: (IndexedValue<JavaTypeQualifiers>) -> JavaTypeQualifiers): Map<Int, JavaTypeQualifiers> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<JavaTypeQualifiers>
    <K> -> Int
    <V> -> JavaTypeQualifiers

'it' @ [223:117] ==> value-parameter it: IndexedValue<JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.parameter.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [223:120] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'it' @ [223:129] ==> value-parameter it: IndexedValue<JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.parameter.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [223:132] ==> public final val value: JavaTypeQualifiers defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'returnType' @ [226:17] ==> private final var returnType: Pair<String, TypeEnhancementInfo?> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[PropertyDescriptorImpl]

'type' @ [226:30] ==> value-parameter type: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.returns[ValueParameterDescriptorImpl]

'TypeEnhancementInfo' @ [226:38] ==> public constructor TypeEnhancementInfo(vararg pairs: Pair<Int, JavaTypeQualifiers>) defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeEnhancementInfo[ClassConstructorDescriptorImpl]

'pairs' @ [226:59] ==> value-parameter vararg pairs: Pair<Int, JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.returns[ValueParameterDescriptorImpl]

'returnType' @ [229:17] ==> private final var returnType: Pair<String, TypeEnhancementInfo?> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[PropertyDescriptorImpl]

'type' @ [229:30] ==> value-parameter type: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.returns[ValueParameterDescriptorImpl]

'TypeEnhancementInfo' @ [229:38] ==> public constructor TypeEnhancementInfo(map: Map<Int, JavaTypeQualifiers>) defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeEnhancementInfo[ClassConstructorDescriptorImpl]

'qualifiers' @ [229:58] ==> value-parameter vararg qualifiers: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.returns[ValueParameterDescriptorImpl]

'withIndex' @ [229:69] ==> public fun <T> Array<out JavaTypeQualifiers>.withIndex(): Iterable<IndexedValue<JavaTypeQualifiers>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeQualifiers

'associateBy' @ [229:81] ==> public inline fun <T, K, V> Iterable<IndexedValue<JavaTypeQualifiers>>.associateBy(keySelector: (IndexedValue<JavaTypeQualifiers>) -> Int, valueTransform: (IndexedValue<JavaTypeQualifiers>) -> JavaTypeQualifiers): Map<Int, JavaTypeQualifiers> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<JavaTypeQualifiers>
    <K> -> Int
    <V> -> JavaTypeQualifiers

'it' @ [229:94] ==> value-parameter it: IndexedValue<JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.returns.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [229:97] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'it' @ [229:106] ==> value-parameter it: IndexedValue<JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.returns.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [229:109] ==> public final val value: JavaTypeQualifiers defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'returnType' @ [232:17] ==> private final var returnType: Pair<String, TypeEnhancementInfo?> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[PropertyDescriptorImpl]

'type' @ [232:30] ==> value-parameter type: JvmPrimitiveType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.returns[ValueParameterDescriptorImpl]

'desc' @ [232:35] ==> public final val JvmPrimitiveType.desc: String[MyPropertyDescriptor]

'with' @ [234:27] ==> @InlineOnly public inline fun <T, R> with(receiver: SignatureBuildingComponents, block: SignatureBuildingComponents.() -> Pair<String, PredefinedFunctionEnhancementInfo>): Pair<String, PredefinedFunctionEnhancementInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignatureBuildingComponents
    <R> -> Pair<String, PredefinedFunctionEnhancementInfo>

'SignatureBuildingComponents' @ [234:33] ==> public object SignatureBuildingComponents defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureBuilding.kt[FakeCallableDescriptorForObject]

'signature' @ [235:17] ==> public final fun signature(internalName: String, jvmDescriptor: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'className' @ [235:27] ==> public final val className: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder[PropertyDescriptorImpl]

'jvmDescriptor' @ [235:38] ==> public final fun jvmDescriptor(name: String, parameters: List<String>, ret: String = ...): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'functionName' @ [235:52] ==> public final val functionName: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[PropertyDescriptorImpl]

'parameters' @ [235:66] ==> private final val parameters: MutableList<Pair<String, TypeEnhancementInfo?>> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[PropertyDescriptorImpl]

'map' @ [235:77] ==> public inline fun <T, R> Iterable<Pair<String, TypeEnhancementInfo?>>.map(transform: (Pair<String, TypeEnhancementInfo?>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, TypeEnhancementInfo?>
    <R> -> String

'it' @ [235:83] ==> value-parameter it: Pair<String, TypeEnhancementInfo?> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.build.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [235:86] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'returnType' @ [235:95] ==> private final var returnType: Pair<String, TypeEnhancementInfo?> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[PropertyDescriptorImpl]

'first' @ [235:106] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'PredefinedFunctionEnhancementInfo' @ [236:25] ==> public constructor PredefinedFunctionEnhancementInfo(returnTypeInfo: TypeEnhancementInfo? = ..., parametersInfo: List<TypeEnhancementInfo?> = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo[ClassConstructorDescriptorImpl]

'returnType' @ [236:59] ==> private final var returnType: Pair<String, TypeEnhancementInfo?> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[PropertyDescriptorImpl]

'second' @ [236:70] ==> public final val second: TypeEnhancementInfo? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'parameters' @ [236:78] ==> private final val parameters: MutableList<Pair<String, TypeEnhancementInfo?>> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder[PropertyDescriptorImpl]

'map' @ [236:89] ==> public inline fun <T, R> Iterable<Pair<String, TypeEnhancementInfo?>>.map(transform: (Pair<String, TypeEnhancementInfo?>) -> TypeEnhancementInfo?): List<TypeEnhancementInfo?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, TypeEnhancementInfo?>
    <R> -> TypeEnhancementInfo?

'it' @ [236:95] ==> value-parameter it: Pair<String, TypeEnhancementInfo?> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder.build.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [236:98] ==> public final val second: TypeEnhancementInfo? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'signatures' @ [242:67] ==> private final val signatures: MutableMap<String, PredefinedFunctionEnhancementInfo> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancementBuilder[PropertyDescriptorImpl]

