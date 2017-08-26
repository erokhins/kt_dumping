'firstArgumentValue' @ [56:35] ==> public fun AnnotationDescriptor.firstArgumentValue(): Any? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'NullabilityQualifierWithMigrationStatus' @ [58:23] ==> public constructor NullabilityQualifierWithMigrationStatus(qualifier: NullabilityQualifier, isForWarningOnly: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus[ClassConstructorDescriptorImpl]

'NOT_NULL' @ [58:84] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'enumEntryDescriptor' @ [60:13] ==> val enumEntryDescriptor: Any defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.extractNullabilityTypeFromArgument[LocalVariableDescriptor]

'when (enumEntryDescriptor.name.asString()) {
            "ALWAYS" -> NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL)
            "MAYBE" -> NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE)
            else -> null
        }' @ [62:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NullabilityQualifierWithMigrationStatus?, entry1: NullabilityQualifierWithMigrationStatus?, entry2: NullabilityQualifierWithMigrationStatus?): NullabilityQualifierWithMigrationStatus?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NullabilityQualifierWithMigrationStatus?

'enumEntryDescriptor' @ [62:22] ==> val enumEntryDescriptor: Any defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.extractNullabilityTypeFromArgument[LocalVariableDescriptor]

'name' @ [62:42] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [62:47] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'NullabilityQualifierWithMigrationStatus' @ [63:25] ==> public constructor NullabilityQualifierWithMigrationStatus(qualifier: NullabilityQualifier, isForWarningOnly: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus[ClassConstructorDescriptorImpl]

'NOT_NULL' @ [63:86] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'NullabilityQualifierWithMigrationStatus' @ [64:24] ==> public constructor NullabilityQualifierWithMigrationStatus(qualifier: NullabilityQualifier, isForWarningOnly: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus[ClassConstructorDescriptorImpl]

'NULLABLE' @ [64:85] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'annotationDescriptor' @ [70:32] ==> value-parameter annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.extractNullability[ValueParameterDescriptorImpl]

'fqName' @ [70:53] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'when (annotationFqName) {
            in NULLABLE_ANNOTATIONS -> NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE)
            in NOT_NULL_ANNOTATIONS -> NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL)
            JAVAX_NONNULL_ANNOTATION -> annotationDescriptor.extractNullabilityTypeFromArgument()
            else -> {
                val forWarning = annotationTypeQualifierResolver.jsr305State.isWarning()

                annotationTypeQualifierResolver
                        .resolveTypeQualifierAnnotation(annotationDescriptor)
                        ?.takeIf { it.fqName == JAVAX_NONNULL_ANNOTATION }
                        ?.extractNullabilityTypeFromArgument()
                        ?.copy(isForWarningOnly = forWarning)
            }
        }' @ [72:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NullabilityQualifierWithMigrationStatus?, entry1: NullabilityQualifierWithMigrationStatus?, entry2: NullabilityQualifierWithMigrationStatus?, entry3: NullabilityQualifierWithMigrationStatus?): NullabilityQualifierWithMigrationStatus?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NullabilityQualifierWithMigrationStatus?

'annotationFqName' @ [72:22] ==> val annotationFqName: FqName defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.extractNullability[LocalVariableDescriptor]

'in' @ [73:13] ==> public abstract fun contains(element: (FqName..FqName?)): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'NULLABLE_ANNOTATIONS' @ [73:16] ==> public val NULLABLE_ANNOTATIONS: List<(FqName..FqName?)> defined in org.jetbrains.kotlin.load.java in file JvmAnnotationNames.kt[PropertyDescriptorImpl]

'NullabilityQualifierWithMigrationStatus' @ [73:40] ==> public constructor NullabilityQualifierWithMigrationStatus(qualifier: NullabilityQualifier, isForWarningOnly: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus[ClassConstructorDescriptorImpl]

'NULLABLE' @ [73:101] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'in' @ [74:13] ==> public abstract fun contains(element: (FqName..FqName?)): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'NOT_NULL_ANNOTATIONS' @ [74:16] ==> public val NOT_NULL_ANNOTATIONS: List<(FqName..FqName?)> defined in org.jetbrains.kotlin.load.java in file JvmAnnotationNames.kt[PropertyDescriptorImpl]

'NullabilityQualifierWithMigrationStatus' @ [74:40] ==> public constructor NullabilityQualifierWithMigrationStatus(qualifier: NullabilityQualifier, isForWarningOnly: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus[ClassConstructorDescriptorImpl]

'NOT_NULL' @ [74:101] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'JAVAX_NONNULL_ANNOTATION' @ [75:13] ==> public val JAVAX_NONNULL_ANNOTATION: FqName defined in org.jetbrains.kotlin.load.java in file JvmAnnotationNames.kt[PropertyDescriptorImpl]

'annotationDescriptor' @ [75:41] ==> value-parameter annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.extractNullability[ValueParameterDescriptorImpl]

'extractNullabilityTypeFromArgument' @ [75:62] ==> private final fun AnnotationDescriptor.extractNullabilityTypeFromArgument(): NullabilityQualifierWithMigrationStatus? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[SimpleFunctionDescriptorImpl]

'annotationTypeQualifierResolver' @ [77:34] ==> private final val annotationTypeQualifierResolver: AnnotationTypeQualifierResolver defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[PropertyDescriptorImpl]

'jsr305State' @ [77:66] ==> public final val jsr305State: Jsr305State defined in org.jetbrains.kotlin.load.java.AnnotationTypeQualifierResolver[PropertyDescriptorImpl]

'isWarning' @ [77:78] ==> public final fun isWarning(): Boolean defined in org.jetbrains.kotlin.utils.Jsr305State[DeserializedSimpleFunctionDescriptor]

'annotationTypeQualifierResolver' @ [79:17] ==> private final val annotationTypeQualifierResolver: AnnotationTypeQualifierResolver defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[PropertyDescriptorImpl]

'resolveTypeQualifierAnnotation' @ [80:26] ==> public final fun resolveTypeQualifierAnnotation(annotationDescriptor: AnnotationDescriptor): AnnotationDescriptor? defined in org.jetbrains.kotlin.load.java.AnnotationTypeQualifierResolver[SimpleFunctionDescriptorImpl]

'annotationDescriptor' @ [80:57] ==> value-parameter annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.extractNullability[ValueParameterDescriptorImpl]

'takeIf' @ [81:27] ==> @InlineOnly @SinceKotlin public inline fun <T> AnnotationDescriptor.takeIf(predicate: (AnnotationDescriptor) -> Boolean): AnnotationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'it' @ [81:36] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.extractNullability.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [81:39] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'JAVAX_NONNULL_ANNOTATION' @ [81:49] ==> public val JAVAX_NONNULL_ANNOTATION: FqName defined in org.jetbrains.kotlin.load.java in file JvmAnnotationNames.kt[PropertyDescriptorImpl]

'extractNullabilityTypeFromArgument' @ [82:27] ==> private final fun AnnotationDescriptor.extractNullabilityTypeFromArgument(): NullabilityQualifierWithMigrationStatus? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[SimpleFunctionDescriptorImpl]

'copy' @ [83:27] ==> public final fun copy(qualifier: NullabilityQualifier = ..., isForWarningOnly: Boolean = ...): NullabilityQualifierWithMigrationStatus defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus[SimpleFunctionDescriptorImpl]

'forWarning' @ [83:51] ==> val forWarning: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.extractNullability[LocalVariableDescriptor]

'platformSignatures' @ [90:16] ==> value-parameter platformSignatures: Collection<D> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignatures[ValueParameterDescriptorImpl]

'map' @ [90:35] ==> public inline fun <T, R> Iterable<D>.map(transform: (D) -> D): List<D> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D
    <R> -> D

'it' @ [91:13] ==> value-parameter it: D defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignatures.<anonymous>[ValueParameterDescriptorImpl]

'enhanceSignature' @ [91:16] ==> private final fun <D : CallableMemberDescriptor> D.enhanceSignature(c: LazyJavaResolverContext): D defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> D

'c' @ [91:33] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignatures[ValueParameterDescriptorImpl]

'this' @ [100:13] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ReceiverParameterDescriptorImpl]

'this' @ [100:59] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ReceiverParameterDescriptorImpl]

'kind' @ [103:13] ==> public final val JavaCallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [103:51] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'original' @ [103:68] ==> public final val JavaCallableMemberDescriptor.original: CallableMemberDescriptor[MyPropertyDescriptor]

'overriddenDescriptors' @ [103:77] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'size' @ [103:99] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'this' @ [103:117] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ReceiverParameterDescriptorImpl]

'c' @ [105:36] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ValueParameterDescriptorImpl]

'computeNewDefaultTypeQualifiers' @ [105:38] ==> public fun LazyJavaResolverContext.computeNewDefaultTypeQualifiers(additionalAnnotations: Annotations): JavaTypeQualifiersByElementType? defined in org.jetbrains.kotlin.load.java.lazy in file context.kt[SimpleFunctionDescriptorImpl]

'annotations' @ [105:70] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[DeserializedPropertyDescriptor]

'if (this is JavaPropertyDescriptor && getter?.isDefault == false)
                    getter!!
                else
                    this' @ [109:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableMemberDescriptor, elseBranch: CallableMemberDescriptor): CallableMemberDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableMemberDescriptor

'this' @ [109:21] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ReceiverParameterDescriptorImpl]

'getter' @ [109:55] ==> public open val getter: PropertyGetterDescriptorImpl? defined in org.jetbrains.kotlin.load.java.descriptors.JavaPropertyDescriptor[JavaPropertyDescriptor]

'isDefault' @ [109:63] ==> public final val PropertyGetterDescriptorImpl.isDefault: Boolean[MyPropertyDescriptor]

'getter' @ [110:21] ==> public open val getter: PropertyGetterDescriptorImpl? defined in org.jetbrains.kotlin.load.java.descriptors.JavaPropertyDescriptor[JavaPropertyDescriptor]

'this' @ [112:21] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ReceiverParameterDescriptorImpl]

'if (extensionReceiverParameter != null)
                    parts<D>(
                            typeContainer =
                                annotationOwnerForMember.safeAs<FunctionDescriptor>()
                                    ?.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER),
                            isCovariant = false,
                            defaultTopLevelQualifiers =
                                outerScopeQualifiers
                                        ?.get(AnnotationTypeQualifierResolver.QualifierApplicabilityType.VALUE_PARAMETER)
                    ) { it.extensionReceiverParameter!!.type }.enhance()
                else null' @ [115:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SignatureEnhancement.PartEnhancementResult?, elseBranch: SignatureEnhancement.PartEnhancementResult?): SignatureEnhancement.PartEnhancementResult?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PartEnhancementResult?

'extensionReceiverParameter' @ [115:21] ==> public final val JavaCallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'parts' @ [116:21] ==> private final fun <D : CallableMemberDescriptor> D.parts(typeContainer: Annotated?, isCovariant: Boolean, defaultTopLevelQualifiers: JavaTypeQualifiers?, collector: (CallableMemberDescriptor) -> KotlinType): SignatureEnhancement.SignatureParts defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> D

'annotationOwnerForMember' @ [118:33] ==> val annotationOwnerForMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'safeAs' @ [118:58] ==> public inline fun <reified T : Any> Any?.safeAs(): FunctionDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> FunctionDescriptor

'getUserData' @ [119:39] ==> @Nullable public abstract fun <V : (Any..Any?)> getUserData(p0: (FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>..FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>?)): ValueParameterDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> ValueParameterDescriptor

'ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER' @ [119:72] ==> public final val ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER: (FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>..FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.load.java.descriptors.JavaMethodDescriptor[JavaPropertyDescriptor]

'outerScopeQualifiers' @ [122:33] ==> val outerScopeQualifiers: JavaTypeQualifiersByElementType? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'get' @ [123:43] ==> public final operator fun get(applicabilityType: AnnotationTypeQualifierResolver.QualifierApplicabilityType): JavaTypeQualifiers? defined in org.jetbrains.kotlin.load.java.lazy.JavaTypeQualifiersByElementType[SimpleFunctionDescriptorImpl]

'VALUE_PARAMETER' @ [123:106] ==> enum entry VALUE_PARAMETER defined in org.jetbrains.kotlin.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType[FakeCallableDescriptorForObject]

'it' @ [124:25] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [124:28] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [124:57] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'enhance' @ [124:64] ==> public final fun enhance(predefined: TypeEnhancementInfo? = ...): SignatureEnhancement.PartEnhancementResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[SimpleFunctionDescriptorImpl]

'this' @ [129:18] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ReceiverParameterDescriptorImpl]

'run' @ [130:27] ==> @InlineOnly public inline fun <T, R> JavaMethodDescriptor.run(block: JavaMethodDescriptor.() -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethodDescriptor
    <R> -> String

'SignatureBuildingComponents' @ [130:33] ==> public object SignatureBuildingComponents defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureBuilding.kt[FakeCallableDescriptorForObject]

'signature' @ [130:61] ==> public final fun signature(classDescriptor: ClassDescriptor, jvmDescriptor: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'this' @ [130:71] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [130:76] ==> public final val JavaMethodDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'this' @ [130:118] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ReceiverParameterDescriptorImpl]

'computeJvmDescriptor' @ [130:123] ==> public fun FunctionDescriptor.computeJvmDescriptor(withReturnType: Boolean = ...): String defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]

'let' @ [131:27] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> PredefinedFunctionEnhancementInfo?): PredefinedFunctionEnhancementInfo? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> PredefinedFunctionEnhancementInfo?

'PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE' @ [131:46] ==> public val PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE: Map<String, PredefinedFunctionEnhancementInfo> defined in org.jetbrains.kotlin.load.java.typeEnhancement in file predefinedEnhancementInfo.kt[PropertyDescriptorImpl]

'signature' @ [131:96] ==> value-parameter signature: String defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ValueParameterDescriptorImpl]

'predefinedEnhancementInfo' @ [134:9] ==> val predefinedEnhancementInfo: PredefinedFunctionEnhancementInfo? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'let' @ [134:36] ==> @InlineOnly public inline fun <T, R> PredefinedFunctionEnhancementInfo.let(block: (PredefinedFunctionEnhancementInfo) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PredefinedFunctionEnhancementInfo
    <R> -> Unit

'assert' @ [135:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [135:20] ==> value-parameter it: PredefinedFunctionEnhancementInfo defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ValueParameterDescriptorImpl]

'parametersInfo' @ [135:23] ==> public final val parametersInfo: List<TypeEnhancementInfo?> defined in org.jetbrains.kotlin.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo[PropertyDescriptorImpl]

'size' @ [135:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'valueParameters' @ [135:46] ==> public final val JavaCallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [135:62] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'this' @ [136:51] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ReceiverParameterDescriptorImpl]

'it' @ [136:62] ==> value-parameter it: PredefinedFunctionEnhancementInfo defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ValueParameterDescriptorImpl]

'parametersInfo' @ [136:65] ==> public final val parametersInfo: List<TypeEnhancementInfo?> defined in org.jetbrains.kotlin.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo[PropertyDescriptorImpl]

'size' @ [136:80] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'valueParameters' @ [136:93] ==> public final val JavaCallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [136:109] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'annotationOwnerForMember' @ [140:42] ==> val annotationOwnerForMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'valueParameters' @ [140:67] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [140:83] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> SignatureEnhancement.PartEnhancementResult): List<SignatureEnhancement.PartEnhancementResult> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> PartEnhancementResult

'parts' @ [142:13] ==> private final fun <D : CallableMemberDescriptor> D.parts(typeContainer: Annotated?, isCovariant: Boolean, defaultTopLevelQualifiers: JavaTypeQualifiers?, collector: (CallableMemberDescriptor) -> KotlinType): SignatureEnhancement.SignatureParts defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> D

'p' @ [143:37] ==> value-parameter p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ValueParameterDescriptorImpl]

'outerScopeQualifiers' @ [145:29] ==> val outerScopeQualifiers: JavaTypeQualifiersByElementType? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'get' @ [146:39] ==> public final operator fun get(applicabilityType: AnnotationTypeQualifierResolver.QualifierApplicabilityType): JavaTypeQualifiers? defined in org.jetbrains.kotlin.load.java.lazy.JavaTypeQualifiersByElementType[SimpleFunctionDescriptorImpl]

'VALUE_PARAMETER' @ [146:102] ==> enum entry VALUE_PARAMETER defined in org.jetbrains.kotlin.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType[FakeCallableDescriptorForObject]

'it' @ [147:17] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [147:20] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'p' @ [147:36] ==> value-parameter p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [147:38] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'type' @ [147:45] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'enhance' @ [148:22] ==> public final fun enhance(predefined: TypeEnhancementInfo? = ...): SignatureEnhancement.PartEnhancementResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[SimpleFunctionDescriptorImpl]

'predefinedEnhancementInfo' @ [148:30] ==> val predefinedEnhancementInfo: PredefinedFunctionEnhancementInfo? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'parametersInfo' @ [148:57] ==> public final val parametersInfo: List<TypeEnhancementInfo?> defined in org.jetbrains.kotlin.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo[PropertyDescriptorImpl]

'getOrNull' @ [148:73] ==> public fun <T> List<TypeEnhancementInfo?>.getOrNull(index: Int): TypeEnhancementInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeEnhancementInfo?

'p' @ [148:83] ==> value-parameter p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [148:85] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parts' @ [152:17] ==> private final fun <D : CallableMemberDescriptor> D.parts(typeContainer: Annotated?, isCovariant: Boolean, defaultTopLevelQualifiers: JavaTypeQualifiers?, collector: (CallableMemberDescriptor) -> KotlinType): SignatureEnhancement.SignatureParts defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> D

'annotationOwnerForMember' @ [153:41] ==> val annotationOwnerForMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'outerScopeQualifiers' @ [155:29] ==> val outerScopeQualifiers: JavaTypeQualifiersByElementType? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'get' @ [155:51] ==> public final operator fun get(applicabilityType: AnnotationTypeQualifierResolver.QualifierApplicabilityType): JavaTypeQualifiers? defined in org.jetbrains.kotlin.load.java.lazy.JavaTypeQualifiersByElementType[SimpleFunctionDescriptorImpl]

'if (this.safeAs<PropertyDescriptor>()?.isJavaField == true)
                                        AnnotationTypeQualifierResolver.QualifierApplicabilityType.FIELD
                                    else
                                        AnnotationTypeQualifierResolver.QualifierApplicabilityType.METHOD_RETURN_TYPE' @ [156:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnnotationTypeQualifierResolver.QualifierApplicabilityType, elseBranch: AnnotationTypeQualifierResolver.QualifierApplicabilityType): AnnotationTypeQualifierResolver.QualifierApplicabilityType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> QualifierApplicabilityType

'this' @ [156:41] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ReceiverParameterDescriptorImpl]

'safeAs' @ [156:46] ==> public inline fun <reified T : Any> Any?.safeAs(): PropertyDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PropertyDescriptor

'isJavaField' @ [156:76] ==> public val PropertyDescriptor.isJavaField: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors in file JavaDescriptorUtil.kt[PropertyDescriptorImpl]

'FIELD' @ [157:100] ==> enum entry FIELD defined in org.jetbrains.kotlin.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType[FakeCallableDescriptorForObject]

'METHOD_RETURN_TYPE' @ [159:100] ==> enum entry METHOD_RETURN_TYPE defined in org.jetbrains.kotlin.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType[FakeCallableDescriptorForObject]

'it' @ [163:21] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [163:24] ==> public final val CallableMemberDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'enhance' @ [163:39] ==> public final fun enhance(predefined: TypeEnhancementInfo? = ...): SignatureEnhancement.PartEnhancementResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[SimpleFunctionDescriptorImpl]

'predefinedEnhancementInfo' @ [163:47] ==> val predefinedEnhancementInfo: PredefinedFunctionEnhancementInfo? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'returnTypeInfo' @ [163:74] ==> public final val returnTypeInfo: TypeEnhancementInfo? defined in org.jetbrains.kotlin.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo[PropertyDescriptorImpl]

'receiverTypeEnhancement' @ [165:14] ==> val receiverTypeEnhancement: SignatureEnhancement.PartEnhancementResult? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'wereChanges' @ [165:39] ==> public final val wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult[PropertyDescriptorImpl]

'returnTypeEnhancement' @ [166:16] ==> val returnTypeEnhancement: SignatureEnhancement.PartEnhancementResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'wereChanges' @ [166:38] ==> public final val wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult[PropertyDescriptorImpl]

'valueParameterEnhancements' @ [166:53] ==> val valueParameterEnhancements: List<SignatureEnhancement.PartEnhancementResult> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'any' @ [166:80] ==> public inline fun <T> Iterable<SignatureEnhancement.PartEnhancementResult>.any(predicate: (SignatureEnhancement.PartEnhancementResult) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartEnhancementResult

'it' @ [166:86] ==> value-parameter it: SignatureEnhancement.PartEnhancementResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ValueParameterDescriptorImpl]

'wereChanges' @ [166:89] ==> public final val wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult[PropertyDescriptorImpl]

'Suppress' @ [167:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [168:20] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ReceiverParameterDescriptorImpl]

'enhance' @ [168:25] ==> @NotNull public abstract fun enhance(@Nullable enhancedReceiverType: KotlinType?, @NotNull enhancedValueParametersTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>), @NotNull enhancedReturnType: KotlinType): JavaCallableMemberDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.JavaCallableMemberDescriptor[JavaMethodDescriptor]

'receiverTypeEnhancement' @ [168:33] ==> val receiverTypeEnhancement: SignatureEnhancement.PartEnhancementResult? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'type' @ [168:58] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult[PropertyDescriptorImpl]

'valueParameterEnhancements' @ [168:64] ==> val valueParameterEnhancements: List<SignatureEnhancement.PartEnhancementResult> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'map' @ [168:91] ==> public inline fun <T, R> Iterable<SignatureEnhancement.PartEnhancementResult>.map(transform: (SignatureEnhancement.PartEnhancementResult) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartEnhancementResult
    <R> -> KotlinType

'it' @ [168:97] ==> value-parameter it: SignatureEnhancement.PartEnhancementResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [168:100] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult[PropertyDescriptorImpl]

'returnTypeEnhancement' @ [168:108] ==> val returnTypeEnhancement: SignatureEnhancement.PartEnhancementResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[LocalVariableDescriptor]

'type' @ [168:130] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult[PropertyDescriptorImpl]

'this' @ [171:16] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature[ReceiverParameterDescriptorImpl]

'computeIndexedQualifiersForOverride' @ [182:30] ==> private final fun computeIndexedQualifiersForOverride(): (Int) -> JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[SimpleFunctionDescriptorImpl]

'predefined' @ [184:76] ==> value-parameter predefined: TypeEnhancementInfo? = ... defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance[ValueParameterDescriptorImpl]

'let' @ [184:88] ==> @InlineOnly public inline fun <T, R> TypeEnhancementInfo.let(block: (TypeEnhancementInfo) -> ((Int) -> JavaTypeQualifiers)?): ((Int) -> JavaTypeQualifiers)? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeEnhancementInfo
    <R> -> Function1<Int, JavaTypeQualifiers>?

'predefined' @ [187:21] ==> value-parameter predefined: TypeEnhancementInfo? = ... defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance[ValueParameterDescriptorImpl]

'map' @ [187:32] ==> public final val map: Map<Int, JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeEnhancementInfo[PropertyDescriptorImpl]

'index' @ [187:36] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [187:46] ==> public abstract operator fun invoke(p1: Int): JavaTypeQualifiers defined in kotlin.Function1[FunctionInvokeDescriptor]

'index' @ [187:57] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fromOverride' @ [191:20] ==> private final val fromOverride: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'enhance' @ [191:33] ==> public fun KotlinType.enhance(qualifiers: (Int) -> JavaTypeQualifiers): KotlinType? defined in org.jetbrains.kotlin.load.java.typeEnhancement[SimpleFunctionDescriptorImpl]

'qualifiersWithPredefined' @ [191:41] ==> val qualifiersWithPredefined: ((Int) -> JavaTypeQualifiers)? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance[LocalVariableDescriptor]

'qualifiers' @ [191:69] ==> val qualifiers: (Int) -> JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance[LocalVariableDescriptor]

'let' @ [191:82] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> SignatureEnhancement.PartEnhancementResult): SignatureEnhancement.PartEnhancementResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> PartEnhancementResult

'PartEnhancementResult' @ [193:17] ==> public constructor PartEnhancementResult(type: KotlinType, wereChanges: Boolean) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult[ClassConstructorDescriptorImpl]

'enhanced' @ [193:39] ==> value-parameter enhanced: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance.<anonymous>[ValueParameterDescriptorImpl]

'PartEnhancementResult' @ [194:18] ==> public constructor PartEnhancementResult(type: KotlinType, wereChanges: Boolean) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult[ClassConstructorDescriptorImpl]

'fromOverride' @ [194:40] ==> private final val fromOverride: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'component1' @ [198:18] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [198:25] ==> public final operator fun component2(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (this.isFlexible())
                        asFlexibleType().let { Pair(it.lowerBound, it.upperBound) }
                    else Pair(this, this)' @ [199:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<KotlinType, KotlinType>, elseBranch: Pair<KotlinType, KotlinType>): Pair<KotlinType, KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<KotlinType, KotlinType>

'this' @ [199:25] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers[ReceiverParameterDescriptorImpl]

'isFlexible' @ [199:30] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'asFlexibleType' @ [200:25] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'let' @ [200:42] ==> @InlineOnly public inline fun <T, R> FlexibleType.let(block: (FlexibleType) -> Pair<SimpleType, SimpleType>): Pair<SimpleType, SimpleType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlexibleType
    <R> -> Pair<SimpleType, SimpleType>

'Pair' @ [200:48] ==> public constructor Pair<out A, out B>(first: SimpleType, second: SimpleType) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SimpleType
    <out B> -> SimpleType

'it' @ [200:53] ==> value-parameter it: FlexibleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers.<anonymous>[ValueParameterDescriptorImpl]

'lowerBound' @ [200:56] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'it' @ [200:68] ==> value-parameter it: FlexibleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers.<anonymous>[ValueParameterDescriptorImpl]

'upperBound' @ [200:71] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'Pair' @ [201:26] ==> public constructor Pair<out A, out B>(first: KotlinType, second: KotlinType) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> KotlinType
    <out B> -> KotlinType

'this' @ [201:31] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers[ReceiverParameterDescriptorImpl]

'this' @ [201:37] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers[ReceiverParameterDescriptorImpl]

'JavaToKotlinClassMap' @ [203:27] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform in file JavaToKotlinClassMap.kt[FakeCallableDescriptorForObject]

'JavaTypeQualifiers' @ [204:20] ==> internal constructor JavaTypeQualifiers(nullability: NullabilityQualifier?, mutability: MutabilityQualifier?, isNotNullTypeParameter: Boolean, isNullabilityQualifierForWarning: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[ClassConstructorDescriptorImpl]

'when {
                        lower.isMarkedNullable -> NullabilityQualifier.NULLABLE
                        !upper.isMarkedNullable -> NullabilityQualifier.NOT_NULL
                        else -> null
                    }' @ [205:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NullabilityQualifier?, entry1: NullabilityQualifier?, entry2: NullabilityQualifier?): NullabilityQualifier?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NullabilityQualifier?

'lower' @ [206:25] ==> val lower: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers[LocalVariableDescriptor]

'isMarkedNullable' @ [206:31] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'NULLABLE' @ [206:72] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'!' @ [207:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'upper' @ [207:26] ==> val upper: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers[LocalVariableDescriptor]

'isMarkedNullable' @ [207:32] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'NOT_NULL' @ [207:73] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'when {
                        mapping.isReadOnly(lower) -> MutabilityQualifier.READ_ONLY
                        mapping.isMutable(upper) -> MutabilityQualifier.MUTABLE
                        else -> null
                    }' @ [210:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MutabilityQualifier?, entry1: MutabilityQualifier?, entry2: MutabilityQualifier?): MutabilityQualifier?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MutabilityQualifier?

'mapping' @ [211:25] ==> val mapping: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers[LocalVariableDescriptor]

'isReadOnly' @ [211:33] ==> public final fun isReadOnly(type: KotlinType): Boolean defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'lower' @ [211:44] ==> val lower: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers[LocalVariableDescriptor]

'READ_ONLY' @ [211:74] ==> enum entry READ_ONLY defined in org.jetbrains.kotlin.load.java.typeEnhancement.MutabilityQualifier[FakeCallableDescriptorForObject]

'mapping' @ [212:25] ==> val mapping: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers[LocalVariableDescriptor]

'isMutable' @ [212:33] ==> public final fun isMutable(type: KotlinType): Boolean defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'upper' @ [212:43] ==> val upper: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers[LocalVariableDescriptor]

'MUTABLE' @ [212:73] ==> enum entry MUTABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.MutabilityQualifier[FakeCallableDescriptorForObject]

'unwrap' @ [215:46] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'if (isHeadTypeConstructor && typeContainer != null)
                        composeAnnotations(typeContainer.annotations, annotations)
                    else
                        annotations' @ [220:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Annotations, elseBranch: Annotations): Annotations[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Annotations

'isHeadTypeConstructor' @ [220:25] ==> value-parameter isHeadTypeConstructor: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[ValueParameterDescriptorImpl]

'typeContainer' @ [220:50] ==> private final val typeContainer: Annotated? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'composeAnnotations' @ [221:25] ==> public fun composeAnnotations(first: Annotations, second: Annotations): Annotations defined in org.jetbrains.kotlin.descriptors.annotations[DeserializedSimpleFunctionDescriptor]

'typeContainer' @ [221:44] ==> private final val typeContainer: Annotated? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'annotations' @ [221:58] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotated[DeserializedPropertyDescriptor]

'annotations' @ [221:71] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'annotations' @ [223:25] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'if (any { composedAnnotation.findAnnotation(it) != null }) qualifier else null' @ [226:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'any' @ [226:25] ==> public inline fun <T> Iterable<FqName>.any(predicate: (FqName) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'composedAnnotation' @ [226:31] ==> val composedAnnotation: Annotations defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[LocalVariableDescriptor]

'findAnnotation' @ [226:50] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'it' @ [226:65] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations.ifPresent.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [226:80] ==> value-parameter qualifier: T defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations.ifPresent[ValueParameterDescriptorImpl]

'if (x == null || y == null || x == y) x ?: y else null' @ [228:56] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'x' @ [228:60] ==> value-parameter x: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations.uniqueNotNull[ValueParameterDescriptorImpl]

'y' @ [228:73] ==> value-parameter y: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations.uniqueNotNull[ValueParameterDescriptorImpl]

'x' @ [228:86] ==> value-parameter x: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations.uniqueNotNull[ValueParameterDescriptorImpl]

'y' @ [228:91] ==> value-parameter y: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations.uniqueNotNull[ValueParameterDescriptorImpl]

'x' @ [228:94] ==> value-parameter x: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations.uniqueNotNull[ValueParameterDescriptorImpl]

'y' @ [228:99] ==> value-parameter y: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations.uniqueNotNull[ValueParameterDescriptorImpl]

'defaultTopLevelQualifiers' @ [230:40] ==> private final val defaultTopLevelQualifiers: JavaTypeQualifiers? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'takeIf' @ [230:67] ==> @InlineOnly @SinceKotlin public inline fun <T> JavaTypeQualifiers.takeIf(predicate: (JavaTypeQualifiers) -> Boolean): JavaTypeQualifiers? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeQualifiers

'isHeadTypeConstructor' @ [230:76] ==> value-parameter isHeadTypeConstructor: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[ValueParameterDescriptorImpl]

'composedAnnotation' @ [232:21] ==> val composedAnnotation: Annotations defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[LocalVariableDescriptor]

'extractNullability' @ [232:40] ==> private final fun Annotations.extractNullability(): NullabilityQualifierWithMigrationStatus? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[SimpleFunctionDescriptorImpl]

'defaultTypeQualifier' @ [233:24] ==> val defaultTypeQualifier: JavaTypeQualifiers? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[LocalVariableDescriptor]

'nullability' @ [233:46] ==> public final val nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'let' @ [233:59] ==> @InlineOnly public inline fun <T, R> NullabilityQualifier.let(block: (NullabilityQualifier) -> NullabilityQualifierWithMigrationStatus): NullabilityQualifierWithMigrationStatus defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NullabilityQualifier
    <R> -> NullabilityQualifierWithMigrationStatus

'NullabilityQualifierWithMigrationStatus' @ [234:25] ==> public constructor NullabilityQualifierWithMigrationStatus(qualifier: NullabilityQualifier, isForWarningOnly: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus[ClassConstructorDescriptorImpl]

'defaultTypeQualifier' @ [235:33] ==> val defaultTypeQualifier: JavaTypeQualifiers? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[LocalVariableDescriptor]

'nullability' @ [235:54] ==> public final val nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'defaultTypeQualifier' @ [236:33] ==> val defaultTypeQualifier: JavaTypeQualifiers? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[LocalVariableDescriptor]

'isNullabilityQualifierForWarning' @ [236:54] ==> internal final val isNullabilityQualifierForWarning: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'JavaTypeQualifiers' @ [240:20] ==> internal constructor JavaTypeQualifiers(nullability: NullabilityQualifier?, mutability: MutabilityQualifier?, isNotNullTypeParameter: Boolean, isNullabilityQualifierForWarning: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[ClassConstructorDescriptorImpl]

'nullabilityInfo' @ [241:21] ==> val nullabilityInfo: NullabilityQualifierWithMigrationStatus? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[LocalVariableDescriptor]

'qualifier' @ [241:38] ==> public final val qualifier: NullabilityQualifier defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus[PropertyDescriptorImpl]

'uniqueNotNull' @ [242:21] ==> local final fun <T : Any> uniqueNotNull(x: MutabilityQualifier?, y: MutabilityQualifier?): MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> MutabilityQualifier

'READ_ONLY_ANNOTATIONS' @ [243:29] ==> public val READ_ONLY_ANNOTATIONS: List<(FqName..FqName?)> defined in org.jetbrains.kotlin.load.java in file JvmAnnotationNames.kt[PropertyDescriptorImpl]

'ifPresent' @ [243:51] ==> local final fun <T : Any> List<FqName>.ifPresent(qualifier: MutabilityQualifier): MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> MutabilityQualifier

'READ_ONLY' @ [244:57] ==> enum entry READ_ONLY defined in org.jetbrains.kotlin.load.java.typeEnhancement.MutabilityQualifier[FakeCallableDescriptorForObject]

'MUTABLE_ANNOTATIONS' @ [246:29] ==> public val MUTABLE_ANNOTATIONS: List<(FqName..FqName?)> defined in org.jetbrains.kotlin.load.java in file JvmAnnotationNames.kt[PropertyDescriptorImpl]

'ifPresent' @ [246:49] ==> local final fun <T : Any> List<FqName>.ifPresent(qualifier: MutabilityQualifier): MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> MutabilityQualifier

'MUTABLE' @ [247:57] ==> enum entry MUTABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.MutabilityQualifier[FakeCallableDescriptorForObject]

'nullabilityInfo' @ [250:46] ==> val nullabilityInfo: NullabilityQualifierWithMigrationStatus? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[LocalVariableDescriptor]

'qualifier' @ [250:63] ==> public final val qualifier: NullabilityQualifier defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus[PropertyDescriptorImpl]

'NOT_NULL' @ [250:97] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'isTypeParameter' @ [250:109] ==> public fun KotlinType.isTypeParameter(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'nullabilityInfo' @ [251:56] ==> val nullabilityInfo: NullabilityQualifierWithMigrationStatus? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations[LocalVariableDescriptor]

'isForWarningOnly' @ [251:73] ==> public final val isForWarningOnly: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus[PropertyDescriptorImpl]

'this' @ [256:17] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractNullability[ReceiverParameterDescriptorImpl]

'firstNotNullResult' @ [256:22] ==> public inline fun <T, R : Any> Iterable<AnnotationDescriptor>.firstNotNullResult(transform: (AnnotationDescriptor) -> NullabilityQualifierWithMigrationStatus?): NullabilityQualifierWithMigrationStatus? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R : Any> -> NullabilityQualifierWithMigrationStatus

'this@SignatureEnhancement' @ [256:41] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[LazyClassReceiverParameterDescriptor]

'ArrayList' @ [260:28] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'list' @ [263:21] ==> val list: ArrayList<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed[LocalVariableDescriptor]

'add' @ [263:26] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'type' @ [263:30] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed.add[ValueParameterDescriptorImpl]

'type' @ [264:33] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed.add[ValueParameterDescriptorImpl]

'arguments' @ [264:38] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'if (arg.isStarProjection) {
                            list.add(arg.type)
                        }
                        else {
                            add(arg.type)
                        }' @ [265:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'arg' @ [265:29] ==> val arg: TypeProjection defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed.add[LocalVariableDescriptor]

'isStarProjection' @ [265:33] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'list' @ [266:29] ==> val list: ArrayList<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed[LocalVariableDescriptor]

'add' @ [266:34] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'arg' @ [266:38] ==> val arg: TypeProjection defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed.add[LocalVariableDescriptor]

'type' @ [266:42] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'add' @ [269:29] ==> local final fun add(type: KotlinType): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed[SimpleFunctionDescriptorImpl]

'arg' @ [269:33] ==> val arg: TypeProjection defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed.add[LocalVariableDescriptor]

'type' @ [269:37] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'add' @ [274:17] ==> local final fun add(type: KotlinType): Unit defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed[SimpleFunctionDescriptorImpl]

'this' @ [274:21] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed[ReceiverParameterDescriptorImpl]

'list' @ [275:24] ==> val list: ArrayList<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.toIndexed[LocalVariableDescriptor]

'fromOverridden' @ [278:41] ==> private final val fromOverridden: Collection<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'map' @ [278:56] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> List<KotlinType>): List<List<KotlinType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> List<KotlinType>

'it' @ [278:62] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'toIndexed' @ [278:65] ==> local final fun KotlinType.toIndexed(): List<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride[SimpleFunctionDescriptorImpl]

'fromOverride' @ [279:35] ==> private final val fromOverride: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'toIndexed' @ [279:48] ==> local final fun KotlinType.toIndexed(): List<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride[SimpleFunctionDescriptorImpl]

'isCovariant' @ [286:43] ==> private final val isCovariant: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'fromOverridden' @ [286:58] ==> private final val fromOverridden: Collection<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'any' @ [286:73] ==> public inline fun <T> Iterable<KotlinType>.any(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'!' @ [286:79] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [286:98] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [286:106] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'it' @ [286:117] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'fromOverride' @ [286:121] ==> private final val fromOverride: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'if (onlyHeadTypeConstructor) 1 else indexedThisType.size' @ [288:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'onlyHeadTypeConstructor' @ [288:32] ==> val onlyHeadTypeConstructor: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride[LocalVariableDescriptor]

'indexedThisType' @ [288:64] ==> val indexedThisType: List<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride[LocalVariableDescriptor]

'size' @ [288:80] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Array' @ [289:34] ==> public constructor Array<T>(size: Int, init: (Int) -> JavaTypeQualifiers) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> JavaTypeQualifiers

'treeSize' @ [289:40] ==> val treeSize: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride[LocalVariableDescriptor]

'index' @ [291:45] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [292:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isHeadTypeConstructor' @ [292:24] ==> val isHeadTypeConstructor: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[LocalVariableDescriptor]

'!' @ [292:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'onlyHeadTypeConstructor' @ [292:50] ==> val onlyHeadTypeConstructor: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride[LocalVariableDescriptor]

'indexedThisType' @ [294:34] ==> val indexedThisType: List<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride[LocalVariableDescriptor]

'index' @ [294:50] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'indexedFromSupertypes' @ [295:37] ==> val indexedFromSupertypes: List<List<KotlinType>> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride[LocalVariableDescriptor]

'mapNotNull' @ [295:59] ==> public inline fun <T, R : Any> Iterable<List<KotlinType>>.mapNotNull(transform: (List<KotlinType>) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<KotlinType>
    <R : Any> -> KotlinType

'it' @ [295:72] ==> value-parameter it: List<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getOrNull' @ [295:75] ==> public fun <T> List<KotlinType>.getOrNull(index: Int): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'index' @ [295:85] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'qualifiers' @ [298:17] ==> val qualifiers: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[LocalVariableDescriptor]

'computeQualifiersForOverride' @ [298:28] ==> private final fun KotlinType.computeQualifiersForOverride(fromSupertypes: Collection<KotlinType>, isCovariant: Boolean, isHeadTypeConstructor: Boolean): JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[SimpleFunctionDescriptorImpl]

'verticalSlice' @ [298:57] ==> val verticalSlice: List<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[LocalVariableDescriptor]

'isCovariant' @ [298:72] ==> private final val isCovariant: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[PropertyDescriptorImpl]

'isHeadTypeConstructor' @ [298:87] ==> val isHeadTypeConstructor: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[LocalVariableDescriptor]

'isHeadTypeConstructor' @ [298:110] ==> val isHeadTypeConstructor: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[LocalVariableDescriptor]

'computedResult' @ [301:31] ==> val computedResult: Array<JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride[LocalVariableDescriptor]

'getOrElse' @ [301:46] ==> @InlineOnly public inline fun <T> Array<out JavaTypeQualifiers>.getOrElse(index: Int, defaultValue: (Int) -> JavaTypeQualifiers): JavaTypeQualifiers defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeQualifiers

'index' @ [301:56] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'JavaTypeQualifiers' @ [301:65] ==> public companion object defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[FakeCallableDescriptorForObject]

'NONE' @ [301:84] ==> public final val NONE: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers.Companion[PropertyDescriptorImpl]

'fromSupertypes' @ [308:35] ==> value-parameter fromSupertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[ValueParameterDescriptorImpl]

'map' @ [308:50] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> JavaTypeQualifiers): List<JavaTypeQualifiers> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> JavaTypeQualifiers

'it' @ [308:56] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'extractQualifiers' @ [308:59] ==> private final fun KotlinType.extractQualifiers(): JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[SimpleFunctionDescriptorImpl]

'superQualifiers' @ [309:44] ==> val superQualifiers: List<JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'mapNotNull' @ [309:60] ==> public inline fun <T, R : Any> Iterable<JavaTypeQualifiers>.mapNotNull(transform: (JavaTypeQualifiers) -> MutabilityQualifier?): List<MutabilityQualifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeQualifiers
    <R : Any> -> MutabilityQualifier

'it' @ [309:73] ==> value-parameter it: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'mutability' @ [309:76] ==> public final val mutability: MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'toSet' @ [309:89] ==> public fun <T> Iterable<MutabilityQualifier>.toSet(): Set<MutabilityQualifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutabilityQualifier

'superQualifiers' @ [310:45] ==> val superQualifiers: List<JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'mapNotNull' @ [310:61] ==> public inline fun <T, R : Any> Iterable<JavaTypeQualifiers>.mapNotNull(transform: (JavaTypeQualifiers) -> NullabilityQualifier?): List<NullabilityQualifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeQualifiers
    <R : Any> -> NullabilityQualifier

'it' @ [310:74] ==> value-parameter it: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'nullability' @ [310:77] ==> public final val nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'toSet' @ [310:91] ==> public fun <T> Iterable<NullabilityQualifier>.toSet(): Set<NullabilityQualifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NullabilityQualifier

'fromSupertypes' @ [311:56] ==> value-parameter fromSupertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[ValueParameterDescriptorImpl]

'mapNotNull' @ [312:22] ==> public inline fun <T, R : Any> Iterable<KotlinType>.mapNotNull(transform: (KotlinType) -> NullabilityQualifier?): List<NullabilityQualifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R : Any> -> NullabilityQualifier

'it' @ [312:35] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'unwrapEnhancement' @ [312:38] ==> public fun KotlinType.unwrapEnhancement(): KotlinType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'extractQualifiers' @ [312:58] ==> private final fun KotlinType.extractQualifiers(): JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[SimpleFunctionDescriptorImpl]

'nullability' @ [312:78] ==> public final val nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'toSet' @ [313:22] ==> public fun <T> Iterable<NullabilityQualifier>.toSet(): Set<NullabilityQualifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NullabilityQualifier

'takeIf' @ [314:22] ==> @InlineOnly @SinceKotlin public inline fun <T> Set<NullabilityQualifier>.takeIf(predicate: (Set<NullabilityQualifier>) -> Boolean): Set<NullabilityQualifier>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<NullabilityQualifier>

'it' @ [314:31] ==> value-parameter it: Set<NullabilityQualifier> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'nullabilityFromSupertypes' @ [314:37] ==> val nullabilityFromSupertypes: Set<NullabilityQualifier> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'extractQualifiersFromAnnotations' @ [316:23] ==> private final fun KotlinType.extractQualifiersFromAnnotations(isHeadTypeConstructor: Boolean): JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[SimpleFunctionDescriptorImpl]

'isHeadTypeConstructor' @ [316:56] ==> value-parameter isHeadTypeConstructor: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[ValueParameterDescriptorImpl]

'own' @ [317:45] ==> val own: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'isNotNullTypeParameter' @ [317:49] ==> internal final val isNotNullTypeParameter: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'superQualifiers' @ [317:75] ==> val superQualifiers: List<JavaTypeQualifiers> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'any' @ [317:91] ==> public inline fun <T> Iterable<JavaTypeQualifiers>.any(predicate: (JavaTypeQualifiers) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeQualifiers

'it' @ [317:97] ==> value-parameter it: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'isNotNullTypeParameter' @ [317:100] ==> internal final val isNotNullTypeParameter: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'!' @ [324:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnyNonNullTypeParameter' @ [324:22] ==> val isAnyNonNullTypeParameter: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'nullability' @ [324:51] ==> value-parameter nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.createJavaTypeQualifiers[ValueParameterDescriptorImpl]

'NOT_NULL' @ [324:87] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'JavaTypeQualifiers' @ [325:28] ==> internal constructor JavaTypeQualifiers(nullability: NullabilityQualifier?, mutability: MutabilityQualifier?, isNotNullTypeParameter: Boolean, isNullabilityQualifierForWarning: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[ClassConstructorDescriptorImpl]

'nullability' @ [325:47] ==> value-parameter nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.createJavaTypeQualifiers[ValueParameterDescriptorImpl]

'mutability' @ [325:60] ==> value-parameter mutability: MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.createJavaTypeQualifiers[ValueParameterDescriptorImpl]

'forWarning' @ [325:79] ==> value-parameter forWarning: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.createJavaTypeQualifiers[ValueParameterDescriptorImpl]

'JavaTypeQualifiers' @ [327:24] ==> internal constructor JavaTypeQualifiers(nullability: NullabilityQualifier?, mutability: MutabilityQualifier?, isNotNullTypeParameter: Boolean, isNullabilityQualifierForWarning: Boolean = ...) defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[ClassConstructorDescriptorImpl]

'nullability' @ [327:43] ==> value-parameter nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.createJavaTypeQualifiers[ValueParameterDescriptorImpl]

'mutability' @ [327:56] ==> value-parameter mutability: MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.createJavaTypeQualifiers[ValueParameterDescriptorImpl]

'forWarning' @ [327:74] ==> value-parameter forWarning: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.createJavaTypeQualifiers[ValueParameterDescriptorImpl]

'isCovariant' @ [331:21] ==> value-parameter isCovariant: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[ValueParameterDescriptorImpl]

'if (low in this) low else if (high in this) high else null' @ [332:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'low' @ [332:50] ==> value-parameter low: T defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ValueParameterDescriptorImpl]

'this' @ [332:57] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ReceiverParameterDescriptorImpl]

'low' @ [332:63] ==> value-parameter low: T defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ValueParameterDescriptorImpl]

'if (high in this) high else null' @ [332:72] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'high' @ [332:76] ==> value-parameter high: T defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ValueParameterDescriptorImpl]

'this' @ [332:84] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ReceiverParameterDescriptorImpl]

'high' @ [332:90] ==> value-parameter high: T defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ValueParameterDescriptorImpl]

'if (supertypeQualifier == low && own == high) null else own ?: supertypeQualifier' @ [333:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'supertypeQualifier' @ [333:32] ==> val supertypeQualifier: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[LocalVariableDescriptor]

'low' @ [333:54] ==> value-parameter low: T defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ValueParameterDescriptorImpl]

'own' @ [333:61] ==> value-parameter own: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ValueParameterDescriptorImpl]

'high' @ [333:68] ==> value-parameter high: T defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ValueParameterDescriptorImpl]

'own' @ [333:84] ==> value-parameter own: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ValueParameterDescriptorImpl]

'supertypeQualifier' @ [333:91] ==> val supertypeQualifier: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[LocalVariableDescriptor]

'own' @ [337:36] ==> value-parameter own: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ValueParameterDescriptorImpl]

'let' @ [337:41] ==> @InlineOnly public inline fun <T, R> T.let(block: (T) -> Set<T>): Set<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> Set<T>

'this' @ [337:48] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ReceiverParameterDescriptorImpl]

'own' @ [337:55] ==> value-parameter own: T? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ValueParameterDescriptorImpl]

'toSet' @ [337:60] ==> public fun <T> Iterable<T>.toSet(): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'this' @ [337:73] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[ReceiverParameterDescriptorImpl]

'effectiveSet' @ [341:24] ==> val effectiveSet: Set<T> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.select[LocalVariableDescriptor]

'singleOrNull' @ [341:37] ==> public fun <T> Iterable<T>.singleOrNull(): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'own' @ [344:34] ==> val own: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'takeIf' @ [344:38] ==> @InlineOnly @SinceKotlin public inline fun <T> JavaTypeQualifiers.takeIf(predicate: (JavaTypeQualifiers) -> Boolean): JavaTypeQualifiers? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeQualifiers

'!' @ [344:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [344:48] ==> value-parameter it: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride.<anonymous>[ValueParameterDescriptorImpl]

'isNullabilityQualifierForWarning' @ [344:51] ==> internal final val isNullabilityQualifierForWarning: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'nullability' @ [344:87] ==> public final val nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'own' @ [345:44] ==> val own: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'nullability' @ [345:48] ==> public final val nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'nullabilityFromSupertypes' @ [347:31] ==> val nullabilityFromSupertypes: Set<NullabilityQualifier> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'select' @ [347:57] ==> local final fun <T : Any> Set<NullabilityQualifier>.select(low: NullabilityQualifier, high: NullabilityQualifier, own: NullabilityQualifier?): NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> NullabilityQualifier

'NOT_NULL' @ [347:85] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'NULLABLE' @ [347:116] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'ownNullability' @ [347:126] ==> val ownNullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'mutabilityFromSupertypes' @ [348:30] ==> val mutabilityFromSupertypes: Set<MutabilityQualifier> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'select' @ [348:55] ==> local final fun <T : Any> Set<MutabilityQualifier>.select(low: MutabilityQualifier, high: MutabilityQualifier, own: MutabilityQualifier?): MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> MutabilityQualifier

'MUTABLE' @ [348:82] ==> enum entry MUTABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.MutabilityQualifier[FakeCallableDescriptorForObject]

'READ_ONLY' @ [348:111] ==> enum entry READ_ONLY defined in org.jetbrains.kotlin.load.java.typeEnhancement.MutabilityQualifier[FakeCallableDescriptorForObject]

'own' @ [348:122] ==> val own: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'mutability' @ [348:126] ==> public final val mutability: MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'ownNullabilityForWarning' @ [350:29] ==> val ownNullabilityForWarning: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'ownNullability' @ [350:57] ==> val ownNullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'nullabilityFromSupertypesWithWarning' @ [350:75] ==> val nullabilityFromSupertypesWithWarning: Set<NullabilityQualifier>? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'nullability' @ [351:17] ==> val nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'canChange' @ [351:40] ==> val canChange: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'nullabilityFromSupertypesWithWarning' @ [352:47] ==> val nullabilityFromSupertypesWithWarning: Set<NullabilityQualifier>? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'nullabilityFromSupertypes' @ [352:87] ==> val nullabilityFromSupertypes: Set<NullabilityQualifier> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'select' @ [353:26] ==> local final fun <T : Any> Set<NullabilityQualifier>.select(low: NullabilityQualifier, high: NullabilityQualifier, own: NullabilityQualifier?): NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> NullabilityQualifier

'NOT_NULL' @ [353:54] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'NULLABLE' @ [353:85] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'ownNullabilityForWarning' @ [353:95] ==> val ownNullabilityForWarning: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'createJavaTypeQualifiers' @ [355:24] ==> local final fun createJavaTypeQualifiers(nullability: NullabilityQualifier?, mutability: MutabilityQualifier?, forWarning: Boolean): JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[SimpleFunctionDescriptorImpl]

'nullabilityWithWarning' @ [355:49] ==> val nullabilityWithWarning: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'mutability' @ [355:73] ==> val mutability: MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'createJavaTypeQualifiers' @ [358:20] ==> local final fun createJavaTypeQualifiers(nullability: NullabilityQualifier?, mutability: MutabilityQualifier?, forWarning: Boolean): JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[SimpleFunctionDescriptorImpl]

'nullability' @ [358:45] ==> val nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'mutability' @ [358:58] ==> val mutability: MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'nullability' @ [358:69] ==> val nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride[LocalVariableDescriptor]

'SignatureParts' @ [370:16] ==> public constructor SignatureParts(typeContainer: Annotated?, fromOverride: KotlinType, fromOverridden: Collection<KotlinType>, isCovariant: Boolean, defaultTopLevelQualifiers: JavaTypeQualifiers?) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.SignatureParts[ClassConstructorDescriptorImpl]

'typeContainer' @ [371:17] ==> value-parameter typeContainer: Annotated? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.parts[ValueParameterDescriptorImpl]

'invoke' @ [372:17] ==> public abstract operator fun invoke(p1: CallableMemberDescriptor): KotlinType defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [372:27] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.parts[ReceiverParameterDescriptorImpl]

'this' @ [373:17] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.parts[ReceiverParameterDescriptorImpl]

'overriddenDescriptors' @ [373:22] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'map' @ [373:44] ==> public inline fun <T, R> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.map(transform: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <R> -> KotlinType

'invoke' @ [374:21] ==> public abstract operator fun invoke(p1: CallableMemberDescriptor): KotlinType defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [374:31] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.parts.<anonymous>[ValueParameterDescriptorImpl]

'isCovariant' @ [376:17] ==> value-parameter isCovariant: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.parts[ValueParameterDescriptorImpl]

'defaultTopLevelQualifiers' @ [377:17] ==> value-parameter defaultTopLevelQualifiers: JavaTypeQualifiers? defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.parts[ValueParameterDescriptorImpl]

