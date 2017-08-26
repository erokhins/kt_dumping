'emptyList' @ [89:39] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'renderedTypes' @ [95:9] ==> public final var renderedTypes: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'theType' @ [95:25] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'renderShort' @ [95:33] ==> internal fun KotlinType.renderShort(typeParameterNameMap: Map<TypeParameterDescriptor, String>): List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'typeParameterNameMap' @ [95:45] ==> value-parameter typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate.render[ValueParameterDescriptorImpl]

'renderedTypeParameters' @ [96:9] ==> public final var renderedTypeParameters: List<RenderedTypeParameter>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'typeParameters' @ [96:34] ==> public final val typeParameters: Array<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'map' @ [96:49] ==> public inline fun <T, R> Array<out TypeParameterDescriptor>.map(transform: (TypeParameterDescriptor) -> RenderedTypeParameter): List<RenderedTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> RenderedTypeParameter

'RenderedTypeParameter' @ [97:13] ==> public constructor RenderedTypeParameter(typeParameter: TypeParameterDescriptor, fake: Boolean, text: String) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.RenderedTypeParameter[ClassConstructorDescriptorImpl]

'it' @ [97:35] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate.render.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [97:39] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate.render.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [97:42] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'fakeFunction' @ [97:67] ==> value-parameter fakeFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate.render[ValueParameterDescriptorImpl]

'typeParameterNameMap' @ [97:81] ==> value-parameter typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate.render[ValueParameterDescriptorImpl]

'it' @ [97:102] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate.render.<anonymous>[ValueParameterDescriptorImpl]

'theType' @ [102:36] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'getTypeParameters' @ [102:44] ==> public fun KotlinType.getTypeParameters(): Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'if (scope == null) {
            typeParameters = typeParametersInType.toTypedArray()
            renderedTypes = theType.renderShort(Collections.emptyMap())
        }
        else {
            typeParameters = getTypeParameterNamesNotInScope(typeParametersInType, scope).toTypedArray()
        }' @ [103:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'scope' @ [103:13] ==> value-parameter scope: HierarchicalScope? = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate.<init>[ValueParameterDescriptorImpl]

'typeParameters' @ [104:13] ==> public final val typeParameters: Array<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'typeParametersInType' @ [104:30] ==> val typeParametersInType: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate.<init>[LocalVariableDescriptor]

'toTypedArray' @ [104:51] ==> public inline fun <reified T> Collection<TypeParameterDescriptor>.toTypedArray(): Array<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> TypeParameterDescriptor

'renderedTypes' @ [105:13] ==> public final var renderedTypes: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'theType' @ [105:29] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'renderShort' @ [105:37] ==> internal fun KotlinType.renderShort(typeParameterNameMap: Map<TypeParameterDescriptor, String>): List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'emptyMap' @ [105:61] ==> public final fun <K : (Any..Any?), V : (Any..Any?)> emptyMap(): (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (String..String?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <V : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'typeParameters' @ [108:13] ==> public final val typeParameters: Array<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'getTypeParameterNamesNotInScope' @ [108:30] ==> internal fun getTypeParameterNamesNotInScope(typeParameters: Collection<TypeParameterDescriptor>, scope: HierarchicalScope): List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'typeParametersInType' @ [108:62] ==> val typeParametersInType: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate.<init>[LocalVariableDescriptor]

'scope' @ [108:84] ==> value-parameter scope: HierarchicalScope? = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate.<init>[ValueParameterDescriptorImpl]

'toTypedArray' @ [108:91] ==> public inline fun <reified T> Collection<TypeParameterDescriptor>.toTypedArray(): Array<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> TypeParameterDescriptor

'theType' @ [112:31] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'toString' @ [112:39] ==> public open fun toString(): String defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [122:9] ==> public inline fun <T> Iterable<TypeCandidate>.firstOrNull(predicate: (TypeCandidate) -> Boolean): TypeCandidate? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'it' @ [122:23] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeByRenderedType.<anonymous>[ValueParameterDescriptorImpl]

'renderedTypes' @ [122:26] ==> public final var renderedTypes: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'renderedTypes' @ [122:43] ==> value-parameter renderedTypes: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeByRenderedType[ValueParameterDescriptorImpl]

'theType' @ [122:60] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'originalElement' @ [127:35] ==> value-parameter originalElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration.<init>[ValueParameterDescriptorImpl]

'containingKtFile' @ [127:51] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'CallablePlacement' @ [134:67] ==> private constructor CallablePlacement() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement[ClassConstructorDescriptorImpl]

'CallablePlacement' @ [135:58] ==> private constructor CallablePlacement() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement[ClassConstructorDescriptorImpl]

'config' @ [145:22] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentFile' @ [145:29] ==> public final val currentFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'analyzeFullyAndGetResult' @ [145:41] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'currentFileContext' @ [146:9] ==> public final val currentFileContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'result' @ [146:30] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.<init>[LocalVariableDescriptor]

'bindingContext' @ [146:37] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'currentFileModule' @ [147:9] ==> public final val currentFileModule: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'result' @ [147:29] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.<init>[LocalVariableDescriptor]

'moduleDescriptor' @ [147:36] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'getValue' @ [150:36] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'config' @ [150:43] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'originalElement' @ [150:50] ==> public final val originalElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'getContainingPseudocode' @ [150:66] ==> public fun KtElement.getContainingPseudocode(context: BindingContext): Pseudocode? defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedSimpleFunctionDescriptor]

'currentFileContext' @ [150:90] ==> public final val currentFileContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'HashMap' @ [152:34] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TypeInfo
    <V : (Any..Any?)> -> List<TypeCandidate>

'ArrayList' @ [156:37] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'typeCandidates' @ [159:13] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'getOrPut' @ [159:28] ==> public inline fun <K, V> MutableMap<TypeInfo, List<TypeCandidate>>.getOrPut(key: TypeInfo, defaultValue: () -> List<TypeCandidate>): List<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeInfo
    <V> -> List<TypeCandidate>

'typeInfo' @ [159:37] ==> value-parameter typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates[ValueParameterDescriptorImpl]

'typeInfo' @ [159:49] ==> value-parameter typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates[ValueParameterDescriptorImpl]

'getPossibleTypes' @ [159:58] ==> public abstract fun getPossibleTypes(builder: CallableBuilder): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[SimpleFunctionDescriptorImpl]

'this' @ [159:75] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[LazyClassReceiverParameterDescriptor]

'map' @ [159:81] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> TypeCandidate): List<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> TypeCandidate

'TypeCandidate' @ [159:87] ==> public constructor TypeCandidate(theType: KotlinType, scope: HierarchicalScope? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[ClassConstructorDescriptorImpl]

'it' @ [159:101] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [165:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeInfo' @ [165:14] ==> value-parameter typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates[ValueParameterDescriptorImpl]

'substitutionsAllowed' @ [165:23] ==> public open val substitutionsAllowed: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[PropertyDescriptorImpl]

'computeTypeCandidates' @ [165:52] ==> public final fun computeTypeCandidates(typeInfo: TypeInfo): List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'typeInfo' @ [165:74] ==> value-parameter typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates[ValueParameterDescriptorImpl]

'typeCandidates' @ [166:16] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'getOrPut' @ [166:31] ==> public inline fun <K, V> MutableMap<TypeInfo, List<TypeCandidate>>.getOrPut(key: TypeInfo, defaultValue: () -> List<TypeCandidate>): List<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeInfo
    <V> -> List<TypeCandidate>

'typeInfo' @ [166:40] ==> value-parameter typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates[ValueParameterDescriptorImpl]

'typeInfo' @ [167:25] ==> value-parameter typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates[ValueParameterDescriptorImpl]

'getPossibleTypes' @ [167:34] ==> public abstract fun getPossibleTypes(builder: CallableBuilder): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[SimpleFunctionDescriptorImpl]

'this' @ [167:51] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[LazyClassReceiverParameterDescriptor]

'asReversed' @ [167:57] ==> public fun <T> List<KotlinType>.asReversed(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'this' @ [171:52] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper[LazyClassReceiverParameterDescriptor]

'other' @ [171:61] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper.equals[ValueParameterDescriptorImpl]

'other' @ [172:55] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper.equals[ValueParameterDescriptorImpl]

'DEFAULT' @ [172:95] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [172:103] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'_type' @ [172:114] ==> public final val _type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper[PropertyDescriptorImpl]

'other' @ [172:121] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper.equals[ValueParameterDescriptorImpl]

'_type' @ [172:127] ==> public final val _type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper[PropertyDescriptorImpl]

'LinkedHashSet' @ [176:28] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (EqWrapper..EqWrapper?)>..Collection<(EqWrapper..EqWrapper?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper..org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper?)

'types' @ [176:42] ==> val types: List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'map' @ [176:48] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> EqWrapper): List<EqWrapper> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> EqWrapper

'EqWrapper' @ [176:54] ==> public constructor EqWrapper(_type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper[ClassConstructorDescriptorImpl]

'substitutions' @ [177:34] ==> value-parameter substitutions: List<KotlinTypeSubstitution> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates[ValueParameterDescriptorImpl]

'newTypes' @ [179:29] ==> val newTypes: LinkedHashSet<(EqWrapper..EqWrapper?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'map' @ [179:38] ==> public inline fun <T, R> Iterable<(EqWrapper..EqWrapper?)>.map(transform: ((EqWrapper..EqWrapper?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper..org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper?)
    <R> -> KotlinType

'it' @ [179:44] ==> value-parameter it: (EqWrapper..EqWrapper?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'_type' @ [179:47] ==> public final val _type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper[PropertyDescriptorImpl]

'substitute' @ [179:53] ==> internal fun KotlinType.substitute(substitution: KotlinTypeSubstitution, variance: Variance): KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'substitution' @ [179:64] ==> val substitution: KotlinTypeSubstitution defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'typeInfo' @ [179:78] ==> value-parameter typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates[ValueParameterDescriptorImpl]

'variance' @ [179:87] ==> public final val variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[PropertyDescriptorImpl]

'newTypes' @ [181:32] ==> val newTypes: LinkedHashSet<(EqWrapper..EqWrapper?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'filter' @ [181:41] ==> public inline fun <T> Iterable<(EqWrapper..EqWrapper?)>.filter(predicate: ((EqWrapper..EqWrapper?)) -> Boolean): List<(EqWrapper..EqWrapper?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper..org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper?)

'substitution' @ [181:50] ==> val substitution: KotlinTypeSubstitution defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'byType' @ [181:63] ==> public final val byType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.KotlinTypeSubstitution[PropertyDescriptorImpl]

'it' @ [181:73] ==> value-parameter it: (EqWrapper..EqWrapper?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'_type' @ [181:76] ==> public final val _type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper[PropertyDescriptorImpl]

'newTypes' @ [183:17] ==> val newTypes: LinkedHashSet<(EqWrapper..EqWrapper?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'addAll' @ [183:26] ==> public open fun addAll(elements: Collection<(EqWrapper..EqWrapper?)>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'toAdd' @ [183:33] ==> val toAdd: List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'map' @ [183:39] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> EqWrapper): List<EqWrapper> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> EqWrapper

'EqWrapper' @ [183:45] ==> public constructor EqWrapper(_type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper[ClassConstructorDescriptorImpl]

'newTypes' @ [184:17] ==> val newTypes: LinkedHashSet<(EqWrapper..EqWrapper?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'removeAll' @ [184:26] ==> public open fun removeAll(elements: Collection<(EqWrapper..EqWrapper?)>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'toRemove' @ [184:36] ==> val toRemove: List<(EqWrapper..EqWrapper?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'newTypes' @ [187:17] ==> val newTypes: LinkedHashSet<(EqWrapper..EqWrapper?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [187:26] ==> public open fun isEmpty(): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'newTypes' @ [188:17] ==> val newTypes: LinkedHashSet<(EqWrapper..EqWrapper?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'add' @ [188:26] ==> public open fun add(element: (EqWrapper..EqWrapper?)): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'EqWrapper' @ [188:30] ==> public constructor EqWrapper(_type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper[ClassConstructorDescriptorImpl]

'currentFileModule' @ [188:40] ==> public final val currentFileModule: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'builtIns' @ [188:58] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'anyType' @ [188:67] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'newTypes' @ [191:13] ==> val newTypes: LinkedHashSet<(EqWrapper..EqWrapper?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>[LocalVariableDescriptor]

'map' @ [191:22] ==> public inline fun <T, R> Iterable<(EqWrapper..EqWrapper?)>.map(transform: ((EqWrapper..EqWrapper?)) -> TypeCandidate): List<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper..org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper?)
    <R> -> TypeCandidate

'TypeCandidate' @ [191:28] ==> public constructor TypeCandidate(theType: KotlinType, scope: HierarchicalScope? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[ClassConstructorDescriptorImpl]

'it' @ [191:42] ==> value-parameter it: (EqWrapper..EqWrapper?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'_type' @ [191:45] ==> public final val _type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates.<anonymous>.EqWrapper[PropertyDescriptorImpl]

'scope' @ [191:52] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.computeTypeCandidates[ValueParameterDescriptorImpl]

'asReversed' @ [191:61] ==> public fun <T> List<TypeCandidate>.asReversed(): List<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'if (iterator.hasNext()) {
            val context = Context(iterator.next())
            runWriteAction { context.buildAndRunTemplate { buildNext(iterator) } }
            ApplicationManager.getApplication().invokeLater { context.showDialogIfNeeded() }
        }
        else {
            runWriteAction { ShortenReferences.DEFAULT.process(elementsToShorten) }
        }' @ [196:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'iterator' @ [196:13] ==> value-parameter iterator: Iterator<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.buildNext[ValueParameterDescriptorImpl]

'hasNext' @ [196:22] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'Context' @ [197:27] ==> public constructor Context(callableInfo: CallableInfo) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[ClassConstructorDescriptorImpl]

'iterator' @ [197:35] ==> value-parameter iterator: Iterator<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.buildNext[ValueParameterDescriptorImpl]

'next' @ [197:44] ==> public abstract operator fun next(): CallableInfo defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'runWriteAction' @ [198:13] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'context' @ [198:30] ==> val context: CallableBuilder.Context defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.buildNext[LocalVariableDescriptor]

'buildAndRunTemplate' @ [198:38] ==> public final fun buildAndRunTemplate(onFinish: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'buildNext' @ [198:60] ==> private final fun buildNext(iterator: Iterator<CallableInfo>): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'iterator' @ [198:70] ==> value-parameter iterator: Iterator<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.buildNext[ValueParameterDescriptorImpl]

'getApplication' @ [199:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [199:49] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'context' @ [199:63] ==> val context: CallableBuilder.Context defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.buildNext[LocalVariableDescriptor]

'showDialogIfNeeded' @ [199:71] ==> public final fun showDialogIfNeeded(): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'runWriteAction' @ [202:13] ==> public fun <T> runWriteAction(action: () -> Collection<KtElement>): Collection<KtElement> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<KtElement>

'ShortenReferences' @ [202:30] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [202:48] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [202:56] ==> @JvmOverloads public final fun process(elements: Iterable<KtElement>, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): Collection<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'elementsToShorten' @ [202:64] ==> private final val elementsToShorten: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'assert' @ [208:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'config' @ [208:20] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentEditor' @ [208:27] ==> public final val currentEditor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'finished' @ [209:17] ==> private final var finished: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'IllegalStateException' @ [209:33] ==> public constructor IllegalStateException(p0: (String..String?)) defined in java.lang.IllegalStateException[JavaClassConstructorDescriptor]

'buildNext' @ [210:13] ==> private final fun buildNext(iterator: Iterator<CallableInfo>): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'config' @ [210:23] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'callableInfos' @ [210:30] ==> public final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'iterator' @ [210:44] ==> public abstract fun iterator(): Iterator<CallableInfo> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'finished' @ [213:13] ==> private final var finished: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'placement' @ [233:29] ==> public final var placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'when (placement) {
                is CallablePlacement.NoReceiver -> {
                    containingElement = placement.containingElement
                    receiverClassDescriptor = with (placement.containingElement) {
                        when (this) {
                            is KtClassOrObject -> currentFileContext[BindingContext.CLASS, this]
                            is PsiClass -> getJavaClassDescriptor()
                            else -> null
                        }
                    }
                }
                is CallablePlacement.WithReceiver -> {
                    receiverClassDescriptor =
                            placement.receiverTypeCandidate.theType.constructor.declarationDescriptor
                    val classDeclaration = receiverClassDescriptor?.let { DescriptorToSourceUtils.getSourceFromDescriptor(it) }
                    containingElement = if (!config.isExtension && classDeclaration != null) classDeclaration else config.currentFile
                }
                else -> throw IllegalArgumentException("Placement wan't initialized")
            }' @ [234:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'placement' @ [234:19] ==> val placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'containingElement' @ [236:21] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'placement' @ [236:41] ==> val placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'containingElement' @ [236:51] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.NoReceiver[PropertyDescriptorImpl]

'receiverClassDescriptor' @ [237:21] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'with' @ [237:47] ==> @InlineOnly public inline fun <T, R> with(receiver: PsiElement, block: PsiElement.() -> ClassifierDescriptor?): ClassifierDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> ClassifierDescriptor?

'placement' @ [237:53] ==> val placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'containingElement' @ [237:63] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.NoReceiver[PropertyDescriptorImpl]

'when (this) {
                            is KtClassOrObject -> currentFileContext[BindingContext.CLASS, this]
                            is PsiClass -> getJavaClassDescriptor()
                            else -> null
                        }' @ [238:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassifierDescriptor?, entry1: ClassifierDescriptor?, entry2: ClassifierDescriptor?): ClassifierDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassifierDescriptor?

'this' @ [238:31] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ReceiverParameterDescriptorImpl]

'currentFileContext' @ [239:51] ==> public final val currentFileContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'CLASS' @ [239:85] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [239:92] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ReceiverParameterDescriptorImpl]

'getJavaClassDescriptor' @ [240:44] ==> @JvmOverloads public fun PsiClass.getJavaClassDescriptor(resolutionFacade: ResolutionFacade? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'receiverClassDescriptor' @ [246:21] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'placement' @ [247:29] ==> val placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'receiverTypeCandidate' @ [247:39] ==> public final val receiverTypeCandidate: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.WithReceiver[PropertyDescriptorImpl]

'theType' @ [247:61] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'constructor' @ [247:69] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [247:81] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'receiverClassDescriptor' @ [248:44] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'let' @ [248:69] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> PsiElement?

'DescriptorToSourceUtils' @ [248:75] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [248:99] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [248:123] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ValueParameterDescriptorImpl]

'containingElement' @ [249:21] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'if (!config.isExtension && classDeclaration != null) classDeclaration else config.currentFile' @ [249:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'!' @ [249:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'config' @ [249:46] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'isExtension' @ [249:53] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'classDeclaration' @ [249:68] ==> val classDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'classDeclaration' @ [249:94] ==> val classDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'config' @ [249:116] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentFile' @ [249:123] ==> public final val currentFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'IllegalArgumentException' @ [251:31] ==> public constructor IllegalArgumentException(p0: (String..String?)) defined in java.lang.IllegalArgumentException[JavaClassConstructorDescriptor]

'receiverClassDescriptor' @ [253:32] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'defaultType' @ [253:57] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'config' @ [255:27] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentFile' @ [255:34] ==> public final val currentFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'project' @ [255:46] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'containingElement' @ [257:17] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'containingFile' @ [257:35] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'config' @ [257:53] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentFile' @ [257:60] ==> public final val currentFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'activateFileWithPsiElement' @ [258:32] ==> public open fun activateFileWithPsiElement(@NotNull p0: PsiElement): Boolean defined in com.intellij.codeInsight.navigation.NavigationUtil[JavaMethodDescriptor]

'containingElement' @ [258:59] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'dialogWithEditor' @ [261:13] ==> public final val dialogWithEditor: DialogWithEditor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'if (containingElement is KtElement) {
                jetFileToEdit = containingElement.containingKtFile
                containingFileEditor = if (jetFileToEdit != config.currentFile) {
                    FileEditorManager.getInstance(project).selectedTextEditor!!
                }
                else {
                    config.currentEditor!!
                }
                null
            } else {
                val dialog = object: DialogWithEditor(project, "Create from usage", "") {
                    override fun doOKAction() {
                        project.executeWriteCommand("Premature end of template") {
                            TemplateManagerImpl.getTemplateState(editor)?.gotoEnd(false)
                        }
                        super.doOKAction()
                    }
                }
                containingFileEditor = dialog.editor
                with(containingFileEditor.settings) {
                    additionalColumnsCount = config.currentEditor!!.settings.getRightMargin(project)
                    additionalLinesCount = 5
                }
                jetFileToEdit = PsiDocumentManager.getInstance(project).getPsiFile(containingFileEditor.document) as KtFile
                jetFileToEdit.analysisContext = config.currentFile
                dialog
            }' @ [261:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DialogWithEditor?, elseBranch: DialogWithEditor?): DialogWithEditor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DialogWithEditor?

'containingElement' @ [261:36] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'jetFileToEdit' @ [262:17] ==> public final val jetFileToEdit: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'containingElement' @ [262:33] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'containingKtFile' @ [262:51] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'containingFileEditor' @ [263:17] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'if (jetFileToEdit != config.currentFile) {
                    FileEditorManager.getInstance(project).selectedTextEditor!!
                }
                else {
                    config.currentEditor!!
                }' @ [263:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Editor, elseBranch: Editor): Editor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Editor

'jetFileToEdit' @ [263:44] ==> public final val jetFileToEdit: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'config' @ [263:61] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentFile' @ [263:68] ==> public final val currentFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'!!' @ [264:21] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Editor?): Editor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Editor

'getInstance' @ [264:39] ==> public open fun getInstance(@NotNull p0: Project): (FileEditorManager..FileEditorManager?) defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'project' @ [264:51] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'selectedTextEditor' @ [264:60] ==> public final val FileEditorManager.selectedTextEditor: Editor?[MyPropertyDescriptor]

'config' @ [267:21] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentEditor' @ [267:28] ==> public final val currentEditor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'DialogWithEditor' @ [271:38] ==> public constructor DialogWithEditor(project: Project, title: String, initialText: String) defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[ClassConstructorDescriptorImpl]

'project' @ [271:55] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'project' @ [273:25] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'executeWriteCommand' @ [273:33] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'getTemplateState' @ [274:49] ==> @Nullable public open fun getTemplateState(@NotNull p0: Editor): TemplateState? defined in com.intellij.codeInsight.template.impl.TemplateManagerImpl[JavaMethodDescriptor]

'editor' @ [274:66] ==> public final val editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<no name provided>[PropertyDescriptorImpl]

'gotoEnd' @ [274:75] ==> public open fun gotoEnd(p0: Boolean): Unit defined in com.intellij.codeInsight.template.impl.TemplateState[JavaMethodDescriptor]

'super' @ [276:25] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<no name provided>[LazyClassReceiverParameterDescriptor]

'doOKAction' @ [276:31] ==> protected/*protected and package*/ open fun doOKAction(): Unit defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[JavaMethodDescriptor]

'containingFileEditor' @ [279:17] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'dialog' @ [279:40] ==> val dialog: <no name provided> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'editor' @ [279:47] ==> public final val editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<no name provided>[PropertyDescriptorImpl]

'with' @ [280:17] ==> @InlineOnly public inline fun <T, R> with(receiver: EditorSettings, block: (EditorSettings).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EditorSettings
    <R> -> Unit

'containingFileEditor' @ [280:22] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'settings' @ [280:43] ==> public final val Editor.settings: EditorSettings[MyPropertyDescriptor]

'additionalColumnsCount' @ [281:21] ==> public final var EditorSettings.additionalColumnsCount: Int[MyPropertyDescriptor]

'config' @ [281:46] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentEditor' @ [281:53] ==> public final val currentEditor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'settings' @ [281:69] ==> public final val Editor.settings: EditorSettings[MyPropertyDescriptor]

'getRightMargin' @ [281:78] ==> public abstract fun getRightMargin(p0: (Project..Project?)): Int defined in com.intellij.openapi.editor.EditorSettings[JavaMethodDescriptor]

'project' @ [281:93] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'additionalLinesCount' @ [282:21] ==> public final var EditorSettings.additionalLinesCount: Int[MyPropertyDescriptor]

'jetFileToEdit' @ [284:17] ==> public final val jetFileToEdit: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'getInstance' @ [284:52] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [284:64] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'getPsiFile' @ [284:73] ==> @Nullable public abstract fun getPsiFile(@NotNull p0: Document): PsiFile? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'containingFileEditor' @ [284:84] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'document' @ [284:105] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'jetFileToEdit' @ [285:17] ==> public final val jetFileToEdit: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'analysisContext' @ [285:31] ==> public var KtFile.analysisContext: PsiElement? defined in org.jetbrains.kotlin.psi[DeserializedPropertyDescriptor]

'config' @ [285:49] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentFile' @ [285:56] ==> public final val currentFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'dialog' @ [286:17] ==> val dialog: <no name provided> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'getDeclarationScope' @ [289:25] ==> private final fun getDeclarationScope(): HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'receiverTypeCandidate' @ [291:13] ==> public final val receiverTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'receiverType' @ [291:37] ==> val receiverType: SimpleType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'let' @ [291:51] ==> @InlineOnly public inline fun <T, R> SimpleType.let(block: (SimpleType) -> TypeCandidate): TypeCandidate defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> TypeCandidate

'TypeCandidate' @ [291:57] ==> public constructor TypeCandidate(theType: KotlinType, scope: HierarchicalScope? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[ClassConstructorDescriptorImpl]

'it' @ [291:71] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [291:75] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'LinkedHashMap' @ [295:35] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KotlinType
    <V : (Any..Any?)> -> KotlinType

'if (config.enableSubstitutions) {
                collectSubstitutionsForReceiverTypeParameters(receiverType, substitutionMap)
                val typeArgumentsForFakeFunction = callableInfo.typeParameterInfos
                        .map {
                            val typeCandidates = computeTypeCandidates(it)
                            assert (typeCandidates.size == 1) { "Ambiguous type candidates for type parameter $it: $typeCandidates" }
                            typeCandidates.first().theType
                        }
                        .subtract(substitutionMap.keys)
                fakeFunction = createFakeFunctionDescriptor(scope, typeArgumentsForFakeFunction.size)
                collectSubstitutionsForCallableTypeParameters(fakeFunction, typeArgumentsForFakeFunction, substitutionMap)
                mandatoryTypeParametersAsCandidates = listOfNotNull(receiverTypeCandidate) + typeArgumentsForFakeFunction.map { TypeCandidate(substitutionMap[it]!!, scope) }
            }
            else {
                fakeFunction = null
                mandatoryTypeParametersAsCandidates = Collections.emptyList()
            }' @ [296:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'config' @ [296:17] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'enableSubstitutions' @ [296:24] ==> public final val enableSubstitutions: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'collectSubstitutionsForReceiverTypeParameters' @ [297:17] ==> private final fun collectSubstitutionsForReceiverTypeParameters(receiverType: KotlinType?, result: MutableMap<KotlinType, KotlinType>): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'receiverType' @ [297:63] ==> val receiverType: SimpleType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'substitutionMap' @ [297:77] ==> val substitutionMap: LinkedHashMap<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'callableInfo' @ [298:52] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'typeParameterInfos' @ [298:65] ==> public final val typeParameterInfos: List<TypeInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'map' @ [299:26] ==> public inline fun <T, R> Iterable<TypeInfo>.map(transform: (TypeInfo) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeInfo
    <R> -> KotlinType

'computeTypeCandidates' @ [300:50] ==> public final fun computeTypeCandidates(typeInfo: TypeInfo): List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'it' @ [300:72] ==> value-parameter it: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [301:29] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'typeCandidates' @ [301:37] ==> val typeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[LocalVariableDescriptor]

'size' @ [301:52] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'it' @ [301:112] ==> value-parameter it: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ValueParameterDescriptorImpl]

'typeCandidates' @ [301:117] ==> val typeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[LocalVariableDescriptor]

'typeCandidates' @ [302:29] ==> val typeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[LocalVariableDescriptor]

'first' @ [302:44] ==> public fun <T> List<TypeCandidate>.first(): TypeCandidate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'theType' @ [302:52] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'subtract' @ [304:26] ==> public infix fun <T> Iterable<KotlinType>.subtract(other: Iterable<KotlinType>): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'substitutionMap' @ [304:35] ==> val substitutionMap: LinkedHashMap<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'keys' @ [304:51] ==> public open val keys: MutableSet<KotlinType> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'fakeFunction' @ [305:17] ==> val fakeFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'createFakeFunctionDescriptor' @ [305:32] ==> private final fun createFakeFunctionDescriptor(scope: HierarchicalScope, typeParameterCount: Int): FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'scope' @ [305:61] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'typeArgumentsForFakeFunction' @ [305:68] ==> val typeArgumentsForFakeFunction: Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'size' @ [305:97] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'collectSubstitutionsForCallableTypeParameters' @ [306:17] ==> private final fun collectSubstitutionsForCallableTypeParameters(fakeFunction: FunctionDescriptor, typeArguments: Set<KotlinType>, result: MutableMap<KotlinType, KotlinType>): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'fakeFunction' @ [306:63] ==> val fakeFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'typeArgumentsForFakeFunction' @ [306:77] ==> val typeArgumentsForFakeFunction: Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'substitutionMap' @ [306:107] ==> val substitutionMap: LinkedHashMap<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'mandatoryTypeParametersAsCandidates' @ [307:17] ==> public final val mandatoryTypeParametersAsCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'listOfNotNull' @ [307:55] ==> public fun <T : Any> listOfNotNull(element: TypeCandidate?): List<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TypeCandidate

'receiverTypeCandidate' @ [307:69] ==> public final val receiverTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'typeArgumentsForFakeFunction' @ [307:94] ==> val typeArgumentsForFakeFunction: Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'map' @ [307:123] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> TypeCandidate): List<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> TypeCandidate

'TypeCandidate' @ [307:129] ==> public constructor TypeCandidate(theType: KotlinType, scope: HierarchicalScope? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[ClassConstructorDescriptorImpl]

'substitutionMap' @ [307:143] ==> val substitutionMap: LinkedHashMap<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'it' @ [307:159] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [307:166] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'fakeFunction' @ [310:17] ==> val fakeFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'mandatoryTypeParametersAsCandidates' @ [311:17] ==> public final val mandatoryTypeParametersAsCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'emptyList' @ [311:67] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(TypeCandidate..TypeCandidate?)>..List<(TypeCandidate..TypeCandidate?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate..org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate?)

'substitutions' @ [313:13] ==> public final val substitutions: List<KotlinTypeSubstitution> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'substitutionMap' @ [313:29] ==> val substitutionMap: LinkedHashMap<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'map' @ [313:45] ==> public inline fun <K, V, R> Map<out KotlinType, KotlinType>.map(transform: (Map.Entry<KotlinType, KotlinType>) -> KotlinTypeSubstitution): List<KotlinTypeSubstitution> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinType
    <V> -> KotlinType
    <R> -> KotlinTypeSubstitution

'KotlinTypeSubstitution' @ [313:51] ==> public constructor KotlinTypeSubstitution(forType: KotlinType, byType: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.KotlinTypeSubstitution[ClassConstructorDescriptorImpl]

'it' @ [313:74] ==> value-parameter it: Map.Entry<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [313:77] ==> public abstract val key: KotlinType defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [313:82] ==> value-parameter it: Map.Entry<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [313:85] ==> public abstract val value: KotlinType defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'callableInfo' @ [315:13] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parameterInfos' @ [315:26] ==> public abstract val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'forEach' @ [315:41] ==> @HidesMembers public inline fun <T> Iterable<ParameterInfo>.forEach(action: (ParameterInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'computeTypeCandidates' @ [316:17] ==> private final fun computeTypeCandidates(typeInfo: TypeInfo, substitutions: List<KotlinTypeSubstitution>, scope: HierarchicalScope): List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'it' @ [316:39] ==> value-parameter it: ParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ValueParameterDescriptorImpl]

'typeInfo' @ [316:42] ==> public final val typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[PropertyDescriptorImpl]

'substitutions' @ [316:52] ==> public final val substitutions: List<KotlinTypeSubstitution> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'scope' @ [316:67] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'computeTypeCandidates' @ [319:39] ==> private final fun computeTypeCandidates(typeInfo: TypeInfo, substitutions: List<KotlinTypeSubstitution>, scope: HierarchicalScope): List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'callableInfo' @ [319:61] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'returnTypeInfo' @ [319:74] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'substitutions' @ [319:90] ==> public final val substitutions: List<KotlinTypeSubstitution> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'scope' @ [319:105] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'singleOrNull' @ [319:112] ==> public fun <T> List<TypeCandidate>.singleOrNull(): TypeCandidate? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'skipReturnType' @ [320:13] ==> public final val skipReturnType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'when (callableInfo.kind) {
                CallableKind.FUNCTION ->
                    returnTypeCandidate?.theType?.isUnit() ?: false
                CallableKind.CLASS_WITH_PRIMARY_CONSTRUCTOR ->
                    callableInfo.returnTypeInfo == TypeInfo.Empty || returnTypeCandidate?.theType?.isAnyOrNullableAny() ?: false
                CallableKind.SECONDARY_CONSTRUCTOR -> true
                CallableKind.PROPERTY -> containingElement is KtBlockExpression
            }' @ [320:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'callableInfo' @ [320:36] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'kind' @ [320:49] ==> public abstract val kind: CallableKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'FUNCTION' @ [321:30] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'returnTypeCandidate' @ [322:21] ==> val returnTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'theType' @ [322:42] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'isUnit' @ [322:51] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'CLASS_WITH_PRIMARY_CONSTRUCTOR' @ [323:30] ==> enum entry CLASS_WITH_PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'callableInfo' @ [324:21] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'returnTypeInfo' @ [324:34] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'Empty' @ [324:61] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'returnTypeCandidate' @ [324:70] ==> val returnTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'theType' @ [324:91] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'isAnyOrNullableAny' @ [324:100] ==> public fun KotlinType.isAnyOrNullableAny(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'SECONDARY_CONSTRUCTOR' @ [325:30] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'PROPERTY' @ [326:30] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'containingElement' @ [326:42] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'typeParameterNameMap' @ [330:13] ==> public final val typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'getTypeParameterRenames' @ [330:36] ==> private final fun getTypeParameterRenames(scope: HierarchicalScope): Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'scope' @ [330:60] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'callableInfo' @ [331:13] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parameterInfos' @ [331:26] ==> public abstract val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'forEach' @ [331:41] ==> @HidesMembers public inline fun <T> Iterable<ParameterInfo>.forEach(action: (ParameterInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'renderTypeCandidates' @ [331:51] ==> private final fun renderTypeCandidates(typeInfo: TypeInfo, typeParameterNameMap: Map<TypeParameterDescriptor, String>, fakeFunction: FunctionDescriptor?): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'it' @ [331:72] ==> value-parameter it: ParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ValueParameterDescriptorImpl]

'typeInfo' @ [331:75] ==> public final val typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[PropertyDescriptorImpl]

'typeParameterNameMap' @ [331:85] ==> public final val typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'fakeFunction' @ [331:107] ==> val fakeFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'!' @ [332:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'skipReturnType' @ [332:18] ==> public final val skipReturnType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'renderTypeCandidates' @ [333:17] ==> private final fun renderTypeCandidates(typeInfo: TypeInfo, typeParameterNameMap: Map<TypeParameterDescriptor, String>, fakeFunction: FunctionDescriptor?): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'callableInfo' @ [333:38] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'returnTypeInfo' @ [333:51] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'typeParameterNameMap' @ [333:67] ==> public final val typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'fakeFunction' @ [333:89] ==> val fakeFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'receiverTypeCandidate' @ [335:13] ==> public final val receiverTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'render' @ [335:36] ==> public final fun render(typeParameterNameMap: Map<TypeParameterDescriptor, String>, fakeFunction: FunctionDescriptor?): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[SimpleFunctionDescriptorImpl]

'typeParameterNameMap' @ [335:43] ==> public final val typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'fakeFunction' @ [335:65] ==> val fakeFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'mandatoryTypeParametersAsCandidates' @ [336:13] ==> public final val mandatoryTypeParametersAsCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'forEach' @ [336:49] ==> @HidesMembers public inline fun <T> Iterable<TypeCandidate>.forEach(action: (TypeCandidate) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'it' @ [336:59] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>.<anonymous>[ValueParameterDescriptorImpl]

'render' @ [336:62] ==> public final fun render(typeParameterNameMap: Map<TypeParameterDescriptor, String>, fakeFunction: FunctionDescriptor?): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[SimpleFunctionDescriptorImpl]

'typeParameterNameMap' @ [336:69] ==> public final val typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'fakeFunction' @ [336:91] ==> val fakeFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.<init>[LocalVariableDescriptor]

'config' @ [340:17] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'isExtension' @ [340:24] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'receiverClassDescriptor' @ [340:39] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'currentFileModule' @ [341:24] ==> public final val currentFileModule: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'getPackage' @ [341:42] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'config' @ [341:53] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentFile' @ [341:60] ==> public final val currentFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'packageFqName' @ [341:72] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'memberScope' @ [341:87] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'memberScopeAsImportingScope' @ [341:99] ==> @JvmOverloads public fun MemberScope.memberScopeAsImportingScope(parentScope: ImportingScope? = ...): ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'receiverClassDescriptor' @ [344:17] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'receiverClassDescriptor' @ [345:24] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'scopeForMemberDeclarationResolution' @ [345:48] ==> public final val ClassDescriptorWithResolutionScopes.scopeForMemberDeclarationResolution: LexicalScope[MyPropertyDescriptor]

'assert' @ [348:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'receiverClassDescriptor' @ [348:21] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'receiverClassDescriptor' @ [348:100] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'receiverClassDescriptor' @ [350:33] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'declaredTypeParameters' @ [350:81] ==> public final val JavaClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [351:22] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> TypeProjectionImpl

'TypeProjectionImpl' @ [351:28] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'it' @ [351:47] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getDeclarationScope.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [351:50] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'receiverClassDescriptor' @ [352:31] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'getMemberScope' @ [352:55] ==> @NotNull public abstract fun getMemberScope(@NotNull p0: (MutableList<out (TypeProjection..TypeProjection?)>..List<(TypeProjection..TypeProjection?)>)): MemberScope defined in org.jetbrains.kotlin.load.java.descriptors.JavaClassDescriptor[JavaMethodDescriptor]

'projections' @ [352:70] ==> val projections: List<TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getDeclarationScope[LocalVariableDescriptor]

'LexicalScopeImpl' @ [354:20] ==> @JvmOverloads public constructor LexicalScopeImpl(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor, isOwnerDescriptorAccessibleByLabel: Boolean, implicitReceiver: ReceiverParameterDescriptor?, kind: LexicalScopeKind, redeclarationChecker: LocalRedeclarationChecker = ..., initialize: LexicalScopeImpl.InitializeHandler.() -> Unit = ...) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl[DeserializedClassConstructorDescriptor]

'memberScope' @ [354:37] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getDeclarationScope[LocalVariableDescriptor]

'memberScopeAsImportingScope' @ [354:49] ==> @JvmOverloads public fun MemberScope.memberScopeAsImportingScope(parentScope: ImportingScope? = ...): ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'receiverClassDescriptor' @ [354:80] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'SYNTHETIC' @ [355:54] ==> enum entry SYNTHETIC defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'receiverClassDescriptor' @ [356:17] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'typeConstructor' @ [356:41] ==> public final val JavaClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [356:57] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'forEach' @ [356:68] ==> @HidesMembers public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.forEach(action: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'addClassifierDescriptor' @ [356:78] ==> public final fun addClassifierDescriptor(classifierDescriptor: ClassifierDescriptor): Unit defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl.InitializeHandler[DeserializedSimpleFunctionDescriptor]

'it' @ [356:102] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getDeclarationScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'placement' @ [364:17] ==> public final var placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'receiverType' @ [366:39] ==> value-parameter receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForReceiverTypeParameters[ValueParameterDescriptorImpl]

'arguments' @ [366:53] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'emptyList' @ [366:78] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(TypeProjection..TypeProjection?)>..List<(TypeProjection..TypeProjection?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.TypeProjection..org.jetbrains.kotlin.types.TypeProjection?)

'?:' @ [367:38] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<TypeProjection>?, right: List<TypeProjection>): List<TypeProjection>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<TypeProjection>

'placement' @ [367:39] ==> public final var placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'receiverTypeCandidate' @ [367:86] ==> public final val receiverTypeCandidate: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.WithReceiver[PropertyDescriptorImpl]

'theType' @ [367:109] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'arguments' @ [367:118] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'emptyList' @ [368:53] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(TypeProjection..TypeProjection?)>..List<(TypeProjection..TypeProjection?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.TypeProjection..org.jetbrains.kotlin.types.TypeProjection?)

'assert' @ [369:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'ownerTypeArguments' @ [369:20] ==> val ownerTypeArguments: List<TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForReceiverTypeParameters[LocalVariableDescriptor]

'size' @ [369:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'classTypeParameters' @ [369:47] ==> val classTypeParameters: List<TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForReceiverTypeParameters[LocalVariableDescriptor]

'size' @ [369:67] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ownerTypeArguments' @ [370:13] ==> val ownerTypeArguments: List<TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForReceiverTypeParameters[LocalVariableDescriptor]

'zip' @ [370:32] ==> public infix fun <T, R> Iterable<TypeProjection>.zip(other: Iterable<TypeProjection>): List<Pair<TypeProjection, TypeProjection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeProjection

'classTypeParameters' @ [370:36] ==> val classTypeParameters: List<TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForReceiverTypeParameters[LocalVariableDescriptor]

'forEach' @ [370:57] ==> @HidesMembers public inline fun <T> Iterable<Pair<TypeProjection, TypeProjection>>.forEach(action: (Pair<TypeProjection, TypeProjection>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<TypeProjection, TypeProjection>

'result' @ [370:67] ==> value-parameter result: MutableMap<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForReceiverTypeParameters[ValueParameterDescriptorImpl]

'it' @ [370:74] ==> value-parameter it: Pair<TypeProjection, TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForReceiverTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [370:77] ==> public final val first: TypeProjection defined in kotlin.Pair[DeserializedPropertyDescriptor]

'type' @ [370:83] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'it' @ [370:91] ==> value-parameter it: Pair<TypeProjection, TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForReceiverTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [370:94] ==> public final val second: TypeProjection defined in kotlin.Pair[DeserializedPropertyDescriptor]

'type' @ [370:101] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'component1' @ [377:19] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [377:33] ==> public final operator fun component2(): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'typeArguments' @ [377:51] ==> value-parameter typeArguments: Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForCallableTypeParameters[ValueParameterDescriptorImpl]

'zip' @ [377:65] ==> public infix fun <T, R> Iterable<KotlinType>.zip(other: Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>): List<Pair<KotlinType, (TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'fakeFunction' @ [377:69] ==> value-parameter fakeFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForCallableTypeParameters[ValueParameterDescriptorImpl]

'typeParameters' @ [377:82] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'result' @ [378:17] ==> value-parameter result: MutableMap<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForCallableTypeParameters[ValueParameterDescriptorImpl]

'typeArgument' @ [378:24] ==> val typeArgument: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForCallableTypeParameters[LocalVariableDescriptor]

'typeParameter' @ [378:40] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.collectSubstitutionsForCallableTypeParameters[LocalVariableDescriptor]

'defaultType' @ [378:54] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'create' @ [383:61] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Name, @NotNull p3: CallableMemberDescriptor.Kind, @NotNull p4: SourceElement): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'MutablePackageFragmentDescriptor' @ [384:21] ==> public constructor MutablePackageFragmentDescriptor(@NotNull p0: ModuleDescriptor, @NotNull p1: FqName) defined in org.jetbrains.kotlin.descriptors.impl.MutablePackageFragmentDescriptor[JavaClassConstructorDescriptor]

'currentFileModule' @ [384:54] ==> public final val currentFileModule: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'FqName' @ [384:73] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'EMPTY' @ [385:33] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'identifier' @ [386:26] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'SYNTHESIZED' @ [387:51] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'NO_SOURCE' @ [388:35] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'CollectingNameValidator' @ [391:29] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'scope' @ [391:55] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor[ValueParameterDescriptorImpl]

'findClassifier' @ [391:61] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [391:81] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [391:92] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [391:114] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'KotlinNameSuggester' @ [392:34] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesForTypeParameters' @ [392:54] ==> public final fun suggestNamesForTypeParameters(count: Int, validator: (String) -> Boolean): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'typeParameterCount' @ [392:84] ==> value-parameter typeParameterCount: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor[ValueParameterDescriptorImpl]

'validator' @ [392:104] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor[LocalVariableDescriptor]

'..' @ [393:35] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'typeParameterCount' @ [393:38] ==> value-parameter typeParameterCount: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor[ValueParameterDescriptorImpl]

'map' @ [393:62] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> TypeParameterDescriptor): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> TypeParameterDescriptor

'createWithDefaultBound' @ [394:45] ==> @NotNull public open fun createWithDefaultBound(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, p2: Boolean, @NotNull p3: Variance, @NotNull p4: Name, p5: Int): TypeParameterDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeParameterDescriptorImpl[JavaMethodDescriptor]

'fakeFunction' @ [395:25] ==> val fakeFunction: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor[LocalVariableDescriptor]

'EMPTY' @ [396:37] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'INVARIANT' @ [398:34] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'identifier' @ [399:30] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'parameterNames' @ [399:41] ==> val parameterNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor[LocalVariableDescriptor]

'it' @ [399:56] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [400:25] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'fakeFunction' @ [404:20] ==> val fakeFunction: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor[LocalVariableDescriptor]

'initialize' @ [404:33] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'typeParameters' @ [404:56] ==> val typeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createFakeFunctionDescriptor[LocalVariableDescriptor]

'emptyList' @ [404:84] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'INTERNAL' @ [405:63] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'typeCandidates' @ [413:13] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'typeInfo' @ [413:28] ==> value-parameter typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.renderTypeCandidates[ValueParameterDescriptorImpl]

'forEach' @ [413:39] ==> @HidesMembers public inline fun <T> Iterable<TypeCandidate>.forEach(action: (TypeCandidate) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'it' @ [413:49] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.renderTypeCandidates.<anonymous>[ValueParameterDescriptorImpl]

'render' @ [413:52] ==> public final fun render(typeParameterNameMap: Map<TypeParameterDescriptor, String>, fakeFunction: FunctionDescriptor?): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[SimpleFunctionDescriptorImpl]

'typeParameterNameMap' @ [413:59] ==> value-parameter typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.renderTypeCandidates[ValueParameterDescriptorImpl]

'fakeFunction' @ [413:81] ==> value-parameter fakeFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.renderTypeCandidates[ValueParameterDescriptorImpl]

'containingElement' @ [417:33] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'getNonStrictParentOfType' @ [417:51] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'classOrObject' @ [418:20] ==> val classOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.isInsideInnerOrLocalClass[LocalVariableDescriptor]

'classOrObject' @ [418:49] ==> val classOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.isInsideInnerOrLocalClass[LocalVariableDescriptor]

'isInner' @ [418:63] ==> public final fun isInner(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [418:76] ==> val classOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.isInsideInnerOrLocalClass[LocalVariableDescriptor]

'isLocal' @ [418:90] ==> public final val KtClass.isLocal: Boolean[MyPropertyDescriptor]

'with' @ [422:13] ==> @InlineOnly public inline fun <T, R> with(receiver: CallableBuilderConfiguration, block: CallableBuilderConfiguration.() -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableBuilderConfiguration
    <R> -> Nothing

'config' @ [422:19] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'if (containingElement is KtBlockExpression && (callableInfo as? PropertyInfo)?.writable ?: false) {
                            originalElement as KtBinaryExpression
                        }
                        else null' @ [424:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtBinaryExpression?, elseBranch: KtBinaryExpression?): KtBinaryExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtBinaryExpression?

'containingElement' @ [424:29] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'?:' @ [424:71] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'callableInfo' @ [424:72] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'writable' @ [424:104] ==> public final val writable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'originalElement' @ [425:29] ==> public final val originalElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'if (isExtension) {
                    val renderedType = receiverTypeCandidate!!.renderedTypes.first()
                    val isFunctionType = receiverTypeCandidate.theType.constructor.declarationDescriptor is FunctionClassDescriptor
                    if (isFunctionType) "($renderedType)." else "$renderedType."
                } else ""' @ [429:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isExtension' @ [429:43] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'receiverTypeCandidate' @ [430:40] ==> public final val receiverTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'renderedTypes' @ [430:64] ==> public final var renderedTypes: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'first' @ [430:78] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'receiverTypeCandidate' @ [431:42] ==> public final val receiverTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'theType' @ [431:64] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'constructor' @ [431:72] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [431:84] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'if (isFunctionType) "($renderedType)." else "$renderedType."' @ [432:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isFunctionType' @ [432:25] ==> val isFunctionType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'renderedType' @ [432:44] ==> val renderedType: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'renderedType' @ [432:67] ==> val renderedType: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'callableInfo' @ [435:34] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'classInfo' @ [435:76] ==> public final val classInfo: ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PrimaryConstructorInfo[PropertyDescriptorImpl]

'kind' @ [435:87] ==> public final val kind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'if (classKind == ClassKind.ANNOTATION_CLASS) "val " else ""' @ [438:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'classKind' @ [438:38] ==> val classKind: ClassKind? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'ANNOTATION_CLASS' @ [438:61] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'callableInfo' @ [439:32] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parameterInfos' @ [439:45] ==> public abstract val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'indices' @ [439:60] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'joinToString' @ [439:68] ==> public fun <T> Iterable<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'prefix' @ [439:97] ==> val prefix: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.renderParamList[LocalVariableDescriptor]

'i' @ [439:106] ==> value-parameter i: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.renderParamList.<anonymous>[ValueParameterDescriptorImpl]

'if (callableInfo.parameterInfos.isNotEmpty()
                               || callableInfo.kind == CallableKind.FUNCTION
                               || callableInfo.kind == CallableKind.SECONDARY_CONSTRUCTOR) "($list)" else list' @ [440:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'callableInfo' @ [440:32] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parameterInfos' @ [440:45] ==> public abstract val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'isNotEmpty' @ [440:60] ==> @InlineOnly public inline fun <T> Collection<ParameterInfo>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'callableInfo' @ [441:35] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'kind' @ [441:48] ==> public abstract val kind: CallableKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'FUNCTION' @ [441:69] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'callableInfo' @ [442:35] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'kind' @ [442:48] ==> public abstract val kind: CallableKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'SECONDARY_CONSTRUCTOR' @ [442:69] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'list' @ [442:95] ==> val list: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.renderParamList[LocalVariableDescriptor]

'list' @ [442:107] ==> val list: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.renderParamList[LocalVariableDescriptor]

'when (callableInfo.kind) {
                    CallableKind.FUNCTION, CallableKind.CLASS_WITH_PRIMARY_CONSTRUCTOR, CallableKind.SECONDARY_CONSTRUCTOR ->
                        renderParamList()
                    CallableKind.PROPERTY -> ""
                }' @ [445:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'callableInfo' @ [445:39] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'kind' @ [445:52] ==> public abstract val kind: CallableKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'FUNCTION' @ [446:34] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'CLASS_WITH_PRIMARY_CONSTRUCTOR' @ [446:57] ==> enum entry CLASS_WITH_PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'SECONDARY_CONSTRUCTOR' @ [446:102] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'renderParamList' @ [447:25] ==> local final fun renderParamList(): String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[SimpleFunctionDescriptorImpl]

'PROPERTY' @ [448:34] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'if (skipReturnType || assignmentToReplace != null) "" else ": Any"' @ [450:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'skipReturnType' @ [450:44] ==> public final val skipReturnType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'assignmentToReplace' @ [450:62] ==> val assignmentToReplace: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'ownerTypeString' @ [451:32] ==> val ownerTypeString: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'callableInfo' @ [451:49] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'name' @ [451:62] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'quoteIfNeeded' @ [451:67] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'paramList' @ [451:84] ==> val paramList: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'returnTypeString' @ [451:94] ==> val returnTypeString: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'KtPsiFactory' @ [453:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'currentFile' @ [453:47] ==> public final val currentFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'if (callableInfo.isAbstract) {
                            if (containingElement is KtClass && containingElement.isInterface()) "" else "abstract "
                        }
                        else if (containingElement is KtClassOrObject
                                 && !(containingElement is KtClass && containingElement.isInterface())
                                 && containingElement.isAncestor(config.originalElement)
                                 && callableInfo.kind != CallableKind.SECONDARY_CONSTRUCTOR) "private "
                        else if (isExtension) "private "
                        else ""' @ [456:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'callableInfo' @ [456:29] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'isAbstract' @ [456:42] ==> public final val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'if (containingElement is KtClass && containingElement.isInterface()) "" else "abstract "' @ [457:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'containingElement' @ [457:33] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'containingElement' @ [457:65] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'isInterface' @ [457:83] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'if (containingElement is KtClassOrObject
                                 && !(containingElement is KtClass && containingElement.isInterface())
                                 && containingElement.isAncestor(config.originalElement)
                                 && callableInfo.kind != CallableKind.SECONDARY_CONSTRUCTOR) "private "
                        else if (isExtension) "private "
                        else ""' @ [459:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'containingElement' @ [459:34] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'!' @ [460:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingElement' @ [460:39] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'containingElement' @ [460:71] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'isInterface' @ [460:89] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'containingElement' @ [461:37] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'isAncestor' @ [461:55] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'config' @ [461:66] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'originalElement' @ [461:73] ==> public final val originalElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'callableInfo' @ [462:37] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'kind' @ [462:50] ==> public abstract val kind: CallableKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'SECONDARY_CONSTRUCTOR' @ [462:71] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'if (isExtension) "private "
                        else ""' @ [463:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isExtension' @ [463:34] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'when (callableInfo.kind) {
                    CallableKind.FUNCTION, CallableKind.SECONDARY_CONSTRUCTOR -> {
                        val body = when {
                            callableInfo.kind == CallableKind.SECONDARY_CONSTRUCTOR -> ""
                            callableInfo.isAbstract -> ""
                            containingElement is KtClass && containingElement.hasModifier(KtTokens.EXTERNAL_KEYWORD) -> ""
                            containingElement is KtObjectDeclaration && containingElement.hasModifier(KtTokens.EXTERNAL_KEYWORD) -> ""
                            containingElement is KtObjectDeclaration && containingElement.isCompanion()
                                && containingElement.parent.parent is KtClass
                                && (containingElement.parent.parent as KtClass).hasModifier(KtTokens.EXTERNAL_KEYWORD) -> ""
                            else -> "{}"

                        }
                        @Suppress("USELESS_CAST") // KT-10755
                        if (callableInfo is FunctionInfo) {
                            val operatorModifier = if (callableInfo.isOperator) "operator " else ""
                            val infixModifier = if (callableInfo.isInfix) "infix " else ""
                            psiFactory.createFunction("$modifiers$infixModifier${operatorModifier}fun<> $header $body") as KtNamedDeclaration
                        }
                        else {
                            psiFactory.createSecondaryConstructor("${modifiers}constructor$paramList $body") as KtNamedDeclaration
                        }
                    }
                    CallableKind.CLASS_WITH_PRIMARY_CONSTRUCTOR -> {
                        with((callableInfo as PrimaryConstructorInfo).classInfo) {
                            val classBody = when (kind) {
                                ClassKind.ANNOTATION_CLASS, ClassKind.ENUM_ENTRY -> ""
                                else -> "{\n\n}"
                            }
                            val safeName = name.quoteIfNeeded()
                            when (kind) {
                                ClassKind.ENUM_ENTRY -> {
                                    val targetParent = applicableParents.singleOrNull()
                                    if (!(targetParent is KtClass && targetParent.isEnum())) throw AssertionError("Enum class expected: ${targetParent?.text}")
                                    val hasParameters = targetParent.primaryConstructorParameters.isNotEmpty()
                                    psiFactory.createEnumEntry("$safeName${if (hasParameters) "()" else " "}")
                                }
                                else -> {
                                    val openMod = if (open) "open " else ""
                                    val innerMod = if (inner || isInsideInnerOrLocalClass()) "inner " else ""
                                    val typeParamList = when (kind) {
                                        ClassKind.PLAIN_CLASS, ClassKind.INTERFACE -> "<>"
                                        else -> ""
                                    }
                                    psiFactory.createDeclaration<KtClassOrObject>(
                                            "$openMod$innerMod${kind.keyword} $safeName$typeParamList$paramList$returnTypeString $classBody"
                                    )
                                }
                            }
                        }
                    }
                    CallableKind.PROPERTY -> {
                        val isVar = (callableInfo as PropertyInfo).writable
                        val valVar = if (isVar) "var" else "val"
                        val accessors = if (isExtension) {
                            buildString {
                                append("\nget() {}")
                                if (isVar) {
                                    append("\nset() {}")
                                }
                            }
                        }
                        else ""
                        psiFactory.createProperty("$modifiers$valVar<> $header$accessors")
                    }
                }' @ [466:55] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtNamedDeclaration, entry1: KtNamedDeclaration, entry2: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtNamedDeclaration

'callableInfo' @ [466:61] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'kind' @ [466:74] ==> public abstract val kind: CallableKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'FUNCTION' @ [467:34] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'SECONDARY_CONSTRUCTOR' @ [467:57] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'when {
                            callableInfo.kind == CallableKind.SECONDARY_CONSTRUCTOR -> ""
                            callableInfo.isAbstract -> ""
                            containingElement is KtClass && containingElement.hasModifier(KtTokens.EXTERNAL_KEYWORD) -> ""
                            containingElement is KtObjectDeclaration && containingElement.hasModifier(KtTokens.EXTERNAL_KEYWORD) -> ""
                            containingElement is KtObjectDeclaration && containingElement.isCompanion()
                                && containingElement.parent.parent is KtClass
                                && (containingElement.parent.parent as KtClass).hasModifier(KtTokens.EXTERNAL_KEYWORD) -> ""
                            else -> "{}"

                        }' @ [468:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'callableInfo' @ [469:29] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'kind' @ [469:42] ==> public abstract val kind: CallableKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'SECONDARY_CONSTRUCTOR' @ [469:63] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'callableInfo' @ [470:29] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'isAbstract' @ [470:42] ==> public final val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'containingElement' @ [471:29] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'containingElement' @ [471:61] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'hasModifier' @ [471:79] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [471:100] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'containingElement' @ [472:29] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'containingElement' @ [472:73] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'hasModifier' @ [472:91] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [472:112] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'containingElement' @ [473:29] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'containingElement' @ [473:73] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'isCompanion' @ [473:91] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'containingElement' @ [474:36] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parent' @ [474:54] ==> public final val KtObjectDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [474:61] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'containingElement' @ [475:37] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parent' @ [475:55] ==> public final val KtObjectDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [475:62] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'hasModifier' @ [475:81] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [475:102] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Suppress' @ [479:25] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (callableInfo is FunctionInfo) {
                            val operatorModifier = if (callableInfo.isOperator) "operator " else ""
                            val infixModifier = if (callableInfo.isInfix) "infix " else ""
                            psiFactory.createFunction("$modifiers$infixModifier${operatorModifier}fun<> $header $body") as KtNamedDeclaration
                        }
                        else {
                            psiFactory.createSecondaryConstructor("${modifiers}constructor$paramList $body") as KtNamedDeclaration
                        }' @ [480:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtNamedDeclaration, elseBranch: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtNamedDeclaration

'callableInfo' @ [480:29] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'if (callableInfo.isOperator) "operator " else ""' @ [481:52] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'callableInfo' @ [481:56] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'isOperator' @ [481:69] ==> public final val isOperator: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[PropertyDescriptorImpl]

'if (callableInfo.isInfix) "infix " else ""' @ [482:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'callableInfo' @ [482:53] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'isInfix' @ [482:66] ==> public final val isInfix: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[PropertyDescriptorImpl]

'psiFactory' @ [483:29] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'createFunction' @ [483:40] ==> public final fun createFunction(funDecl: String): KtNamedFunction defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [483:57] ==> val modifiers: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'infixModifier' @ [483:67] ==> val infixModifier: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'operatorModifier' @ [483:82] ==> val operatorModifier: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'header' @ [483:106] ==> val header: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'body' @ [483:114] ==> val body: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'psiFactory' @ [486:29] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'createSecondaryConstructor' @ [486:40] ==> public final fun createSecondaryConstructor(decl: String): KtSecondaryConstructor defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [486:70] ==> val modifiers: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'paramList' @ [486:92] ==> val paramList: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'body' @ [486:103] ==> val body: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'CLASS_WITH_PRIMARY_CONSTRUCTOR' @ [489:34] ==> enum entry CLASS_WITH_PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'with' @ [490:25] ==> @InlineOnly public inline fun <T, R> with(receiver: ClassInfo, block: ClassInfo.() -> KtClassOrObject): KtClassOrObject defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassInfo
    <R> -> KtClassOrObject

'callableInfo' @ [490:31] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'classInfo' @ [490:71] ==> public final val classInfo: ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PrimaryConstructorInfo[PropertyDescriptorImpl]

'when (kind) {
                                ClassKind.ANNOTATION_CLASS, ClassKind.ENUM_ENTRY -> ""
                                else -> "{\n\n}"
                            }' @ [491:45] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'kind' @ [491:51] ==> public final val kind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'ANNOTATION_CLASS' @ [492:43] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'ENUM_ENTRY' @ [492:71] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'name' @ [495:44] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'quoteIfNeeded' @ [495:49] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'when (kind) {
                                ClassKind.ENUM_ENTRY -> {
                                    val targetParent = applicableParents.singleOrNull()
                                    if (!(targetParent is KtClass && targetParent.isEnum())) throw AssertionError("Enum class expected: ${targetParent?.text}")
                                    val hasParameters = targetParent.primaryConstructorParameters.isNotEmpty()
                                    psiFactory.createEnumEntry("$safeName${if (hasParameters) "()" else " "}")
                                }
                                else -> {
                                    val openMod = if (open) "open " else ""
                                    val innerMod = if (inner || isInsideInnerOrLocalClass()) "inner " else ""
                                    val typeParamList = when (kind) {
                                        ClassKind.PLAIN_CLASS, ClassKind.INTERFACE -> "<>"
                                        else -> ""
                                    }
                                    psiFactory.createDeclaration<KtClassOrObject>(
                                            "$openMod$innerMod${kind.keyword} $safeName$typeParamList$paramList$returnTypeString $classBody"
                                    )
                                }
                            }' @ [496:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtClassOrObject, entry1: KtClassOrObject): KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtClassOrObject

'kind' @ [496:35] ==> public final val kind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'ENUM_ENTRY' @ [497:43] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'applicableParents' @ [498:56] ==> public final val applicableParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'singleOrNull' @ [498:74] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'!' @ [499:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetParent' @ [499:43] ==> val targetParent: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'targetParent' @ [499:70] ==> val targetParent: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isEnum' @ [499:83] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [499:100] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'targetParent' @ [499:139] ==> val targetParent: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'text' @ [499:153] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'targetParent' @ [500:57] ==> val targetParent: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'primaryConstructorParameters' @ [500:70] ==> public final val KtClass.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'isNotEmpty' @ [500:99] ==> @InlineOnly public inline fun <T> Collection<KtParameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'psiFactory' @ [501:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'createEnumEntry' @ [501:48] ==> public final fun createEnumEntry(text: String): KtEnumEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'safeName' @ [501:66] ==> val safeName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (hasParameters) "()" else " "' @ [501:76] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'hasParameters' @ [501:80] ==> val hasParameters: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (open) "open " else ""' @ [504:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'open' @ [504:55] ==> public final val open: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'if (inner || isInsideInnerOrLocalClass()) "inner " else ""' @ [505:52] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'inner' @ [505:56] ==> public final val inner: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'isInsideInnerOrLocalClass' @ [505:65] ==> private final fun isInsideInnerOrLocalClass(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'when (kind) {
                                        ClassKind.PLAIN_CLASS, ClassKind.INTERFACE -> "<>"
                                        else -> ""
                                    }' @ [506:57] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'kind' @ [506:63] ==> public final val kind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'PLAIN_CLASS' @ [507:51] ==> enum entry PLAIN_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'INTERFACE' @ [507:74] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'psiFactory' @ [510:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'createDeclaration' @ [510:48] ==> public final fun <TDeclaration : KtDeclaration> createDeclaration(text: String): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtClassOrObject

'openMod' @ [511:47] ==> val openMod: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'innerMod' @ [511:55] ==> val innerMod: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'kind' @ [511:65] ==> public final val kind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'keyword' @ [511:70] ==> public final val keyword: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[PropertyDescriptorImpl]

'safeName' @ [511:80] ==> val safeName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'typeParamList' @ [511:89] ==> val typeParamList: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'paramList' @ [511:103] ==> val paramList: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'returnTypeString' @ [511:113] ==> val returnTypeString: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'classBody' @ [511:131] ==> val classBody: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[LocalVariableDescriptor]

'PROPERTY' @ [517:34] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'callableInfo' @ [518:38] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'writable' @ [518:68] ==> public final val writable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'if (isVar) "var" else "val"' @ [519:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isVar' @ [519:42] ==> val isVar: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'if (isExtension) {
                            buildString {
                                append("\nget() {}")
                                if (isVar) {
                                    append("\nset() {}")
                                }
                            }
                        }
                        else ""' @ [520:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isExtension' @ [520:45] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'buildString' @ [521:29] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [522:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'isVar' @ [523:37] ==> val isVar: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'append' @ [524:37] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'psiFactory' @ [529:25] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'createProperty' @ [529:36] ==> public final fun createProperty(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [529:53] ==> val modifiers: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'valVar' @ [529:63] ==> val valVar: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'header' @ [529:73] ==> val header: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'accessors' @ [529:80] ==> val accessors: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'assignmentToReplace' @ [533:21] ==> val assignmentToReplace: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'declaration' @ [534:22] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'initializer' @ [534:49] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'assignmentToReplace' @ [534:63] ==> val assignmentToReplace: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'right' @ [534:83] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'assignmentToReplace' @ [535:28] ==> val assignmentToReplace: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'replace' @ [535:48] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'declaration' @ [535:56] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'placeDeclarationInContainer' @ [538:42] ==> @Suppress internal fun <D : KtNamedDeclaration> placeDeclarationInContainer(declaration: KtNamedDeclaration, container: PsiElement, anchor: PsiElement, fileToEdit: KtFile = ...): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : KtNamedDeclaration> -> KtNamedDeclaration

'declaration' @ [538:70] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'containingElement' @ [538:83] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'config' @ [538:102] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'originalElement' @ [538:109] ==> public final val originalElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'jetFileToEdit' @ [538:126] ==> public final val jetFileToEdit: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'declarationInPlace' @ [540:21] ==> val declarationInPlace: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'declarationInPlace' @ [541:43] ==> val declarationInPlace: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'containingClassOrObject' @ [541:62] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'if (containingClass.primaryConstructorParameters.isNotEmpty()) {
                        declarationInPlace.replaceImplicitDelegationCallWithExplicit(true)
                    }
                    else if ((receiverClassDescriptor as ClassDescriptor).getSuperClassOrAny().constructors.all { it.valueParameters.isNotEmpty() }) {
                        declarationInPlace.replaceImplicitDelegationCallWithExplicit(false)
                    }' @ [542:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'containingClass' @ [542:25] ==> val containingClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'primaryConstructorParameters' @ [542:41] ==> public final val KtClassOrObject.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'isNotEmpty' @ [542:70] ==> @InlineOnly public inline fun <T> Collection<KtParameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'declarationInPlace' @ [543:25] ==> val declarationInPlace: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'replaceImplicitDelegationCallWithExplicit' @ [543:44] ==> public final fun replaceImplicitDelegationCallWithExplicit(isThis: Boolean): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'receiverClassDescriptor' @ [545:31] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'getSuperClassOrAny' @ [545:75] ==> public fun ClassDescriptor.getSuperClassOrAny(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'constructors' @ [545:96] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'all' @ [545:109] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.all(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [545:115] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [545:118] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [545:134] ==> @InlineOnly public inline fun <T> Collection<(ValueParameterDescriptor..ValueParameterDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'declarationInPlace' @ [546:25] ==> val declarationInPlace: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'replaceImplicitDelegationCallWithExplicit' @ [546:44] ==> public final fun replaceImplicitDelegationCallWithExplicit(isThis: Boolean): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'declarationInPlace' @ [550:24] ==> val declarationInPlace: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.createDeclarationSkeleton.<anonymous>[LocalVariableDescriptor]

'LinkedHashSet' @ [555:47] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeParameterDescriptor

'mandatoryTypeParametersAsCandidates' @ [557:13] ==> public final val mandatoryTypeParametersAsCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'asSequence' @ [557:49] ==> public fun <T> Iterable<TypeCandidate>.asSequence(): Sequence<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'plus' @ [558:22] ==> public operator fun <T> Sequence<TypeCandidate>.plus(elements: Sequence<TypeCandidate>): Sequence<TypeCandidate> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'callableInfo' @ [558:27] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parameterInfos' @ [558:40] ==> public abstract val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'asSequence' @ [558:55] ==> public fun <T> Iterable<ParameterInfo>.asSequence(): Sequence<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'flatMap' @ [558:68] ==> public fun <T, R> Sequence<ParameterInfo>.flatMap(transform: (ParameterInfo) -> Sequence<TypeCandidate>): Sequence<TypeCandidate> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo
    <R> -> TypeCandidate

'typeCandidates' @ [558:78] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'it' @ [558:93] ==> value-parameter it: ParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames.<anonymous>[ValueParameterDescriptorImpl]

'typeInfo' @ [558:96] ==> public final val typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[PropertyDescriptorImpl]

'asSequence' @ [558:108] ==> public fun <T> Iterable<TypeCandidate>.asSequence(): Sequence<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'flatMap' @ [559:22] ==> public fun <T, R> Sequence<TypeCandidate>.flatMap(transform: (TypeCandidate) -> Sequence<TypeParameterDescriptor>): Sequence<TypeParameterDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate
    <R> -> TypeParameterDescriptor

'it' @ [559:32] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [559:35] ==> public final val typeParameters: Array<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'asSequence' @ [559:50] ==> public fun <T> Array<out TypeParameterDescriptor>.asSequence(): Sequence<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'toCollection' @ [560:22] ==> public fun <T, C : MutableCollection<in TypeParameterDescriptor>> Sequence<TypeParameterDescriptor>.toCollection(destination: LinkedHashSet<TypeParameterDescriptor>): LinkedHashSet<TypeParameterDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <C : MutableCollection<in T>> -> LinkedHashSet<TypeParameterDescriptor>

'allTypeParametersNotInScope' @ [560:35] ==> val allTypeParametersNotInScope: LinkedHashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames[LocalVariableDescriptor]

'!' @ [562:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'skipReturnType' @ [562:18] ==> public final val skipReturnType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'computeTypeCandidates' @ [563:17] ==> public final fun computeTypeCandidates(typeInfo: TypeInfo): List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'callableInfo' @ [563:39] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'returnTypeInfo' @ [563:52] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'asSequence' @ [563:68] ==> public fun <T> Iterable<TypeCandidate>.asSequence(): Sequence<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'flatMapTo' @ [563:81] ==> public inline fun <T, R, C : MutableCollection<in TypeParameterDescriptor>> Sequence<TypeCandidate>.flatMapTo(destination: LinkedHashSet<TypeParameterDescriptor>, transform: (TypeCandidate) -> Sequence<TypeParameterDescriptor>): LinkedHashSet<TypeParameterDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate
    <R> -> TypeParameterDescriptor
    <C : MutableCollection<in R>> -> LinkedHashSet<TypeParameterDescriptor>

'allTypeParametersNotInScope' @ [563:91] ==> val allTypeParametersNotInScope: LinkedHashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames[LocalVariableDescriptor]

'it' @ [564:21] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [564:24] ==> public final val typeParameters: Array<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'asSequence' @ [564:39] ==> public fun <T> Array<out TypeParameterDescriptor>.asSequence(): Sequence<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'CollectingNameValidator' @ [568:29] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'scope' @ [568:55] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames[ValueParameterDescriptorImpl]

'findClassifier' @ [568:61] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [568:81] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [568:92] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [568:114] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'allTypeParametersNotInScope' @ [569:38] ==> val allTypeParametersNotInScope: LinkedHashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames[LocalVariableDescriptor]

'map' @ [569:66] ==> public inline fun <T, R> Iterable<TypeParameterDescriptor>.map(transform: (TypeParameterDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> String

'KotlinNameSuggester' @ [569:72] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [569:92] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'it' @ [569:110] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [569:113] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [569:118] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'validator' @ [569:130] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames[LocalVariableDescriptor]

'allTypeParametersNotInScope' @ [571:20] ==> val allTypeParametersNotInScope: LinkedHashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames[LocalVariableDescriptor]

'zip' @ [571:48] ==> public infix fun <T, R> Iterable<TypeParameterDescriptor>.zip(other: Iterable<String>): List<Pair<TypeParameterDescriptor, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> String

'typeParameterNames' @ [571:52] ==> val typeParameterNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.getTypeParameterRenames[LocalVariableDescriptor]

'toMap' @ [571:72] ==> public fun <K, V> Iterable<Pair<TypeParameterDescriptor, String>>.toMap(): Map<TypeParameterDescriptor, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> String

'ArrayList' @ [576:37] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'config' @ [578:17] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'isExtension' @ [578:24] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'receiverTypeCandidate' @ [579:40] ==> public final val receiverTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'theType' @ [579:64] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'renderLong' @ [579:72] ==> internal fun KotlinType.renderLong(typeParameterNameMap: Map<TypeParameterDescriptor, String>): List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'typeParameterNameMap' @ [579:83] ==> public final val typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'first' @ [579:105] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'KtPsiFactory' @ [580:40] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'declaration' @ [580:53] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[ValueParameterDescriptorImpl]

'createType' @ [580:66] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'receiverTypeText' @ [580:77] ==> val receiverTypeText: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'!!' @ [581:34] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtTypeReference?): KtTypeReference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtTypeReference

'declaration' @ [581:35] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[ValueParameterDescriptorImpl]

'setReceiverTypeReference' @ [581:73] ==> public fun KtCallableDeclaration.setReceiverTypeReference(typeRef: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers[DeserializedSimpleFunctionDescriptor]

'replacingTypeRef' @ [581:98] ==> val replacingTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'typeRefsToShorten' @ [582:17] ==> val typeRefsToShorten: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'add' @ [582:35] ==> public open fun add(element: KtElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'newTypeRef' @ [582:39] ==> val newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'declaration' @ [585:34] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[ValueParameterDescriptorImpl]

'getReturnTypeReferences' @ [585:46] ==> internal fun KtNamedDeclaration.getReturnTypeReferences(): List<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'returnTypeRefs' @ [586:17] ==> val returnTypeRefs: List<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'isNotEmpty' @ [586:32] ==> @InlineOnly public inline fun <T> Collection<KtTypeReference>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference

'typeCandidates' @ [587:34] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'callableInfo' @ [587:49] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'returnTypeInfo' @ [587:62] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'getTypeByRenderedType' @ [587:80] ==> public fun List<TypeCandidate>.getTypeByRenderedType(renderedTypes: List<String>): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'returnTypeRefs' @ [588:25] ==> val returnTypeRefs: List<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'map' @ [588:40] ==> public inline fun <T, R> Iterable<KtTypeReference>.map(transform: (KtTypeReference) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [588:46] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [588:49] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'returnType' @ [590:21] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'replaceWithLongerName' @ [592:21] ==> private final fun replaceWithLongerName(typeRefs: List<KtTypeReference>, theType: KotlinType): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'returnTypeRefs' @ [592:43] ==> val returnTypeRefs: List<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'returnType' @ [592:59] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'typeRefsToShorten' @ [593:21] ==> val typeRefsToShorten: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'addAll' @ [593:39] ==> public open fun addAll(elements: Collection<KtElement>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'declaration' @ [593:46] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[ValueParameterDescriptorImpl]

'getReturnTypeReferences' @ [593:58] ==> internal fun KtNamedDeclaration.getReturnTypeReferences(): List<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [597:35] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[ValueParameterDescriptorImpl]

'getValueParameters' @ [597:47] ==> public fun KtNamedDeclaration.getValueParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [598:45] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'assert' @ [599:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [599:20] ==> val valueParameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'size' @ [599:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'parameterTypeExpressions' @ [599:44] ==> value-parameter parameterTypeExpressions: List<TypeExpression> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[ValueParameterDescriptorImpl]

'size' @ [599:69] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [600:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [600:22] ==> public final operator fun component2(): KtParameter defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [600:36] ==> val valueParameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'asSequence' @ [600:52] ==> public fun <T> Iterable<KtParameter>.asSequence(): Sequence<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'withIndex' @ [600:65] ==> public fun <T> Sequence<KtParameter>.withIndex(): Sequence<IndexedValue<KtParameter>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'parameter' @ [601:40] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'typeReference' @ [601:50] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'parameterTypeRef' @ [602:21] ==> val parameterTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'parameterTypeExpressions' @ [603:41] ==> value-parameter parameterTypeExpressions: List<TypeExpression> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[ValueParameterDescriptorImpl]

'i' @ [603:66] ==> val i: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'typeCandidates' @ [603:69] ==> public final val typeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression[PropertyDescriptorImpl]

'getTypeByRenderedType' @ [603:84] ==> public fun List<TypeCandidate>.getTypeByRenderedType(renderedTypes: List<String>): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [604:29] ==> public fun <T> listOf(element: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'parameterTypeRef' @ [604:36] ==> val parameterTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'text' @ [604:53] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'parameterType' @ [606:25] ==> val parameterType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'replaceWithLongerName' @ [607:25] ==> private final fun replaceWithLongerName(typeRefs: List<KtTypeReference>, theType: KotlinType): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'listOf' @ [607:47] ==> public fun <T> listOf(element: KtTypeReference): List<KtTypeReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference

'parameterTypeRef' @ [607:54] ==> val parameterTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'parameterType' @ [607:73] ==> val parameterType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'parameterIndicesToShorten' @ [608:25] ==> val parameterIndicesToShorten: ArrayList<Int> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'add' @ [608:51] ==> public open fun add(element: Int): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'i' @ [608:55] ==> val i: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'declaration' @ [613:43] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[ValueParameterDescriptorImpl]

'getValueParameters' @ [613:55] ==> public fun KtNamedDeclaration.getValueParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'parameterIndicesToShorten' @ [614:13] ==> val parameterIndicesToShorten: ArrayList<Int> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'mapNotNullTo' @ [614:39] ==> public inline fun <T, R : Any, C : MutableCollection<in KtTypeReference>> Iterable<Int>.mapNotNullTo(destination: ArrayList<KtElement>, transform: (Int) -> KtTypeReference?): ArrayList<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Any> -> KtTypeReference
    <C : MutableCollection<in R>> -> ArrayList<KtElement>

'typeRefsToShorten' @ [614:52] ==> val typeRefsToShorten: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'expandedValueParameters' @ [614:73] ==> val expandedValueParameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'it' @ [614:97] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [614:101] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeRefsToShorten' @ [616:20] ==> val typeRefsToShorten: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeReferencesForShortening[LocalVariableDescriptor]

'callableInfo' @ [620:17] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'callableInfo' @ [620:49] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'isLateinitPreferred' @ [620:62] ==> public final val isLateinitPreferred: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'declaration' @ [621:21] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.postprocessDeclaration[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [621:33] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'declaration' @ [622:42] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.postprocessDeclaration[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [622:54] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [623:34] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.postprocessDeclaration[LocalVariableDescriptor]

'returnType' @ [623:53] ==> public final val PropertyDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'isNullableType' @ [624:31] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'returnType' @ [624:46] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.postprocessDeclaration[LocalVariableDescriptor]

'isPrimitiveType' @ [624:76] ==> public open fun isPrimitiveType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [624:92] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.postprocessDeclaration[LocalVariableDescriptor]

'declaration' @ [625:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.postprocessDeclaration[ValueParameterDescriptorImpl]

'addModifier' @ [625:29] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'LATEINIT_KEYWORD' @ [625:50] ==> public final val LATEINIT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'func' @ [630:27] ==> value-parameter func: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupDeclarationBody[ValueParameterDescriptorImpl]

'bodyExpression' @ [630:32] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'when (func) {
                is KtSecondaryConstructor -> TemplateKind.SECONDARY_CONSTRUCTOR
                is KtNamedFunction, is KtPropertyAccessor -> TemplateKind.FUNCTION
                else -> throw AssertionError("Unexpected declaration: " + func.getElementTextWithContext())
            }' @ [631:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TemplateKind, entry1: TemplateKind, entry2: TemplateKind): TemplateKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TemplateKind

'func' @ [631:38] ==> value-parameter func: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupDeclarationBody[ValueParameterDescriptorImpl]

'SECONDARY_CONSTRUCTOR' @ [632:59] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.core.TemplateKind[FakeCallableDescriptorForObject]

'FUNCTION' @ [633:75] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.core.TemplateKind[FakeCallableDescriptorForObject]

'AssertionError' @ [634:31] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'+' @ [634:46] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'func' @ [634:75] ==> value-parameter func: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupDeclarationBody[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [634:80] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'getFunctionBodyTextFromTemplate' @ [636:28] ==> public fun getFunctionBodyTextFromTemplate(project: Project, kind: TemplateKind, name: String?, returnType: String, classFqName: FqName? = ...): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'func' @ [637:21] ==> value-parameter func: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupDeclarationBody[ValueParameterDescriptorImpl]

'project' @ [637:26] ==> public final val KtDeclarationWithBody.project: Project[MyPropertyDescriptor]

'templateKind' @ [638:21] ==> val templateKind: TemplateKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupDeclarationBody[LocalVariableDescriptor]

'if (callableInfo.name.isNotEmpty()) callableInfo.name else null' @ [639:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'callableInfo' @ [639:25] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'name' @ [639:38] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'isNotEmpty' @ [639:43] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'callableInfo' @ [639:57] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'name' @ [639:70] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'if (skipReturnType) "Unit" else (func as? KtFunction)?.typeReference?.text ?: ""' @ [640:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'skipReturnType' @ [640:25] ==> public final val skipReturnType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'?:' @ [640:53] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'func' @ [640:54] ==> value-parameter func: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupDeclarationBody[ValueParameterDescriptorImpl]

'typeReference' @ [640:76] ==> public final var KtFunction.typeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [640:91] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'receiverClassDescriptor' @ [641:21] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'importableFqName' @ [641:46] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'receiverClassDescriptor' @ [641:66] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'name' @ [641:91] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'let' @ [641:97] ==> @InlineOnly public inline fun <T, R> Name.let(block: (Name) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> FqName

'topLevel' @ [641:110] ==> @NotNull public open fun topLevel(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'it' @ [641:119] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupDeclarationBody.<anonymous>[ValueParameterDescriptorImpl]

'oldBody' @ [643:13] ==> val oldBody: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupDeclarationBody[LocalVariableDescriptor]

'replace' @ [643:21] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [643:29] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'func' @ [643:42] ==> value-parameter func: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupDeclarationBody[ValueParameterDescriptorImpl]

'createBlock' @ [643:48] ==> public final fun createBlock(bodyText: String): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'bodyText' @ [643:60] ==> val bodyText: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupDeclarationBody[LocalVariableDescriptor]

'callElement' @ [647:39] ==> value-parameter callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments[ValueParameterDescriptorImpl]

'typeArgumentList' @ [647:51] ==> public final val KtCallElement.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'typeParameters' @ [648:36] ==> value-parameter typeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments[ValueParameterDescriptorImpl]

'map' @ [648:51] ==> public inline fun <T, R> Iterable<TypeParameterDescriptor>.map(transform: (TypeParameterDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> String

'substitutions' @ [649:28] ==> public final val substitutions: List<KotlinTypeSubstitution> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'first' @ [649:42] ==> public inline fun <T> Iterable<KotlinTypeSubstitution>.first(predicate: (KotlinTypeSubstitution) -> Boolean): KotlinTypeSubstitution defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinTypeSubstitution

'it' @ [649:50] ==> value-parameter it: KotlinTypeSubstitution defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'byType' @ [649:53] ==> public final val byType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.KotlinTypeSubstitution[PropertyDescriptorImpl]

'constructor' @ [649:60] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [649:72] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'typeParameter' @ [649:97] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'forType' @ [649:113] ==> public final val forType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.KotlinTypeSubstitution[PropertyDescriptorImpl]

'IdeDescriptorRenderers' @ [650:17] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [650:40] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [650:52] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [650:63] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments.<anonymous>[LocalVariableDescriptor]

'if (renderedTypeArgs.isEmpty()) {
                oldTypeArgumentList.delete()
            }
            else {
                oldTypeArgumentList.replace(KtPsiFactory(callElement).createTypeArguments(renderedTypeArgs.joinToString(", ", "<", ">")))
                elementsToShorten.add(callElement.typeArgumentList!!)
            }' @ [652:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'renderedTypeArgs' @ [652:17] ==> val renderedTypeArgs: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments[LocalVariableDescriptor]

'isEmpty' @ [652:34] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'oldTypeArgumentList' @ [653:17] ==> val oldTypeArgumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments[LocalVariableDescriptor]

'delete' @ [653:37] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtTypeArgumentList[JavaMethodDescriptor]

'oldTypeArgumentList' @ [656:17] ==> val oldTypeArgumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments[LocalVariableDescriptor]

'replace' @ [656:37] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeArgumentList[JavaMethodDescriptor]

'KtPsiFactory' @ [656:45] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'callElement' @ [656:58] ==> value-parameter callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments[ValueParameterDescriptorImpl]

'createTypeArguments' @ [656:71] ==> public final fun createTypeArguments(text: String): KtTypeArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'renderedTypeArgs' @ [656:91] ==> val renderedTypeArgs: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments[LocalVariableDescriptor]

'joinToString' @ [656:108] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'elementsToShorten' @ [657:17] ==> private final val elementsToShorten: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'add' @ [657:35] ==> public open fun add(element: KtElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'callElement' @ [657:39] ==> value-parameter callElement: KtCallElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupCallTypeArguments[ValueParameterDescriptorImpl]

'typeArgumentList' @ [657:51] ==> public final val KtCallElement.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'typeCandidates' @ [662:30] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'callableInfo' @ [662:45] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'returnTypeInfo' @ [662:58] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'candidates' @ [663:17] ==> val candidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'isEmpty' @ [663:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'when (declaration) {
                is KtCallableDeclaration -> {
                    elementToReplace = declaration.typeReference
                    TypeExpression.ForTypeReference(candidates)
                }
                is KtClassOrObject -> {
                    elementToReplace = declaration.superTypeListEntries.firstOrNull()
                    TypeExpression.ForDelegationSpecifier(candidates)
                }
                else -> throw AssertionError("Unexpected declaration kind: ${declaration.text}")
            }' @ [666:46] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeExpression, entry1: TypeExpression, entry2: TypeExpression): TypeExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeExpression

'declaration' @ [666:52] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[ValueParameterDescriptorImpl]

'elementToReplace' @ [668:21] ==> val elementToReplace: KtElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'declaration' @ [668:40] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[ValueParameterDescriptorImpl]

'typeReference' @ [668:52] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'ForTypeReference' @ [669:36] ==> public constructor ForTypeReference(typeCandidates: List<TypeCandidate>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForTypeReference[ClassConstructorDescriptorImpl]

'candidates' @ [669:53] ==> val candidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'elementToReplace' @ [672:21] ==> val elementToReplace: KtElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'declaration' @ [672:40] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [672:52] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'firstOrNull' @ [672:73] ==> public fun <T> List<KtSuperTypeListEntry>.firstOrNull(): KtSuperTypeListEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'ForDelegationSpecifier' @ [673:36] ==> public constructor ForDelegationSpecifier(typeCandidates: List<TypeCandidate>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier[ClassConstructorDescriptorImpl]

'candidates' @ [673:59] ==> val candidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'AssertionError' @ [675:31] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'declaration' @ [675:78] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[ValueParameterDescriptorImpl]

'text' @ [675:90] ==> public final val KtNamedDeclaration.text: (String..String?)[MyPropertyDescriptor]

'elementToReplace' @ [677:17] ==> val elementToReplace: KtElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'candidates' @ [679:17] ==> val candidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'size' @ [679:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'builder' @ [680:17] ==> value-parameter builder: TemplateBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[ValueParameterDescriptorImpl]

'replaceElement' @ [680:25] ==> public abstract fun replaceElement(@NotNull p0: PsiElement, p1: (String..String?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilder[JavaMethodDescriptor]

'elementToReplace' @ [680:40] ==> val elementToReplace: KtElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'expression' @ [680:59] ==> val expression: TypeExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'calculateResult' @ [680:70] ==> public open fun calculateResult(context: ExpressionContext?): Result defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression[SimpleFunctionDescriptorImpl]

'text' @ [680:107] ==> public final val TextResult.text: String[MyPropertyDescriptor]

'builder' @ [684:13] ==> value-parameter builder: TemplateBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[ValueParameterDescriptorImpl]

'replaceElement' @ [684:21] ==> public abstract fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilder[JavaMethodDescriptor]

'elementToReplace' @ [684:36] ==> val elementToReplace: KtElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'expression' @ [684:54] ==> val expression: TypeExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'expression' @ [685:20] ==> val expression: TypeExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupReturnTypeTemplate[LocalVariableDescriptor]

'!' @ [689:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callableInfo' @ [689:19] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'writable' @ [689:49] ==> public final val writable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'builder' @ [690:17] ==> value-parameter builder: TemplateBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupValVarTemplate[ValueParameterDescriptorImpl]

'replaceElement' @ [690:25] ==> public abstract fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilder[JavaMethodDescriptor]

'property' @ [690:40] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupValVarTemplate[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [690:49] ==> public final val KtProperty.valOrVarKeyword: PsiElement[MyPropertyDescriptor]

'ValVarExpression' @ [690:66] ==> public object ValVarExpression : Expression defined in org.jetbrains.kotlin.idea.refactoring in file ValVarExpression.kt[FakeCallableDescriptorForObject]

'when (declaration) {
                is KtObjectDeclaration -> return null
                !is KtTypeParameterListOwner -> throw AssertionError("Unexpected declaration kind: ${declaration.text}")
            }' @ [698:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'declaration' @ [698:19] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[ValueParameterDescriptorImpl]

'AssertionError' @ [700:55] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'declaration' @ [700:102] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[ValueParameterDescriptorImpl]

'text' @ [700:114] ==> public final val KtNamedDeclaration.text: (String..String?)[MyPropertyDescriptor]

'?:' @ [703:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtTypeParameterList?, right: KtTypeParameterList): KtTypeParameterList[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtTypeParameterList

'declaration' @ [703:38] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[ValueParameterDescriptorImpl]

'typeParameterList' @ [703:79] ==> public final val KtTypeParameterListOwner.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'HashMap' @ [705:36] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> List<RenderedTypeParameter>

'ArrayList' @ [707:43] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> RenderedTypeParameter

'mandatoryTypeParametersAsCandidates' @ [709:13] ==> public final val mandatoryTypeParametersAsCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'asSequence' @ [709:49] ==> public fun <T> Iterable<TypeCandidate>.asSequence(): Sequence<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'flatMapTo' @ [709:62] ==> public inline fun <T, R, C : MutableCollection<in RenderedTypeParameter>> Sequence<TypeCandidate>.flatMapTo(destination: ArrayList<RenderedTypeParameter>, transform: (TypeCandidate) -> Sequence<RenderedTypeParameter>): ArrayList<RenderedTypeParameter> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate
    <R> -> RenderedTypeParameter
    <C : MutableCollection<in R>> -> ArrayList<RenderedTypeParameter>

'mandatoryTypeParameters' @ [709:72] ==> val mandatoryTypeParameters: ArrayList<RenderedTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'it' @ [709:99] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate.<anonymous>[ValueParameterDescriptorImpl]

'renderedTypeParameters' @ [709:102] ==> public final var renderedTypeParameters: List<RenderedTypeParameter>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'asSequence' @ [709:127] ==> public fun <T> Iterable<RenderedTypeParameter>.asSequence(): Sequence<RenderedTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RenderedTypeParameter

'callableInfo' @ [711:13] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parameterInfos' @ [711:26] ==> public abstract val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'asSequence' @ [711:41] ==> public fun <T> Iterable<ParameterInfo>.asSequence(): Sequence<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'flatMap' @ [712:22] ==> public fun <T, R> Sequence<ParameterInfo>.flatMap(transform: (ParameterInfo) -> Sequence<TypeCandidate>): Sequence<TypeCandidate> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo
    <R> -> TypeCandidate

'typeCandidates' @ [712:32] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'it' @ [712:47] ==> value-parameter it: ParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate.<anonymous>[ValueParameterDescriptorImpl]

'typeInfo' @ [712:50] ==> public final val typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[PropertyDescriptorImpl]

'asSequence' @ [712:62] ==> public fun <T> Iterable<TypeCandidate>.asSequence(): Sequence<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'forEach' @ [713:22] ==> public inline fun <T> Sequence<TypeCandidate>.forEach(action: (TypeCandidate) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'typeParameterMap' @ [713:32] ==> val typeParameterMap: HashMap<String, List<RenderedTypeParameter>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'it' @ [713:49] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate.<anonymous>[ValueParameterDescriptorImpl]

'renderedTypes' @ [713:52] ==> public final var renderedTypes: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'first' @ [713:66] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [713:77] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate.<anonymous>[ValueParameterDescriptorImpl]

'renderedTypeParameters' @ [713:80] ==> public final var renderedTypeParameters: List<RenderedTypeParameter>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'declaration' @ [715:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[ValueParameterDescriptorImpl]

'getReturnTypeReference' @ [715:29] ==> internal fun KtNamedDeclaration.getReturnTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'typeCandidates' @ [716:17] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'callableInfo' @ [716:32] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'returnTypeInfo' @ [716:45] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'forEach' @ [716:63] ==> @HidesMembers public inline fun <T> Iterable<TypeCandidate>.forEach(action: (TypeCandidate) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'typeParameterMap' @ [717:21] ==> val typeParameterMap: HashMap<String, List<RenderedTypeParameter>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'it' @ [717:38] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate.<anonymous>[ValueParameterDescriptorImpl]

'renderedTypes' @ [717:41] ==> public final var renderedTypes: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'first' @ [717:55] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [717:66] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate.<anonymous>[ValueParameterDescriptorImpl]

'renderedTypeParameters' @ [717:69] ==> public final var renderedTypeParameters: List<RenderedTypeParameter>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'TypeParameterListExpression' @ [721:30] ==> public constructor TypeParameterListExpression(mandatoryTypeParameters: List<RenderedTypeParameter>, parameterTypeToTypeParameterNamesMap: Map<String, List<RenderedTypeParameter>>, insertLeadingSpace: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression[ClassConstructorDescriptorImpl]

'mandatoryTypeParameters' @ [722:21] ==> val mandatoryTypeParameters: ArrayList<RenderedTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'typeParameterMap' @ [723:21] ==> val typeParameterMap: HashMap<String, List<RenderedTypeParameter>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'callableInfo' @ [724:21] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'kind' @ [724:34] ==> public abstract val kind: CallableKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'CLASS_WITH_PRIMARY_CONSTRUCTOR' @ [724:55] ==> enum entry CLASS_WITH_PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'typeParameterList' @ [726:29] ==> val typeParameterList: KtTypeParameterList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'prevSibling' @ [726:47] ==> public final val KtTypeParameterList.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (leftSpace != null) leftSpace.startOffset else typeParameterList.startOffset' @ [727:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'leftSpace' @ [727:34] ==> val leftSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'leftSpace' @ [727:53] ==> val leftSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'startOffset' @ [727:63] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'typeParameterList' @ [727:80] ==> val typeParameterList: KtTypeParameterList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'startOffset' @ [727:98] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'typeParameterList' @ [728:26] ==> val typeParameterList: KtTypeParameterList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'startOffset' @ [728:44] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'UnfairTextRange' @ [729:25] ==> public constructor UnfairTextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.UnfairTextRange[JavaClassConstructorDescriptor]

'rangeStart' @ [729:41] ==> val rangeStart: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'offset' @ [729:54] ==> val offset: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'typeParameterList' @ [729:62] ==> val typeParameterList: KtTypeParameterList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'endOffset' @ [729:80] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'offset' @ [729:92] ==> val offset: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'builder' @ [730:13] ==> value-parameter builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[ValueParameterDescriptorImpl]

'replaceElement' @ [730:21] ==> public open fun replaceElement(@NotNull p0: PsiElement, @NotNull p1: TextRange, p2: (String..String?), p3: (Expression..Expression?), p4: Boolean): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'typeParameterList' @ [730:36] ==> val typeParameterList: KtTypeParameterList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'range' @ [730:55] ==> val range: UnfairTextRange defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'expression' @ [730:85] ==> val expression: TypeParameterListExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'expression' @ [731:20] ==> val expression: TypeParameterListExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupTypeParameterListTemplate[LocalVariableDescriptor]

'assert' @ [735:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parameterList' @ [735:20] ==> value-parameter parameterList: List<KtParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[ValueParameterDescriptorImpl]

'size' @ [735:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'callableInfo' @ [735:42] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parameterInfos' @ [735:55] ==> public abstract val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'size' @ [735:70] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ArrayList' @ [737:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeExpression

'component1' @ [738:19] ==> public final operator fun component1(): ParameterInfo defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [738:30] ==> public final operator fun component2(): KtParameter defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'callableInfo' @ [738:47] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parameterInfos' @ [738:60] ==> public abstract val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'zip' @ [738:75] ==> public infix fun <T, R> Iterable<ParameterInfo>.zip(other: Iterable<KtParameter>): List<Pair<ParameterInfo, KtParameter>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo
    <R> -> KtParameter

'parameterList' @ [738:79] ==> value-parameter parameterList: List<KtParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[ValueParameterDescriptorImpl]

'ForTypeReference' @ [739:62] ==> public constructor ForTypeReference(typeCandidates: List<TypeCandidate>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForTypeReference[ClassConstructorDescriptorImpl]

'typeCandidates' @ [739:79] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'parameter' @ [739:94] ==> val parameter: ParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'typeInfo' @ [739:104] ==> public final val typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[PropertyDescriptorImpl]

'jetParameter' @ [740:40] ==> val jetParameter: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'typeReference' @ [740:53] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'builder' @ [741:17] ==> value-parameter builder: TemplateBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[ValueParameterDescriptorImpl]

'replaceElement' @ [741:25] ==> public abstract fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilder[JavaMethodDescriptor]

'parameterTypeRef' @ [741:40] ==> val parameterTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'parameterTypeExpression' @ [741:58] ==> val parameterTypeExpression: TypeExpression.ForTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'parameter' @ [744:51] ==> val parameter: ParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'typeInfo' @ [744:61] ==> public final val typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[PropertyDescriptorImpl]

'getPossibleNamesFromExpression' @ [744:70] ==> public open fun getPossibleNamesFromExpression(bindingContext: BindingContext): Array<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[SimpleFunctionDescriptorImpl]

'currentFileContext' @ [744:101] ==> public final val currentFileContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'parameter' @ [745:37] ==> val parameter: ParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'preferredName' @ [745:47] ==> public final val preferredName: String? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[PropertyDescriptorImpl]

'if (preferredName != null) {
                    arrayOf(preferredName, *possibleNamesFromExpression)
                }
                else {
                    possibleNamesFromExpression
                }' @ [746:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<String>, elseBranch: Array<String>): Array<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<String>

'preferredName' @ [746:41] ==> val preferredName: String? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'arrayOf' @ [747:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'preferredName' @ [747:29] ==> val preferredName: String? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'possibleNamesFromExpression' @ [747:45] ==> val possibleNamesFromExpression: Array<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'possibleNamesFromExpression' @ [750:21] ==> val possibleNamesFromExpression: Array<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'HashMap' @ [754:47] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Array<String>

'typeCandidates' @ [755:17] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'parameter' @ [755:32] ==> val parameter: ParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'typeInfo' @ [755:42] ==> public final val typeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[PropertyDescriptorImpl]

'forEach' @ [755:54] ==> @HidesMembers public inline fun <T> Iterable<TypeCandidate>.forEach(action: (TypeCandidate) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'KotlinNameSuggester' @ [756:42] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByType' @ [756:62] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'typeCandidate' @ [756:81] ==> value-parameter typeCandidate: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates.<anonymous>[ValueParameterDescriptorImpl]

'theType' @ [756:95] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'parameterTypeToNamesMap' @ [757:21] ==> val parameterTypeToNamesMap: HashMap<String, Array<String>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'typeCandidate' @ [757:45] ==> value-parameter typeCandidate: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates.<anonymous>[ValueParameterDescriptorImpl]

'renderedTypes' @ [757:59] ==> public final var renderedTypes: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'first' @ [757:73] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'suggestedNames' @ [757:84] ==> val suggestedNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [757:99] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'ParameterNameExpression' @ [761:47] ==> public constructor ParameterNameExpression(names: Array<String>, parameterTypeToNamesMap: Map<String, Array<String>>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression[ClassConstructorDescriptorImpl]

'possibleNames' @ [761:71] ==> val possibleNames: Array<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'parameterTypeToNamesMap' @ [761:86] ==> val parameterTypeToNamesMap: HashMap<String, Array<String>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'jetParameter' @ [762:47] ==> val jetParameter: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'nameIdentifier' @ [762:60] ==> public final val KtParameter.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'builder' @ [763:17] ==> value-parameter builder: TemplateBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[ValueParameterDescriptorImpl]

'replaceElement' @ [763:25] ==> public abstract fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilder[JavaMethodDescriptor]

'parameterNameIdentifier' @ [763:40] ==> val parameterNameIdentifier: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'parameterNameExpression' @ [763:65] ==> val parameterNameExpression: ParameterNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'typeParameters' @ [765:17] ==> val typeParameters: ArrayList<TypeExpression> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'add' @ [765:32] ==> public open fun add(element: TypeExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'parameterTypeExpression' @ [765:36] ==> val parameterTypeExpression: TypeExpression.ForTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'typeParameters' @ [767:20] ==> val typeParameters: ArrayList<TypeExpression> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupParameterTypeTemplates[LocalVariableDescriptor]

'KtPsiFactory' @ [771:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'jetFileToEdit' @ [771:43] ==> public final val jetFileToEdit: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'project' @ [771:57] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'theType' @ [772:50] ==> value-parameter theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.replaceWithLongerName[ValueParameterDescriptorImpl]

'renderLong' @ [772:58] ==> internal fun KotlinType.renderLong(typeParameterNameMap: Map<TypeParameterDescriptor, String>): List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'typeParameterNameMap' @ [772:69] ==> public final val typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'map' @ [772:91] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> KtTypeReference): List<KtTypeReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KtTypeReference

'psiFactory' @ [772:97] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.replaceWithLongerName[LocalVariableDescriptor]

'createType' @ [772:108] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [772:119] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.replaceWithLongerName.<anonymous>[ValueParameterDescriptorImpl]

'typeRefs' @ [773:14] ==> value-parameter typeRefs: List<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.replaceWithLongerName[ValueParameterDescriptorImpl]

'fullyQualifiedReceiverTypeRefs' @ [773:27] ==> val fullyQualifiedReceiverTypeRefs: List<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.replaceWithLongerName[LocalVariableDescriptor]

'forEach' @ [773:59] ==> @HidesMembers public inline fun <T> Iterable<Pair<KtTypeReference, KtTypeReference>>.forEach(action: (Pair<KtTypeReference, KtTypeReference>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtTypeReference, KtTypeReference>

'component1' @ [773:70] ==> public final operator fun component1(): KtTypeReference defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [773:80] ==> public final operator fun component2(): KtTypeReference defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'shortRef' @ [773:92] ==> val shortRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.replaceWithLongerName.<anonymous>[LocalVariableDescriptor]

'replace' @ [773:101] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'longRef' @ [773:109] ==> val longRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.replaceWithLongerName.<anonymous>[LocalVariableDescriptor]

'KtPsiFactory' @ [778:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'declaration' @ [778:47] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[ValueParameterDescriptorImpl]

'psiFactory' @ [780:17] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[LocalVariableDescriptor]

'createPackageDirectiveIfNeeded' @ [780:28] ==> public final fun createPackageDirectiveIfNeeded(fqName: FqName): KtPackageDirective? defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'config' @ [780:59] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'currentFile' @ [780:66] ==> public final val currentFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'packageFqName' @ [780:78] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'let' @ [780:94] ==> @InlineOnly public inline fun <T, R> KtPackageDirective.let(block: (KtPackageDirective) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPackageDirective
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'declaration' @ [781:21] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[ValueParameterDescriptorImpl]

'containingFile' @ [781:33] ==> public final val KtNamedDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'addBefore' @ [781:48] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'it' @ [781:58] ==> value-parameter it: KtPackageDirective defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava.<anonymous>[ValueParameterDescriptorImpl]

'when (declaration) {
                    is KtNamedFunction, is KtProperty -> {
                        val klass = psiFactory.createClass("class Foo {}")
                        klass.getBody()!!.add(declaration)
                        (declaration.replace(klass) as KtClass).getBody()!!.declarations.first()
                    }
                    else -> declaration
                }' @ [784:43] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (KtDeclaration..KtDeclaration?), entry1: (KtDeclaration..KtDeclaration?)): (KtDeclaration..KtDeclaration?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'declaration' @ [784:49] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[ValueParameterDescriptorImpl]

'psiFactory' @ [786:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[LocalVariableDescriptor]

'createClass' @ [786:48] ==> public final fun createClass(text: String): KtClass defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'klass' @ [787:25] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[LocalVariableDescriptor]

'getBody' @ [787:31] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'add' @ [787:43] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'declaration' @ [787:47] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[ValueParameterDescriptorImpl]

'!!' @ [788:25] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtClassBody?): KtClassBody[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtClassBody

'declaration' @ [788:26] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[ValueParameterDescriptorImpl]

'replace' @ [788:38] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'klass' @ [788:46] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[LocalVariableDescriptor]

'getBody' @ [788:65] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'declarations' @ [788:77] ==> public final val KtClassBody.declarations: (MutableList<(KtDeclaration..KtDeclaration?)>..List<(KtDeclaration..KtDeclaration?)>?)[MyPropertyDescriptor]

'first' @ [788:90] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.first(): (KtDeclaration..KtDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'declaration' @ [790:29] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[ValueParameterDescriptorImpl]

'when (adjustedDeclaration) {
                    is KtNamedFunction, is KtSecondaryConstructor -> {
                        createJavaMethod(adjustedDeclaration as KtFunction, targetClass)
                    }
                    is KtProperty -> {
                        createJavaField(adjustedDeclaration, targetClass)
                    }
                    is KtClass -> {
                        createJavaClass(adjustedDeclaration, targetClass)
                    }
                    else -> null
                }' @ [793:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiMember?, entry1: PsiMember?, entry2: PsiMember?, entry3: PsiMember?): PsiMember?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiMember?

'adjustedDeclaration' @ [793:30] ==> val adjustedDeclaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[LocalVariableDescriptor]

'createJavaMethod' @ [795:25] ==> public fun createJavaMethod(function: KtFunction, targetClass: PsiClass): PsiMethod defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'adjustedDeclaration' @ [795:42] ==> val adjustedDeclaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[LocalVariableDescriptor]

'targetClass' @ [795:77] ==> value-parameter targetClass: PsiClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[ValueParameterDescriptorImpl]

'createJavaField' @ [798:25] ==> public fun createJavaField(property: KtNamedDeclaration, targetClass: PsiClass): PsiField defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'adjustedDeclaration' @ [798:41] ==> val adjustedDeclaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[LocalVariableDescriptor]

'targetClass' @ [798:62] ==> value-parameter targetClass: PsiClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[ValueParameterDescriptorImpl]

'createJavaClass' @ [801:25] ==> public fun createJavaClass(klass: KtClass, targetClass: PsiClass?, forcePlainClass: Boolean = ...): PsiClass defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'adjustedDeclaration' @ [801:41] ==> val adjustedDeclaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[LocalVariableDescriptor]

'targetClass' @ [801:62] ==> value-parameter targetClass: PsiClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable.convertToJava[ValueParameterDescriptorImpl]

'config' @ [807:17] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'isExtension' @ [807:24] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'receiverClassDescriptor' @ [807:39] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'DescriptorToSourceUtils' @ [809:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [809:55] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'receiverClassDescriptor' @ [809:79] ==> public final val receiverClassDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'targetClass' @ [810:17] ==> val targetClass: PsiClass? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'!' @ [810:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [810:41] ==> val targetClass: PsiClass? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'canRefactor' @ [810:53] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [812:27] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[ValueParameterDescriptorImpl]

'project' @ [812:39] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'convertToJava' @ [814:33] ==> local final fun convertToJava(targetClass: PsiClass): PsiMember? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[SimpleFunctionDescriptorImpl]

'targetClass' @ [814:47] ==> val targetClass: PsiClass? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'newJavaMember' @ [816:32] ==> val newJavaMember: PsiMember defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'modifierList' @ [816:46] ==> public final val PsiMember.modifierList: PsiModifierList?[MyPropertyDescriptor]

'newJavaMember' @ [817:17] ==> val newJavaMember: PsiMember defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'newJavaMember' @ [817:47] ==> val newJavaMember: PsiMember defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'modifierList' @ [818:17] ==> val modifierList: PsiModifierList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'setModifierProperty' @ [818:30] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'FINAL' @ [818:62] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'when (callableInfo) {
                is PrimaryConstructorInfo -> with(callableInfo.classInfo) {
                    !inner && kind != ClassKind.ENUM_ENTRY && kind != ClassKind.ENUM_CLASS
                }
                else -> callableInfo.receiverTypeInfo.staticContextRequired
            }' @ [821:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'callableInfo' @ [821:36] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'with' @ [822:46] ==> @InlineOnly public inline fun <T, R> with(receiver: ClassInfo, block: ClassInfo.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassInfo
    <R> -> Boolean

'callableInfo' @ [822:51] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'classInfo' @ [822:64] ==> public final val classInfo: ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PrimaryConstructorInfo[PropertyDescriptorImpl]

'!' @ [823:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inner' @ [823:22] ==> public final val inner: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'kind' @ [823:31] ==> public final val kind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'ENUM_ENTRY' @ [823:49] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'kind' @ [823:63] ==> public final val kind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'ENUM_CLASS' @ [823:81] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'callableInfo' @ [825:25] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'receiverTypeInfo' @ [825:38] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'staticContextRequired' @ [825:55] ==> public open val staticContextRequired: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[PropertyDescriptorImpl]

'modifierList' @ [827:13] ==> val modifierList: PsiModifierList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'setModifierProperty' @ [827:26] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'STATIC' @ [827:58] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'needStatic' @ [827:66] ==> val needStatic: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'getInstance' @ [829:34] ==> public open fun getInstance(p0: (Project..Project?)): (JavaCodeStyleManager..JavaCodeStyleManager?) defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'project' @ [829:46] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'shortenClassReferences' @ [829:55] ==> @NotNull public abstract fun shortenClassReferences(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'newJavaMember' @ [829:78] ==> val newJavaMember: PsiMember defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'OpenFileDescriptor' @ [831:30] ==> public constructor OpenFileDescriptor(@NotNull p0: Project, @NotNull p1: VirtualFile) defined in com.intellij.openapi.fileEditor.OpenFileDescriptor[JavaClassConstructorDescriptor]

'project' @ [831:49] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'targetClass' @ [831:58] ==> val targetClass: PsiClass? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'containingFile' @ [831:70] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [831:85] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'!!' @ [832:32] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Editor?): Editor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Editor

'getInstance' @ [832:50] ==> public open fun getInstance(@NotNull p0: Project): (FileEditorManager..FileEditorManager?) defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'project' @ [832:62] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'openTextEditor' @ [832:71] ==> @Nullable public abstract fun openTextEditor(@NotNull p0: OpenFileDescriptor, p1: Boolean): Editor? defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'descriptor' @ [832:86] ==> val descriptor: OpenFileDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'when (newJavaMember) {
                is PsiMethod -> CreateFromUsageUtils.setupEditor(newJavaMember, targetEditor)
                is PsiField -> targetEditor.caretModel.moveToOffset(newJavaMember.endOffset - 1)
                is PsiClass -> {
                    val constructor = newJavaMember.constructors.firstOrNull()
                    val superStatement = constructor?.body?.statements?.firstOrNull() as? PsiExpressionStatement
                    val superCall = superStatement?.expression as? PsiMethodCallExpression
                    if (superCall != null) {
                        val lParen = superCall.argumentList.firstChild
                        targetEditor.caretModel.moveToOffset(lParen.endOffset)
                    }
                    else {
                        targetEditor.caretModel.moveToOffset(newJavaMember.startOffset)
                    }
                }
            }' @ [834:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'newJavaMember' @ [834:19] ==> val newJavaMember: PsiMember defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'setupEditor' @ [835:54] ==> public open fun setupEditor(p0: (PsiMethod..PsiMethod?), p1: (Editor..Editor?)): Unit defined in com.intellij.codeInsight.daemon.impl.quickfix.CreateFromUsageUtils[JavaMethodDescriptor]

'newJavaMember' @ [835:66] ==> val newJavaMember: PsiMember defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'targetEditor' @ [835:81] ==> val targetEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'targetEditor' @ [836:32] ==> val targetEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'caretModel' @ [836:45] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [836:56] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'newJavaMember' @ [836:69] ==> val newJavaMember: PsiMember defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'endOffset' @ [836:83] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'newJavaMember' @ [838:39] ==> val newJavaMember: PsiMember defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'constructors' @ [838:53] ==> public final val PsiClass.constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'firstOrNull' @ [838:66] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.firstOrNull(): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'constructor' @ [839:42] ==> val constructor: PsiMethod? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'body' @ [839:55] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'statements' @ [839:61] ==> public final val PsiCodeBlock.statements: (Array<(PsiStatement..PsiStatement?)>..Array<out (PsiStatement..PsiStatement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [839:73] ==> public fun <T> Array<out (PsiStatement..PsiStatement?)>.firstOrNull(): PsiStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiStatement..com.intellij.psi.PsiStatement?)

'superStatement' @ [840:37] ==> val superStatement: PsiExpressionStatement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'expression' @ [840:53] ==> public final val PsiExpressionStatement.expression: PsiExpression[MyPropertyDescriptor]

'if (superCall != null) {
                        val lParen = superCall.argumentList.firstChild
                        targetEditor.caretModel.moveToOffset(lParen.endOffset)
                    }
                    else {
                        targetEditor.caretModel.moveToOffset(newJavaMember.startOffset)
                    }' @ [841:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'superCall' @ [841:25] ==> val superCall: PsiMethodCallExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'superCall' @ [842:38] ==> val superCall: PsiMethodCallExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'argumentList' @ [842:48] ==> public final val PsiMethodCallExpression.argumentList: PsiExpressionList[MyPropertyDescriptor]

'firstChild' @ [842:61] ==> public final val PsiExpressionList.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'targetEditor' @ [843:25] ==> val targetEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'caretModel' @ [843:38] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [843:49] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'lParen' @ [843:62] ==> val lParen: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'endOffset' @ [843:69] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'targetEditor' @ [846:25] ==> val targetEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'caretModel' @ [846:38] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [846:49] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'newJavaMember' @ [846:62] ==> val newJavaMember: PsiMember defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'startOffset' @ [846:76] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'targetEditor' @ [850:13] ==> val targetEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.transformToJavaMemberIfApplicable[LocalVariableDescriptor]

'scrollingModel' @ [850:26] ==> public final val Editor.scrollingModel: ScrollingModel[MyPropertyDescriptor]

'scrollToCaret' @ [850:41] ==> public abstract fun scrollToCaret(@NotNull p0: ScrollType): Unit defined in com.intellij.openapi.editor.ScrollingModel[JavaMethodDescriptor]

'RELATIVE' @ [850:66] ==> enum entry RELATIVE defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

'declaration' @ [856:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[ValueParameterDescriptorImpl]

'!' @ [856:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [856:47] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[ValueParameterDescriptorImpl]

'hasInitializer' @ [856:59] ==> public open fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'containingElement' @ [856:79] ==> public final val containingElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'typeCandidates' @ [857:40] ==> private final val typeCandidates: HashMap<TypeInfo, List<TypeCandidate>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'callableInfo' @ [857:55] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'returnTypeInfo' @ [857:68] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'firstOrNull' @ [857:86] ==> public fun <T> List<TypeCandidate>.firstOrNull(): TypeCandidate? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'theType' @ [857:101] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'defaultValueType' @ [858:36] ==> val defaultValueType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[LocalVariableDescriptor]

'let' @ [858:54] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String?

'defaultInitializer' @ [858:77] ==> @Nullable public open fun defaultInitializer(type: (KotlinType..KotlinType?)): String? defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]

'it' @ [858:96] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [859:35] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[ValueParameterDescriptorImpl]

'setInitializer' @ [859:47] ==> @Nullable public open fun setInitializer(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'KtPsiFactory' @ [859:62] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'declaration' @ [859:75] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[ValueParameterDescriptorImpl]

'createExpression' @ [859:88] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'defaultValue' @ [859:105] ==> val defaultValue: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[LocalVariableDescriptor]

'initializer' @ [860:29] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[LocalVariableDescriptor]

'textRange' @ [860:41] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containingFileEditor' @ [861:17] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'selectionModel' @ [861:38] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'setSelection' @ [861:53] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'range' @ [861:66] ==> val range: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[LocalVariableDescriptor]

'startOffset' @ [861:72] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'range' @ [861:85] ==> val range: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[LocalVariableDescriptor]

'endOffset' @ [861:91] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'containingFileEditor' @ [862:17] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'caretModel' @ [862:38] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [862:49] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'range' @ [862:62] ==> val range: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[LocalVariableDescriptor]

'endOffset' @ [862:68] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'declaration' @ [865:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[ValueParameterDescriptorImpl]

'!' @ [865:58] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [865:59] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[ValueParameterDescriptorImpl]

'hasImplicitDelegationCall' @ [865:71] ==> public final fun hasImplicitDelegationCall(): Boolean defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'containingFileEditor' @ [866:17] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'caretModel' @ [866:38] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [866:49] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'declaration' @ [866:62] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[ValueParameterDescriptorImpl]

'getDelegationCall' @ [866:74] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'valueArgumentList' @ [866:94] ==> public final val KtConstructorDelegationCall.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'startOffset' @ [866:114] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'setupEditorSelection' @ [869:13] ==> public fun setupEditorSelection(editor: Editor, declaration: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file generationUtils.kt[SimpleFunctionDescriptorImpl]

'containingFileEditor' @ [869:34] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'declaration' @ [869:56] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.setupEditor[ValueParameterDescriptorImpl]

'createDeclarationSkeleton' @ [874:39] ==> private final fun createDeclarationSkeleton(): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'declarationSkeleton' @ [875:27] ==> val declarationSkeleton: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'project' @ [875:47] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'getInstance' @ [876:58] ==> public open fun getInstance(p0: (Project..Project?)): (SmartPointerManager..SmartPointerManager?) defined in com.intellij.psi.SmartPointerManager[JavaMethodDescriptor]

'project' @ [876:70] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'createSmartPsiElementPointer' @ [876:79] ==> @NotNull public abstract fun <E : (PsiElement..PsiElement?)> createSmartPsiElementPointer(@NotNull p0: KtNamedDeclaration): SmartPsiElementPointer<(KtNamedDeclaration..KtNamedDeclaration?)> defined in com.intellij.psi.SmartPointerManager[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtNamedDeclaration

'declarationSkeleton' @ [876:108] ==> val declarationSkeleton: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'getInstance' @ [879:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [879:44] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'commitAllDocuments' @ [879:53] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'getInstance' @ [880:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [880:44] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [880:53] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'containingFileEditor' @ [880:93] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'document' @ [880:114] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'containingFileEditor' @ [882:30] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'caretModel' @ [882:51] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'caretModel' @ [883:13] ==> val caretModel: CaretModel defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'moveToOffset' @ [883:24] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'jetFileToEdit' @ [883:37] ==> public final val jetFileToEdit: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'node' @ [883:51] ==> public final val KtFile.node: FileASTNode[MyPropertyDescriptor]

'startOffset' @ [883:56] ==> public final val FileASTNode.startOffset: Int[MyPropertyDescriptor]

'declarationPointer' @ [885:31] ==> val declarationPointer: SmartPsiElementPointer<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'element' @ [885:50] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<(KtNamedDeclaration..KtNamedDeclaration?)>.element: KtNamedDeclaration?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedDeclaration..org.jetbrains.kotlin.psi.KtNamedDeclaration?)

'containingFileEditor' @ [887:37] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'document' @ [887:58] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'createRangeMarker' @ [887:67] ==> @NotNull public open fun createRangeMarker(@NotNull p0: TextRange): RangeMarker defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'declaration' @ [887:85] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'textRange' @ [887:97] ==> public final val KtNamedDeclaration.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'TemplateBuilderImpl' @ [889:27] ==> public constructor TemplateBuilderImpl(@NotNull p0: PsiElement) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaClassConstructorDescriptor]

'jetFileToEdit' @ [889:47] ==> public final val jetFileToEdit: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'declaration' @ [890:17] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'setupValVarTemplate' @ [891:17] ==> private final fun setupValVarTemplate(builder: TemplateBuilder, property: KtProperty): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'builder' @ [891:37] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'declaration' @ [891:46] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'!' @ [893:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'skipReturnType' @ [893:18] ==> public final val skipReturnType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'setupReturnTypeTemplate' @ [894:17] ==> private final fun setupReturnTypeTemplate(builder: TemplateBuilder, declaration: KtNamedDeclaration): TypeExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'builder' @ [894:41] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'declaration' @ [894:50] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'setupParameterTypeTemplates' @ [897:44] ==> private final fun setupParameterTypeTemplates(builder: TemplateBuilder, parameterList: List<KtParameter>): List<TypeExpression> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'builder' @ [897:72] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'declaration' @ [897:81] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'getValueParameters' @ [897:93] ==> public fun KtNamedDeclaration.getValueParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'setupTypeParameterListTemplate' @ [904:30] ==> private final fun setupTypeParameterListTemplate(builder: TemplateBuilderImpl, declaration: KtNamedDeclaration): TypeParameterListExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'builder' @ [904:61] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'declaration' @ [904:70] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'builder' @ [907:32] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'buildInlineTemplate' @ [907:40] ==> public open fun buildInlineTemplate(): (Template..Template?) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'templateImpl' @ [908:29] ==> val templateImpl: TemplateImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'variables' @ [908:42] ==> public final val TemplateImpl.variables: (ArrayList<(Variable..Variable?)>..ArrayList<(Variable..Variable?)>?)[MyPropertyDescriptor]

'variables' @ [909:17] ==> val variables: ArrayList<(Variable..Variable?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'isNotEmpty' @ [909:27] ==> @InlineOnly public inline fun <T> Collection<(Variable..Variable?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInsight.template.impl.Variable..com.intellij.codeInsight.template.impl.Variable?)

'if (expression != null) variables.removeAt(0) else null' @ [910:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Variable?, elseBranch: Variable?): Variable?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Variable?

'expression' @ [910:45] ==> val expression: TypeParameterListExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'variables' @ [910:65] ==> val variables: ArrayList<(Variable..Variable?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'removeAt' @ [910:75] ==> public open fun removeAt(p0: Int): (Variable..Variable?) defined in java.util.ArrayList[JavaMethodDescriptor]

'..' @ [911:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'callableInfo' @ [911:31] ==> public final val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'parameterInfos' @ [911:44] ==> public abstract val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'size' @ [911:59] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'swap' @ [912:33] ==> public open fun swap(p0: (MutableList<*>..List<*>?), p1: Int, p2: Int): Unit defined in java.util.Collections[JavaMethodDescriptor]

'variables' @ [912:38] ==> val variables: ArrayList<(Variable..Variable?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'i' @ [912:49] ==> val i: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'i' @ [912:56] ==> val i: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'typeParametersVar' @ [914:17] ==> val typeParametersVar: Variable? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'let' @ [914:36] ==> @InlineOnly public inline fun <T, R> Variable.let(block: (Variable) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Variable
    <R> -> Boolean

'variables' @ [914:42] ==> val variables: ArrayList<(Variable..Variable?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'add' @ [914:52] ==> public open fun add(element: (Variable..Variable?)): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [914:56] ==> value-parameter it: Variable defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<anonymous>[ValueParameterDescriptorImpl]

'templateImpl' @ [918:13] ==> val templateImpl: TemplateImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'isToShortenLongNames' @ [918:26] ==> public final var TemplateImpl.isToShortenLongNames: Boolean[MyPropertyDescriptor]

'getInstance' @ [921:29] ==> public open fun getInstance(p0: (Project..Project?)): (TemplateManager..TemplateManager?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'project' @ [921:41] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'startTemplate' @ [921:50] ==> public abstract fun startTemplate(@NotNull p0: Editor, @NotNull p1: Template, p2: (TemplateEditingListener..TemplateEditingListener?)): Unit defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'containingFileEditor' @ [921:64] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'templateImpl' @ [921:86] ==> val templateImpl: TemplateImpl defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'TemplateEditingAdapter' @ [921:109] ==> public constructor TemplateEditingAdapter() defined in com.intellij.codeInsight.template.TemplateEditingAdapter[JavaClassConstructorDescriptor]

'getInstance' @ [924:44] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [924:56] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'commitDocument' @ [924:65] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'containingFileEditor' @ [924:80] ==> public final val containingFileEditor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'document' @ [924:101] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'dialogWithEditor' @ [926:25] ==> public final val dialogWithEditor: DialogWithEditor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'close' @ [926:43] ==> public final fun close(p0: Int): Unit defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[JavaMethodDescriptor]

'OK_EXIT_CODE' @ [926:63] ==> public const final val OK_EXIT_CODE: Int defined in com.intellij.openapi.ui.DialogWrapper[JavaPropertyDescriptor]

'brokenOff' @ [927:29] ==> value-parameter brokenOff: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[ValueParameterDescriptorImpl]

'!' @ [927:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [927:62] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [927:79] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'?:' @ [930:46] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtNamedDeclaration?, right: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtNamedDeclaration

'findElementOfClassAtOffset' @ [930:58] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> findElementOfClassAtOffset(@NotNull p0: PsiFile, p1: Int, @NotNull p2: Class<out KtNamedDeclaration>, p3: Boolean): KtNamedDeclaration? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> Captured(out KtNamedDeclaration)

'jetFileToEdit' @ [930:85] ==> public final val jetFileToEdit: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'declarationMarker' @ [931:85] ==> val declarationMarker: RangeMarker defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'startOffset' @ [931:103] ==> public final val RangeMarker.startOffset: Int[MyPropertyDescriptor]

'declaration' @ [932:85] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'java' @ [932:104] ==> public val <T> KClass<out KtNamedDeclaration>.java: Class<out KtNamedDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KtNamedDeclaration)

'runWriteAction' @ [935:25] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'postprocessDeclaration' @ [936:29] ==> private final fun postprocessDeclaration(declaration: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'newDeclaration' @ [936:52] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[LocalVariableDescriptor]

'newDeclaration' @ [939:33] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[LocalVariableDescriptor]

'newDeclaration' @ [939:70] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[LocalVariableDescriptor]

'setupDeclarationBody' @ [940:33] ==> private final fun setupDeclarationBody(func: KtDeclarationWithBody): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'newDeclaration' @ [940:54] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[LocalVariableDescriptor]

'newDeclaration' @ [943:33] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[LocalVariableDescriptor]

'newDeclaration' @ [944:33] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[LocalVariableDescriptor]

'getter' @ [944:48] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'let' @ [944:56] ==> @InlineOnly public inline fun <T, R> KtPropertyAccessor.let(block: (KtPropertyAccessor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPropertyAccessor
    <R> -> Unit

'setupDeclarationBody' @ [944:62] ==> private final fun setupDeclarationBody(func: KtDeclarationWithBody): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'it' @ [944:83] ==> value-parameter it: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'config' @ [947:47] ==> public final val config: CallableBuilderConfiguration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'originalElement' @ [947:54] ==> public final val originalElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[PropertyDescriptorImpl]

'callElement' @ [948:33] ==> val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate.<anonymous>[LocalVariableDescriptor]

'setupCallTypeArguments' @ [949:33] ==> private final fun setupCallTypeArguments(callElement: KtCallElement, typeParameters: List<TypeParameterDescriptor>): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'callElement' @ [949:56] ==> val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate.<anonymous>[LocalVariableDescriptor]

'expression' @ [949:69] ==> val expression: TypeParameterListExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'currentTypeParameters' @ [949:81] ==> public final var currentTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression[PropertyDescriptorImpl]

'emptyList' @ [949:118] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'getInstance' @ [952:46] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [952:58] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'reformat' @ [952:67] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'newDeclaration' @ [952:76] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[LocalVariableDescriptor]

'setupTypeReferencesForShortening' @ [955:53] ==> private final fun setupTypeReferencesForShortening(declaration: KtNamedDeclaration, parameterTypeExpressions: List<TypeExpression>): List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'newDeclaration' @ [955:86] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[LocalVariableDescriptor]

'parameterTypeExpressions' @ [955:102] ==> val parameterTypeExpressions: List<TypeExpression> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'!' @ [956:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'transformToJavaMemberIfApplicable' @ [956:34] ==> private final fun transformToJavaMemberIfApplicable(declaration: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'newDeclaration' @ [956:68] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[LocalVariableDescriptor]

'elementsToShorten' @ [957:33] ==> private final val elementsToShorten: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'addAll' @ [957:51] ==> public open fun addAll(elements: Collection<KtElement>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'typeRefsToShorten' @ [957:58] ==> val typeRefsToShorten: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate.<anonymous>[LocalVariableDescriptor]

'setupEditor' @ [958:33] ==> private final fun setupEditor(declaration: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[SimpleFunctionDescriptorImpl]

'newDeclaration' @ [958:45] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.finishTemplate[LocalVariableDescriptor]

'declarationMarker' @ [963:25] ==> val declarationMarker: RangeMarker defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate[LocalVariableDescriptor]

'dispose' @ [963:43] ==> public abstract fun dispose(): Unit defined in com.intellij.openapi.editor.RangeMarker[JavaMethodDescriptor]

'finished' @ [964:25] ==> public final var finished: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'invoke' @ [965:25] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'finishTemplate' @ [970:21] ==> private final fun finishTemplate(brokenOff: Boolean): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>[SimpleFunctionDescriptorImpl]

'finishTemplate' @ [974:21] ==> private final fun finishTemplate(brokenOff: Boolean): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>[SimpleFunctionDescriptorImpl]

'brokenOff' @ [974:36] ==> value-parameter brokenOff: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context.buildAndRunTemplate.<no name provided>.templateFinished[ValueParameterDescriptorImpl]

'!' @ [980:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [980:37] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [980:54] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'dialogWithEditor' @ [980:72] ==> public final val dialogWithEditor: DialogWithEditor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'!' @ [980:100] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'finished' @ [980:101] ==> public final var finished: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'dialogWithEditor' @ [981:17] ==> public final val dialogWithEditor: DialogWithEditor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder.Context[PropertyDescriptorImpl]

'show' @ [981:34] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.util.DialogWithEditor[JavaMethodDescriptor]

'Suppress' @ [988:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'container' @ [993:30] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'containingFile' @ [993:40] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'KtPsiFactory' @ [995:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'container' @ [995:35] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'psiFactory' @ [996:19] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'createNewLine' @ [996:30] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'decl' @ [1003:25] ==> value-parameter decl: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[ValueParameterDescriptorImpl]

'siblings' @ [1003:30] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'after' @ [1003:49] ==> value-parameter after: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[ValueParameterDescriptorImpl]

'when (sibling) {
                is PsiWhiteSpace -> lineBreaksPresent += (sibling.text ?: "").count { it == '\n' }
                else -> {
                    neighbor = sibling
                    break@siblingsLoop
                }
            }' @ [1004:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'sibling' @ [1004:19] ==> val sibling: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'lineBreaksPresent' @ [1005:37] ==> var lineBreaksPresent: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'sibling' @ [1005:59] ==> val sibling: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'text' @ [1005:67] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'count' @ [1005:79] ==> public inline fun CharSequence.count(predicate: (Char) -> Boolean): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [1005:87] ==> value-parameter it: Char defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines.<anonymous>[ValueParameterDescriptorImpl]

'neighbor' @ [1007:21] ==> var neighbor: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'sibling' @ [1007:32] ==> val sibling: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'neighbor' @ [1013:28] ==> var neighbor: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'node' @ [1013:38] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [1013:44] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'when {
            neighborType == KtTokens.LBRACE || neighborType == KtTokens.RBRACE -> 1
            neighbor is KtDeclaration && (neighbor !is KtProperty || decl !is KtProperty) -> 2
            else -> 1
        }' @ [1014:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'neighborType' @ [1015:13] ==> val neighborType: IElementType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'LBRACE' @ [1015:38] ==> public final val LBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'neighborType' @ [1015:48] ==> val neighborType: IElementType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'RBRACE' @ [1015:73] ==> public final val RBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'neighbor' @ [1016:13] ==> var neighbor: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'neighbor' @ [1016:43] ==> var neighbor: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'decl' @ [1016:70] ==> value-parameter decl: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[ValueParameterDescriptorImpl]

'max' @ [1020:21] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'lineBreaksNeeded' @ [1020:25] ==> val lineBreaksNeeded: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'lineBreaksPresent' @ [1020:44] ==> var lineBreaksPresent: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.calcNecessaryEmptyLines[LocalVariableDescriptor]

'?:' @ [1023:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'container' @ [1023:28] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'getOrCreateBody' @ [1023:60] ==> public fun KtClassOrObject.getOrCreateBody(): KtClassBody defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'container' @ [1023:81] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'classOrObject' @ [1027:25] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addDeclarationToClassOrObject[ValueParameterDescriptorImpl]

'getOrCreateBody' @ [1027:39] ==> public fun KtClassOrObject.getOrCreateBody(): KtClassBody defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'if (declaration is KtNamedFunction) {
            val neighbor = PsiTreeUtil.skipSiblingsBackward(
                    classBody.rBrace ?: classBody.lastChild!!,
                    PsiWhiteSpace::class.java
            )
            classBody.addAfter(declaration, neighbor) as KtNamedDeclaration
        }
        else classBody.addAfter(declaration, classBody.lBrace!!) as KtNamedDeclaration' @ [1028:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtNamedDeclaration, elseBranch: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtNamedDeclaration

'declaration' @ [1028:20] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addDeclarationToClassOrObject[ValueParameterDescriptorImpl]

'skipSiblingsBackward' @ [1029:40] ==> @Nullable @Contract public open fun skipSiblingsBackward(@Nullable p0: PsiElement?, @NotNull vararg p1: raw (Class<(Any..Any?)>..Class<*>?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'classBody' @ [1030:21] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addDeclarationToClassOrObject[LocalVariableDescriptor]

'rBrace' @ [1030:31] ==> public final val rBrace: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassBody[DeserializedPropertyDescriptor]

'classBody' @ [1030:41] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addDeclarationToClassOrObject[LocalVariableDescriptor]

'lastChild' @ [1030:51] ==> public final val KtClassBody.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'java' @ [1031:42] ==> public val <T> KClass<PsiWhiteSpace>.java: Class<PsiWhiteSpace> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiWhiteSpace

'classBody' @ [1033:13] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addDeclarationToClassOrObject[LocalVariableDescriptor]

'addAfter' @ [1033:23] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'declaration' @ [1033:32] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addDeclarationToClassOrObject[ValueParameterDescriptorImpl]

'neighbor' @ [1033:45] ==> val neighbor: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addDeclarationToClassOrObject[LocalVariableDescriptor]

'classBody' @ [1035:14] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addDeclarationToClassOrObject[LocalVariableDescriptor]

'addAfter' @ [1035:24] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'declaration' @ [1035:33] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addDeclarationToClassOrObject[ValueParameterDescriptorImpl]

'classBody' @ [1035:46] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addDeclarationToClassOrObject[LocalVariableDescriptor]

'lBrace' @ [1035:56] ==> public final val lBrace: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassBody[DeserializedPropertyDescriptor]

'anchor' @ [1040:23] ==> value-parameter anchor: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [1040:30] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'first' @ [1040:46] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [1040:54] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addNextToOriginalElementContainer.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [1040:57] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'actualContainer' @ [1040:67] ==> val actualContainer: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'if (addBefore) {
            actualContainer.addBefore(declaration, sibling)
        }
        else {
            actualContainer.addAfter(declaration, sibling)
        }' @ [1041:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'addBefore' @ [1041:20] ==> value-parameter addBefore: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addNextToOriginalElementContainer[ValueParameterDescriptorImpl]

'actualContainer' @ [1042:13] ==> val actualContainer: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'addBefore' @ [1042:29] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'declaration' @ [1042:39] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'sibling' @ [1042:52] ==> val sibling: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addNextToOriginalElementContainer[LocalVariableDescriptor]

'actualContainer' @ [1045:13] ==> val actualContainer: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'addAfter' @ [1045:29] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'declaration' @ [1045:38] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'sibling' @ [1045:51] ==> val sibling: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.addNextToOriginalElementContainer[LocalVariableDescriptor]

'when {
        actualContainer.isAncestor(anchor, true) -> {
            val insertToBlock = container is KtBlockExpression
            if (insertToBlock) {
                val parent = container.parent
                if (parent is KtFunctionLiteral) {
                    if (!parent.isMultiLine()) {
                        parent.addBefore(newLine, container)
                        parent.addAfter(newLine, container)
                    }
                }
            }
            addNextToOriginalElementContainer(insertToBlock
                                              || (declaration is KtProperty && actualContainer !is KtFile)
                                              || declaration is KtTypeAlias)
        }

        container is KtFile -> container.add(declaration) as D

        container is PsiClass -> {
            if (declaration is KtSecondaryConstructor) {
                val wrappingClass = psiFactory.createClass("class ${container.name} {\n}")
                addDeclarationToClassOrObject(wrappingClass, declaration)
                (fileToEdit.add(wrappingClass) as KtClass).declarations.first() as D
            }
            else {
                fileToEdit.add(declaration) as D
            }
        }

        container is KtClassOrObject -> {
            insertMember(null, container, declaration, container.declarations.lastOrNull())
        }
        else -> throw AssertionError("Invalid containing element: ${container.text}")
    }' @ [1049:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: D, entry1: D, entry2: D, entry3: D, entry4: D): D[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> D

'actualContainer' @ [1050:9] ==> val actualContainer: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'isAncestor' @ [1050:25] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'anchor' @ [1050:36] ==> value-parameter anchor: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'container' @ [1051:33] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'insertToBlock' @ [1052:17] ==> val insertToBlock: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'container' @ [1053:30] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'parent' @ [1053:40] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [1054:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'!' @ [1055:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [1055:26] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'isMultiLine' @ [1055:33] ==> public fun PsiElement.isMultiLine(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'parent' @ [1056:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'addBefore' @ [1056:32] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newLine' @ [1056:42] ==> val newLine: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'container' @ [1056:51] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'parent' @ [1057:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'addAfter' @ [1057:32] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newLine' @ [1057:41] ==> val newLine: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'container' @ [1057:50] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'addNextToOriginalElementContainer' @ [1061:13] ==> local final fun addNextToOriginalElementContainer(addBefore: Boolean): D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[SimpleFunctionDescriptorImpl]

'insertToBlock' @ [1061:47] ==> val insertToBlock: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'declaration' @ [1062:51] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'actualContainer' @ [1062:80] ==> val actualContainer: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'declaration' @ [1063:50] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'container' @ [1066:9] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'container' @ [1066:32] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'add' @ [1066:42] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'declaration' @ [1066:46] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'container' @ [1068:9] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'if (declaration is KtSecondaryConstructor) {
                val wrappingClass = psiFactory.createClass("class ${container.name} {\n}")
                addDeclarationToClassOrObject(wrappingClass, declaration)
                (fileToEdit.add(wrappingClass) as KtClass).declarations.first() as D
            }
            else {
                fileToEdit.add(declaration) as D
            }' @ [1069:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: D, elseBranch: D): D[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> D

'declaration' @ [1069:17] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'psiFactory' @ [1070:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'createClass' @ [1070:48] ==> public final fun createClass(text: String): KtClass defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'container' @ [1070:69] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'name' @ [1070:79] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'addDeclarationToClassOrObject' @ [1071:17] ==> local final fun addDeclarationToClassOrObject(classOrObject: KtClassOrObject, declaration: KtNamedDeclaration): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[SimpleFunctionDescriptorImpl]

'wrappingClass' @ [1071:47] ==> val wrappingClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'declaration' @ [1071:62] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'fileToEdit' @ [1072:18] ==> value-parameter fileToEdit: KtFile = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'add' @ [1072:29] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'wrappingClass' @ [1072:33] ==> val wrappingClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'declarations' @ [1072:60] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'first' @ [1072:73] ==> public fun <T> List<KtDeclaration>.first(): KtDeclaration defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'fileToEdit' @ [1075:17] ==> value-parameter fileToEdit: KtFile = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'add' @ [1075:28] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'declaration' @ [1075:32] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'container' @ [1079:9] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'insertMember' @ [1080:13] ==> public fun <T : KtDeclaration> insertMember(editor: Editor?, classOrObject: KtClassOrObject, declaration: D, anchor: PsiElement? = ...): D defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : KtDeclaration> -> D

'container' @ [1080:32] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'declaration' @ [1080:43] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'container' @ [1080:56] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'declarations' @ [1080:66] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'lastOrNull' @ [1080:79] ==> public fun <T> List<KtDeclaration>.lastOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'AssertionError' @ [1082:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'container' @ [1082:69] ==> value-parameter container: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[ValueParameterDescriptorImpl]

'text' @ [1082:79] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'declarationInPlace' @ [1085:18] ==> val declarationInPlace: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'parent' @ [1085:37] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'calcNecessaryEmptyLines' @ [1086:5] ==> local final fun calcNecessaryEmptyLines(decl: KtDeclaration, after: Boolean): Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[SimpleFunctionDescriptorImpl]

'declarationInPlace' @ [1086:29] ==> val declarationInPlace: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'let' @ [1086:56] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Unit

'it' @ [1087:13] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [1087:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'addBefore' @ [1087:28] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [1087:38] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'createNewLine' @ [1087:49] ==> public final fun createNewLine(lineBreaks: Int): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [1087:63] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.<anonymous>[ValueParameterDescriptorImpl]

'declarationInPlace' @ [1087:68] ==> val declarationInPlace: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'calcNecessaryEmptyLines' @ [1089:5] ==> local final fun calcNecessaryEmptyLines(decl: KtDeclaration, after: Boolean): Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[SimpleFunctionDescriptorImpl]

'declarationInPlace' @ [1089:29] ==> val declarationInPlace: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'let' @ [1089:55] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Unit

'it' @ [1090:13] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [1090:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'addAfter' @ [1090:28] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [1090:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'createNewLine' @ [1090:48] ==> public final fun createNewLine(lineBreaks: Int): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [1090:62] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer.<anonymous>[ValueParameterDescriptorImpl]

'declarationInPlace' @ [1090:67] ==> val declarationInPlace: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'declarationInPlace' @ [1092:12] ==> val declarationInPlace: D defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.placeDeclarationInContainer[LocalVariableDescriptor]

'getReturnTypeReferences' @ [1095:60] ==> internal fun KtNamedDeclaration.getReturnTypeReferences(): List<KtTypeReference> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'singleOrNull' @ [1095:86] ==> public fun <T> List<KtTypeReference>.singleOrNull(): KtTypeReference? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference

'when (this) {
        is KtCallableDeclaration -> listOfNotNull(typeReference)
        is KtClassOrObject -> superTypeListEntries.mapNotNull { it.typeReference }
        else -> throw AssertionError("Unexpected declaration kind: $text")
    }' @ [1098:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtTypeReference>, entry1: List<KtTypeReference>, entry2: List<KtTypeReference>): List<KtTypeReference>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtTypeReference>

'this' @ [1098:18] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getReturnTypeReferences[ReceiverParameterDescriptorImpl]

'listOfNotNull' @ [1099:37] ==> public fun <T : Any> listOfNotNull(element: KtTypeReference?): List<KtTypeReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtTypeReference

'typeReference' @ [1099:51] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'superTypeListEntries' @ [1100:31] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'mapNotNull' @ [1100:52] ==> public inline fun <T, R : Any> Iterable<KtSuperTypeListEntry>.mapNotNull(transform: (KtSuperTypeListEntry) -> KtTypeReference?): List<KtTypeReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry
    <R : Any> -> KtTypeReference

'it' @ [1100:65] ==> value-parameter it: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getReturnTypeReferences.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [1100:68] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'AssertionError' @ [1101:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'text' @ [1101:69] ==> public final val KtNamedDeclaration.text: (String..String?)[MyPropertyDescriptor]

'CallableBuilder' @ [1105:69] ==> public constructor CallableBuilder(config: CallableBuilderConfiguration) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[ClassConstructorDescriptorImpl]

'this' @ [1105:85] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.createBuilder[ReceiverParameterDescriptorImpl]

