'AnnotationsChangeTracker' @ [27:48] ==> public constructor AnnotationsChangeTracker() defined in org.jetbrains.jps.builders.java.dependencyView.AnnotationsChangeTracker[JavaClassConstructorDescriptor]

'NULLABLE_ANNOTATIONS' @ [28:32] ==> public val NULLABLE_ANNOTATIONS: List<(FqName..FqName?)> defined in org.jetbrains.kotlin.load.java[DeserializedPropertyDescriptor]

'JAVAX_NONNULL_ANNOTATION' @ [28:55] ==> public val JAVAX_NONNULL_ANNOTATION: FqName defined in org.jetbrains.kotlin.load.java[DeserializedPropertyDescriptor]

'NOT_NULL_ANNOTATIONS' @ [28:82] ==> public val NOT_NULL_ANNOTATIONS: List<(FqName..FqName?)> defined in org.jetbrains.kotlin.load.java[DeserializedPropertyDescriptor]

'mapTo' @ [28:104] ==> public inline fun <T, R, C : MutableCollection<in String>> Iterable<(FqName..FqName?)>.mapTo(destination: HashSet<String>, transform: ((FqName..FqName?)) -> String): HashSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <R> -> String
    <C : MutableCollection<in R>> -> HashSet<String>

'HashSet' @ [28:110] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'it' @ [28:123] ==> value-parameter it: (FqName..FqName?) defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.annotations.<anonymous>[ValueParameterDescriptorImpl]

'internalNameWithoutInnerClasses' @ [28:126] ==> public val FqName.internalNameWithoutInnerClasses: String defined in org.jetbrains.kotlin.fileClasses[DeserializedPropertyDescriptor]

'toTypedArray' @ [28:160] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'annotationsDiff' @ [36:34] ==> value-parameter annotationsDiff: Difference.Specifier<TypeRepr.ClassType, Difference> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.methodAnnotationsChanged[ValueParameterDescriptorImpl]

'addedOrRemoved' @ [36:50] ==> private final fun <T> Difference.Specifier<TypeRepr.ClassType, Difference>.addedOrRemoved(): Sequence<TypeRepr.ClassType> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassType

'paramAnnotationsDiff' @ [37:34] ==> value-parameter paramAnnotationsDiff: Difference.Specifier<ParamAnnotation, Difference> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.methodAnnotationsChanged[ValueParameterDescriptorImpl]

'addedOrRemoved' @ [37:55] ==> private final fun <T> Difference.Specifier<ParamAnnotation, Difference>.addedOrRemoved(): Sequence<ParamAnnotation> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ParamAnnotation

'map' @ [37:72] ==> public fun <T, R> Sequence<ParamAnnotation>.map(transform: (ParamAnnotation) -> TypeRepr.ClassType): Sequence<TypeRepr.ClassType> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParamAnnotation
    <R> -> ClassType

'it' @ [37:78] ==> value-parameter it: ParamAnnotation defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.methodAnnotationsChanged.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [37:81] ==> @NotNull public final val type: TypeRepr.ClassType defined in org.jetbrains.jps.builders.java.dependencyView.ParamAnnotation[JavaPropertyDescriptor]

'handleNullAnnotationsChanges' @ [39:16] ==> private final fun handleNullAnnotationsChanges(context: NamingContext, protoMember: ProtoMember, annotations: Sequence<TypeRepr.ClassType>): Set<AnnotationsChangeTracker.Recompile> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker[SimpleFunctionDescriptorImpl]

'context' @ [39:45] ==> value-parameter context: DependencyContext defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.methodAnnotationsChanged[ValueParameterDescriptorImpl]

'method' @ [39:54] ==> value-parameter method: MethodRepr defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.methodAnnotationsChanged[ValueParameterDescriptorImpl]

'changedAnnotations' @ [39:62] ==> val changedAnnotations: Sequence<TypeRepr.ClassType> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.methodAnnotationsChanged[LocalVariableDescriptor]

'handleNullAnnotationsChanges' @ [48:16] ==> private final fun handleNullAnnotationsChanges(context: NamingContext, protoMember: ProtoMember, annotations: Sequence<TypeRepr.ClassType>): Set<AnnotationsChangeTracker.Recompile> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker[SimpleFunctionDescriptorImpl]

'context' @ [48:45] ==> value-parameter context: NamingContext defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.fieldAnnotationsChanged[ValueParameterDescriptorImpl]

'field' @ [48:54] ==> value-parameter field: FieldRepr defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.fieldAnnotationsChanged[ValueParameterDescriptorImpl]

'annotationsDiff' @ [48:61] ==> value-parameter annotationsDiff: Difference.Specifier<TypeRepr.ClassType, Difference> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.fieldAnnotationsChanged[ValueParameterDescriptorImpl]

'addedOrRemoved' @ [48:77] ==> private final fun <T> Difference.Specifier<TypeRepr.ClassType, Difference>.addedOrRemoved(): Sequence<TypeRepr.ClassType> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassType

'TIntHashSet' @ [52:38] ==> public constructor TIntHashSet(p0: (IntArray..IntArray?)) defined in gnu.trove.TIntHashSet[JavaClassConstructorDescriptor]

'this' @ [52:50] ==> <this> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker[LazyClassReceiverParameterDescriptor]

'annotations' @ [52:55] ==> private final val annotations: Array<String> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker[PropertyDescriptorImpl]

'toIntArray' @ [52:67] ==> private final inline fun <T> Array<String>.toIntArray(fn: (String) -> Int): IntArray defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'context' @ [52:80] ==> value-parameter context: NamingContext defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges[ValueParameterDescriptorImpl]

'get' @ [52:88] ==> public abstract operator fun get(p0: (String..String?)): Int defined in org.jetbrains.jps.builders.java.dependencyView.NamingContext[JavaMethodDescriptor]

'it' @ [52:92] ==> value-parameter it: String defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [53:37] ==> value-parameter annotations: Sequence<TypeRepr.ClassType> defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges[ValueParameterDescriptorImpl]

'firstOrNull' @ [53:49] ==> public inline fun <T> Sequence<TypeRepr.ClassType>.firstOrNull(predicate: (TypeRepr.ClassType) -> Boolean): TypeRepr.ClassType? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassType

'nullabilityAnnotations' @ [53:63] ==> val nullabilityAnnotations: TIntHashSet defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges[LocalVariableDescriptor]

'contains' @ [53:86] ==> public open fun contains(p0: Int): Boolean defined in gnu.trove.TIntHashSet[JavaMethodDescriptor]

'it' @ [53:95] ==> value-parameter it: TypeRepr.ClassType defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges.<anonymous>[ValueParameterDescriptorImpl]

'className' @ [53:98] ==> public final val className: Int defined in org.jetbrains.jps.builders.java.dependencyView.TypeRepr.ClassType[JavaPropertyDescriptor]

'noneOf' @ [55:30] ==> public open fun <E : (Enum<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>..Enum<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>?)> noneOf(p0: (Class<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>..Class<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>?)): (EnumSet<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>..EnumSet<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>?) defined in java.util.EnumSet[JavaMethodDescriptor]
Inferred types:
    <E : (Enum<(E..E?)>..Enum<(E..E?)>?)> -> Recompile

'Recompile' @ [55:37] ==> private constructor Recompile() defined in org.jetbrains.jps.builders.java.dependencyView.AnnotationsChangeTracker.Recompile[JavaClassConstructorDescriptor]

'java' @ [55:54] ==> public val <T> KClass<AnnotationsChangeTracker.Recompile>.java: Class<AnnotationsChangeTracker.Recompile> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Recompile

'changedNullAnnotation' @ [56:13] ==> val changedNullAnnotation: TypeRepr.ClassType? defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges[LocalVariableDescriptor]

'result' @ [57:13] ==> val result: (EnumSet<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>..EnumSet<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>?) defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges[LocalVariableDescriptor]

'add' @ [57:20] ==> public open fun add(element: (AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)): Boolean defined in java.util.EnumSet[JavaMethodDescriptor]

'USAGES' @ [57:34] ==> enum entry USAGES defined in org.jetbrains.jps.builders.java.dependencyView.AnnotationsChangeTracker.Recompile[FakeCallableDescriptorForObject]

'protoMember' @ [59:17] ==> value-parameter protoMember: ProtoMember defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges[ValueParameterDescriptorImpl]

'!' @ [59:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'protoMember' @ [59:47] ==> value-parameter protoMember: ProtoMember defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges[ValueParameterDescriptorImpl]

'isFinal' @ [59:59] ==> public final val MethodRepr.isFinal: Boolean[MyPropertyDescriptor]

'result' @ [61:17] ==> val result: (EnumSet<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>..EnumSet<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>?) defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges[LocalVariableDescriptor]

'add' @ [61:24] ==> public open fun add(element: (AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)): Boolean defined in java.util.EnumSet[JavaMethodDescriptor]

'SUBCLASSES' @ [61:38] ==> enum entry SUBCLASSES defined in org.jetbrains.jps.builders.java.dependencyView.AnnotationsChangeTracker.Recompile[FakeCallableDescriptorForObject]

'result' @ [65:16] ==> val result: (EnumSet<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>..EnumSet<(AnnotationsChangeTracker.Recompile..AnnotationsChangeTracker.Recompile?)>?) defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.handleNullAnnotationsChanges[LocalVariableDescriptor]

'added' @ [69:13] ==> public abstract fun added(): (MutableCollection<(T..T?)>..Collection<(T..T?)>?) defined in org.jetbrains.jps.builders.java.dependencyView.Difference.Specifier[JavaMethodDescriptor]

'asSequence' @ [69:21] ==> public fun <T> Iterable<(T..T?)>.asSequence(): Sequence<(T..T?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'removed' @ [69:36] ==> public abstract fun removed(): (MutableCollection<(T..T?)>..Collection<(T..T?)>?) defined in org.jetbrains.jps.builders.java.dependencyView.Difference.Specifier[JavaMethodDescriptor]

'asSequence' @ [69:46] ==> public fun <T> Iterable<(T..T?)>.asSequence(): Sequence<(T..T?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'IntArray' @ [72:13] ==> public constructor IntArray(size: Int, init: (Int) -> Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'size' @ [72:22] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'invoke' @ [72:35] ==> public abstract operator fun invoke(p1: T): Int defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [72:38] ==> public final operator fun get(index: Int): T defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'i' @ [72:42] ==> value-parameter i: Int defined in org.jetbrains.jps.builders.java.dependencyView.NullabilityAnnotationsTracker.toIntArray.<anonymous>[ValueParameterDescriptorImpl]

