'with' @ [23:73] ==> @InlineOnly public inline fun <T, R> with(receiver: SignatureBuildingComponents, block: SignatureBuildingComponents.() -> T): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignatureBuildingComponents
    <R> -> T

'SignatureBuildingComponents' @ [23:78] ==> public object SignatureBuildingComponents defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureBuilding.kt[FakeCallableDescriptorForObject]

'block' @ [23:107] ==> value-parameter block: SignatureBuildingComponents.() -> T defined in org.jetbrains.kotlin.load.kotlin.signatures[ValueParameterDescriptorImpl]

'name' @ [26:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.javaLang[ValueParameterDescriptorImpl]

'name' @ [27:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.javaUtil[ValueParameterDescriptorImpl]

'name' @ [28:59] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.javaFunction[ValueParameterDescriptorImpl]

'signatures' @ [30:51] ==> value-parameter vararg signatures: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.constructors[ValueParameterDescriptorImpl]

'map' @ [30:62] ==> public inline fun <T, R> Array<out String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [30:77] ==> value-parameter it: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.constructors.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [30:85] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'inClass' @ [32:63] ==> public final fun inClass(internalName: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaLang' @ [32:71] ==> public final fun javaLang(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'name' @ [32:80] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.inJavaLang[ValueParameterDescriptorImpl]

'signatures' @ [32:88] ==> value-parameter vararg signatures: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.inJavaLang[ValueParameterDescriptorImpl]

'inClass' @ [33:63] ==> public final fun inClass(internalName: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaUtil' @ [33:71] ==> public final fun javaUtil(name: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'name' @ [33:80] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.inJavaUtil[ValueParameterDescriptorImpl]

'signatures' @ [33:88] ==> value-parameter vararg signatures: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.inJavaUtil[ValueParameterDescriptorImpl]

'signatures' @ [35:68] ==> value-parameter vararg signatures: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.inClass[ValueParameterDescriptorImpl]

'mapTo' @ [35:79] ==> public inline fun <T, R, C : MutableCollection<in String>> Array<out String>.mapTo(destination: LinkedHashSet<String>, transform: (String) -> String): LinkedHashSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String
    <C : MutableCollection<in R>> -> LinkedHashSet<String>

'LinkedHashSet' @ [35:85] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'internalName' @ [35:104] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.inClass[ValueParameterDescriptorImpl]

'it' @ [35:125] ==> value-parameter it: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.inClass.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [37:78] ==> public final fun signature(internalName: String, jvmDescriptor: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [37:88] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.signature[ValueParameterDescriptorImpl]

'internalName' @ [37:104] ==> internal val ClassDescriptor.internalName: String defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureMapping.kt[PropertyDescriptorImpl]

'jvmDescriptor' @ [37:118] ==> value-parameter jvmDescriptor: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.signature[ValueParameterDescriptorImpl]

'signature' @ [38:62] ==> public final fun signature(internalName: String, jvmDescriptor: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'classId' @ [38:72] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.signature[ValueParameterDescriptorImpl]

'internalName' @ [38:80] ==> internal val ClassId.internalName: String defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureMapping.kt[PropertyDescriptorImpl]

'jvmDescriptor' @ [38:94] ==> value-parameter jvmDescriptor: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.signature[ValueParameterDescriptorImpl]

'internalName' @ [39:66] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.signature[ValueParameterDescriptorImpl]

'jvmDescriptor' @ [39:87] ==> value-parameter jvmDescriptor: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.signature[ValueParameterDescriptorImpl]

'jvmDescriptor' @ [42:13] ==> public final fun jvmDescriptor(name: String, parameters: List<String>, ret: String = ...): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'name' @ [42:27] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.jvmDescriptor[ValueParameterDescriptorImpl]

'parameters' @ [42:33] ==> value-parameter vararg parameters: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.jvmDescriptor[ValueParameterDescriptorImpl]

'asList' @ [42:44] ==> public fun <T> Array<out String>.asList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ret' @ [42:54] ==> value-parameter ret: String = ... defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.jvmDescriptor[ValueParameterDescriptorImpl]

'name' @ [44:15] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.jvmDescriptor[ValueParameterDescriptorImpl]

'parameters' @ [44:22] ==> value-parameter parameters: List<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.jvmDescriptor[ValueParameterDescriptorImpl]

'joinToString' @ [44:33] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'escapeClassName' @ [44:52] ==> private final fun escapeClassName(internalName: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'it' @ [44:68] ==> value-parameter it: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.jvmDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'escapeClassName' @ [44:77] ==> private final fun escapeClassName(internalName: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'ret' @ [44:108] ==> value-parameter ret: String = ... defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.jvmDescriptor[ValueParameterDescriptorImpl]

'if (internalName.length > 1) "L$internalName;" else internalName' @ [46:57] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'internalName' @ [46:61] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.escapeClassName[ValueParameterDescriptorImpl]

'length' @ [46:74] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'internalName' @ [46:89] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.escapeClassName[ValueParameterDescriptorImpl]

'internalName' @ [46:109] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents.escapeClassName[ValueParameterDescriptorImpl]

