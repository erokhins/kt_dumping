'type' @ [31:9] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.util.record[ValueParameterDescriptorImpl]

'isError' @ [31:14] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'type' @ [31:25] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.util.record[ValueParameterDescriptorImpl]

'isUnit' @ [31:30] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'type' @ [33:26] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.util.record[ValueParameterDescriptorImpl]

'constructor' @ [33:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [33:43] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'typeDescriptor' @ [34:27] ==> val typeDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'containingDeclaration' @ [34:42] ==> public final val ClassifierDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'when {
        scopeDescriptor is PackageFragmentDescriptor && !DescriptorUtils.isLocal(typeDescriptor) -> {
            record(KotlinLookupLocation(expression), scopeDescriptor, typeDescriptor.name)
        }
        scopeDescriptor is ClassDescriptor && !DescriptorUtils.isLocal(typeDescriptor) -> {
            record(KotlinLookupLocation(expression), scopeDescriptor, typeDescriptor.name)
        }
    }' @ [38:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'scopeDescriptor' @ [39:9] ==> val scopeDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'!' @ [39:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [39:74] ==> public open fun isLocal(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'typeDescriptor' @ [39:82] ==> val typeDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'record' @ [40:13] ==> public fun LookupTracker.record(from: LookupLocation, scopeOwner: PackageFragmentDescriptor, name: Name): Unit defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'KotlinLookupLocation' @ [40:20] ==> public constructor KotlinLookupLocation(element: KtElement) defined in org.jetbrains.kotlin.incremental.KotlinLookupLocation[ClassConstructorDescriptorImpl]

'expression' @ [40:41] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.util.record[ValueParameterDescriptorImpl]

'scopeDescriptor' @ [40:54] ==> val scopeDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'typeDescriptor' @ [40:71] ==> val typeDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'name' @ [40:86] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'scopeDescriptor' @ [42:9] ==> val scopeDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'!' @ [42:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [42:64] ==> public open fun isLocal(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'typeDescriptor' @ [42:72] ==> val typeDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'record' @ [43:13] ==> public fun LookupTracker.record(from: LookupLocation, scopeOwner: ClassDescriptor, name: Name): Unit defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'KotlinLookupLocation' @ [43:20] ==> public constructor KotlinLookupLocation(element: KtElement) defined in org.jetbrains.kotlin.incremental.KotlinLookupLocation[ClassConstructorDescriptorImpl]

'expression' @ [43:41] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.util.record[ValueParameterDescriptorImpl]

'scopeDescriptor' @ [43:54] ==> val scopeDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'typeDescriptor' @ [43:71] ==> val typeDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'name' @ [43:86] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'type' @ [47:26] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.util.record[ValueParameterDescriptorImpl]

'arguments' @ [47:31] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'!' @ [48:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeArgument' @ [48:14] ==> val typeArgument: TypeProjection defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'isStarProjection' @ [48:27] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'record' @ [49:13] ==> public fun LookupTracker.record(expression: KtExpression, type: KotlinType): Unit defined in org.jetbrains.kotlin.util in file lookupTrackerUtil.kt[SimpleFunctionDescriptorImpl]

'expression' @ [49:20] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.util.record[ValueParameterDescriptorImpl]

'typeArgument' @ [49:32] ==> val typeArgument: TypeProjection defined in org.jetbrains.kotlin.util.record[LocalVariableDescriptor]

'type' @ [49:45] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

