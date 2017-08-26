'TypeCheckerContext' @ [27:56] ==> public constructor TypeCheckerContext(errorTypeEqualsToAnything: Boolean, allowedTypeVariable: Boolean = ...) defined in org.jetbrains.kotlin.types.checker.TypeCheckerContext[DeserializedClassConstructorDescriptor]

'when {
        isMyTypeVariable(subType) -> LowerCapturedTypePolicy.SKIP_LOWER
        subType.contains { it.anyBound(this::isMyTypeVariable) } -> LowerCapturedTypePolicy.CHECK_ONLY_LOWER
        else -> LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER
    }' @ [35:96] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeCheckerContext.LowerCapturedTypePolicy, entry1: TypeCheckerContext.LowerCapturedTypePolicy, entry2: TypeCheckerContext.LowerCapturedTypePolicy): TypeCheckerContext.LowerCapturedTypePolicy[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LowerCapturedTypePolicy

'isMyTypeVariable' @ [36:9] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'subType' @ [36:26] ==> value-parameter subType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.getLowerCapturedTypePolicy[ValueParameterDescriptorImpl]

'SKIP_LOWER' @ [36:62] ==> enum entry SKIP_LOWER defined in org.jetbrains.kotlin.types.checker.TypeCheckerContext.LowerCapturedTypePolicy[FakeCallableDescriptorForObject]

'subType' @ [37:9] ==> value-parameter subType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.getLowerCapturedTypePolicy[ValueParameterDescriptorImpl]

'contains' @ [37:17] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [37:28] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.getLowerCapturedTypePolicy.<anonymous>[ValueParameterDescriptorImpl]

'anyBound' @ [37:31] ==> private final inline fun UnwrappedType.anyBound(f: (SimpleType) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'this' @ [37:40] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[LazyClassReceiverParameterDescriptor]

'isMyTypeVariable' @ [37:46] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'CHECK_ONLY_LOWER' @ [37:93] ==> enum entry CHECK_ONLY_LOWER defined in org.jetbrains.kotlin.types.checker.TypeCheckerContext.LowerCapturedTypePolicy[FakeCallableDescriptorForObject]

'CHECK_SUBTYPE_AND_LOWER' @ [38:41] ==> enum entry CHECK_SUBTYPE_AND_LOWER defined in org.jetbrains.kotlin.types.checker.TypeCheckerContext.LowerCapturedTypePolicy[FakeCallableDescriptorForObject]

'subType' @ [48:26] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[ValueParameterDescriptorImpl]

'isTypeVariableWithNoInfer' @ [48:34] ==> private final fun UnwrappedType.isTypeVariableWithNoInfer(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'superType' @ [48:65] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[ValueParameterDescriptorImpl]

'isTypeVariableWithNoInfer' @ [48:75] ==> private final fun UnwrappedType.isTypeVariableWithNoInfer(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'hasNoInfer' @ [49:13] ==> val hasNoInfer: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'subType' @ [51:24] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[ValueParameterDescriptorImpl]

'isTypeVariableWithExact' @ [51:32] ==> private final fun UnwrappedType.isTypeVariableWithExact(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'superType' @ [51:61] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[ValueParameterDescriptorImpl]

'isTypeVariableWithExact' @ [51:71] ==> private final fun UnwrappedType.isTypeVariableWithExact(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'if (hasExact) subType.replaceAnnotations(Annotations.EMPTY) else subType' @ [54:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType, elseBranch: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType

'hasExact' @ [54:29] ==> val hasExact: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'subType' @ [54:39] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[ValueParameterDescriptorImpl]

'replaceAnnotations' @ [54:47] ==> public abstract fun replaceAnnotations(newAnnotations: Annotations): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [54:78] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'subType' @ [54:90] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[ValueParameterDescriptorImpl]

'if (hasExact) superType.replaceAnnotations(Annotations.EMPTY) else superType' @ [55:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType, elseBranch: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType

'hasExact' @ [55:31] ==> val hasExact: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'superType' @ [55:41] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[ValueParameterDescriptorImpl]

'replaceAnnotations' @ [55:51] ==> public abstract fun replaceAnnotations(newAnnotations: Annotations): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [55:82] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'superType' @ [55:94] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[ValueParameterDescriptorImpl]

'internalAddSubtypeConstraint' @ [57:22] ==> private final fun internalAddSubtypeConstraint(subType: UnwrappedType, superType: UnwrappedType): Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'mySubType' @ [57:51] ==> val mySubType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'mySuperType' @ [57:62] ==> val mySuperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'!' @ [58:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasExact' @ [58:14] ==> val hasExact: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'result' @ [58:31] ==> val result: Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'internalAddSubtypeConstraint' @ [60:23] ==> private final fun internalAddSubtypeConstraint(subType: UnwrappedType, superType: UnwrappedType): Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'mySuperType' @ [60:52] ==> val mySuperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'mySubType' @ [60:65] ==> val mySubType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'result' @ [62:13] ==> val result: Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'result2' @ [62:31] ==> val result2: Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'result' @ [63:17] ==> val result: Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'result2' @ [63:37] ==> val result2: Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.addSubtypeConstraint[LocalVariableDescriptor]

'anyBound' @ [67:13] ==> private final inline fun UnwrappedType.anyBound(f: (SimpleType) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'this@TypeCheckerContextForConstraintSystem' @ [67:22] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[LazyClassReceiverParameterDescriptor]

'isMyTypeVariable' @ [67:66] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'hasExactAnnotation' @ [67:87] ==> public fun KotlinType.hasExactAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'anyBound' @ [70:13] ==> private final inline fun UnwrappedType.anyBound(f: (SimpleType) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'this@TypeCheckerContextForConstraintSystem' @ [70:22] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[LazyClassReceiverParameterDescriptor]

'isMyTypeVariable' @ [70:66] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'hasNoInferAnnotation' @ [70:87] ==> public fun KotlinType.hasNoInferAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'assertInputTypes' @ [73:9] ==> private final fun assertInputTypes(subType: UnwrappedType, superType: UnwrappedType): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'subType' @ [73:26] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[ValueParameterDescriptorImpl]

'superType' @ [73:35] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[ValueParameterDescriptorImpl]

'superType' @ [77:13] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[ValueParameterDescriptorImpl]

'anyBound' @ [77:23] ==> private final inline fun UnwrappedType.anyBound(f: (SimpleType) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'this' @ [77:32] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[LazyClassReceiverParameterDescriptor]

'isMyTypeVariable' @ [77:38] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'answer' @ [78:13] ==> var answer: Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[LocalVariableDescriptor]

'simplifyLowerConstraint' @ [78:22] ==> private final fun simplifyLowerConstraint(typeVariable: UnwrappedType, subType: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'superType' @ [78:46] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[ValueParameterDescriptorImpl]

'subType' @ [78:57] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[ValueParameterDescriptorImpl]

'if (subType.anyBound(this::isMyTypeVariable)) {
            return simplifyUpperConstraint(subType, superType) && (answer ?: true)
        }
        else {
            return simplifyConstraintForPossibleIntersectionSubType(subType, superType) ?: answer
        }' @ [81:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'subType' @ [81:13] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[ValueParameterDescriptorImpl]

'anyBound' @ [81:21] ==> private final inline fun UnwrappedType.anyBound(f: (SimpleType) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'this' @ [81:30] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[LazyClassReceiverParameterDescriptor]

'isMyTypeVariable' @ [81:36] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'simplifyUpperConstraint' @ [82:20] ==> private final fun simplifyUpperConstraint(typeVariable: UnwrappedType, superType: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'subType' @ [82:44] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[ValueParameterDescriptorImpl]

'superType' @ [82:53] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[ValueParameterDescriptorImpl]

'answer' @ [82:68] ==> var answer: Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[LocalVariableDescriptor]

'simplifyConstraintForPossibleIntersectionSubType' @ [85:20] ==> private final fun simplifyConstraintForPossibleIntersectionSubType(subType: UnwrappedType, superType: UnwrappedType): Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'subType' @ [85:69] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[ValueParameterDescriptorImpl]

'superType' @ [85:78] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[ValueParameterDescriptorImpl]

'answer' @ [85:92] ==> var answer: Boolean? defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.internalAddSubtypeConstraint[LocalVariableDescriptor]

'Suppress' @ [95:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'typeVariable' @ [96:28] ==> value-parameter typeVariable: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyLowerConstraint[ValueParameterDescriptorImpl]

'upperIfFlexible' @ [96:41] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'if (typeVariable.isMarkedNullable) {
            addLowerConstraint(typeVariable.constructor, intersectTypes(listOf(subType, subType.builtIns.anyType)))
        }
        else {
            addLowerConstraint(typeVariable.constructor, subType)
        }' @ [98:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'typeVariable' @ [98:13] ==> val typeVariable: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyLowerConstraint[LocalVariableDescriptor]

'isMarkedNullable' @ [98:26] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'addLowerConstraint' @ [99:13] ==> public abstract fun addLowerConstraint(typeVariable: TypeConstructor, subType: UnwrappedType): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'typeVariable' @ [99:32] ==> val typeVariable: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyLowerConstraint[LocalVariableDescriptor]

'constructor' @ [99:45] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'intersectTypes' @ [99:58] ==> public fun intersectTypes(types: List<UnwrappedType>): UnwrappedType defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'listOf' @ [99:73] ==> public fun <T> listOf(vararg elements: UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'subType' @ [99:80] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyLowerConstraint[ValueParameterDescriptorImpl]

'subType' @ [99:89] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyLowerConstraint[ValueParameterDescriptorImpl]

'builtIns' @ [99:97] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'anyType' @ [99:106] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'addLowerConstraint' @ [102:13] ==> public abstract fun addLowerConstraint(typeVariable: TypeConstructor, subType: UnwrappedType): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'typeVariable' @ [102:32] ==> val typeVariable: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyLowerConstraint[LocalVariableDescriptor]

'constructor' @ [102:45] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'subType' @ [102:58] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyLowerConstraint[ValueParameterDescriptorImpl]

'Suppress' @ [114:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'typeVariable' @ [115:28] ==> value-parameter typeVariable: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyUpperConstraint[ValueParameterDescriptorImpl]

'lowerIfFlexible' @ [115:41] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'addUpperConstraint' @ [117:9] ==> public abstract fun addUpperConstraint(typeVariable: TypeConstructor, superType: UnwrappedType): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'typeVariable' @ [117:28] ==> val typeVariable: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyUpperConstraint[LocalVariableDescriptor]

'constructor' @ [117:41] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'superType' @ [117:54] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyUpperConstraint[ValueParameterDescriptorImpl]

'typeVariable' @ [119:13] ==> val typeVariable: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyUpperConstraint[LocalVariableDescriptor]

'isMarkedNullable' @ [119:26] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'superType' @ [121:20] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyUpperConstraint[ValueParameterDescriptorImpl]

'anyBound' @ [121:30] ==> private final inline fun UnwrappedType.anyBound(f: (SimpleType) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'this' @ [121:39] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[LazyClassReceiverParameterDescriptor]

'isMyTypeVariable' @ [121:45] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'isSubtypeOfByTypeChecker' @ [122:17] ==> private final fun isSubtypeOfByTypeChecker(subType: UnwrappedType, superType: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'typeVariable' @ [122:42] ==> val typeVariable: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyUpperConstraint[LocalVariableDescriptor]

'builtIns' @ [122:55] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'nullableNothingType' @ [122:64] ==> public final val KotlinBuiltIns.nullableNothingType: SimpleType[MyPropertyDescriptor]

'superType' @ [122:85] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyUpperConstraint[ValueParameterDescriptorImpl]

'Suppress' @ [129:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'subType' @ [130:23] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[ValueParameterDescriptorImpl]

'lowerIfFlexible' @ [130:31] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'!' @ [132:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'subType' @ [132:14] ==> val subType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'isIntersectionType' @ [132:22] ==> public val SimpleType.isIntersectionType: Boolean defined in org.jetbrains.kotlin.types.checker[DeserializedPropertyDescriptor]

'assert' @ [134:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [134:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'subType' @ [134:17] ==> val subType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'isMarkedNullable' @ [134:25] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'subType' @ [134:97] ==> val subType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'subType' @ [137:37] ==> val subType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'constructor' @ [137:45] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'supertypes' @ [137:89] ==> public final val IntersectionTypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'map' @ [137:100] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> SimpleType

'it' @ [137:106] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType.<anonymous>[ValueParameterDescriptorImpl]

'lowerIfFlexible' @ [137:109] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'subIntersectionTypes' @ [139:29] ==> val subIntersectionTypes: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'filter' @ [139:50] ==> public inline fun <T> Iterable<SimpleType>.filter(predicate: (SimpleType) -> Boolean): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'this' @ [139:57] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[LazyClassReceiverParameterDescriptor]

'isMyTypeVariable' @ [139:63] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'takeIf' @ [139:81] ==> @InlineOnly @SinceKotlin public inline fun <T> List<SimpleType>.takeIf(predicate: (List<SimpleType>) -> Boolean): List<SimpleType>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SimpleType>

'it' @ [139:90] ==> value-parameter it: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [139:93] ==> @InlineOnly public inline fun <T> Collection<SimpleType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'subIntersectionTypes' @ [140:32] ==> val subIntersectionTypes: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'filterNot' @ [140:53] ==> public inline fun <T> Iterable<SimpleType>.filterNot(predicate: (SimpleType) -> Boolean): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'this' @ [140:63] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[LazyClassReceiverParameterDescriptor]

'isMyTypeVariable' @ [140:69] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'notTypeVariables' @ [143:13] ==> val notTypeVariables: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'isNotEmpty' @ [143:30] ==> @InlineOnly public inline fun <T> Collection<SimpleType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'NewKotlinTypeChecker' @ [143:46] ==> public object NewKotlinTypeChecker : KotlinTypeChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'isSubtypeOf' @ [143:67] ==> public open fun isSubtypeOf(subtype: KotlinType, supertype: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.NewKotlinTypeChecker[DeserializedSimpleFunctionDescriptor]

'intersectTypes' @ [143:79] ==> public fun intersectTypes(types: List<SimpleType>): SimpleType defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'notTypeVariables' @ [143:94] ==> val notTypeVariables: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'superType' @ [143:113] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[ValueParameterDescriptorImpl]

'notTypeVariables' @ [162:13] ==> val notTypeVariables: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'any' @ [162:30] ==> public inline fun <T> Iterable<SimpleType>.any(predicate: (SimpleType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'NullabilityChecker' @ [162:36] ==> public object NullabilityChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'isSubtypeOfAny' @ [162:55] ==> public final fun isSubtypeOfAny(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.types.checker.NullabilityChecker[DeserializedSimpleFunctionDescriptor]

'it' @ [162:70] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType.<anonymous>[ValueParameterDescriptorImpl]

'typeVariables' @ [163:20] ==> val typeVariables: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'all' @ [163:34] ==> public inline fun <T> Iterable<SimpleType>.all(predicate: (SimpleType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'simplifyUpperConstraint' @ [163:40] ==> private final fun simplifyUpperConstraint(typeVariable: UnwrappedType, superType: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'it' @ [163:64] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType.<anonymous>[ValueParameterDescriptorImpl]

'superType' @ [163:68] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[ValueParameterDescriptorImpl]

'makeNullableAsSpecified' @ [163:78] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'typeVariables' @ [166:16] ==> val typeVariables: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[LocalVariableDescriptor]

'all' @ [166:30] ==> public inline fun <T> Iterable<SimpleType>.all(predicate: (SimpleType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'simplifyUpperConstraint' @ [166:36] ==> private final fun simplifyUpperConstraint(typeVariable: UnwrappedType, superType: UnwrappedType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'it' @ [166:60] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType.<anonymous>[ValueParameterDescriptorImpl]

'superType' @ [166:64] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.simplifyConstraintForPossibleIntersectionSubType[ValueParameterDescriptorImpl]

'with' @ [170:13] ==> @InlineOnly public inline fun <T, R> with(receiver: NewKotlinTypeChecker, block: NewKotlinTypeChecker.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewKotlinTypeChecker
    <R> -> Boolean

'NewKotlinTypeChecker' @ [170:18] ==> public object NewKotlinTypeChecker : KotlinTypeChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'this@TypeCheckerContextForConstraintSystem' @ [170:42] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[LazyClassReceiverParameterDescriptor]

'isSubtypeOf' @ [170:85] ==> public final fun TypeCheckerContext.isSubtypeOf(subType: UnwrappedType, superType: UnwrappedType): Boolean defined in org.jetbrains.kotlin.types.checker.NewKotlinTypeChecker[DeserializedSimpleFunctionDescriptor]

'subType' @ [170:97] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.isSubtypeOfByTypeChecker[ValueParameterDescriptorImpl]

'superType' @ [170:106] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.isSubtypeOfByTypeChecker[ValueParameterDescriptorImpl]

'subType' @ [173:51] ==> value-parameter subType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes.correctSubType[ValueParameterDescriptorImpl]

'isSingleClassifierType' @ [173:59] ==> public val SimpleType.isSingleClassifierType: Boolean defined in org.jetbrains.kotlin.types.checker[DeserializedPropertyDescriptor]

'subType' @ [173:85] ==> value-parameter subType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes.correctSubType[ValueParameterDescriptorImpl]

'isIntersectionType' @ [173:93] ==> public val SimpleType.isIntersectionType: Boolean defined in org.jetbrains.kotlin.types.checker[DeserializedPropertyDescriptor]

'isMyTypeVariable' @ [173:115] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'subType' @ [173:132] ==> value-parameter subType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes.correctSubType[ValueParameterDescriptorImpl]

'superType' @ [174:55] ==> value-parameter superType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes.correctSuperType[ValueParameterDescriptorImpl]

'isSingleClassifierType' @ [174:65] ==> public val SimpleType.isSingleClassifierType: Boolean defined in org.jetbrains.kotlin.types.checker[DeserializedPropertyDescriptor]

'isMyTypeVariable' @ [174:91] ==> public abstract fun isMyTypeVariable(type: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'superType' @ [174:108] ==> value-parameter superType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes.correctSuperType[ValueParameterDescriptorImpl]

'assert' @ [176:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'subType' @ [176:16] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes[ValueParameterDescriptorImpl]

'bothBounds' @ [176:24] ==> private final inline fun UnwrappedType.bothBounds(f: (SimpleType) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'correctSubType' @ [176:37] ==> local final fun correctSubType(subType: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes[SimpleFunctionDescriptorImpl]

'subType' @ [177:70] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes[ValueParameterDescriptorImpl]

'assert' @ [179:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'superType' @ [179:16] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes[ValueParameterDescriptorImpl]

'bothBounds' @ [179:26] ==> private final inline fun UnwrappedType.bothBounds(f: (SimpleType) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem[SimpleFunctionDescriptorImpl]

'correctSuperType' @ [179:39] ==> local final fun correctSuperType(superType: SimpleType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes[SimpleFunctionDescriptorImpl]

'superType' @ [180:51] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.assertInputTypes[ValueParameterDescriptorImpl]

'when (this) {
        is SimpleType -> f(this)
        is FlexibleType -> f(lowerBound) && f(upperBound)
    }' @ [184:79] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [184:85] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.bothBounds[ReceiverParameterDescriptorImpl]

'invoke' @ [185:26] ==> public abstract operator fun invoke(p1: SimpleType): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [185:28] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.bothBounds[ReceiverParameterDescriptorImpl]

'invoke' @ [186:28] ==> public abstract operator fun invoke(p1: SimpleType): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'lowerBound' @ [186:30] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'invoke' @ [186:45] ==> public abstract operator fun invoke(p1: SimpleType): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'upperBound' @ [186:47] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'when (this) {
        is SimpleType -> f(this)
        is FlexibleType -> f(lowerBound) || f(upperBound)
    }' @ [189:77] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [189:83] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.anyBound[ReceiverParameterDescriptorImpl]

'invoke' @ [190:26] ==> public abstract operator fun invoke(p1: SimpleType): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [190:28] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.TypeCheckerContextForConstraintSystem.anyBound[ReceiverParameterDescriptorImpl]

'invoke' @ [191:28] ==> public abstract operator fun invoke(p1: SimpleType): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'lowerBound' @ [191:30] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'invoke' @ [191:45] ==> public abstract operator fun invoke(p1: SimpleType): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'upperBound' @ [191:47] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

