'File' @ [30:23] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'listOf' @ [31:34] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'writeFileIfContentChanged' @ [34:24] ==> @SuppressWarnings public open fun writeFileIfContentChanged(file: (File..File?), newText: (String..String?)): Unit defined in org.jetbrains.kotlin.generators.util.GeneratorsFileUtil[JavaMethodDescriptor]

'DEST_FILE' @ [34:50] ==> public val DEST_FILE: File defined in org.jetbrains.kotlin.generators.evaluate in file GenerateOperationsMap.kt[PropertyDescriptorImpl]

'generate' @ [34:61] ==> public fun generate(): String defined in org.jetbrains.kotlin.generators.evaluate in file GenerateOperationsMap.kt[SimpleFunctionDescriptorImpl]

'StringBuilder' @ [38:14] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'Printer' @ [39:13] ==> public constructor Printer(@NotNull p0: Appendable) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'sb' @ [39:21] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'p' @ [40:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [40:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'File' @ [40:15] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'readText' @ [40:43] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'p' @ [41:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [41:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [42:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [42:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [43:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [43:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [44:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [44:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [45:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [45:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [46:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [46:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [47:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [47:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'arrayListOf' @ [49:30] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Triple<String, List<KotlinType>, Boolean>> /* = ArrayList<Triple<String, List<KotlinType>, Boolean>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Triple<String, List<KotlinType>, Boolean>

'arrayListOf' @ [50:31] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Pair<String, List<KotlinType>>> /* = ArrayList<Pair<String, List<KotlinType>>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, List<KotlinType>>

'DefaultBuiltIns' @ [52:20] ==> public companion object defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns[FakeCallableDescriptorForObject]

'Instance' @ [52:36] ==> @JvmStatic public final val Instance: DefaultBuiltIns defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns.Companion[DeserializedPropertyDescriptor]

'Suppress' @ [53:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'builtIns' @ [54:29] ==> val builtIns: DefaultBuiltIns defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'builtInsPackageScope' @ [54:38] ==> public final val DefaultBuiltIns.builtInsPackageScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [54:59] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'filter' @ [55:14] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [55:23] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate.<anonymous>[ValueParameterDescriptorImpl]

'isPrimitiveType' @ [55:63] ==> public open fun isPrimitiveType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [55:79] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [55:82] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'allPrimitiveTypes' @ [57:24] ==> val allPrimitiveTypes: List<ClassDescriptor> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'builtIns' @ [57:44] ==> val builtIns: DefaultBuiltIns defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'string' @ [57:53] ==> public final val DefaultBuiltIns.string: ClassDescriptor[MyPropertyDescriptor]

'Suppress' @ [58:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'descriptor' @ [59:25] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'getMemberScope' @ [59:36] ==> @NotNull public abstract fun getMemberScope(@NotNull p0: (MutableList<out (TypeProjection..TypeProjection?)>..List<(TypeProjection..TypeProjection?)>)): MemberScope defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[JavaMethodDescriptor]

'listOf' @ [59:51] ==> @InlineOnly public inline fun <T> listOf(): List<(TypeProjection..TypeProjection?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.TypeProjection..org.jetbrains.kotlin.types.TypeProjection?)

'getContributedDescriptors' @ [59:61] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'filter' @ [60:18] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [60:27] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [60:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'EXCLUDED_FUNCTIONS' @ [60:56] ==> private val EXCLUDED_FUNCTIONS: List<String> defined in org.jetbrains.kotlin.generators.evaluate in file GenerateOperationsMap.kt[PropertyDescriptorImpl]

'contains' @ [60:75] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [60:84] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate.<anonymous>[ValueParameterDescriptorImpl]

'getName' @ [60:87] ==> @NotNull public abstract fun getName(): Name defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[JavaMethodDescriptor]

'asString' @ [60:97] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'functions' @ [62:26] ==> val functions: List<CallableDescriptor> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'function' @ [63:35] ==> val function: CallableDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'getParametersTypes' @ [63:44] ==> private fun CallableDescriptor.getParametersTypes(): List<KotlinType> defined in org.jetbrains.kotlin.generators.evaluate[SimpleFunctionDescriptorImpl]

'when (parametersTypes.size) {
                1 -> unaryOperationsMap.add(Triple(function.name.asString(), parametersTypes, function is FunctionDescriptor))
                2 -> binaryOperationsMap.add(function.name.asString() to parametersTypes)
                else -> throw IllegalStateException("Couldn't add following method from builtins to operations map: ${function.name} in class ${descriptor.name}")
            }' @ [65:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parametersTypes' @ [65:19] ==> val parametersTypes: List<KotlinType> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'size' @ [65:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'unaryOperationsMap' @ [66:22] ==> val unaryOperationsMap: ArrayList<Triple<String, List<KotlinType>, Boolean>> /* = ArrayList<Triple<String, List<KotlinType>, Boolean>> */ defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'add' @ [66:41] ==> public open fun add(element: Triple<String, List<KotlinType>, Boolean>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Triple' @ [66:45] ==> public constructor Triple<out A, out B, out C>(first: String, second: List<KotlinType>, third: Boolean) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> List<KotlinType>
    <out C> -> Boolean

'function' @ [66:52] ==> val function: CallableDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'name' @ [66:61] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [66:66] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'parametersTypes' @ [66:78] ==> val parametersTypes: List<KotlinType> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'function' @ [66:95] ==> val function: CallableDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'binaryOperationsMap' @ [67:22] ==> val binaryOperationsMap: ArrayList<Pair<String, List<KotlinType>>> /* = ArrayList<Pair<String, List<KotlinType>>> */ defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'add' @ [67:42] ==> public open fun add(element: Pair<String, List<KotlinType>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'function' @ [67:46] ==> val function: CallableDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'name' @ [67:55] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [67:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'parametersTypes' @ [67:74] ==> val parametersTypes: List<KotlinType> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'IllegalStateException' @ [68:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'function' @ [68:119] ==> val function: CallableDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'name' @ [68:128] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'descriptor' @ [68:145] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'name' @ [68:156] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'p' @ [73:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [73:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [74:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [74:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [75:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [75:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [76:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [76:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [77:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [77:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [78:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'pushIndent' @ [78:7] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'unaryOperationsMap' @ [80:38] ==> val unaryOperationsMap: ArrayList<Triple<String, List<KotlinType>, Boolean>> /* = ArrayList<Triple<String, List<KotlinType>, Boolean>> */ defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'iterator' @ [80:57] ==> public open fun iterator(): MutableIterator<Triple<String, List<KotlinType>, Boolean>> defined in java.util.ArrayList[JavaMethodDescriptor]

'unaryOperationsMapIterator' @ [81:12] ==> val unaryOperationsMapIterator: MutableIterator<Triple<String, List<KotlinType>, Boolean>> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'hasNext' @ [81:39] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'component1' @ [82:14] ==> public final operator fun component1(): String defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component2' @ [82:24] ==> public final operator fun component2(): List<KotlinType> defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component3' @ [82:36] ==> public final operator fun component3(): Boolean defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'unaryOperationsMapIterator' @ [82:50] ==> val unaryOperationsMapIterator: MutableIterator<Triple<String, List<KotlinType>, Boolean>> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'next' @ [82:77] ==> public abstract fun next(): Triple<String, List<KotlinType>, Boolean> defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'if (isFunction) "()" else ""' @ [83:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isFunction' @ [83:38] ==> val isFunction: Boolean defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'p' @ [84:9] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [84:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'parameters' @ [86:17] ==> val parameters: List<KotlinType> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'map' @ [86:28] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'it' @ [86:34] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.generators.evaluate.generate.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [86:37] ==> private fun KotlinType.asString(): String defined in org.jetbrains.kotlin.generators.evaluate in file GenerateOperationsMap.kt[SimpleFunctionDescriptorImpl]

'joinToString' @ [86:50] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'funcName' @ [88:21] ==> val funcName: String defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'funcName' @ [89:30] ==> val funcName: String defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'parenthesesOrBlank' @ [89:39] ==> val parenthesesOrBlank: String defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'renderCheckUnaryOperation' @ [90:17] ==> public fun renderCheckUnaryOperation(name: String, params: List<KotlinType>): String defined in org.jetbrains.kotlin.generators.evaluate[SimpleFunctionDescriptorImpl]

'funcName' @ [90:43] ==> val funcName: String defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'parameters' @ [90:53] ==> val parameters: List<KotlinType> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'if (unaryOperationsMapIterator.hasNext()) "," else ""' @ [92:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'unaryOperationsMapIterator' @ [92:21] ==> val unaryOperationsMapIterator: MutableIterator<Triple<String, List<KotlinType>, Boolean>> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'hasNext' @ [92:48] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'p' @ [95:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'popIndent' @ [95:7] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [96:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [96:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [98:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [98:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [100:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [100:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [101:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [101:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [102:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'pushIndent' @ [102:7] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'binaryOperationsMap' @ [104:39] ==> val binaryOperationsMap: ArrayList<Pair<String, List<KotlinType>>> /* = ArrayList<Pair<String, List<KotlinType>>> */ defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'iterator' @ [104:59] ==> public open fun iterator(): MutableIterator<Pair<String, List<KotlinType>>> defined in java.util.ArrayList[JavaMethodDescriptor]

'binaryOperationsMapIterator' @ [105:12] ==> val binaryOperationsMapIterator: MutableIterator<Pair<String, List<KotlinType>>> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'hasNext' @ [105:40] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'component1' @ [106:14] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [106:24] ==> public final operator fun component2(): List<KotlinType> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'binaryOperationsMapIterator' @ [106:38] ==> val binaryOperationsMapIterator: MutableIterator<Pair<String, List<KotlinType>>> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'next' @ [106:66] ==> public abstract fun next(): Pair<String, List<KotlinType>> defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'p' @ [107:9] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [107:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'parameters' @ [109:17] ==> val parameters: List<KotlinType> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'map' @ [109:28] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'it' @ [109:34] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.generators.evaluate.generate.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [109:37] ==> private fun KotlinType.asString(): String defined in org.jetbrains.kotlin.generators.evaluate in file GenerateOperationsMap.kt[SimpleFunctionDescriptorImpl]

'joinToString' @ [109:50] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'funcName' @ [111:21] ==> val funcName: String defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'funcName' @ [112:33] ==> val funcName: String defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'renderCheckBinaryOperation' @ [113:17] ==> public fun renderCheckBinaryOperation(name: String, params: List<KotlinType>): String defined in org.jetbrains.kotlin.generators.evaluate[SimpleFunctionDescriptorImpl]

'funcName' @ [113:44] ==> val funcName: String defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'parameters' @ [113:54] ==> val parameters: List<KotlinType> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'if (binaryOperationsMapIterator.hasNext()) "," else ""' @ [115:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'binaryOperationsMapIterator' @ [115:21] ==> val binaryOperationsMapIterator: MutableIterator<Pair<String, List<KotlinType>>> defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'hasNext' @ [115:49] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'p' @ [118:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'popIndent' @ [118:7] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [119:5] ==> val p: Printer defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'println' @ [119:7] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'sb' @ [121:12] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.generators.evaluate.generate[LocalVariableDescriptor]

'toString' @ [121:15] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'params' @ [125:31] ==> value-parameter params: List<KotlinType> defined in org.jetbrains.kotlin.generators.evaluate.renderCheckUnaryOperation[ValueParameterDescriptorImpl]

'fold' @ [125:38] ==> public inline fun <T, R> Iterable<KotlinType>.fold(initial: Boolean, operation: (Boolean, KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'a' @ [125:59] ==> value-parameter a: Boolean defined in org.jetbrains.kotlin.generators.evaluate.renderCheckUnaryOperation.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [125:64] ==> value-parameter b: KotlinType defined in org.jetbrains.kotlin.generators.evaluate.renderCheckUnaryOperation.<anonymous>[ValueParameterDescriptorImpl]

'isIntegerType' @ [125:66] ==> private fun KotlinType.isIntegerType(): Boolean defined in org.jetbrains.kotlin.generators.evaluate in file GenerateOperationsMap.kt[SimpleFunctionDescriptorImpl]

'!' @ [126:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAllParamsIntegers' @ [126:10] ==> val isAllParamsIntegers: Boolean defined in org.jetbrains.kotlin.generators.evaluate.renderCheckUnaryOperation[LocalVariableDescriptor]

'when(name) {
        "unaryMinus", "minus" -> "{ a -> a.$name() }"
        else -> "emptyUnaryFun"
    }' @ [130:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'name' @ [130:17] ==> value-parameter name: String defined in org.jetbrains.kotlin.generators.evaluate.renderCheckUnaryOperation[ValueParameterDescriptorImpl]

'name' @ [131:45] ==> value-parameter name: String defined in org.jetbrains.kotlin.generators.evaluate.renderCheckUnaryOperation[ValueParameterDescriptorImpl]

'params' @ [137:31] ==> value-parameter params: List<KotlinType> defined in org.jetbrains.kotlin.generators.evaluate.renderCheckBinaryOperation[ValueParameterDescriptorImpl]

'fold' @ [137:38] ==> public inline fun <T, R> Iterable<KotlinType>.fold(initial: Boolean, operation: (Boolean, KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'a' @ [137:59] ==> value-parameter a: Boolean defined in org.jetbrains.kotlin.generators.evaluate.renderCheckBinaryOperation.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [137:64] ==> value-parameter b: KotlinType defined in org.jetbrains.kotlin.generators.evaluate.renderCheckBinaryOperation.<anonymous>[ValueParameterDescriptorImpl]

'isIntegerType' @ [137:66] ==> private fun KotlinType.isIntegerType(): Boolean defined in org.jetbrains.kotlin.generators.evaluate in file GenerateOperationsMap.kt[SimpleFunctionDescriptorImpl]

'!' @ [138:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAllParamsIntegers' @ [138:10] ==> val isAllParamsIntegers: Boolean defined in org.jetbrains.kotlin.generators.evaluate.renderCheckBinaryOperation[LocalVariableDescriptor]

'when(name) {
        "plus" -> "{ a, b -> a.add(b) }"
        "minus" -> "{ a, b -> a.subtract(b) }"
        "div" -> "{ a, b -> a.divide(b) }"
        "times" -> "{ a, b -> a.multiply(b) }"
        "mod",
        "rem",
        "xor",
        "or",
        "and" -> "{ a, b -> a.$name(b) }"
        else -> "emptyBinaryFun"
    }' @ [142:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'name' @ [142:17] ==> value-parameter name: String defined in org.jetbrains.kotlin.generators.evaluate.renderCheckBinaryOperation[ValueParameterDescriptorImpl]

'name' @ [151:32] ==> value-parameter name: String defined in org.jetbrains.kotlin.generators.evaluate.renderCheckBinaryOperation[ValueParameterDescriptorImpl]

'isInt' @ [157:27] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [157:33] ==> <this> defined in org.jetbrains.kotlin.generators.evaluate.isIntegerType[ReceiverParameterDescriptorImpl]

'isShort' @ [158:27] ==> public open fun isShort(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [158:35] ==> <this> defined in org.jetbrains.kotlin.generators.evaluate.isIntegerType[ReceiverParameterDescriptorImpl]

'isByte' @ [159:27] ==> public open fun isByte(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [159:34] ==> <this> defined in org.jetbrains.kotlin.generators.evaluate.isIntegerType[ReceiverParameterDescriptorImpl]

'isLong' @ [160:27] ==> public open fun isLong(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [160:34] ==> <this> defined in org.jetbrains.kotlin.generators.evaluate.isIntegerType[ReceiverParameterDescriptorImpl]

'arrayListOf' @ [165:16] ==> public fun <T> arrayListOf(vararg elements: KotlinType): ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'containingDeclaration' @ [165:41] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'defaultType' @ [165:83] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'valueParameters' @ [166:5] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [166:21] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [166:27] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.generators.evaluate.getParametersTypes.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [166:30] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'forEach' @ [166:37] ==> @HidesMembers public inline fun <T> Iterable<KotlinType>.forEach(action: (KotlinType) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'list' @ [167:9] ==> val list: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.generators.evaluate.getParametersTypes[LocalVariableDescriptor]

'add' @ [167:14] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'makeNotNullable' @ [167:28] ==> @NotNull public open fun makeNotNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'it' @ [167:44] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.generators.evaluate.getParametersTypes.<anonymous>[ValueParameterDescriptorImpl]

'list' @ [169:12] ==> val list: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.generators.evaluate.getParametersTypes[LocalVariableDescriptor]

'constructor' @ [172:45] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [172:57] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'name' @ [172:81] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [172:86] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'toUpperCase' @ [172:97] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

