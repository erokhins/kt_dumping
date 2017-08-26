'JvmStatic' @ [32:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'classDescriptor' @ [38:31] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[ValueParameterDescriptorImpl]

'typeConstructor' @ [38:47] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'typeConstructor' @ [39:13] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'parameters' @ [39:29] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [39:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'GraphBuilder' @ [41:23] ==> public constructor GraphBuilder(typeConstructor: TypeConstructor) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[ClassConstructorDescriptorImpl]

'typeConstructor' @ [41:36] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'builder' @ [42:21] ==> val builder: NonExpansiveInheritanceRestrictionChecker.GraphBuilder defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'build' @ [42:29] ==> public final fun build(): NonExpansiveInheritanceRestrictionChecker.Graph<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[SimpleFunctionDescriptorImpl]

'graph' @ [44:29] ==> val graph: NonExpansiveInheritanceRestrictionChecker.Graph<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'expansiveEdges' @ [44:35] ==> public abstract val expansiveEdges: Set<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.Graph[PropertyDescriptorImpl]

'filter' @ [44:50] ==> public inline fun <T> Iterable<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>>.filter(predicate: (NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>) -> Boolean): List<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpansiveEdge<TypeParameterDescriptor>

'graph' @ [44:59] ==> val graph: NonExpansiveInheritanceRestrictionChecker.Graph<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'isEdgeInCycle' @ [44:65] ==> private final fun <T> NonExpansiveInheritanceRestrictionChecker.Graph<TypeParameterDescriptor>.isEdgeInCycle(edge: NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TypeParameterDescriptor

'it' @ [44:79] ==> value-parameter it: NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'edgesInCycles' @ [45:13] ==> val edgesInCycles: List<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'isEmpty' @ [45:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'edgesInCycles' @ [47:28] ==> val edgesInCycles: List<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'flatMap' @ [47:42] ==> public inline fun <T, R> Iterable<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>>.flatMap(transform: (NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>) -> Iterable<TypeParameterDescriptor>): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpansiveEdge<TypeParameterDescriptor>
    <R> -> TypeParameterDescriptor

'setOf' @ [47:52] ==> public fun <T> setOf(vararg elements: TypeParameterDescriptor): Set<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'it' @ [47:58] ==> value-parameter it: NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [47:61] ==> public final val from: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge[PropertyDescriptorImpl]

'it' @ [47:67] ==> value-parameter it: NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [47:70] ==> public final val to: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge[PropertyDescriptorImpl]

'typeConstructor' @ [49:31] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'parameters' @ [49:47] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'typeParameter' @ [50:17] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'problemNodes' @ [50:34] ==> val problemNodes: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'?:' @ [51:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'descriptorToDeclaration' @ [51:55] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'typeParameter' @ [51:79] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'declaration' @ [51:97] ==> value-parameter declaration: KtClass defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [52:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[ValueParameterDescriptorImpl]

'report' @ [52:34] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPANSIVE_INHERITANCE' @ [52:48] ==> public final val EXPANSIVE_INHERITANCE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [52:70] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'element' @ [52:73] ==> val element: PsiElement defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'problemNodes' @ [57:13] ==> val problemNodes: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'any' @ [57:26] ==> public inline fun <T> Iterable<TypeParameterDescriptor>.any(predicate: (TypeParameterDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'it' @ [57:32] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [57:35] ==> public final val TypeParameterDescriptor.source: SourceElement[MyPropertyDescriptor]

'NO_SOURCE' @ [57:59] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'problemNodes' @ [59:27] ==> val problemNodes: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'map' @ [59:40] ==> public inline fun <T, R> Iterable<TypeParameterDescriptor>.map(transform: (TypeParameterDescriptor) -> DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> DeclarationDescriptor

'it' @ [59:46] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [59:49] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'map' @ [59:73] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> String

'it' @ [59:79] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [59:82] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [59:95] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'toSortedSet' @ [59:108] ==> public fun <T : Comparable<String>> Iterable<String>.toSortedSet(): SortedSet<String> /* = SortedSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'diagnosticHolder' @ [60:9] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[ValueParameterDescriptorImpl]

'report' @ [60:26] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPANSIVE_INHERITANCE_IN_JAVA' @ [60:40] ==> public final val EXPANSIVE_INHERITANCE_IN_JAVA: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [60:70] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'declaration' @ [60:73] ==> value-parameter declaration: KtClass defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[ValueParameterDescriptorImpl]

'typeFqNames' @ [60:86] ==> val typeFqNames: SortedSet<String> /* = SortedSet<String> */ defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.check[LocalVariableDescriptor]

'joinToString' @ [60:98] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'hashSetOf' @ [64:49] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<TypeConstructor> /* = HashSet<TypeConstructor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'hashSetOf' @ [65:38] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>> /* = HashSet<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpansiveEdge<TypeParameterDescriptor>

'hashMapOf' @ [66:33] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<TypeParameterDescriptor, MutableSet<TypeParameterDescriptor>> /* = HashMap<TypeParameterDescriptor, MutableSet<TypeParameterDescriptor>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> MutableSet<TypeParameterDescriptor>

'doBuildGraph' @ [69:13] ==> private final fun doBuildGraph(typeConstructor: TypeConstructor): Unit defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[SimpleFunctionDescriptorImpl]

'typeConstructor' @ [69:26] ==> public final val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[PropertyDescriptorImpl]

'edgeLists' @ [72:76] ==> private final val edgeLists: HashMap<TypeParameterDescriptor, MutableSet<TypeParameterDescriptor>> /* = HashMap<TypeParameterDescriptor, MutableSet<TypeParameterDescriptor>> */ defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[PropertyDescriptorImpl]

'node' @ [72:86] ==> value-parameter node: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.build.<no name provided>.getNeighbors[ValueParameterDescriptorImpl]

'emptyList' @ [72:95] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'this@GraphBuilder' @ [73:47] ==> <this> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[LazyClassReceiverParameterDescriptor]

'expansiveEdges' @ [73:65] ==> private final val expansiveEdges: HashSet<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>> /* = HashSet<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>> */ defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[PropertyDescriptorImpl]

'edgeLists' @ [78:13] ==> private final val edgeLists: HashMap<TypeParameterDescriptor, MutableSet<TypeParameterDescriptor>> /* = HashMap<TypeParameterDescriptor, MutableSet<TypeParameterDescriptor>> */ defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[PropertyDescriptorImpl]

'getOrPut' @ [78:23] ==> public inline fun <K, V> MutableMap<TypeParameterDescriptor, MutableSet<TypeParameterDescriptor>>.getOrPut(key: TypeParameterDescriptor, defaultValue: () -> MutableSet<TypeParameterDescriptor>): MutableSet<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> MutableSet<TypeParameterDescriptor>

'from' @ [78:32] ==> value-parameter from: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.addEdge[ValueParameterDescriptorImpl]

'linkedSetOf' @ [78:40] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<TypeParameterDescriptor> /* = LinkedHashSet<TypeParameterDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'add' @ [78:56] ==> public abstract fun add(element: TypeParameterDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'to' @ [78:60] ==> value-parameter to: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.addEdge[ValueParameterDescriptorImpl]

'expansive' @ [79:17] ==> value-parameter expansive: Boolean = ... defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.addEdge[ValueParameterDescriptorImpl]

'expansiveEdges' @ [80:17] ==> private final val expansiveEdges: HashSet<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>> /* = HashSet<NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>> */ defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[PropertyDescriptorImpl]

'add' @ [80:32] ==> public open fun add(element: NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<TypeParameterDescriptor>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'ExpansiveEdge' @ [80:36] ==> public constructor ExpansiveEdge<out T>(from: TypeParameterDescriptor, to: TypeParameterDescriptor) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> TypeParameterDescriptor

'from' @ [80:50] ==> value-parameter from: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.addEdge[ValueParameterDescriptorImpl]

'to' @ [80:56] ==> value-parameter to: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.addEdge[ValueParameterDescriptorImpl]

'typeConstructor' @ [85:17] ==> value-parameter typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[ValueParameterDescriptorImpl]

'parameters' @ [85:33] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [85:44] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'typeConstructor' @ [87:34] ==> value-parameter typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[ValueParameterDescriptorImpl]

'parameters' @ [87:50] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'constituentTypes' @ [93:37] ==> public fun constituentTypes(types: Collection<KotlinType>): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'typeConstructor' @ [93:54] ==> value-parameter typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[ValueParameterDescriptorImpl]

'supertypes' @ [93:70] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'constituentType' @ [94:50] ==> val constituentType: KotlinType defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'constructor' @ [94:66] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'constituentTypeConstructor' @ [95:21] ==> val constituentTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'processedTypeConstructors' @ [95:52] ==> private final val processedTypeConstructors: HashSet<TypeConstructor> /* = HashSet<TypeConstructor> */ defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[PropertyDescriptorImpl]

'processedTypeConstructors' @ [96:21] ==> private final val processedTypeConstructors: HashSet<TypeConstructor> /* = HashSet<TypeConstructor> */ defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[PropertyDescriptorImpl]

'add' @ [96:47] ==> public open fun add(element: TypeConstructor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'constituentTypeConstructor' @ [96:51] ==> val constituentTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'doBuildGraph' @ [97:21] ==> private final fun doBuildGraph(typeConstructor: TypeConstructor): Unit defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[SimpleFunctionDescriptorImpl]

'constituentTypeConstructor' @ [97:34] ==> val constituentTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'constituentTypeConstructor' @ [99:21] ==> val constituentTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'parameters' @ [99:48] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [99:59] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'constituentType' @ [99:67] ==> val constituentType: KotlinType defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'arguments' @ [99:83] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'size' @ [99:93] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'constituentType' @ [101:17] ==> val constituentType: KotlinType defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'arguments' @ [101:33] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'forEachIndexed' @ [101:43] ==> public inline fun <T> Iterable<TypeProjection>.forEachIndexed(action: (index: Int, TypeProjection) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'if (typeProjection.projectionKind == Variance.INVARIANT) {
                        val constituents = constituentTypes(setOf(typeProjection.type))

                        for (typeParameter in typeParameters) {
                            if (typeParameter.defaultType in constituents || typeParameter.defaultType.makeNullableAsSpecified(true) in constituents) {
                                addEdge(typeParameter, constituentTypeConstructor.parameters[i], !TypeUtils.isTypeParameter(typeProjection.type))
                            }
                        }
                    }
                    else {
                        // Furthermore, if T appears as a constituent type of an element of the B-closure of the set of lower and
                        // upper bounds of a skolem type variable Q in a skolemization of a projected generic type in ST, add an
                        // expanding edge from T to V, where V is the type parameter corresponding to Q.
                        val originalTypeParameter = constituentTypeConstructor.parameters[i]
                        val bounds = hashSetOf<KotlinType>()

                        val substitutor = TypeConstructorSubstitution.create(constituentType).buildSubstitutor()
                        val adaptedUpperBounds = originalTypeParameter.upperBounds.mapNotNull { substitutor.substitute(it, Variance.INVARIANT) }
                        bounds.addAll(adaptedUpperBounds)

                        if (!typeProjection.isStarProjection) {
                            bounds.add(typeProjection.type)
                        }

                        val boundClosure = boundClosure(bounds)
                        val constituentTypes = constituentTypes(boundClosure)
                        for (typeParameter in typeParameters) {
                            if (typeParameter.defaultType in constituentTypes || typeParameter.defaultType.makeNullableAsSpecified(true) in constituentTypes) {
                                addEdge(typeParameter, originalTypeParameter, true)
                            }
                        }
                    }' @ [102:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'typeProjection' @ [102:25] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [102:40] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [102:67] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'constituentTypes' @ [103:44] ==> public fun constituentTypes(types: Collection<KotlinType>): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'setOf' @ [103:61] ==> public fun <T> setOf(element: KotlinType): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'typeProjection' @ [103:67] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [103:82] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'typeParameters' @ [105:47] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'typeParameter' @ [106:33] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [106:47] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'constituents' @ [106:62] ==> val constituents: Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'typeParameter' @ [106:78] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [106:92] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'makeNullableAsSpecified' @ [106:104] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'constituents' @ [106:137] ==> val constituents: Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'addEdge' @ [107:33] ==> private final fun addEdge(from: TypeParameterDescriptor, to: TypeParameterDescriptor, expansive: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[SimpleFunctionDescriptorImpl]

'typeParameter' @ [107:41] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'constituentTypeConstructor' @ [107:56] ==> val constituentTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'parameters' @ [107:83] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'i' @ [107:94] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [107:98] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTypeParameter' @ [107:109] ==> public open fun isTypeParameter(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'typeProjection' @ [107:125] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [107:140] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constituentTypeConstructor' @ [115:53] ==> val constituentTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'parameters' @ [115:80] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'i' @ [115:91] ==> value-parameter i: Int defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[ValueParameterDescriptorImpl]

'hashSetOf' @ [116:38] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'TypeConstructorSubstitution' @ [118:43] ==> public companion object defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[FakeCallableDescriptorForObject]

'create' @ [118:71] ==> @JvmStatic public final fun create(kotlinType: KotlinType): TypeSubstitution defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution.Companion[DeserializedSimpleFunctionDescriptor]

'constituentType' @ [118:78] ==> val constituentType: KotlinType defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'buildSubstitutor' @ [118:95] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitution[DeserializedSimpleFunctionDescriptor]

'originalTypeParameter' @ [119:50] ==> val originalTypeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'upperBounds' @ [119:72] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'mapNotNull' @ [119:84] ==> public inline fun <T, R : Any> Iterable<(KotlinType..KotlinType?)>.mapNotNull(transform: ((KotlinType..KotlinType?)) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R : Any> -> KotlinType

'substitutor' @ [119:97] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'substitute' @ [119:109] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'it' @ [119:120] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'INVARIANT' @ [119:133] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'bounds' @ [120:25] ==> val bounds: HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'addAll' @ [120:32] ==> public open fun addAll(elements: Collection<KotlinType>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'adaptedUpperBounds' @ [120:39] ==> val adaptedUpperBounds: List<KotlinType> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'!' @ [122:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeProjection' @ [122:30] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [122:45] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'bounds' @ [123:29] ==> val bounds: HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'add' @ [123:36] ==> public open fun add(element: KotlinType): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'typeProjection' @ [123:40] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [123:55] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'boundClosure' @ [126:44] ==> public fun boundClosure(types: Collection<KotlinType>): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'bounds' @ [126:57] ==> val bounds: HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'constituentTypes' @ [127:48] ==> public fun constituentTypes(types: Collection<KotlinType>): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'boundClosure' @ [127:65] ==> val boundClosure: Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'typeParameters' @ [128:47] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph[LocalVariableDescriptor]

'typeParameter' @ [129:33] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [129:47] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'constituentTypes' @ [129:62] ==> val constituentTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'typeParameter' @ [129:82] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [129:96] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'makeNullableAsSpecified' @ [129:108] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'constituentTypes' @ [129:141] ==> val constituentTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'addEdge' @ [130:33] ==> private final fun addEdge(from: TypeParameterDescriptor, to: TypeParameterDescriptor, expansive: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder[SimpleFunctionDescriptorImpl]

'typeParameter' @ [130:41] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'originalTypeParameter' @ [130:56] ==> val originalTypeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.GraphBuilder.doBuildGraph.<anonymous>[LocalVariableDescriptor]

'edge' @ [146:70] ==> value-parameter edge: NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<T> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.isEdgeInCycle[ValueParameterDescriptorImpl]

'from' @ [146:75] ==> public final val from: T defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge[PropertyDescriptorImpl]

'collectReachable' @ [146:83] ==> private final fun <T> NonExpansiveInheritanceRestrictionChecker.Graph<T>.collectReachable(from: T): List<T> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'edge' @ [146:100] ==> value-parameter edge: NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge<T> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.isEdgeInCycle[ValueParameterDescriptorImpl]

'to' @ [146:105] ==> public final val to: T defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.ExpansiveEdge[PropertyDescriptorImpl]

'DFS.NodeHandlerWithListResult<T, T>' @ [149:32] ==> protected/*protected and package*/ constructor NodeHandlerWithListResult<N : (Any..Any?), R : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.DFS.NodeHandlerWithListResult[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> T
    <R : (Any..Any?)> -> T

'result' @ [151:17] ==> @NotNull protected/*protected and package*/ final val result: LinkedList<(T..T?)> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.collectReachable.<no name provided>[JavaPropertyDescriptor]

'add' @ [151:24] ==> public open fun add(element: (T..T?)): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'current' @ [151:28] ==> value-parameter current: T? defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.collectReachable.<no name provided>.afterChildren[ValueParameterDescriptorImpl]

'this@collectReachable' @ [156:66] ==> <this> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.collectReachable[ReceiverParameterDescriptorImpl]

'getNeighbors' @ [156:88] ==> public abstract fun getNeighbors(node: T): Collection<T> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.Graph[SimpleFunctionDescriptorImpl]

'current' @ [156:101] ==> value-parameter current: T defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.collectReachable.<no name provided>.getNeighbors[ValueParameterDescriptorImpl]

'dfs' @ [159:13] ==> public open fun <N : (Any..Any?), R : (Any..Any?)> dfs(@NotNull p0: (MutableCollection<(T..T?)>..Collection<(T..T?)>), @NotNull p1: DFS.Neighbors<(T..T?)>, @NotNull p2: DFS.NodeHandler<(T..T?), (LinkedList<(T..T?)>..LinkedList<(T..T?)>?)>): (LinkedList<(T..T?)>..LinkedList<(T..T?)>?) defined in org.jetbrains.kotlin.utils.DFS[JavaMethodDescriptor]
Inferred types:
    <N : (Any..Any?)> -> (T..T?)
    <R : (Any..Any?)> -> (java.util.LinkedList<(T..T?)>..java.util.LinkedList<(T..T?)>?)

'listOf' @ [159:17] ==> public fun <T> listOf(element: T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'from' @ [159:24] ==> value-parameter from: T defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.collectReachable[ValueParameterDescriptorImpl]

'neighbors' @ [159:31] ==> val neighbors: <no name provided><T> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.collectReachable[LocalVariableDescriptor]

'handler' @ [159:42] ==> val handler: <no name provided><T> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.collectReachable[LocalVariableDescriptor]

'handler' @ [161:16] ==> val handler: <no name provided><T> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.collectReachable[LocalVariableDescriptor]

'result' @ [161:24] ==> @NotNull public open fun result(): LinkedList<(T..T?)> defined in org.jetbrains.kotlin.resolve.NonExpansiveInheritanceRestrictionChecker.collectReachable.<no name provided>[JavaMethodDescriptor]

