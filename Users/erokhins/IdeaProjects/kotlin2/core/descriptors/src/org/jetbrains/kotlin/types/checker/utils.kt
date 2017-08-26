'TypeCheckerProcedureCallbacksImpl' @ [30:74] ==> public/*package*/ constructor TypeCheckerProcedureCallbacksImpl() defined in org.jetbrains.kotlin.types.checker.TypeCheckerProcedureCallbacksImpl[JavaClassConstructorDescriptor]

'ArrayDeque' @ [32:17] ==> public constructor ArrayDeque<E : (Any..Any?)>() defined in java.util.ArrayDeque[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SubtypePathNode

'queue' @ [33:5] ==> val queue: ArrayDeque<SubtypePathNode> defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'add' @ [33:11] ==> public open fun add(element: (SubtypePathNode..SubtypePathNode?)): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'SubtypePathNode' @ [33:15] ==> public constructor SubtypePathNode(type: KotlinType, previous: SubtypePathNode?) defined in org.jetbrains.kotlin.types.checker.SubtypePathNode[ClassConstructorDescriptorImpl]

'subtype' @ [33:31] ==> value-parameter subtype: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[ValueParameterDescriptorImpl]

'supertype' @ [35:32] ==> value-parameter supertype: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[ValueParameterDescriptorImpl]

'constructor' @ [35:42] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'!' @ [37:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'queue' @ [37:13] ==> val queue: ArrayDeque<SubtypePathNode> defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'isEmpty' @ [37:19] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'queue' @ [38:28] ==> val queue: ArrayDeque<SubtypePathNode> defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'poll' @ [38:34] ==> public open fun poll(): (SubtypePathNode..SubtypePathNode?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'lastPathNode' @ [39:30] ==> val lastPathNode: (SubtypePathNode..SubtypePathNode?) defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'type' @ [39:43] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.checker.SubtypePathNode[PropertyDescriptorImpl]

'currentSubtype' @ [40:27] ==> val currentSubtype: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'constructor' @ [40:42] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'typeCheckingProcedureCallbacks' @ [42:13] ==> value-parameter typeCheckingProcedureCallbacks: TypeCheckingProcedureCallbacks = ... defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[ValueParameterDescriptorImpl]

'assertEqualTypeConstructors' @ [42:44] ==> public abstract fun assertEqualTypeConstructors(@NotNull a: TypeConstructor, @NotNull b: TypeConstructor): Boolean defined in org.jetbrains.kotlin.types.checker.TypeCheckingProcedureCallbacks[JavaMethodDescriptor]

'constructor' @ [42:72] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'supertypeConstructor' @ [42:85] ==> val supertypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'currentSubtype' @ [43:31] ==> val currentSubtype: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'currentSubtype' @ [44:39] ==> val currentSubtype: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'isMarkedNullable' @ [44:54] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'lastPathNode' @ [46:35] ==> val lastPathNode: (SubtypePathNode..SubtypePathNode?) defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'previous' @ [46:48] ==> public final val previous: SubtypePathNode? defined in org.jetbrains.kotlin.types.checker.SubtypePathNode[PropertyDescriptorImpl]

'currentPathNode' @ [48:20] ==> var currentPathNode: SubtypePathNode? defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'currentPathNode' @ [49:35] ==> var currentPathNode: SubtypePathNode? defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'type' @ [49:51] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.checker.SubtypePathNode[PropertyDescriptorImpl]

'substituted' @ [50:17] ==> var substituted: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'if (currentType.arguments.any { it.projectionKind != Variance.INVARIANT }) {
                    TypeConstructorSubstitution.create(currentType)
                            .wrapWithCapturingSubstitution().buildSubstitutor()
                            .safeSubstitute(substituted, Variance.INVARIANT)
                            .approximate()
                }
                else {
                    TypeConstructorSubstitution.create(currentType)
                            .buildSubstitutor()
                            .safeSubstitute(substituted, Variance.INVARIANT)
                }' @ [50:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'currentType' @ [50:35] ==> val currentType: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'arguments' @ [50:47] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'any' @ [50:57] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [50:63] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [50:66] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [50:93] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeConstructorSubstitution' @ [51:21] ==> public companion object defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[FakeCallableDescriptorForObject]

'create' @ [51:49] ==> @JvmStatic public final fun create(kotlinType: KotlinType): TypeSubstitution defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution.Companion[SimpleFunctionDescriptorImpl]

'currentType' @ [51:56] ==> val currentType: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'wrapWithCapturingSubstitution' @ [52:30] ==> public fun TypeSubstitution.wrapWithCapturingSubstitution(needApproximation: Boolean = ...): TypeSubstitution defined in org.jetbrains.kotlin.resolve.calls.inference in file CapturedTypeConstructor.kt[SimpleFunctionDescriptorImpl]

'buildSubstitutor' @ [52:62] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitution[SimpleFunctionDescriptorImpl]

'safeSubstitute' @ [53:30] ==> @NotNull public open fun safeSubstitute(@NotNull type: KotlinType, @NotNull howThisTypeIsUsed: Variance): KotlinType defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'substituted' @ [53:45] ==> var substituted: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'INVARIANT' @ [53:67] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'approximate' @ [54:30] ==> private fun KotlinType.approximate(): KotlinType defined in org.jetbrains.kotlin.types.checker[SimpleFunctionDescriptorImpl]

'TypeConstructorSubstitution' @ [57:21] ==> public companion object defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[FakeCallableDescriptorForObject]

'create' @ [57:49] ==> @JvmStatic public final fun create(kotlinType: KotlinType): TypeSubstitution defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution.Companion[SimpleFunctionDescriptorImpl]

'currentType' @ [57:56] ==> val currentType: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'buildSubstitutor' @ [58:30] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitution[SimpleFunctionDescriptorImpl]

'safeSubstitute' @ [59:30] ==> @NotNull public open fun safeSubstitute(@NotNull type: KotlinType, @NotNull howThisTypeIsUsed: Variance): KotlinType defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'substituted' @ [59:45] ==> var substituted: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'INVARIANT' @ [59:67] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'isAnyMarkedNullable' @ [62:17] ==> var isAnyMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'isAnyMarkedNullable' @ [62:39] ==> var isAnyMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'currentType' @ [62:62] ==> val currentType: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'isMarkedNullable' @ [62:74] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'currentPathNode' @ [64:17] ==> var currentPathNode: SubtypePathNode? defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'currentPathNode' @ [64:35] ==> var currentPathNode: SubtypePathNode? defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'previous' @ [64:51] ==> public final val previous: SubtypePathNode? defined in org.jetbrains.kotlin.types.checker.SubtypePathNode[PropertyDescriptorImpl]

'substituted' @ [67:42] ==> var substituted: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'constructor' @ [67:54] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'!' @ [68:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeCheckingProcedureCallbacks' @ [68:18] ==> value-parameter typeCheckingProcedureCallbacks: TypeCheckingProcedureCallbacks = ... defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[ValueParameterDescriptorImpl]

'assertEqualTypeConstructors' @ [68:49] ==> public abstract fun assertEqualTypeConstructors(@NotNull a: TypeConstructor, @NotNull b: TypeConstructor): Boolean defined in org.jetbrains.kotlin.types.checker.TypeCheckingProcedureCallbacks[JavaMethodDescriptor]

'substitutedConstructor' @ [68:77] ==> val substitutedConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'supertypeConstructor' @ [68:101] ==> val supertypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'AssertionError' @ [69:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [69:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'substitutedConstructor' @ [70:63] ==> val substitutedConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'debugInfo' @ [70:86] ==> private fun TypeConstructor.debugInfo(): String defined in org.jetbrains.kotlin.types.checker[SimpleFunctionDescriptorImpl]

'supertypeConstructor' @ [71:52] ==> val supertypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'debugInfo' @ [71:73] ==> private fun TypeConstructor.debugInfo(): String defined in org.jetbrains.kotlin.types.checker[SimpleFunctionDescriptorImpl]

'typeCheckingProcedureCallbacks' @ [72:38] ==> value-parameter typeCheckingProcedureCallbacks: TypeCheckingProcedureCallbacks = ... defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[ValueParameterDescriptorImpl]

'assertEqualTypeConstructors' @ [72:69] ==> public abstract fun assertEqualTypeConstructors(@NotNull a: TypeConstructor, @NotNull b: TypeConstructor): Boolean defined in org.jetbrains.kotlin.types.checker.TypeCheckingProcedureCallbacks[JavaMethodDescriptor]

'substitutedConstructor' @ [72:97] ==> val substitutedConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'supertypeConstructor' @ [72:121] ==> val supertypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [75:30] ==> @NotNull public open fun makeNullableAsSpecified(@NotNull type: KotlinType, nullable: Boolean): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'substituted' @ [75:54] ==> var substituted: KotlinType defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'isAnyMarkedNullable' @ [75:67] ==> var isAnyMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'constructor' @ [78:36] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'supertypes' @ [78:48] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'queue' @ [79:13] ==> val queue: ArrayDeque<SubtypePathNode> defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'add' @ [79:19] ==> public open fun add(element: (SubtypePathNode..SubtypePathNode?)): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'SubtypePathNode' @ [79:23] ==> public constructor SubtypePathNode(type: KotlinType, previous: SubtypePathNode?) defined in org.jetbrains.kotlin.types.checker.SubtypePathNode[ClassConstructorDescriptorImpl]

'immediateSupertype' @ [79:39] ==> val immediateSupertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'lastPathNode' @ [79:59] ==> val lastPathNode: (SubtypePathNode..SubtypePathNode?) defined in org.jetbrains.kotlin.types.checker.findCorrespondingSupertype[LocalVariableDescriptor]

'approximateCapturedTypes' @ [86:40] ==> public fun approximateCapturedTypes(type: KotlinType): ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'this' @ [86:65] ==> <this> defined in org.jetbrains.kotlin.types.checker.approximate[ReceiverParameterDescriptorImpl]

'upper' @ [86:71] ==> public final val upper: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[PropertyDescriptorImpl]

'buildString' @ [88:43] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [89:39] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [89:48] ==> <this> defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>.unaryPlus[ReceiverParameterDescriptorImpl]

'+' @ [91:5] ==> local final operator fun String.unaryPlus(): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>[SimpleFunctionDescriptorImpl]

'this@debugInfo' @ [91:16] ==> <this> defined in org.jetbrains.kotlin.types.checker.debugInfo[ReceiverParameterDescriptorImpl]

'+' @ [92:5] ==> local final operator fun String.unaryPlus(): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>[SimpleFunctionDescriptorImpl]

'this@debugInfo' @ [92:20] ==> <this> defined in org.jetbrains.kotlin.types.checker.debugInfo[ReceiverParameterDescriptorImpl]

'hashCode' @ [92:35] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.types.TypeConstructor[DeserializedSimpleFunctionDescriptor]

'+' @ [93:5] ==> local final operator fun String.unaryPlus(): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>[SimpleFunctionDescriptorImpl]

'this@debugInfo' @ [93:21] ==> <this> defined in org.jetbrains.kotlin.types.checker.debugInfo[ReceiverParameterDescriptorImpl]

'java' @ [93:43] ==> public val <T> KClass<out TypeConstructor>.java: Class<out TypeConstructor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TypeConstructor

'canonicalName' @ [93:48] ==> public final val <T : (Any..Any?)> Class<out TypeConstructor>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TypeConstructor

'declarationDescriptor' @ [94:57] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'declarationDescriptor' @ [95:12] ==> var declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>[LocalVariableDescriptor]

'+' @ [97:9] ==> local final operator fun String.unaryPlus(): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>[SimpleFunctionDescriptorImpl]

'DescriptorRenderer' @ [97:22] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [97:41] ==> @JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[PropertyDescriptorImpl]

'render' @ [97:59] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [97:66] ==> var declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>[LocalVariableDescriptor]

'+' @ [98:9] ==> local final operator fun String.unaryPlus(): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [98:25] ==> var declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>[LocalVariableDescriptor]

'java' @ [98:54] ==> public val <T> KClass<out DeclarationDescriptor>.java: Class<out DeclarationDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'canonicalName' @ [98:59] ==> public final val <T : (Any..Any?)> Class<out DeclarationDescriptor>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DeclarationDescriptor

'declarationDescriptor' @ [100:9] ==> var declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>[LocalVariableDescriptor]

'declarationDescriptor' @ [100:33] ==> var declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.types.checker.debugInfo.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [100:55] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

