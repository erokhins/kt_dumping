'this' @ [31:13] ==> <this> defined in org.jetbrains.kotlin.diagnostics.rendering.adaptiveClassifierPolicy[ReceiverParameterDescriptorImpl]

'ADAPTIVE_CLASSIFIER_POLICY_KEY' @ [31:18] ==> private val ADAPTIVE_CLASSIFIER_POLICY_KEY: <no name provided> defined in org.jetbrains.kotlin.diagnostics.rendering in file adaptiveClassifierNamePolicy.kt[PropertyDescriptorImpl]

'mutableMapOf' @ [34:38] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<Name, LinkedHashSet<TypeParameterDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> LinkedHashSet<TypeParameterDescriptor>

'when {
            hasUniqueName(classifier) -> ClassifierNamePolicy.SHORT.renderClassifier(classifier, renderer)
            classifier is ClassDescriptor ||
            classifier is TypeAliasDescriptor ->
                ClassifierNamePolicy.FULLY_QUALIFIED.renderClassifier(classifier, renderer)
            classifier is TypeParameterDescriptor -> {
                val name = classifier.name
                val typeParametersWithSameName = renderedParameters.getOrPut(name) { LinkedHashSet() }
                val isFirstOccurence = typeParametersWithSameName.add(classifier)
                val index = typeParametersWithSameName.indexOf(classifier)
                renderer.renderAmbiguousTypeParameter(classifier, index + 1, isFirstOccurence)
            }
            else -> error("Unexpected classifier: ${classifier::class.java}")
        }' @ [37:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'hasUniqueName' @ [38:13] ==> private final fun hasUniqueName(classifier: ClassifierDescriptor): Boolean defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy[SimpleFunctionDescriptorImpl]

'classifier' @ [38:27] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'renderClassifier' @ [38:69] ==> public open fun renderClassifier(classifier: ClassifierDescriptor, renderer: DescriptorRenderer): String defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT[DeserializedSimpleFunctionDescriptor]

'classifier' @ [38:86] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'renderer' @ [38:98] ==> value-parameter renderer: DescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'classifier' @ [39:13] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'classifier' @ [40:13] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'renderClassifier' @ [41:54] ==> public open fun renderClassifier(classifier: ClassifierDescriptor, renderer: DescriptorRenderer): String defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.FULLY_QUALIFIED[DeserializedSimpleFunctionDescriptor]

'classifier' @ [41:71] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'renderer' @ [41:83] ==> value-parameter renderer: DescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'classifier' @ [42:13] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'classifier' @ [43:28] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'name' @ [43:39] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'renderedParameters' @ [44:50] ==> private final val renderedParameters: MutableMap<Name, LinkedHashSet<TypeParameterDescriptor>> defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy[PropertyDescriptorImpl]

'getOrPut' @ [44:69] ==> public inline fun <K, V> MutableMap<Name, LinkedHashSet<TypeParameterDescriptor>>.getOrPut(key: Name, defaultValue: () -> LinkedHashSet<TypeParameterDescriptor>): LinkedHashSet<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> LinkedHashSet<TypeParameterDescriptor>

'name' @ [44:78] ==> val name: Name defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[LocalVariableDescriptor]

'LinkedHashSet' @ [44:86] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeParameterDescriptor

'typeParametersWithSameName' @ [45:40] ==> val typeParametersWithSameName: LinkedHashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[LocalVariableDescriptor]

'add' @ [45:67] ==> public open fun add(element: TypeParameterDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'classifier' @ [45:71] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'typeParametersWithSameName' @ [46:29] ==> val typeParametersWithSameName: LinkedHashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[LocalVariableDescriptor]

'indexOf' @ [46:56] ==> public fun <@OnlyInputTypes T> Iterable<TypeParameterDescriptor>.indexOf(element: TypeParameterDescriptor): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> TypeParameterDescriptor

'classifier' @ [46:64] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'renderer' @ [47:17] ==> value-parameter renderer: DescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'renderAmbiguousTypeParameter' @ [47:26] ==> private final fun DescriptorRenderer.renderAmbiguousTypeParameter(typeParameter: TypeParameterDescriptor, index: Int, firstOccurence: Boolean): String defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy[SimpleFunctionDescriptorImpl]

'classifier' @ [47:55] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'index' @ [47:67] ==> val index: Int defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[LocalVariableDescriptor]

'isFirstOccurence' @ [47:78] ==> val isFirstOccurence: Boolean defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[LocalVariableDescriptor]

'error' @ [49:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classifier' @ [49:53] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderClassifier[ValueParameterDescriptorImpl]

'java' @ [49:71] ==> public val <T> KClass<out ClassifierDescriptor>.java: Class<out ClassifierDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out ClassifierDescriptor)

'classifier' @ [54:16] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.hasUniqueName[ValueParameterDescriptorImpl]

'name' @ [54:27] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'ambiguousNames' @ [54:36] ==> private final val ambiguousNames: List<Name> defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy[PropertyDescriptorImpl]

'buildString' @ [59:9] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [60:9] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'typeParameter' @ [60:16] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderAmbiguousTypeParameter[ValueParameterDescriptorImpl]

'name' @ [60:30] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'append' @ [61:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'index' @ [61:19] ==> value-parameter index: Int defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderAmbiguousTypeParameter[ValueParameterDescriptorImpl]

'firstOccurence' @ [62:13] ==> value-parameter firstOccurence: Boolean defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderAmbiguousTypeParameter[ValueParameterDescriptorImpl]

'append' @ [63:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderMessage' @ [63:20] ==> public abstract fun renderMessage(message: String): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'renderFqName' @ [63:57] ==> public abstract fun renderFqName(fqName: FqNameUnsafe): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'typeParameter' @ [63:70] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy.renderAmbiguousTypeParameter[ValueParameterDescriptorImpl]

'containingDeclaration' @ [63:84] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'fqNameUnsafe' @ [63:106] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'RenderingContext.Key<ClassifierNamePolicy>' @ [68:55] ==> public constructor Key<out T>(name: String) defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Key[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> ClassifierNamePolicy

'collectClassifiersFqNames' @ [71:17] ==> private fun collectClassifiersFqNames(objectsToRender: Collection<Any?>): Set<FqNameUnsafe> defined in org.jetbrains.kotlin.diagnostics.rendering in file adaptiveClassifierNamePolicy.kt[SimpleFunctionDescriptorImpl]

'objectsToRender' @ [71:43] ==> value-parameter objectsToRender: Collection<Any?> defined in org.jetbrains.kotlin.diagnostics.rendering.ADAPTIVE_CLASSIFIER_POLICY_KEY.<no name provided>.compute[ValueParameterDescriptorImpl]

'groupBy' @ [71:60] ==> public inline fun <T, K> Iterable<FqNameUnsafe>.groupBy(keySelector: (FqNameUnsafe) -> Name): Map<Name, List<FqNameUnsafe>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqNameUnsafe
    <K> -> Name

'it' @ [71:70] ==> value-parameter it: FqNameUnsafe defined in org.jetbrains.kotlin.diagnostics.rendering.ADAPTIVE_CLASSIFIER_POLICY_KEY.<no name provided>.compute.<anonymous>[ValueParameterDescriptorImpl]

'shortNameOrSpecial' @ [71:73] ==> @NotNull public open fun shortNameOrSpecial(): Name defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'filter' @ [71:96] ==> public inline fun <K, V> Map<out Name, List<FqNameUnsafe>>.filter(predicate: (Map.Entry<Name, List<FqNameUnsafe>>) -> Boolean): Map<Name, List<FqNameUnsafe>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> List<FqNameUnsafe>

'it' @ [71:105] ==> value-parameter it: Map.Entry<Name, List<FqNameUnsafe>> defined in org.jetbrains.kotlin.diagnostics.rendering.ADAPTIVE_CLASSIFIER_POLICY_KEY.<no name provided>.compute.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [71:108] ==> public abstract val value: List<FqNameUnsafe> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'size' @ [71:114] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'map' @ [71:125] ==> public inline fun <K, V, R> Map<out Name, List<FqNameUnsafe>>.map(transform: (Map.Entry<Name, List<FqNameUnsafe>>) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> List<FqNameUnsafe>
    <R> -> Name

'it' @ [71:131] ==> value-parameter it: Map.Entry<Name, List<FqNameUnsafe>> defined in org.jetbrains.kotlin.diagnostics.rendering.ADAPTIVE_CLASSIFIER_POLICY_KEY.<no name provided>.compute.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [71:134] ==> public abstract val key: Name defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'AdaptiveClassifierNamePolicy' @ [72:16] ==> public constructor AdaptiveClassifierNamePolicy(ambiguousNames: List<Name>) defined in org.jetbrains.kotlin.diagnostics.rendering.AdaptiveClassifierNamePolicy[ClassConstructorDescriptorImpl]

'ambiguousNames' @ [72:45] ==> val ambiguousNames: List<Name> defined in org.jetbrains.kotlin.diagnostics.rendering.ADAPTIVE_CLASSIFIER_POLICY_KEY.<no name provided>.compute[LocalVariableDescriptor]

'LinkedHashSet' @ [76:95] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqNameUnsafe

'apply' @ [76:125] ==> @InlineOnly public inline fun <T> LinkedHashSet<FqNameUnsafe>.apply(block: LinkedHashSet<FqNameUnsafe>.() -> Unit): LinkedHashSet<FqNameUnsafe> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashSet<FqNameUnsafe>

'collectMentionedClassifiersFqNames' @ [77:5] ==> private fun collectMentionedClassifiersFqNames(contextObjects: Collection<Any?>, result: MutableSet<FqNameUnsafe>): Unit defined in org.jetbrains.kotlin.diagnostics.rendering in file adaptiveClassifierNamePolicy.kt[SimpleFunctionDescriptorImpl]

'objectsToRender' @ [77:40] ==> value-parameter objectsToRender: Collection<Any?> defined in org.jetbrains.kotlin.diagnostics.rendering.collectClassifiersFqNames[ValueParameterDescriptorImpl]

'this' @ [77:57] ==> <this> defined in org.jetbrains.kotlin.diagnostics.rendering.collectClassifiersFqNames.<anonymous>[ReceiverParameterDescriptorImpl]

'constructor' @ [82:9] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [82:21] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'let' @ [82:44] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> Boolean

'result' @ [82:50] ==> value-parameter result: MutableSet<FqNameUnsafe> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[ValueParameterDescriptorImpl]

'add' @ [82:57] ==> public abstract fun add(element: FqNameUnsafe): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [82:61] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.addMentionedTypeConstructor.<anonymous>[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [82:64] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'contextObjects' @ [85:5] ==> value-parameter contextObjects: Collection<Any?> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[ValueParameterDescriptorImpl]

'filterIsInstance' @ [85:20] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KotlinType

'forEach' @ [85:51] ==> @HidesMembers public inline fun <T> Iterable<KotlinType>.forEach(action: (KotlinType) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'diagnosticType' @ [86:9] ==> value-parameter diagnosticType: KotlinType defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [86:24] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'innerType' @ [88:13] ==> value-parameter innerType: UnwrappedType defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addMentionedTypeConstructor' @ [88:23] ==> local final fun KotlinType.addMentionedTypeConstructor(): Unit defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[SimpleFunctionDescriptorImpl]

'innerType' @ [89:13] ==> value-parameter innerType: UnwrappedType defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getAbbreviation' @ [89:23] ==> public fun KotlinType.getAbbreviation(): SimpleType? defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'addMentionedTypeConstructor' @ [89:42] ==> local final fun KotlinType.addMentionedTypeConstructor(): Unit defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[SimpleFunctionDescriptorImpl]

'contextObjects' @ [94:5] ==> value-parameter contextObjects: Collection<Any?> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[ValueParameterDescriptorImpl]

'filterIsInstance' @ [94:20] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Collection<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Collection<*>

'forEach' @ [94:54] ==> @HidesMembers public inline fun <T> Iterable<Collection<*>>.forEach(action: (Collection<*>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<*>

'collectMentionedClassifiersFqNames' @ [95:9] ==> private fun collectMentionedClassifiersFqNames(contextObjects: Collection<Any?>, result: MutableSet<FqNameUnsafe>): Unit defined in org.jetbrains.kotlin.diagnostics.rendering in file adaptiveClassifierNamePolicy.kt[SimpleFunctionDescriptorImpl]

'it' @ [95:44] ==> value-parameter it: Collection<*> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [95:48] ==> value-parameter result: MutableSet<FqNameUnsafe> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[ValueParameterDescriptorImpl]

'contextObjects' @ [97:5] ==> value-parameter contextObjects: Collection<Any?> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[ValueParameterDescriptorImpl]

'filterIsInstance' @ [97:20] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassifierDescriptor

'forEach' @ [97:61] ==> @HidesMembers public inline fun <T> Iterable<ClassifierDescriptor>.forEach(action: (ClassifierDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'result' @ [98:9] ==> value-parameter result: MutableSet<FqNameUnsafe> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[ValueParameterDescriptorImpl]

'add' @ [98:16] ==> public abstract fun add(element: FqNameUnsafe): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [98:20] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [98:23] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'contextObjects' @ [100:5] ==> value-parameter contextObjects: Collection<Any?> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[ValueParameterDescriptorImpl]

'filterIsInstance' @ [100:20] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> TypeParameterDescriptor

'forEach' @ [100:64] ==> @HidesMembers public inline fun <T> Iterable<TypeParameterDescriptor>.forEach(action: (TypeParameterDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'collectMentionedClassifiersFqNames' @ [101:9] ==> private fun collectMentionedClassifiersFqNames(contextObjects: Collection<Any?>, result: MutableSet<FqNameUnsafe>): Unit defined in org.jetbrains.kotlin.diagnostics.rendering in file adaptiveClassifierNamePolicy.kt[SimpleFunctionDescriptorImpl]

'it' @ [101:44] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>[ValueParameterDescriptorImpl]

'upperBounds' @ [101:47] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'result' @ [101:60] ==> value-parameter result: MutableSet<FqNameUnsafe> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[ValueParameterDescriptorImpl]

'contextObjects' @ [103:5] ==> value-parameter contextObjects: Collection<Any?> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[ValueParameterDescriptorImpl]

'filterIsInstance' @ [103:20] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CallableDescriptor

'forEach' @ [103:59] ==> @HidesMembers public inline fun <T> Iterable<CallableDescriptor>.forEach(action: (CallableDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'collectMentionedClassifiersFqNames' @ [104:9] ==> private fun collectMentionedClassifiersFqNames(contextObjects: Collection<Any?>, result: MutableSet<FqNameUnsafe>): Unit defined in org.jetbrains.kotlin.diagnostics.rendering in file adaptiveClassifierNamePolicy.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [104:44] ==> public fun <T> listOf(vararg elements: Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'it' @ [105:17] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [105:20] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'it' @ [106:17] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [106:20] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'it' @ [107:17] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [107:20] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'it' @ [108:17] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [108:20] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [108:47] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'it' @ [109:17] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [109:20] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [109:48] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'result' @ [110:12] ==> value-parameter result: MutableSet<FqNameUnsafe> defined in org.jetbrains.kotlin.diagnostics.rendering.collectMentionedClassifiersFqNames[ValueParameterDescriptorImpl]

