'c' @ [42:31] ==> value-parameter c: VariableFixationFinder.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findFirstVariableForFixation[ValueParameterDescriptorImpl]

'findTypeVariableForFixation' @ [42:33] ==> private final fun VariableFixationFinder.Context.findTypeVariableForFixation(allTypeVariables: List<TypeConstructor>, postponedKtPrimitives: List<PostponedResolvedAtom>, completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode, topLevelType: UnwrappedType): VariableFixationFinder.VariableForFixation? defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder[SimpleFunctionDescriptorImpl]

'allTypeVariables' @ [42:61] ==> value-parameter allTypeVariables: List<TypeConstructor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findFirstVariableForFixation[ValueParameterDescriptorImpl]

'postponedKtPrimitives' @ [42:79] ==> value-parameter postponedKtPrimitives: List<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findFirstVariableForFixation[ValueParameterDescriptorImpl]

'completionMode' @ [42:102] ==> value-parameter completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findFirstVariableForFixation[ValueParameterDescriptorImpl]

'topLevelType' @ [42:118] ==> value-parameter topLevelType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findFirstVariableForFixation[ValueParameterDescriptorImpl]

'when {
        !notFixedTypeVariables.contains(variable) ||
        dependencyProvider.isVariableRelatedToTopLevelType(variable) -> TypeVariableFixationReadiness.FORBIDDEN
        !variableHasProperArgumentConstraints(variable) -> TypeVariableFixationReadiness.WITHOUT_PROPER_ARGUMENT_CONSTRAINT
        dependencyProvider.isVariableRelatedToAnyOutputType(variable) -> TypeVariableFixationReadiness.RELATED_TO_ANY_OUTPUT_TYPE
        hasDependencyToOtherTypeVariables(variable) -> TypeVariableFixationReadiness.WITH_COMPLEX_DEPENDENCY
        else -> TypeVariableFixationReadiness.READY_FOR_FIXATION
    }' @ [55:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VariableFixationFinder.TypeVariableFixationReadiness, entry1: VariableFixationFinder.TypeVariableFixationReadiness, entry2: VariableFixationFinder.TypeVariableFixationReadiness, entry3: VariableFixationFinder.TypeVariableFixationReadiness, entry4: VariableFixationFinder.TypeVariableFixationReadiness): VariableFixationFinder.TypeVariableFixationReadiness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeVariableFixationReadiness

'!' @ [56:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'notFixedTypeVariables' @ [56:10] ==> public abstract val notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.Context[PropertyDescriptorImpl]

'contains' @ [56:32] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out TypeConstructor, VariableWithConstraints>.contains(key: TypeConstructor): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> TypeConstructor
    <V> -> VariableWithConstraints

'variable' @ [56:41] ==> value-parameter variable: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.getTypeVariableReadiness[ValueParameterDescriptorImpl]

'dependencyProvider' @ [57:9] ==> value-parameter dependencyProvider: TypeVariableDependencyInformationProvider defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.getTypeVariableReadiness[ValueParameterDescriptorImpl]

'isVariableRelatedToTopLevelType' @ [57:28] ==> public final fun isVariableRelatedToTopLevelType(variable: TypeConstructor): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeVariableDependencyInformationProvider[SimpleFunctionDescriptorImpl]

'variable' @ [57:60] ==> value-parameter variable: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.getTypeVariableReadiness[ValueParameterDescriptorImpl]

'FORBIDDEN' @ [57:103] ==> enum entry FORBIDDEN defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.TypeVariableFixationReadiness[FakeCallableDescriptorForObject]

'!' @ [58:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'variableHasProperArgumentConstraints' @ [58:10] ==> private final fun VariableFixationFinder.Context.variableHasProperArgumentConstraints(variable: TypeConstructor): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder[SimpleFunctionDescriptorImpl]

'variable' @ [58:47] ==> value-parameter variable: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.getTypeVariableReadiness[ValueParameterDescriptorImpl]

'WITHOUT_PROPER_ARGUMENT_CONSTRAINT' @ [58:90] ==> enum entry WITHOUT_PROPER_ARGUMENT_CONSTRAINT defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.TypeVariableFixationReadiness[FakeCallableDescriptorForObject]

'dependencyProvider' @ [59:9] ==> value-parameter dependencyProvider: TypeVariableDependencyInformationProvider defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.getTypeVariableReadiness[ValueParameterDescriptorImpl]

'isVariableRelatedToAnyOutputType' @ [59:28] ==> public final fun isVariableRelatedToAnyOutputType(variable: TypeConstructor): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeVariableDependencyInformationProvider[SimpleFunctionDescriptorImpl]

'variable' @ [59:61] ==> value-parameter variable: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.getTypeVariableReadiness[ValueParameterDescriptorImpl]

'RELATED_TO_ANY_OUTPUT_TYPE' @ [59:104] ==> enum entry RELATED_TO_ANY_OUTPUT_TYPE defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.TypeVariableFixationReadiness[FakeCallableDescriptorForObject]

'hasDependencyToOtherTypeVariables' @ [60:9] ==> private final fun VariableFixationFinder.Context.hasDependencyToOtherTypeVariables(typeVariable: TypeConstructor): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder[SimpleFunctionDescriptorImpl]

'variable' @ [60:43] ==> value-parameter variable: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.getTypeVariableReadiness[ValueParameterDescriptorImpl]

'WITH_COMPLEX_DEPENDENCY' @ [60:86] ==> enum entry WITH_COMPLEX_DEPENDENCY defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.TypeVariableFixationReadiness[FakeCallableDescriptorForObject]

'READY_FOR_FIXATION' @ [61:47] ==> enum entry READY_FOR_FIXATION defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.TypeVariableFixationReadiness[FakeCallableDescriptorForObject]

'TypeVariableDependencyInformationProvider' @ [70:34] ==> public constructor TypeVariableDependencyInformationProvider(notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints>, postponedKtPrimitives: List<PostponedResolvedAtom>, topLevelType: UnwrappedType?) defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeVariableDependencyInformationProvider[ClassConstructorDescriptorImpl]

'notFixedTypeVariables' @ [70:76] ==> public abstract val notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.Context[PropertyDescriptorImpl]

'postponedKtPrimitives' @ [70:99] ==> value-parameter postponedKtPrimitives: List<PostponedResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation[ValueParameterDescriptorImpl]

'topLevelType' @ [71:76] ==> value-parameter topLevelType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation[ValueParameterDescriptorImpl]

'takeIf' @ [71:89] ==> @InlineOnly @SinceKotlin public inline fun <T> UnwrappedType.takeIf(predicate: (UnwrappedType) -> Boolean): UnwrappedType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'completionMode' @ [71:98] ==> value-parameter completionMode: KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation[ValueParameterDescriptorImpl]

'PARTIAL' @ [71:116] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.ConstraintSystemCompletionMode[FakeCallableDescriptorForObject]

'allTypeVariables' @ [73:25] ==> value-parameter allTypeVariables: List<TypeConstructor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation[ValueParameterDescriptorImpl]

'maxBy' @ [73:42] ==> public inline fun <T, R : Comparable<VariableFixationFinder.TypeVariableFixationReadiness>> Iterable<TypeConstructor>.maxBy(selector: (TypeConstructor) -> VariableFixationFinder.TypeVariableFixationReadiness): TypeConstructor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor
    <R : Comparable<R>> -> TypeVariableFixationReadiness

'getTypeVariableReadiness' @ [73:50] ==> private final fun VariableFixationFinder.Context.getTypeVariableReadiness(variable: TypeConstructor, dependencyProvider: TypeVariableDependencyInformationProvider): VariableFixationFinder.TypeVariableFixationReadiness defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder[SimpleFunctionDescriptorImpl]

'it' @ [73:75] ==> value-parameter it: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation.<anonymous>[ValueParameterDescriptorImpl]

'dependencyProvider' @ [73:79] ==> val dependencyProvider: TypeVariableDependencyInformationProvider defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation[LocalVariableDescriptor]

'getTypeVariableReadiness' @ [74:34] ==> private final fun VariableFixationFinder.Context.getTypeVariableReadiness(variable: TypeConstructor, dependencyProvider: TypeVariableDependencyInformationProvider): VariableFixationFinder.TypeVariableFixationReadiness defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder[SimpleFunctionDescriptorImpl]

'candidate' @ [74:59] ==> val candidate: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation[LocalVariableDescriptor]

'dependencyProvider' @ [74:70] ==> val dependencyProvider: TypeVariableDependencyInformationProvider defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation[LocalVariableDescriptor]

'when (candidateReadiness) {
            TypeVariableFixationReadiness.FORBIDDEN -> null
            TypeVariableFixationReadiness.WITHOUT_PROPER_ARGUMENT_CONSTRAINT -> VariableForFixation(candidate, false)
            else -> VariableForFixation(candidate, true)
        }' @ [75:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VariableFixationFinder.VariableForFixation?, entry1: VariableFixationFinder.VariableForFixation?, entry2: VariableFixationFinder.VariableForFixation?): VariableFixationFinder.VariableForFixation?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> VariableForFixation?

'candidateReadiness' @ [75:22] ==> val candidateReadiness: VariableFixationFinder.TypeVariableFixationReadiness defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation[LocalVariableDescriptor]

'FORBIDDEN' @ [76:43] ==> enum entry FORBIDDEN defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.TypeVariableFixationReadiness[FakeCallableDescriptorForObject]

'WITHOUT_PROPER_ARGUMENT_CONSTRAINT' @ [77:43] ==> enum entry WITHOUT_PROPER_ARGUMENT_CONSTRAINT defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.TypeVariableFixationReadiness[FakeCallableDescriptorForObject]

'VariableForFixation' @ [77:81] ==> public constructor VariableForFixation(variable: TypeConstructor, hasProperConstraint: Boolean) defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.VariableForFixation[ClassConstructorDescriptorImpl]

'candidate' @ [77:101] ==> val candidate: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation[LocalVariableDescriptor]

'VariableForFixation' @ [78:21] ==> public constructor VariableForFixation(variable: TypeConstructor, hasProperConstraint: Boolean) defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.VariableForFixation[ClassConstructorDescriptorImpl]

'candidate' @ [78:41] ==> val candidate: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.findTypeVariableForFixation[LocalVariableDescriptor]

'notFixedTypeVariables' @ [83:28] ==> public abstract val notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.Context[PropertyDescriptorImpl]

'typeVariable' @ [83:50] ==> value-parameter typeVariable: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.hasDependencyToOtherTypeVariables[ValueParameterDescriptorImpl]

'constraints' @ [83:65] ==> public abstract val constraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.VariableWithConstraints[PropertyDescriptorImpl]

'constraint' @ [84:17] ==> val constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.hasDependencyToOtherTypeVariables[LocalVariableDescriptor]

'type' @ [84:28] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'arguments' @ [84:33] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'isNotEmpty' @ [84:43] ==> @InlineOnly public inline fun <T> Collection<TypeProjection>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'constraint' @ [84:59] ==> val constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.hasDependencyToOtherTypeVariables[LocalVariableDescriptor]

'type' @ [84:70] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'contains' @ [84:75] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'notFixedTypeVariables' @ [84:86] ==> public abstract val notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.Context[PropertyDescriptorImpl]

'containsKey' @ [84:108] ==> public abstract fun containsKey(key: TypeConstructor): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'it' @ [84:120] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.hasDependencyToOtherTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [84:123] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'notFixedTypeVariables' @ [92:13] ==> public abstract val notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.Context[PropertyDescriptorImpl]

'variable' @ [92:35] ==> value-parameter variable: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.variableHasProperArgumentConstraints[ValueParameterDescriptorImpl]

'constraints' @ [92:46] ==> public abstract val constraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.VariableWithConstraints[PropertyDescriptorImpl]

'any' @ [92:59] ==> public inline fun <T> Iterable<Constraint>.any(predicate: (Constraint) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'isProperArgumentConstraint' @ [92:65] ==> private final fun VariableFixationFinder.Context.isProperArgumentConstraint(c: Constraint): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder[SimpleFunctionDescriptorImpl]

'it' @ [92:92] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.variableHasProperArgumentConstraints.<anonymous>[ValueParameterDescriptorImpl]

'isProperType' @ [95:13] ==> private final fun VariableFixationFinder.Context.isProperType(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder[SimpleFunctionDescriptorImpl]

'c' @ [95:26] ==> value-parameter c: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.isProperArgumentConstraint[ValueParameterDescriptorImpl]

'type' @ [95:28] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'c' @ [95:37] ==> value-parameter c: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.isProperArgumentConstraint[ValueParameterDescriptorImpl]

'position' @ [95:39] ==> public final val position: IncorporationConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'initialConstraint' @ [95:48] ==> public final val initialConstraint: InitialConstraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.IncorporationConstraintPosition[PropertyDescriptorImpl]

'position' @ [95:66] ==> public final val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.model.InitialConstraint[PropertyDescriptorImpl]

'!' @ [98:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [98:14] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.isProperType[ValueParameterDescriptorImpl]

'contains' @ [98:19] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'notFixedTypeVariables' @ [98:30] ==> public abstract val notFixedTypeVariables: Map<TypeConstructor, VariableWithConstraints> defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.Context[PropertyDescriptorImpl]

'containsKey' @ [98:52] ==> public abstract fun containsKey(key: TypeConstructor): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'it' @ [98:64] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.VariableFixationFinder.isProperType.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [98:67] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

