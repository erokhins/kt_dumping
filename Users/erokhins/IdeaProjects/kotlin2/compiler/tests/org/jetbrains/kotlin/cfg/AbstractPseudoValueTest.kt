'AbstractPseudocodeTest' @ [30:42] ==> public constructor AbstractPseudocodeTest() defined in org.jetbrains.kotlin.cfg.AbstractPseudocodeTest[JavaClassConstructorDescriptor]

'HashMap' @ [32:40] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PseudoValue
    <V : (Any..Any?)> -> TypePredicate

'LinkedHashMap' @ [35:35] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> PseudoValue

'pseudocode' @ [36:13] ==> value-parameter pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.getElementToValueMap[ValueParameterDescriptorImpl]

'correspondingElement' @ [36:24] ==> public open val correspondingElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[DeserializedPropertyDescriptor]

'accept' @ [36:45] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [36:61] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [38:21] ==> <this> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.getElementToValueMap.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitKtElement' @ [38:27] ==> public open fun visitKtElement(@NotNull p0: KtElement): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'element' @ [38:42] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.getElementToValueMap.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'pseudocode' @ [40:33] ==> value-parameter pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.getElementToValueMap[ValueParameterDescriptorImpl]

'getElementValue' @ [40:44] ==> public open fun getElementValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[DeserializedSimpleFunctionDescriptor]

'element' @ [40:60] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.getElementToValueMap.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'value' @ [41:25] ==> val value: PseudoValue? defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.getElementToValueMap.<no name provided>.visitKtElement[LocalVariableDescriptor]

'elementToValues' @ [42:25] ==> val elementToValues: LinkedHashMap<KtElement, PseudoValue> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.getElementToValueMap[LocalVariableDescriptor]

'put' @ [42:41] ==> public open fun put(key: KtElement, value: PseudoValue): PseudoValue? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'element' @ [42:45] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.getElementToValueMap.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'value' @ [42:54] ==> val value: PseudoValue? defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.getElementToValueMap.<no name provided>.visitKtElement[LocalVariableDescriptor]

'elementToValues' @ [46:20] ==> val elementToValues: LinkedHashMap<KtElement, PseudoValue> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.getElementToValueMap[LocalVariableDescriptor]

'element' @ [50:17] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.elementText[ValueParameterDescriptorImpl]

'text' @ [50:26] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'replace' @ [50:32] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [50:47] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expectedTypePredicateMap' @ [53:33] ==> val expectedTypePredicateMap: HashMap<PseudoValue, TypePredicate> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'getOrPut' @ [53:58] ==> public inline fun <K, V> MutableMap<PseudoValue, TypePredicate>.getOrPut(key: PseudoValue, defaultValue: () -> TypePredicate): TypePredicate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PseudoValue
    <V> -> TypePredicate

'value' @ [53:67] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.valueDecl[ValueParameterDescriptorImpl]

'getExpectedTypePredicate' @ [54:17] ==> public fun getExpectedTypePredicate(value: PseudoValue, bindingContext: BindingContext, builtIns: KotlinBuiltIns): TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedSimpleFunctionDescriptor]

'value' @ [54:42] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.valueDecl[ValueParameterDescriptorImpl]

'bindingContext' @ [54:49] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[ValueParameterDescriptorImpl]

'Instance' @ [54:81] ==> @JvmStatic public final val Instance: DefaultBuiltIns defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns.Companion[DeserializedPropertyDescriptor]

'value' @ [56:23] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.valueDecl[ValueParameterDescriptorImpl]

'debugName' @ [56:29] ==> public abstract val debugName: String defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'typePredicate' @ [56:42] ==> val typePredicate: TypePredicate defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.valueDecl[LocalVariableDescriptor]

'when {
                value.element != element -> "COPY"
                else -> value.createdAt?.let { "NEW: $it" } ?: ""
            }' @ [60:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'value' @ [61:17] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.valueDescription[ValueParameterDescriptorImpl]

'element' @ [61:23] ==> public abstract val element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'element' @ [61:34] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.valueDescription[ValueParameterDescriptorImpl]

'value' @ [62:25] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.valueDescription[ValueParameterDescriptorImpl]

'createdAt' @ [62:31] ==> public abstract val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'let' @ [62:42] ==> @InlineOnly public inline fun <T, R> InstructionWithValue.let(block: (InstructionWithValue) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InstructionWithValue
    <R> -> String

'it' @ [62:55] ==> value-parameter it: InstructionWithValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.valueDescription.<anonymous>[ValueParameterDescriptorImpl]

'getElementToValueMap' @ [66:31] ==> local final fun getElementToValueMap(pseudocode: PseudocodeImpl): Map<KtElement, PseudoValue> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[SimpleFunctionDescriptorImpl]

'pseudocode' @ [66:52] ==> value-parameter pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[ValueParameterDescriptorImpl]

'pseudocode' @ [67:29] ==> value-parameter pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[ValueParameterDescriptorImpl]

'instructions' @ [67:40] ==> public open val instructions: ArrayList<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[DeserializedPropertyDescriptor]

'mapNotNull' @ [68:18] ==> public inline fun <T, R : Any> Iterable<Instruction>.mapNotNull(transform: (Instruction) -> PseudoValue?): List<PseudoValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction
    <R : Any> -> PseudoValue

'it' @ [68:32] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.<anonymous>[ValueParameterDescriptorImpl]

'outputValue' @ [68:62] ==> public abstract val outputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithValue[DeserializedPropertyDescriptor]

'filter' @ [69:18] ==> public inline fun <T> Iterable<PseudoValue>.filter(predicate: (PseudoValue) -> Boolean): List<PseudoValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'it' @ [69:27] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [69:30] ==> public abstract val element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'sortedBy' @ [70:18] ==> public inline fun <T, R : Comparable<String>> Iterable<PseudoValue>.sortedBy(crossinline selector: (PseudoValue) -> String?): List<PseudoValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue
    <R : Comparable<R>> -> String

'it' @ [70:29] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.<anonymous>[ValueParameterDescriptorImpl]

'debugName' @ [70:32] ==> public abstract val debugName: String defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'elementToValues' @ [71:25] ==> val elementToValues: Map<KtElement, PseudoValue> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'values' @ [71:41] ==> public abstract val values: Collection<PseudoValue> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'unboundValues' @ [71:50] ==> val unboundValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'allValues' @ [72:13] ==> val allValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'isEmpty' @ [72:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'LinkedHashMap' @ [74:33] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Pair<PseudoValue, KtElement?>
    <V : (Any..Any?)> -> String

'unboundValues' @ [75:23] ==> val unboundValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'valueDescriptions' @ [76:13] ==> val valueDescriptions: LinkedHashMap<Pair<PseudoValue, KtElement?>, String> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'value' @ [76:31] ==> val value: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'valueDescription' @ [76:48] ==> local final fun valueDescription(element: KtElement?, value: PseudoValue): String defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[SimpleFunctionDescriptorImpl]

'value' @ [76:71] ==> val value: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'component1' @ [78:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtElement, PseudoValue>.component1(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> PseudoValue

'component2' @ [78:24] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtElement, PseudoValue>.component2(): PseudoValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> PseudoValue

'elementToValues' @ [78:34] ==> val elementToValues: Map<KtElement, PseudoValue> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'entries' @ [78:50] ==> public abstract val entries: Set<Map.Entry<KtElement, PseudoValue>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'valueDescriptions' @ [79:13] ==> val valueDescriptions: LinkedHashMap<Pair<PseudoValue, KtElement?>, String> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'value' @ [79:31] ==> val value: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'element' @ [79:40] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'valueDescription' @ [79:51] ==> local final fun valueDescription(element: KtElement?, value: PseudoValue): String defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[SimpleFunctionDescriptorImpl]

'element' @ [79:68] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'value' @ [79:77] ==> val value: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'elementToValues' @ [82:34] ==> val elementToValues: Map<KtElement, PseudoValue> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'keys' @ [82:50] ==> public abstract val keys: Set<KtElement> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [82:55] ==> public inline fun <T, R> Iterable<KtElement>.map(transform: (KtElement) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> Int

'elementText' @ [82:61] ==> local final fun elementText(element: KtElement?): String defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[SimpleFunctionDescriptorImpl]

'it' @ [82:73] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [82:77] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'max' @ [82:86] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'allValues' @ [83:32] ==> val allValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'map' @ [83:42] ==> public inline fun <T, R> Iterable<PseudoValue>.map(transform: (PseudoValue) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue
    <R> -> Int

'valueDecl' @ [83:48] ==> local final fun valueDecl(value: PseudoValue): String defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[SimpleFunctionDescriptorImpl]

'it' @ [83:58] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [83:62] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'max' @ [83:71] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'valueDescriptions' @ [84:36] ==> val valueDescriptions: LinkedHashMap<Pair<PseudoValue, KtElement?>, String> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'values' @ [84:54] ==> public open val values: MutableCollection<String> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'map' @ [84:61] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int

'it' @ [84:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [84:70] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'max' @ [84:79] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'component1' @ [86:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Pair<PseudoValue, KtElement?>, String>.component1(): Pair<PseudoValue, KtElement?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<PseudoValue, KtElement?>
    <V> -> String

'component2' @ [86:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Pair<PseudoValue, KtElement?>, String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<PseudoValue, KtElement?>
    <V> -> String

'valueDescriptions' @ [86:35] ==> val valueDescriptions: LinkedHashMap<Pair<PseudoValue, KtElement?>, String> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'entries' @ [86:53] ==> public open val entries: MutableSet<MutableMap.MutableEntry<Pair<PseudoValue, KtElement?>, String>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'component1' @ [87:18] ==> public final operator fun component1(): PseudoValue defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [87:25] ==> public final operator fun component2(): KtElement? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

've' @ [87:36] ==> val ve: Pair<PseudoValue, KtElement?> defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'out' @ [88:13] ==> value-parameter out: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[ValueParameterDescriptorImpl]

'append' @ [89:22] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'elementColumnWidth' @ [89:36] ==> val elementColumnWidth: Int defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'format' @ [89:58] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'elementText' @ [89:65] ==> local final fun elementText(element: KtElement?): String defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[SimpleFunctionDescriptorImpl]

'element' @ [89:77] ==> val element: KtElement? defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'append' @ [90:22] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [91:22] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'valueColumnWidth' @ [91:36] ==> val valueColumnWidth: Int defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'format' @ [91:56] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'valueDecl' @ [91:63] ==> local final fun valueDecl(value: PseudoValue): String defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[SimpleFunctionDescriptorImpl]

'value' @ [91:73] ==> val value: PseudoValue defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'append' @ [92:22] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [93:22] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'valueDescColumnWidth' @ [93:36] ==> val valueDescColumnWidth: Int defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'format' @ [93:60] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'description' @ [93:67] ==> val description: String defined in org.jetbrains.kotlin.cfg.AbstractPseudoValueTest.dumpInstructions[LocalVariableDescriptor]

'append' @ [94:22] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

