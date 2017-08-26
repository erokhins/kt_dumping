'DEFAULT' @ [46:30] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [46:38] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'this' @ [46:49] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.contains[ReceiverParameterDescriptorImpl]

'inner' @ [46:55] ==> value-parameter inner: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.contains[ValueParameterDescriptorImpl]

'arguments' @ [46:65] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'any' @ [46:75] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'inner' @ [46:81] ==> value-parameter inner: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.contains[ValueParameterDescriptorImpl]

'it' @ [46:90] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.contains.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [46:93] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [50:12] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [50:24] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'descriptor' @ [50:49] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.contains[ValueParameterDescriptorImpl]

'arguments' @ [50:63] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'any' @ [50:73] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'descriptor' @ [50:79] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.contains[ValueParameterDescriptorImpl]

'it' @ [50:93] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.contains.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [50:96] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [54:6] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'let' @ [54:52] ==> @InlineOnly public inline fun <T, R> IntersectionTypeConstructor.let(block: (IntersectionTypeConstructor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntersectionTypeConstructor
    <R> -> Nothing

'it' @ [55:16] ==> value-parameter it: IntersectionTypeConstructor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.decomposeIntersection.<anonymous>[ValueParameterDescriptorImpl]

'supertypes' @ [55:19] ==> public final val IntersectionTypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'flatMap' @ [55:30] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.flatMap(transform: ((KotlinType..KotlinType?)) -> Iterable<KotlinType>): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> KotlinType

'it' @ [55:40] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.decomposeIntersection.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'decomposeIntersection' @ [55:43] ==> internal fun KotlinType.decomposeIntersection(): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [58:12] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'this' @ [58:19] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.decomposeIntersection[ReceiverParameterDescriptorImpl]

'typeParameterNameMap' @ [62:24] ==> value-parameter typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle[ValueParameterDescriptorImpl]

'mapValues' @ [63:14] ==> public inline fun <K, V, R> Map<out TypeParameterDescriptor, String>.mapValues(transform: (Map.Entry<TypeParameterDescriptor, String>) -> TypeProjectionImpl): Map<TypeParameterDescriptor, TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> String
    <R> -> TypeProjectionImpl

'identifier' @ [64:33] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [64:44] ==> value-parameter it: Map.Entry<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [64:47] ==> public abstract val value: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [66:37] ==> value-parameter it: Map.Entry<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [66:40] ==> public abstract val key: TypeParameterDescriptor defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'typeParameter' @ [69:75] ==> val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[LocalVariableDescriptor]

'typeConstructor' @ [69:89] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'wrappingTypeParameter' @ [70:63] ==> var wrappingTypeParameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[LocalVariableDescriptor]

'wrappingTypeParameter' @ [73:17] ==> var wrappingTypeParameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[LocalVariableDescriptor]

'typeParameter' @ [73:77] ==> val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[LocalVariableDescriptor]

'name' @ [74:46] ==> val name: Name defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[LocalVariableDescriptor]

'wrappingTypeConstructor' @ [75:57] ==> val wrappingTypeConstructor: <no name provided> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[LocalVariableDescriptor]

'KotlinTypeFactory' @ [78:36] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [78:54] ==> @JvmStatic public final fun simpleType(baseType: SimpleType, annotations: Annotations = ..., constructor: TypeConstructor = ..., arguments: List<TypeProjection> = ..., nullable: Boolean = ..., memberScope: MemberScope = ...): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'typeParameter' @ [78:65] ==> val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [78:79] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'wrappingTypeConstructor' @ [78:106] ==> val wrappingTypeConstructor: <no name provided> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[LocalVariableDescriptor]

'TypeProjectionImpl' @ [79:17] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'wrappingType' @ [79:36] ==> val wrappingType: SimpleType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[LocalVariableDescriptor]

'mapKeys' @ [81:14] ==> public inline fun <K, V, R> Map<out TypeParameterDescriptor, TypeProjectionImpl>.mapKeys(transform: (Map.Entry<TypeParameterDescriptor, TypeProjectionImpl>) -> TypeConstructor): Map<TypeConstructor, TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> TypeProjectionImpl
    <R> -> TypeConstructor

'it' @ [81:24] ==> value-parameter it: Map.Entry<TypeParameterDescriptor, TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [81:27] ==> public abstract val key: TypeParameterDescriptor defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'typeConstructor' @ [81:31] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'!!' @ [83:24] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinType?): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinType

'create' @ [83:40] ==> @NotNull public open fun create(@NotNull p0: (MutableMap<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>..Map<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>)): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'substitution' @ [83:47] ==> val substitution: Map<TypeConstructor, TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle[LocalVariableDescriptor]

'substitute' @ [83:61] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'this' @ [83:72] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle[ReceiverParameterDescriptorImpl]

'INVARIANT' @ [83:87] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'if (fq) IdeDescriptorRenderers.SOURCE_CODE else IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [84:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DescriptorRenderer, elseBranch: DescriptorRenderer): DescriptorRenderer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DescriptorRenderer

'fq' @ [84:24] ==> value-parameter fq: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle[ValueParameterDescriptorImpl]

'SOURCE_CODE' @ [84:51] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [84:91] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderer' @ [85:12] ==> val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle[LocalVariableDescriptor]

'renderType' @ [85:21] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'typeToRender' @ [85:32] ==> val typeToRender: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderSingle[LocalVariableDescriptor]

'decomposeIntersection' @ [89:12] ==> internal fun KotlinType.decomposeIntersection(): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'map' @ [89:36] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'it' @ [89:42] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.render.<anonymous>[ValueParameterDescriptorImpl]

'renderSingle' @ [89:45] ==> private fun KotlinType.renderSingle(typeParameterNameMap: Map<TypeParameterDescriptor, String>, fq: Boolean): String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'typeParameterNameMap' @ [89:58] ==> value-parameter typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.render[ValueParameterDescriptorImpl]

'fq' @ [89:80] ==> value-parameter fq: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.render[ValueParameterDescriptorImpl]

'render' @ [92:99] ==> private fun KotlinType.render(typeParameterNameMap: Map<TypeParameterDescriptor, String>, fq: Boolean): List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'typeParameterNameMap' @ [92:106] ==> value-parameter typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderShort[ValueParameterDescriptorImpl]

'render' @ [93:98] ==> private fun KotlinType.render(typeParameterNameMap: Map<TypeParameterDescriptor, String>, fq: Boolean): List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'typeParameterNameMap' @ [93:105] ==> value-parameter typeParameterNameMap: Map<TypeParameterDescriptor, String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.renderLong[ValueParameterDescriptorImpl]

'typeParameters' @ [96:12] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameterNamesNotInScope[ValueParameterDescriptorImpl]

'filter' @ [96:27] ==> public inline fun <T> Iterable<TypeParameterDescriptor>.filter(predicate: (TypeParameterDescriptor) -> Boolean): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'scope' @ [97:26] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameterNamesNotInScope[ValueParameterDescriptorImpl]

'findClassifier' @ [97:32] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'typeParameter' @ [97:47] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameterNamesNotInScope.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [97:61] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [97:84] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'classifier' @ [98:9] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameterNamesNotInScope.<anonymous>[LocalVariableDescriptor]

'classifier' @ [98:31] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameterNamesNotInScope.<anonymous>[LocalVariableDescriptor]

'typeParameter' @ [98:45] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameterNamesNotInScope.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [102:53] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'any' @ [102:63] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [102:69] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.containsStarProjections.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [102:72] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'it' @ [102:92] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.containsStarProjections.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [102:95] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'containsStarProjections' @ [102:100] ==> public fun KotlinType.containsStarProjections(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'HashSet' @ [105:24] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'LinkedHashSet' @ [106:26] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeParameterDescriptor

'!' @ [109:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'visitedTypes' @ [109:14] ==> val visitedTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters[LocalVariableDescriptor]

'add' @ [109:27] ==> public open fun add(element: KotlinType): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'type' @ [109:31] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters.traverseTypes[ValueParameterDescriptorImpl]

'type' @ [111:25] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters.traverseTypes[ValueParameterDescriptorImpl]

'arguments' @ [111:30] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'arguments' @ [112:13] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters.traverseTypes[LocalVariableDescriptor]

'isEmpty' @ [112:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'type' @ [113:30] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters.traverseTypes[ValueParameterDescriptorImpl]

'constructor' @ [113:35] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [113:47] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'descriptor' @ [114:17] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters.traverseTypes[LocalVariableDescriptor]

'typeParameters' @ [115:17] ==> val typeParameters: LinkedHashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters[LocalVariableDescriptor]

'add' @ [115:32] ==> public open fun add(element: TypeParameterDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [115:36] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters.traverseTypes[LocalVariableDescriptor]

'arguments' @ [120:9] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters.traverseTypes[LocalVariableDescriptor]

'forEach' @ [120:19] ==> @HidesMembers public inline fun <T> Iterable<TypeProjection>.forEach(action: (TypeProjection) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'traverseTypes' @ [120:29] ==> local final fun traverseTypes(type: KotlinType): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters[SimpleFunctionDescriptorImpl]

'it' @ [120:43] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters.traverseTypes.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [120:46] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'traverseTypes' @ [123:5] ==> local final fun traverseTypes(type: KotlinType): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters[SimpleFunctionDescriptorImpl]

'this' @ [123:19] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters[ReceiverParameterDescriptorImpl]

'typeParameters' @ [124:12] ==> val typeParameters: LinkedHashSet<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeParameters[LocalVariableDescriptor]

'allowErrorTypes' @ [134:42] ==> value-parameter allowErrorTypes: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'!' @ [134:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsErrorType' @ [134:73] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'type' @ [134:91] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes.isAcceptable[ValueParameterDescriptorImpl]

'coerceUnusedToUnit' @ [136:9] ==> value-parameter coerceUnusedToUnit: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'this' @ [137:12] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'isUsedAsStatement' @ [138:12] ==> public fun KtExpression.isUsedAsStatement(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [138:30] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [139:12] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'arrayOf' @ [139:74] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'module' @ [139:82] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'builtIns' @ [139:89] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'unitType' @ [139:98] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'context' @ [142:20] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'getType' @ [142:28] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'this' @ [142:36] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'theType1' @ [143:9] ==> val theType1: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'isAcceptable' @ [143:29] ==> local final fun isAcceptable(type: KotlinType): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[SimpleFunctionDescriptorImpl]

'theType1' @ [143:42] ==> val theType1: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'context' @ [144:28] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'getDataFlowInfoAfter' @ [144:36] ==> public fun BindingContext.getDataFlowInfoAfter(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'this' @ [144:57] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'dataFlowInfo' @ [145:29] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'getCollectedTypes' @ [145:42] ==> public abstract fun getCollectedTypes(key: DataFlowValue): Set<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'createDataFlowValue' @ [145:81] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'this' @ [145:101] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'theType1' @ [145:107] ==> val theType1: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'context' @ [145:117] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'module' @ [145:126] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'if (possibleTypes.isNotEmpty()) possibleTypes.toTypedArray() else arrayOf(theType1)' @ [146:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<KotlinType>, elseBranch: Array<KotlinType>): Array<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<KotlinType>

'possibleTypes' @ [146:20] ==> val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'isNotEmpty' @ [146:34] ==> @InlineOnly public inline fun <T> Collection<KotlinType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'possibleTypes' @ [146:48] ==> val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'toTypedArray' @ [146:62] ==> public inline fun <reified T> Collection<KotlinType>.toTypedArray(): Array<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KotlinType

'arrayOf' @ [146:82] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'theType1' @ [146:90] ==> val theType1: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'context' @ [150:20] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'EXPECTED_EXPRESSION_TYPE' @ [150:43] ==> public final val EXPECTED_EXPRESSION_TYPE: (WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [150:69] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'theType2' @ [151:9] ==> val theType2: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'isAcceptable' @ [151:29] ==> local final fun isAcceptable(type: KotlinType): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[SimpleFunctionDescriptorImpl]

'theType2' @ [151:42] ==> val theType2: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'arrayOf' @ [151:60] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'theType2' @ [151:68] ==> val theType2: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [153:18] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when {
        this is KtTypeConstraint -> {
            // expression itself is a type assertion
            val constraint = this
            arrayOf(context[BindingContext.TYPE, constraint.boundTypeReference]!!)
        }
        parent is KtTypeConstraint -> {
            // expression is on the left side of a type assertion
            arrayOf(context[BindingContext.TYPE, parent.boundTypeReference]!!)
        }
        this is KtDestructuringDeclarationEntry -> {
            // expression is on the lhs of a multi-declaration
            val typeRef = typeReference
            if (typeRef != null) {
                // and has a specified type
                arrayOf(context[BindingContext.TYPE, typeRef]!!)
            }
            else {
                // otherwise guess
                guessType(context)
            }
        }
        this is KtParameter -> {
            // expression is a parameter (e.g. declared in a for-loop)
            val typeRef = typeReference
            if (typeRef != null) {
                // and has a specified type
                arrayOf(context[BindingContext.TYPE, typeRef]!!)
            }
            else {
                // otherwise guess
                guessType(context)
            }
        }
        parent is KtProperty && parent.isLocal -> {
            // the expression is the RHS of a variable assignment with a specified type
            val typeRef = parent.typeReference
            if (typeRef != null) {
                // and has a specified type
                arrayOf(context[BindingContext.TYPE, typeRef]!!)
            }
            else {
                // otherwise guess, based on LHS
                parent.guessType(context)
            }
        }
        parent is KtPropertyDelegate -> {
            val variableDescriptor = context[BindingContext.DECLARATION_TO_DESCRIPTOR, parent.parent as KtProperty] as VariableDescriptor
            val delegateClassName = if (variableDescriptor.isVar) "ReadWriteProperty" else "ReadOnlyProperty"
            val delegateClass = module.resolveTopLevelClass(FqName("kotlin.properties.$delegateClassName"), NoLookupLocation.FROM_IDE)
                                ?: return arrayOf(module.builtIns.anyType)
            val receiverType = (variableDescriptor.extensionReceiverParameter ?: variableDescriptor.dispatchReceiverParameter)?.type
                               ?: module.builtIns.nullableNothingType
            val typeArguments = listOf(TypeProjectionImpl(receiverType), TypeProjectionImpl(variableDescriptor.type))
            arrayOf(TypeUtils.substituteProjectionsForParameters(delegateClass, typeArguments))
        }
        parent is KtStringTemplateEntryWithExpression && parent.expression == this -> {
            arrayOf(module.builtIns.stringType)
        }
        parent is KtBlockExpression && parent.statements.lastOrNull() == this && parent.parent is KtFunctionLiteral -> {
            parent.guessTypes(context, module, pseudocode, coerceUnusedToUnit)
        }
        parent is KtFunction -> {
            val functionDescriptor = context[BindingContext.DECLARATION_TO_DESCRIPTOR, parent] as? FunctionDescriptor ?: return arrayOf()
            val returnType = functionDescriptor.returnType
            if (returnType != null && isAcceptable(returnType)) return arrayOf(returnType)
            val functionalExpression: KtExpression? = when {
                parent is KtFunctionLiteral -> parent.parent as? KtLambdaExpression
                parent is KtNamedFunction && parent.name == null -> parent
                else -> null
            }
            if (functionalExpression == null) {
                functionDescriptor.overriddenDescriptors
                        .mapNotNull { it.returnType }
                        .firstOrNull { isAcceptable(it) }
                        ?.let { return arrayOf(it) }
                return arrayOf()
            }
            val lambdaTypes = functionalExpression.guessTypes(context, module, pseudocode?.parent, coerceUnusedToUnit)
            lambdaTypes.mapNotNull { it.getFunctionType()?.arguments?.lastOrNull()?.type }.toTypedArray()
        }
        else -> {
            pseudocode?.getElementValue(this)?.let {
                getExpectedTypePredicate(it, context, module.builtIns).getRepresentativeTypes().toTypedArray()
            } ?: arrayOf() // can't infer anything
        }
    }' @ [154:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Array<KotlinType>, entry1: Array<KotlinType>, entry2: Array<KotlinType>, entry3: Array<KotlinType>, entry4: Array<KotlinType>, entry5: Array<KotlinType>, entry6: Array<KotlinType>, entry7: Array<KotlinType>, entry8: Array<KotlinType>, entry9: Array<KotlinType>): Array<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Array<KotlinType>

'this' @ [155:9] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'this' @ [157:30] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'arrayOf' @ [158:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'context' @ [158:21] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'TYPE' @ [158:44] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'constraint' @ [158:50] ==> val constraint: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'boundTypeReference' @ [158:61] ==> public final val KtTypeConstraint.boundTypeReference: KtTypeReference?[MyPropertyDescriptor]

'parent' @ [160:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'arrayOf' @ [162:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'context' @ [162:21] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'TYPE' @ [162:44] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parent' @ [162:50] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'boundTypeReference' @ [162:57] ==> public final val KtTypeConstraint.boundTypeReference: KtTypeReference?[MyPropertyDescriptor]

'this' @ [164:9] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'typeReference' @ [166:27] ==> public final var KtDestructuringDeclarationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'if (typeRef != null) {
                // and has a specified type
                arrayOf(context[BindingContext.TYPE, typeRef]!!)
            }
            else {
                // otherwise guess
                guessType(context)
            }' @ [167:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<KotlinType>, elseBranch: Array<KotlinType>): Array<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<KotlinType>

'typeRef' @ [167:17] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'arrayOf' @ [169:17] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'context' @ [169:25] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'TYPE' @ [169:48] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeRef' @ [169:54] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'guessType' @ [173:17] ==> private fun KtNamedDeclaration.guessType(context: BindingContext): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [173:27] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'this' @ [176:9] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'typeReference' @ [178:27] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'if (typeRef != null) {
                // and has a specified type
                arrayOf(context[BindingContext.TYPE, typeRef]!!)
            }
            else {
                // otherwise guess
                guessType(context)
            }' @ [179:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<KotlinType>, elseBranch: Array<KotlinType>): Array<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<KotlinType>

'typeRef' @ [179:17] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'arrayOf' @ [181:17] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'context' @ [181:25] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'TYPE' @ [181:48] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeRef' @ [181:54] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'guessType' @ [185:17] ==> private fun KtNamedDeclaration.guessType(context: BindingContext): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [185:27] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'parent' @ [188:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [188:33] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'isLocal' @ [188:40] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'parent' @ [190:27] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'typeReference' @ [190:34] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'if (typeRef != null) {
                // and has a specified type
                arrayOf(context[BindingContext.TYPE, typeRef]!!)
            }
            else {
                // otherwise guess, based on LHS
                parent.guessType(context)
            }' @ [191:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<KotlinType>, elseBranch: Array<KotlinType>): Array<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<KotlinType>

'typeRef' @ [191:17] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'arrayOf' @ [193:17] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'context' @ [193:25] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'TYPE' @ [193:48] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeRef' @ [193:54] ==> val typeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [197:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'guessType' @ [197:24] ==> private fun KtNamedDeclaration.guessType(context: BindingContext): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [197:34] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'parent' @ [200:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'context' @ [201:38] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [201:61] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parent' @ [201:88] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [201:95] ==> public final val KtPropertyDelegate.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (variableDescriptor.isVar) "ReadWriteProperty" else "ReadOnlyProperty"' @ [202:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'variableDescriptor' @ [202:41] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'isVar' @ [202:60] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'module' @ [203:33] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'resolveTopLevelClass' @ [203:40] ==> public fun ModuleDescriptor.resolveTopLevelClass(topLevelClassFqName: FqName, location: LookupLocation): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'FqName' @ [203:61] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'delegateClassName' @ [203:88] ==> val delegateClassName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'FROM_IDE' @ [203:126] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'arrayOf' @ [204:43] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'module' @ [204:51] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'builtIns' @ [204:58] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'anyType' @ [204:67] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'?:' @ [205:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinType?, right: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinType

'variableDescriptor' @ [205:33] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'extensionReceiverParameter' @ [205:52] ==> public final val VariableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'variableDescriptor' @ [205:82] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [205:101] ==> public final val VariableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [205:129] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'module' @ [206:35] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'builtIns' @ [206:42] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'nullableNothingType' @ [206:51] ==> public final val KotlinBuiltIns.nullableNothingType: SimpleType[MyPropertyDescriptor]

'listOf' @ [207:33] ==> public fun <T> listOf(vararg elements: TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjectionImpl

'TypeProjectionImpl' @ [207:40] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'receiverType' @ [207:59] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'TypeProjectionImpl' @ [207:74] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'variableDescriptor' @ [207:93] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'type' @ [207:112] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'arrayOf' @ [208:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'substituteProjectionsForParameters' @ [208:31] ==> @NotNull public open fun substituteProjectionsForParameters(@NotNull p0: ClassDescriptor, @NotNull p1: (MutableList<(TypeProjection..TypeProjection?)>..List<(TypeProjection..TypeProjection?)>)): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'delegateClass' @ [208:66] ==> val delegateClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'typeArguments' @ [208:81] ==> val typeArguments: List<TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [210:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [210:58] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'expression' @ [210:65] ==> public final val KtStringTemplateEntryWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'this' @ [210:79] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'arrayOf' @ [211:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'module' @ [211:21] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'builtIns' @ [211:28] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'stringType' @ [211:37] ==> public final val KotlinBuiltIns.stringType: SimpleType[MyPropertyDescriptor]

'parent' @ [213:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [213:40] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'statements' @ [213:47] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'lastOrNull' @ [213:58] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'this' @ [213:74] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'parent' @ [213:82] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [213:89] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [214:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'guessTypes' @ [214:20] ==> public fun KtExpression.guessTypes(context: BindingContext, module: ModuleDescriptor, pseudocode: Pseudocode? = ..., coerceUnusedToUnit: Boolean = ..., allowErrorTypes: Boolean = ...): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [214:31] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'module' @ [214:40] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'pseudocode' @ [214:48] ==> value-parameter pseudocode: Pseudocode? = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'coerceUnusedToUnit' @ [214:60] ==> value-parameter coerceUnusedToUnit: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'parent' @ [216:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'context' @ [217:38] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [217:61] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parent' @ [217:88] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'arrayOf' @ [217:129] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'functionDescriptor' @ [218:30] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'returnType' @ [218:49] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [219:17] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'isAcceptable' @ [219:39] ==> local final fun isAcceptable(type: KotlinType): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[SimpleFunctionDescriptorImpl]

'returnType' @ [219:52] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'arrayOf' @ [219:72] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'returnType' @ [219:80] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'when {
                parent is KtFunctionLiteral -> parent.parent as? KtLambdaExpression
                parent is KtNamedFunction && parent.name == null -> parent
                else -> null
            }' @ [220:55] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'parent' @ [221:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [221:48] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [221:55] ==> public final val KtFunctionLiteral.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [222:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'parent' @ [222:46] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'name' @ [222:53] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'parent' @ [222:69] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'functionalExpression' @ [225:17] ==> val functionalExpression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'functionDescriptor' @ [226:17] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'overriddenDescriptors' @ [226:36] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'mapNotNull' @ [227:26] ==> public inline fun <T, R : Any> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.mapNotNull(transform: ((FunctionDescriptor..FunctionDescriptor?)) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)
    <R : Any> -> KotlinType

'it' @ [227:39] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [227:42] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'firstOrNull' @ [228:26] ==> public inline fun <T> Iterable<KotlinType>.firstOrNull(predicate: (KotlinType) -> Boolean): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'isAcceptable' @ [228:40] ==> local final fun isAcceptable(type: KotlinType): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[SimpleFunctionDescriptorImpl]

'it' @ [228:53] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [229:27] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Nothing

'arrayOf' @ [229:40] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'it' @ [229:48] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [230:24] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'functionalExpression' @ [232:31] ==> val functionalExpression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'guessTypes' @ [232:52] ==> public fun KtExpression.guessTypes(context: BindingContext, module: ModuleDescriptor, pseudocode: Pseudocode? = ..., coerceUnusedToUnit: Boolean = ..., allowErrorTypes: Boolean = ...): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [232:63] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'module' @ [232:72] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'pseudocode' @ [232:80] ==> value-parameter pseudocode: Pseudocode? = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'parent' @ [232:92] ==> public abstract val parent: Pseudocode? defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedPropertyDescriptor]

'coerceUnusedToUnit' @ [232:100] ==> value-parameter coerceUnusedToUnit: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'lambdaTypes' @ [233:13] ==> val lambdaTypes: Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[LocalVariableDescriptor]

'mapNotNull' @ [233:25] ==> public inline fun <T, R : Any> Array<out KotlinType>.mapNotNull(transform: (KotlinType) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R : Any> -> KotlinType

'it' @ [233:38] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes.<anonymous>[ValueParameterDescriptorImpl]

'getFunctionType' @ [233:41] ==> private fun KotlinType.getFunctionType(): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'arguments' @ [233:60] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'lastOrNull' @ [233:71] ==> public fun <T> List<TypeProjection>.lastOrNull(): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [233:85] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'toTypedArray' @ [233:92] ==> public inline fun <reified T> Collection<KotlinType>.toTypedArray(): Array<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KotlinType

'pseudocode' @ [236:13] ==> value-parameter pseudocode: Pseudocode? = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'getElementValue' @ [236:25] ==> public abstract fun getElementValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedSimpleFunctionDescriptor]

'this' @ [236:41] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ReceiverParameterDescriptorImpl]

'let' @ [236:48] ==> @InlineOnly public inline fun <T, R> PseudoValue.let(block: (PseudoValue) -> Array<KotlinType>): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue
    <R> -> Array<KotlinType>

'getExpectedTypePredicate' @ [237:17] ==> public fun getExpectedTypePredicate(value: PseudoValue, bindingContext: BindingContext, builtIns: KotlinBuiltIns): TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedSimpleFunctionDescriptor]

'it' @ [237:42] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [237:46] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'module' @ [237:55] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessTypes[ValueParameterDescriptorImpl]

'builtIns' @ [237:62] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'getRepresentativeTypes' @ [237:72] ==> private fun TypePredicate.getRepresentativeTypes(): Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'toTypedArray' @ [237:97] ==> public inline fun <reified T> Collection<KotlinType>.toTypedArray(): Array<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KotlinType

'arrayOf' @ [238:18] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'if (isFunctionType) this else supertypes().firstOrNull { it.isFunctionType }' @ [243:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'isFunctionType' @ [243:48] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'this' @ [243:64] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getFunctionType[ReceiverParameterDescriptorImpl]

'supertypes' @ [243:74] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [243:87] ==> public inline fun <T> Iterable<KotlinType>.firstOrNull(predicate: (KotlinType) -> Boolean): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [243:101] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'isFunctionType' @ [243:104] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'!!' @ [246:25] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: (MutableIterable<(PsiReference..PsiReference?)>?..Iterable<(PsiReference..PsiReference?)>?)): (MutableIterable<(PsiReference..PsiReference?)>..Iterable<(PsiReference..PsiReference?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> (kotlin.collections.MutableIterable<(com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)>..kotlin.collections.Iterable<(com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)>)

'findAllReferences' @ [246:37] ==> public open fun findAllReferences(p0: (PsiElement..PsiElement?), p1: (SearchScope..SearchScope?)): (MutableIterable<(PsiReference..PsiReference?)>..Iterable<(PsiReference..PsiReference?)>?) defined in com.intellij.refactoring.psi.SearchUtils[JavaMethodDescriptor]

'this' @ [246:55] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType[ReceiverParameterDescriptorImpl]

'useScope' @ [246:61] ==> public final val KtNamedDeclaration.useScope: SearchScope[MyPropertyDescriptor]

'mapNotNullTo' @ [246:73] ==> public inline fun <T, R : Any, C : MutableCollection<in KotlinType>> Iterable<(PsiReference..PsiReference?)>.mapNotNullTo(destination: HashSet<KotlinType>, transform: ((PsiReference..PsiReference?)) -> KotlinType?): HashSet<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R : Any> -> KotlinType
    <C : MutableCollection<in R>> -> HashSet<KotlinType>

'HashSet' @ [246:86] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'if (ref is KtSimpleNameReference) {
            context[BindingContext.EXPECTED_EXPRESSION_TYPE, ref.expression]
        }
        else {
            null
        }' @ [247:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'ref' @ [247:13] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [248:13] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType[ValueParameterDescriptorImpl]

'EXPECTED_EXPRESSION_TYPE' @ [248:36] ==> public final val EXPECTED_EXPRESSION_TYPE: (WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ref' @ [248:62] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [248:66] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'expectedTypes' @ [255:9] ==> val expectedTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType[LocalVariableDescriptor]

'isEmpty' @ [255:23] ==> public open fun isEmpty(): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'expectedTypes' @ [255:36] ==> val expectedTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType[LocalVariableDescriptor]

'any' @ [255:50] ==> public inline fun <T> Iterable<KotlinType>.any(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'containsErrorType' @ [255:83] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'expectedType' @ [255:101] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [256:16] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'intersectTypes' @ [258:35] ==> @Nullable public open fun intersectTypes(@NotNull p0: KotlinTypeChecker, @NotNull p1: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>)): KotlinType? defined in org.jetbrains.kotlin.types.TypeIntersector[JavaMethodDescriptor]

'DEFAULT' @ [258:68] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'expectedTypes' @ [258:77] ==> val expectedTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType[LocalVariableDescriptor]

'if (theType != null) {
        arrayOf(theType)
    }
    else {
        // intersection doesn't exist; let user make an imperfect choice
        expectedTypes.toTypedArray()
    }' @ [259:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<KotlinType>, elseBranch: Array<KotlinType>): Array<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<KotlinType>

'theType' @ [259:16] ==> val theType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType[LocalVariableDescriptor]

'arrayOf' @ [260:9] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KotlinType): Array<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType

'theType' @ [260:17] ==> val theType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType[LocalVariableDescriptor]

'expectedTypes' @ [264:9] ==> val expectedTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.guessType[LocalVariableDescriptor]

'toTypedArray' @ [264:23] ==> public inline fun <reified T> Collection<KotlinType>.toTypedArray(): Array<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KotlinType

'isMarkedNullable' @ [274:20] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'makeNotNullable' @ [275:23] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'if (when (variance) {
        Variance.INVARIANT      -> KotlinTypeChecker.DEFAULT.equalTypes(currentType, substitution.forType)
        Variance.IN_VARIANCE    -> KotlinTypeChecker.DEFAULT.isSubtypeOf(currentType, substitution.forType)
        Variance.OUT_VARIANCE   -> KotlinTypeChecker.DEFAULT.isSubtypeOf(substitution.forType, currentType)
    }) {
        TypeUtils.makeNullableAsSpecified(substitution.byType, nullable)
    }
    else {
        val newArguments = arguments.zip(constructor.parameters).map { pair ->
            val (projection, typeParameter) = pair
            TypeProjectionImpl(Variance.INVARIANT, projection.type.substitute(substitution, typeParameter.variance))
        }
        KotlinTypeFactory.simpleType(annotations, constructor, newArguments, isMarkedNullable, memberScope)
    }' @ [277:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'when (variance) {
        Variance.INVARIANT      -> KotlinTypeChecker.DEFAULT.equalTypes(currentType, substitution.forType)
        Variance.IN_VARIANCE    -> KotlinTypeChecker.DEFAULT.isSubtypeOf(currentType, substitution.forType)
        Variance.OUT_VARIANCE   -> KotlinTypeChecker.DEFAULT.isSubtypeOf(substitution.forType, currentType)
    }' @ [277:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'variance' @ [277:22] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[ValueParameterDescriptorImpl]

'INVARIANT' @ [278:18] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'DEFAULT' @ [278:54] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [278:62] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'currentType' @ [278:73] ==> val currentType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[LocalVariableDescriptor]

'substitution' @ [278:86] ==> value-parameter substitution: KotlinTypeSubstitution defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[ValueParameterDescriptorImpl]

'forType' @ [278:99] ==> public final val forType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.KotlinTypeSubstitution[PropertyDescriptorImpl]

'IN_VARIANCE' @ [279:18] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'DEFAULT' @ [279:54] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [279:62] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'currentType' @ [279:74] ==> val currentType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[LocalVariableDescriptor]

'substitution' @ [279:87] ==> value-parameter substitution: KotlinTypeSubstitution defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[ValueParameterDescriptorImpl]

'forType' @ [279:100] ==> public final val forType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.KotlinTypeSubstitution[PropertyDescriptorImpl]

'OUT_VARIANCE' @ [280:18] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'DEFAULT' @ [280:54] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [280:62] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'substitution' @ [280:74] ==> value-parameter substitution: KotlinTypeSubstitution defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[ValueParameterDescriptorImpl]

'forType' @ [280:87] ==> public final val forType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.KotlinTypeSubstitution[PropertyDescriptorImpl]

'currentType' @ [280:96] ==> val currentType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [282:19] ==> @NotNull public open fun makeNullableAsSpecified(@NotNull p0: KotlinType, p1: Boolean): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'substitution' @ [282:43] ==> value-parameter substitution: KotlinTypeSubstitution defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[ValueParameterDescriptorImpl]

'byType' @ [282:56] ==> public final val byType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.KotlinTypeSubstitution[PropertyDescriptorImpl]

'nullable' @ [282:64] ==> val nullable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[LocalVariableDescriptor]

'arguments' @ [285:28] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'zip' @ [285:38] ==> public infix fun <T, R> Iterable<TypeProjection>.zip(other: Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>): List<Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'constructor' @ [285:42] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameters' @ [285:54] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [285:66] ==> public inline fun <T, R> Iterable<Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)>>.map(transform: (Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)>) -> TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<TypeProjection, (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)>
    <R> -> TypeProjectionImpl

'component1' @ [286:18] ==> public final operator fun component1(): TypeProjection defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [286:30] ==> public final operator fun component2(): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'pair' @ [286:47] ==> value-parameter pair: Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute.<anonymous>[ValueParameterDescriptorImpl]

'TypeProjectionImpl' @ [287:13] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'INVARIANT' @ [287:41] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'projection' @ [287:52] ==> val projection: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute.<anonymous>[LocalVariableDescriptor]

'type' @ [287:63] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'substitute' @ [287:68] ==> internal fun KotlinType.substitute(substitution: KotlinTypeSubstitution, variance: Variance): KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'substitution' @ [287:79] ==> value-parameter substitution: KotlinTypeSubstitution defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[ValueParameterDescriptorImpl]

'typeParameter' @ [287:93] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute.<anonymous>[LocalVariableDescriptor]

'variance' @ [287:107] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'simpleType' @ [289:27] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean, memberScope: MemberScope): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'annotations' @ [289:38] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'constructor' @ [289:51] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'newArguments' @ [289:64] ==> val newArguments: List<TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.substitute[LocalVariableDescriptor]

'isMarkedNullable' @ [289:78] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'memberScope' @ [289:96] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getAssignmentByLHS' @ [293:48] ==> public fun KtExpression.getAssignmentByLHS(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'right' @ [293:70] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'this' @ [293:79] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getExpressionForTypeGuess[ReceiverParameterDescriptorImpl]

'typeArguments' @ [296:12] ==> public final val KtCallElement.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'mapNotNull' @ [296:26] ==> public inline fun <T, R : Any> Iterable<(KtTypeProjection..KtTypeProjection?)>.mapNotNull(transform: ((KtTypeProjection..KtTypeProjection?)) -> TypeInfo?): List<TypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)
    <R : Any> -> TypeInfo

'it' @ [296:39] ==> value-parameter it: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeInfoForTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [296:42] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [296:57] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> TypeInfo): TypeInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> TypeInfo

'TypeInfo' @ [296:63] ==> public fun TypeInfo(typeReference: KtTypeReference, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'it' @ [296:72] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getTypeInfoForTypeArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'INVARIANT' @ [296:85] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'this' @ [300:19] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getParameterInfos[ReceiverParameterDescriptorImpl]

'builtIns' @ [300:24] ==> public val KtElement.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'nullableAnyType' @ [300:33] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'valueArguments' @ [301:12] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'map' @ [301:27] ==> public inline fun <T, R> Iterable<(KtValueArgument..KtValueArgument?)>.map(transform: ((KtValueArgument..KtValueArgument?)) -> ParameterInfo): List<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <R> -> ParameterInfo

'ParameterInfo' @ [302:9] ==> public constructor ParameterInfo(typeInfo: TypeInfo, preferredName: String? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[ClassConstructorDescriptorImpl]

'it' @ [303:17] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getParameterInfos.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [303:20] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'let' @ [303:45] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> TypeInfo): TypeInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> TypeInfo

'TypeInfo' @ [303:51] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'it' @ [303:60] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getParameterInfos.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [303:73] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeInfo' @ [303:91] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'anyType' @ [303:100] ==> val anyType: SimpleType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getParameterInfos[LocalVariableDescriptor]

'IN_VARIANCE' @ [303:118] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'it' @ [304:17] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getParameterInfos.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [304:20] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'referenceExpression' @ [304:39] ==> public open val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtValueArgumentName[JavaPropertyDescriptor]

'getReferencedName' @ [304:60] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'when (this) {
        is SingleType -> Collections.singleton(targetType)
        is AllSubtypes -> Collections.singleton(upperBound)
        is ForAllTypes -> {
            if (typeSets.isEmpty()) AllTypes.getRepresentativeTypes()
            else typeSets.map { it.getRepresentativeTypes() }.reduce { a, b -> a.intersect(b) }
        }
        is ForSomeType -> typeSets.flatMapTo(LinkedHashSet<KotlinType>()) { it.getRepresentativeTypes() }
        is AllTypes -> emptySet()
        else -> throw AssertionError("Invalid type predicate: ${this}")
    }' @ [310:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Set<KotlinType>, entry1: Set<KotlinType>, entry2: Set<KotlinType>, entry3: Set<KotlinType>, entry4: Set<KotlinType>, entry5: Set<KotlinType>): Set<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Set<KotlinType>

'this' @ [310:18] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getRepresentativeTypes[ReceiverParameterDescriptorImpl]

'singleton' @ [311:38] ==> public open fun <T : (Any..Any?)> singleton(p0: (KotlinType..KotlinType?)): (MutableSet<(KotlinType..KotlinType?)>..Set<(KotlinType..KotlinType?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'targetType' @ [311:48] ==> public final val targetType: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.SingleType[DeserializedPropertyDescriptor]

'singleton' @ [312:39] ==> public open fun <T : (Any..Any?)> singleton(p0: (KotlinType..KotlinType?)): (MutableSet<(KotlinType..KotlinType?)>..Set<(KotlinType..KotlinType?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'upperBound' @ [312:49] ==> public final val upperBound: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.AllSubtypes[DeserializedPropertyDescriptor]

'if (typeSets.isEmpty()) AllTypes.getRepresentativeTypes()
            else typeSets.map { it.getRepresentativeTypes() }.reduce { a, b -> a.intersect(b) }' @ [314:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<KotlinType>, elseBranch: Set<KotlinType>): Set<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<KotlinType>

'typeSets' @ [314:17] ==> public final val typeSets: List<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.ForAllTypes[DeserializedPropertyDescriptor]

'isEmpty' @ [314:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'getRepresentativeTypes' @ [314:46] ==> private fun TypePredicate.getRepresentativeTypes(): Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'typeSets' @ [315:18] ==> public final val typeSets: List<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.ForAllTypes[DeserializedPropertyDescriptor]

'map' @ [315:27] ==> public inline fun <T, R> Iterable<TypePredicate>.map(transform: (TypePredicate) -> Set<KotlinType>): List<Set<KotlinType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypePredicate
    <R> -> Set<KotlinType>

'it' @ [315:33] ==> value-parameter it: TypePredicate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getRepresentativeTypes.<anonymous>[ValueParameterDescriptorImpl]

'getRepresentativeTypes' @ [315:36] ==> private fun TypePredicate.getRepresentativeTypes(): Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'reduce' @ [315:63] ==> public inline fun <S, T : Set<KotlinType>> Iterable<Set<KotlinType>>.reduce(operation: (acc: Set<KotlinType>, Set<KotlinType>) -> Set<KotlinType>): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Set<KotlinType>
    <T : S> -> Set<KotlinType>

'a' @ [315:80] ==> value-parameter a: Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getRepresentativeTypes.<anonymous>[ValueParameterDescriptorImpl]

'intersect' @ [315:82] ==> public infix fun <T> Iterable<KotlinType>.intersect(other: Iterable<KotlinType>): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'b' @ [315:92] ==> value-parameter b: Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getRepresentativeTypes.<anonymous>[ValueParameterDescriptorImpl]

'typeSets' @ [317:27] ==> public final val typeSets: List<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.ForSomeType[DeserializedPropertyDescriptor]

'flatMapTo' @ [317:36] ==> public inline fun <T, R, C : MutableCollection<in KotlinType>> Iterable<TypePredicate>.flatMapTo(destination: LinkedHashSet<KotlinType>, transform: (TypePredicate) -> Iterable<KotlinType>): LinkedHashSet<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypePredicate
    <R> -> KotlinType
    <C : MutableCollection<in R>> -> LinkedHashSet<KotlinType>

'LinkedHashSet' @ [317:46] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'it' @ [317:77] ==> value-parameter it: TypePredicate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getRepresentativeTypes.<anonymous>[ValueParameterDescriptorImpl]

'getRepresentativeTypes' @ [317:80] ==> private fun TypePredicate.getRepresentativeTypes(): Set<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'emptySet' @ [318:24] ==> public fun <T> emptySet(): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'AssertionError' @ [319:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'this' @ [319:65] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.getRepresentativeTypes[ReceiverParameterDescriptorImpl]

