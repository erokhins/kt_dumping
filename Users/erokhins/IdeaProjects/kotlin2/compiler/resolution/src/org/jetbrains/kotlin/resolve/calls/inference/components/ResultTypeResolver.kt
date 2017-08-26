'findResultTypeOrNull' @ [37:9] ==> public final fun findResultTypeOrNull(c: ResultTypeResolver.Context, variableWithConstraints: VariableWithConstraints, direction: TypeVariableDirectionCalculator.ResolveDirection): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [37:30] ==> value-parameter c: ResultTypeResolver.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultType[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [37:33] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultType[ValueParameterDescriptorImpl]

'direction' @ [37:58] ==> value-parameter direction: TypeVariableDirectionCalculator.ResolveDirection defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultType[ValueParameterDescriptorImpl]

'let' @ [37:70] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> Nothing

'it' @ [37:83] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultType.<anonymous>[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [40:16] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultType[ValueParameterDescriptorImpl]

'typeVariable' @ [40:40] ==> public abstract val typeVariable: NewTypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.model.VariableWithConstraints[PropertyDescriptorImpl]

'freshTypeConstructor' @ [40:53] ==> public final val freshTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewTypeVariable[PropertyDescriptorImpl]

'builtIns' @ [40:74] ==> public final val TypeConstructor.builtIns: KotlinBuiltIns[MyPropertyDescriptor]

'run' @ [40:83] ==> @InlineOnly public inline fun <T, R> KotlinBuiltIns.run(block: (KotlinBuiltIns).() -> SimpleType): SimpleType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinBuiltIns
    <R> -> SimpleType

'if (direction == ResolveDirection.TO_SUBTYPE) nothingType else nullableAnyType' @ [41:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'direction' @ [41:17] ==> value-parameter direction: TypeVariableDirectionCalculator.ResolveDirection defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultType[ValueParameterDescriptorImpl]

'TO_SUBTYPE' @ [41:47] ==> enum entry TO_SUBTYPE defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeVariableDirectionCalculator.ResolveDirection[FakeCallableDescriptorForObject]

'nothingType' @ [41:59] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'nullableAnyType' @ [41:76] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'findResultIfThereIsEqualsConstraint' @ [46:9] ==> public final fun findResultIfThereIsEqualsConstraint(c: ResultTypeResolver.Context, variableWithConstraints: VariableWithConstraints, allowedFixToNotProperType: Boolean = ...): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [46:45] ==> value-parameter c: ResultTypeResolver.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [46:48] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'let' @ [46:109] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> Nothing

'it' @ [46:122] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull.<anonymous>[ValueParameterDescriptorImpl]

'findSubType' @ [48:23] ==> private final fun findSubType(c: ResultTypeResolver.Context, variableWithConstraints: VariableWithConstraints): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [48:35] ==> value-parameter c: ResultTypeResolver.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [48:38] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'findSuperType' @ [49:25] ==> private final fun findSuperType(c: ResultTypeResolver.Context, variableWithConstraints: VariableWithConstraints): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [49:39] ==> value-parameter c: ResultTypeResolver.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [49:42] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'if (direction == ResolveDirection.TO_SUBTYPE || direction == ResolveDirection.UNKNOWN) {
            c.resultType(subType, superType, variableWithConstraints)
        }
        else {
            c.resultType(superType, subType, variableWithConstraints)
        }' @ [50:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType?, elseBranch: UnwrappedType?): UnwrappedType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType?

'direction' @ [50:26] ==> value-parameter direction: TypeVariableDirectionCalculator.ResolveDirection defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'TO_SUBTYPE' @ [50:56] ==> enum entry TO_SUBTYPE defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeVariableDirectionCalculator.ResolveDirection[FakeCallableDescriptorForObject]

'direction' @ [50:70] ==> value-parameter direction: TypeVariableDirectionCalculator.ResolveDirection defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'UNKNOWN' @ [50:100] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeVariableDirectionCalculator.ResolveDirection[FakeCallableDescriptorForObject]

'c' @ [51:13] ==> value-parameter c: ResultTypeResolver.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'resultType' @ [51:15] ==> private final fun ResultTypeResolver.Context.resultType(firstCandidate: UnwrappedType?, secondCandidate: UnwrappedType?, variableWithConstraints: VariableWithConstraints): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'subType' @ [51:26] ==> val subType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[LocalVariableDescriptor]

'superType' @ [51:35] ==> val superType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[LocalVariableDescriptor]

'variableWithConstraints' @ [51:46] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'c' @ [54:13] ==> value-parameter c: ResultTypeResolver.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'resultType' @ [54:15] ==> private final fun ResultTypeResolver.Context.resultType(firstCandidate: UnwrappedType?, secondCandidate: UnwrappedType?, variableWithConstraints: VariableWithConstraints): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'superType' @ [54:26] ==> val superType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[LocalVariableDescriptor]

'subType' @ [54:37] ==> val subType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[LocalVariableDescriptor]

'variableWithConstraints' @ [54:46] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[ValueParameterDescriptorImpl]

'result' @ [57:16] ==> val result: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultTypeOrNull[LocalVariableDescriptor]

'firstCandidate' @ [65:13] ==> value-parameter firstCandidate: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'secondCandidate' @ [65:39] ==> value-parameter secondCandidate: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'firstCandidate' @ [65:71] ==> value-parameter firstCandidate: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'secondCandidate' @ [65:89] ==> value-parameter secondCandidate: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'isSuitableType' @ [67:13] ==> private final fun ResultTypeResolver.Context.isSuitableType(resultType: UnwrappedType, variableWithConstraints: VariableWithConstraints): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'firstCandidate' @ [67:28] ==> value-parameter firstCandidate: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [67:44] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'firstCandidate' @ [67:77] ==> value-parameter firstCandidate: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'if (isSuitableType(secondCandidate, variableWithConstraints)) {
            return secondCandidate
        }
        else {
            return firstCandidate
        }' @ [69:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'isSuitableType' @ [69:13] ==> private final fun ResultTypeResolver.Context.isSuitableType(resultType: UnwrappedType, variableWithConstraints: VariableWithConstraints): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'secondCandidate' @ [69:28] ==> value-parameter secondCandidate: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [69:45] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'secondCandidate' @ [70:20] ==> value-parameter secondCandidate: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'firstCandidate' @ [73:20] ==> value-parameter firstCandidate: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.resultType[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [78:28] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.isSuitableType[ValueParameterDescriptorImpl]

'constraints' @ [78:52] ==> public abstract val constraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.VariableWithConstraints[PropertyDescriptorImpl]

'!' @ [79:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isProperType' @ [79:18] ==> public abstract fun isProperType(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.Context[SimpleFunctionDescriptorImpl]

'constraint' @ [79:31] ==> val constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.isSuitableType[LocalVariableDescriptor]

'type' @ [79:42] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'!' @ [80:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkConstraint' @ [80:18] ==> public fun checkConstraint(constraintType: UnwrappedType, constraintKind: ConstraintKind, resultType: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.model in file ConstraintStorage.kt[SimpleFunctionDescriptorImpl]

'constraint' @ [80:34] ==> val constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.isSuitableType[LocalVariableDescriptor]

'type' @ [80:45] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'constraint' @ [80:51] ==> val constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.isSuitableType[LocalVariableDescriptor]

'kind' @ [80:62] ==> public final val kind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'resultType' @ [80:68] ==> value-parameter resultType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.isSuitableType[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [86:32] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSubType[ValueParameterDescriptorImpl]

'constraints' @ [86:56] ==> public abstract val constraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.VariableWithConstraints[PropertyDescriptorImpl]

'filter' @ [86:68] ==> public inline fun <T> Iterable<Constraint>.filter(predicate: (Constraint) -> Boolean): List<Constraint> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'it' @ [86:77] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSubType.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [86:80] ==> public final val kind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'LOWER' @ [86:103] ==> enum entry LOWER defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'c' @ [86:112] ==> value-parameter c: ResultTypeResolver.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSubType[ValueParameterDescriptorImpl]

'isProperType' @ [86:114] ==> public abstract fun isProperType(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.Context[SimpleFunctionDescriptorImpl]

'it' @ [86:127] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSubType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [86:130] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'lowerConstraints' @ [87:13] ==> val lowerConstraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSubType[LocalVariableDescriptor]

'isNotEmpty' @ [87:30] ==> @InlineOnly public inline fun <T> Collection<Constraint>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'NewCommonSuperTypeCalculator' @ [88:35] ==> public object NewCommonSuperTypeCalculator defined in org.jetbrains.kotlin.resolve.calls in file NewCommonSuperTypeCalculator.kt[FakeCallableDescriptorForObject]

'commonSuperType' @ [88:64] ==> public final fun commonSuperType(types: List<UnwrappedType>): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'lowerConstraints' @ [88:80] ==> val lowerConstraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSubType[LocalVariableDescriptor]

'map' @ [88:97] ==> public inline fun <T, R> Iterable<Constraint>.map(transform: (Constraint) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint
    <R> -> UnwrappedType

'it' @ [88:103] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSubType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [88:106] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'adjustCommonSupertypeWithKnowledgeOfNumberTypes' @ [89:43] ==> private final fun adjustCommonSupertypeWithKnowledgeOfNumberTypes(commonSuperType: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[SimpleFunctionDescriptorImpl]

'commonSuperType' @ [89:91] ==> val commonSuperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSubType[LocalVariableDescriptor]

'typeApproximator' @ [108:20] ==> public final val typeApproximator: TypeApproximator defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[PropertyDescriptorImpl]

'approximateToSuperType' @ [108:37] ==> public final fun approximateToSuperType(type: UnwrappedType, conf: TypeApproximatorConfiguration): UnwrappedType? defined in org.jetbrains.kotlin.types.TypeApproximator[SimpleFunctionDescriptorImpl]

'adjustedCommonSuperType' @ [108:60] ==> val adjustedCommonSuperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSubType[LocalVariableDescriptor]

'CapturedTypesApproximation' @ [108:115] ==> public object CapturedTypesApproximation : TypeApproximatorConfiguration.AbstractCapturedTypesApproximation defined in org.jetbrains.kotlin.types.TypeApproximatorConfiguration[FakeCallableDescriptorForObject]

'adjustedCommonSuperType' @ [109:23] ==> val adjustedCommonSuperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSubType[LocalVariableDescriptor]

'commonSuperType' @ [116:27] ==> value-parameter commonSuperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[ValueParameterDescriptorImpl]

'constructor' @ [116:43] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'when (constructor) {
            is IntegerValueTypeConstructor,
            is IntersectionTypeConstructor -> {
                val newSupertypes = arrayListOf<UnwrappedType>()
                val numberSupertypes = arrayListOf<KotlinType>()
                for (supertype in constructor.supertypes.map { it.unwrap() }) {
                    if (supertype.isPrimitiveNumberType())
                        numberSupertypes.add(supertype)
                    else
                        newSupertypes.add(supertype)
                }

                TypeUtils.getDefaultPrimitiveNumberType(numberSupertypes)?.let {
                    newSupertypes.add(it.unwrap())
                }

                intersectTypes(newSupertypes).makeNullableAsSpecified(commonSuperType.isMarkedNullable)
            }

            else ->
                commonSuperType
        }' @ [118:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UnwrappedType, entry1: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UnwrappedType

'constructor' @ [118:22] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[LocalVariableDescriptor]

'arrayListOf' @ [121:37] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<UnwrappedType> /* = ArrayList<UnwrappedType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'arrayListOf' @ [122:40] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'constructor' @ [123:35] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[LocalVariableDescriptor]

'supertypes' @ [123:47] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'map' @ [123:58] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> UnwrappedType

'it' @ [123:64] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes.<anonymous>[ValueParameterDescriptorImpl]

'unwrap' @ [123:67] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'if (supertype.isPrimitiveNumberType())
                        numberSupertypes.add(supertype)
                    else
                        newSupertypes.add(supertype)' @ [124:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'supertype' @ [124:25] ==> val supertype: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[LocalVariableDescriptor]

'isPrimitiveNumberType' @ [124:35] ==> public fun KotlinType.isPrimitiveNumberType(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'numberSupertypes' @ [125:25] ==> val numberSupertypes: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[LocalVariableDescriptor]

'add' @ [125:42] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'supertype' @ [125:46] ==> val supertype: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[LocalVariableDescriptor]

'newSupertypes' @ [127:25] ==> val newSupertypes: ArrayList<UnwrappedType> /* = ArrayList<UnwrappedType> */ defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[LocalVariableDescriptor]

'add' @ [127:39] ==> public open fun add(element: UnwrappedType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'supertype' @ [127:43] ==> val supertype: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[LocalVariableDescriptor]

'getDefaultPrimitiveNumberType' @ [130:27] ==> @Nullable public open fun getDefaultPrimitiveNumberType(@NotNull p0: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>)): KotlinType? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'numberSupertypes' @ [130:57] ==> val numberSupertypes: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[LocalVariableDescriptor]

'let' @ [130:76] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'newSupertypes' @ [131:21] ==> val newSupertypes: ArrayList<UnwrappedType> /* = ArrayList<UnwrappedType> */ defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[LocalVariableDescriptor]

'add' @ [131:35] ==> public open fun add(element: UnwrappedType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [131:39] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes.<anonymous>[ValueParameterDescriptorImpl]

'unwrap' @ [131:42] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'intersectTypes' @ [134:17] ==> public fun intersectTypes(types: List<UnwrappedType>): UnwrappedType defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'newSupertypes' @ [134:32] ==> val newSupertypes: ArrayList<UnwrappedType> /* = ArrayList<UnwrappedType> */ defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [134:47] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'commonSuperType' @ [134:71] ==> value-parameter commonSuperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [134:87] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'commonSuperType' @ [138:17] ==> value-parameter commonSuperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.adjustCommonSupertypeWithKnowledgeOfNumberTypes[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [143:32] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSuperType[ValueParameterDescriptorImpl]

'constraints' @ [143:56] ==> public abstract val constraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.VariableWithConstraints[PropertyDescriptorImpl]

'filter' @ [143:68] ==> public inline fun <T> Iterable<Constraint>.filter(predicate: (Constraint) -> Boolean): List<Constraint> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'it' @ [143:77] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSuperType.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [143:80] ==> public final val kind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'UPPER' @ [143:103] ==> enum entry UPPER defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'c' @ [143:112] ==> value-parameter c: ResultTypeResolver.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSuperType[ValueParameterDescriptorImpl]

'isProperType' @ [143:114] ==> public abstract fun isProperType(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.Context[SimpleFunctionDescriptorImpl]

'it' @ [143:127] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSuperType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [143:130] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'upperConstraints' @ [144:13] ==> val upperConstraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSuperType[LocalVariableDescriptor]

'isNotEmpty' @ [144:30] ==> @InlineOnly public inline fun <T> Collection<Constraint>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'intersectTypes' @ [145:29] ==> public fun intersectTypes(types: List<UnwrappedType>): UnwrappedType defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'upperConstraints' @ [145:44] ==> val upperConstraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSuperType[LocalVariableDescriptor]

'map' @ [145:61] ==> public inline fun <T, R> Iterable<Constraint>.map(transform: (Constraint) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint
    <R> -> UnwrappedType

'it' @ [145:67] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSuperType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [145:70] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'typeApproximator' @ [147:20] ==> public final val typeApproximator: TypeApproximator defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver[PropertyDescriptorImpl]

'approximateToSubType' @ [147:37] ==> public final fun approximateToSubType(type: UnwrappedType, conf: TypeApproximatorConfiguration): UnwrappedType? defined in org.jetbrains.kotlin.types.TypeApproximator[SimpleFunctionDescriptorImpl]

'upperType' @ [147:58] ==> val upperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSuperType[LocalVariableDescriptor]

'CapturedTypesApproximation' @ [147:99] ==> public object CapturedTypesApproximation : TypeApproximatorConfiguration.AbstractCapturedTypesApproximation defined in org.jetbrains.kotlin.types.TypeApproximatorConfiguration[FakeCallableDescriptorForObject]

'upperType' @ [147:130] ==> val upperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findSuperType[LocalVariableDescriptor]

'variableWithConstraints' @ [157:38] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint[ValueParameterDescriptorImpl]

'constraints' @ [157:62] ==> public abstract val constraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.VariableWithConstraints[PropertyDescriptorImpl]

'filter' @ [157:74] ==> public inline fun <T> Iterable<Constraint>.filter(predicate: (Constraint) -> Boolean): List<Constraint> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'it' @ [158:13] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [158:16] ==> public final val kind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'EQUALITY' @ [158:39] ==> enum entry EQUALITY defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'c' @ [158:51] ==> value-parameter c: ResultTypeResolver.Context defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint[ValueParameterDescriptorImpl]

'isProperType' @ [158:53] ==> public abstract fun isProperType(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.Context[SimpleFunctionDescriptorImpl]

'it' @ [158:66] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [158:69] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'properEqualsConstraint' @ [161:13] ==> val properEqualsConstraint: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint[LocalVariableDescriptor]

'isNotEmpty' @ [161:36] ==> @InlineOnly public inline fun <T> Collection<Constraint>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'properEqualsConstraint' @ [162:20] ==> val properEqualsConstraint: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint[LocalVariableDescriptor]

'map' @ [162:43] ==> public inline fun <T, R> Iterable<Constraint>.map(transform: (Constraint) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint
    <R> -> UnwrappedType

'it' @ [162:49] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [162:52] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'singleBestRepresentative' @ [162:59] ==> public fun Collection<KotlinType>.singleBestRepresentative(): KotlinType? defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'unwrap' @ [162:87] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'properEqualsConstraint' @ [163:23] ==> val properEqualsConstraint: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint[LocalVariableDescriptor]

'first' @ [163:46] ==> public fun <T> List<Constraint>.first(): Constraint defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'type' @ [163:54] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'!' @ [165:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allowedFixToNotProperType' @ [165:14] ==> value-parameter allowedFixToNotProperType: Boolean = ... defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint[ValueParameterDescriptorImpl]

'variableWithConstraints' @ [167:41] ==> value-parameter variableWithConstraints: VariableWithConstraints defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint[ValueParameterDescriptorImpl]

'constraints' @ [167:65] ==> public abstract val constraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.VariableWithConstraints[PropertyDescriptorImpl]

'filter' @ [167:77] ==> public inline fun <T> Iterable<Constraint>.filter(predicate: (Constraint) -> Boolean): List<Constraint> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'it' @ [167:86] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [167:89] ==> public final val kind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'EQUALITY' @ [167:112] ==> enum entry EQUALITY defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'notProperEqualsConstraint' @ [170:16] ==> val notProperEqualsConstraint: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.components.ResultTypeResolver.findResultIfThereIsEqualsConstraint[LocalVariableDescriptor]

'singleOrNull' @ [170:42] ==> public fun <T> List<Constraint>.singleOrNull(): Constraint? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'type' @ [170:58] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

