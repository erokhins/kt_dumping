'flexibleId' @ [32:13] ==> value-parameter flexibleId: String defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

'id' @ [32:27] ==> public final val id: String defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer[PropertyDescriptorImpl]

'createErrorType' @ [32:49] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'flexibleId' @ [32:82] ==> value-parameter flexibleId: String defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

'lowerBound' @ [32:96] ==> value-parameter lowerBound: SimpleType defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

'upperBound' @ [32:109] ==> value-parameter upperBound: SimpleType defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

'if (StrictEqualityTypeChecker.strictEqualTypes(lowerBound, lowerBound.builtIns.nothingType) &&
                   StrictEqualityTypeChecker.strictEqualTypes(upperBound, upperBound.builtIns.nullableAnyType)) {
            createDynamicType(lowerBound.builtIns)
        }
        else {
            ErrorUtils.createErrorType("Illegal type range for dynamic type: $lowerBound..$upperBound")
        }' @ [33:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'StrictEqualityTypeChecker' @ [33:20] ==> public object StrictEqualityTypeChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'strictEqualTypes' @ [33:46] ==> public final fun strictEqualTypes(a: SimpleType, b: SimpleType): Boolean defined in org.jetbrains.kotlin.types.checker.StrictEqualityTypeChecker[DeserializedSimpleFunctionDescriptor]

'lowerBound' @ [33:63] ==> value-parameter lowerBound: SimpleType defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

'lowerBound' @ [33:75] ==> value-parameter lowerBound: SimpleType defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

'builtIns' @ [33:86] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'nothingType' @ [33:95] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'StrictEqualityTypeChecker' @ [34:20] ==> public object StrictEqualityTypeChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'strictEqualTypes' @ [34:46] ==> public final fun strictEqualTypes(a: SimpleType, b: SimpleType): Boolean defined in org.jetbrains.kotlin.types.checker.StrictEqualityTypeChecker[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [34:63] ==> value-parameter upperBound: SimpleType defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

'upperBound' @ [34:75] ==> value-parameter upperBound: SimpleType defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

'builtIns' @ [34:86] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'nullableAnyType' @ [34:95] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'createDynamicType' @ [35:13] ==> public fun createDynamicType(builtIns: KotlinBuiltIns): DynamicType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'lowerBound' @ [35:31] ==> value-parameter lowerBound: SimpleType defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

'builtIns' @ [35:42] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'createErrorType' @ [38:24] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'lowerBound' @ [38:79] ==> value-parameter lowerBound: SimpleType defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

'upperBound' @ [38:92] ==> value-parameter upperBound: SimpleType defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer.create[ValueParameterDescriptorImpl]

