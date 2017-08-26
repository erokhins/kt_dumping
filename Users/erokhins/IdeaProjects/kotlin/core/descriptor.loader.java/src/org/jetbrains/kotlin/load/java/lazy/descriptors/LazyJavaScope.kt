'MemberScopeImpl' @ [50:74] ==> public constructor MemberScopeImpl() defined in org.jetbrains.kotlin.resolve.scopes.MemberScopeImpl[ClassConstructorDescriptorImpl]

'c' @ [55:34] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'storageManager' @ [55:36] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createRecursionTolerantLazyValue' @ [55:51] ==> public abstract fun <T : Any> createRecursionTolerantLazyValue(computable: () -> Collection<DeclarationDescriptor>, onRecursiveCall: Collection<DeclarationDescriptor>): NotNullLazyValue<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Collection<DeclarationDescriptor>

'computeDescriptors' @ [56:15] ==> protected final fun computeDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, location: LookupLocation): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'ALL' @ [56:55] ==> @JvmField public final val ALL: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'ALL_NAME_FILTER' @ [56:72] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[PropertyDescriptorImpl]

'WHEN_GET_ALL_DESCRIPTORS' @ [56:106] ==> enum entry WHEN_GET_ALL_DESCRIPTORS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'listOf' @ [61:13] ==> @InlineOnly public inline fun <T> listOf(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'c' @ [64:80] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'storageManager' @ [64:82] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [64:97] ==> public abstract fun <T : Any> createLazyValue(computable: () -> DeclaredMemberIndex): NotNullLazyValue<DeclaredMemberIndex> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> DeclaredMemberIndex

'computeMemberIndex' @ [64:115] ==> protected abstract fun computeMemberIndex(): DeclaredMemberIndex defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'c' @ [73:29] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'storageManager' @ [73:31] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createMemoizedFunction' @ [73:46] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (Name) -> Collection<SimpleFunctionDescriptor>): MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Name
    <V : Any> -> Collection<SimpleFunctionDescriptor>

'LinkedHashSet' @ [75:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SimpleFunctionDescriptor

'invoke' @ [77:24] ==> public abstract fun invoke(): DeclaredMemberIndex defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'findMethodsByName' @ [77:46] ==> public abstract fun findMethodsByName(name: Name): Collection<JavaMethod> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.DeclaredMemberIndex[SimpleFunctionDescriptorImpl]

'name' @ [77:64] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[ValueParameterDescriptorImpl]

'resolveMethodToFunctionDescriptor' @ [78:30] ==> protected final fun resolveMethodToFunctionDescriptor(method: JavaMethod): JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'method' @ [78:64] ==> val method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[LocalVariableDescriptor]

'!' @ [79:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [79:18] ==> val descriptor: JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[LocalVariableDescriptor]

'isVisibleAsFunction' @ [79:29] ==> protected open fun JavaMethodDescriptor.isVisibleAsFunction(): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'c' @ [81:13] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'components' @ [81:15] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'javaResolverCache' @ [81:26] ==> public final val javaResolverCache: JavaResolverCache defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'recordMethod' @ [81:44] ==> public abstract fun recordMethod(@NotNull method: JavaMethod, @NotNull descriptor: SimpleFunctionDescriptor): Unit defined in org.jetbrains.kotlin.load.java.components.JavaResolverCache[JavaMethodDescriptor]

'method' @ [81:57] ==> val method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [81:65] ==> val descriptor: JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[LocalVariableDescriptor]

'result' @ [82:13] ==> val result: LinkedHashSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[LocalVariableDescriptor]

'add' @ [82:20] ==> public open fun add(element: SimpleFunctionDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [82:24] ==> val descriptor: JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[LocalVariableDescriptor]

'result' @ [85:9] ==> val result: LinkedHashSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[LocalVariableDescriptor]

'retainMostSpecificInEachOverridableGroup' @ [85:16] ==> public fun <D : CallableDescriptor> MutableCollection<SimpleFunctionDescriptor>.retainMostSpecificInEachOverridableGroup(): Unit defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> SimpleFunctionDescriptor

'computeNonDeclaredFunctions' @ [87:9] ==> protected abstract fun computeNonDeclaredFunctions(result: MutableCollection<SimpleFunctionDescriptor>, name: Name): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'result' @ [87:37] ==> val result: LinkedHashSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[LocalVariableDescriptor]

'name' @ [87:45] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [89:9] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'components' @ [89:11] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'signatureEnhancement' @ [89:22] ==> public final val signatureEnhancement: SignatureEnhancement defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'enhanceSignatures' @ [89:43] ==> public final fun <D : CallableMemberDescriptor> enhanceSignatures(c: LazyJavaResolverContext, platformSignatures: Collection<SimpleFunctionDescriptor>): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> SimpleFunctionDescriptor

'c' @ [89:61] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'result' @ [89:64] ==> val result: LinkedHashSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.functions.<anonymous>[LocalVariableDescriptor]

'toList' @ [89:72] ==> public fun <T> Iterable<SimpleFunctionDescriptor>.toList(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'c' @ [111:27] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'resolveAnnotations' @ [111:29] ==> public fun LazyJavaResolverContext.resolveAnnotations(annotationsOwner: JavaAnnotationOwner): Annotations defined in org.jetbrains.kotlin.load.java.lazy in file LazyJavaAnnotations.kt[SimpleFunctionDescriptorImpl]

'method' @ [111:48] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'createJavaMethod' @ [112:59] ==> @NotNull public open fun createJavaMethod(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull annotations: Annotations, @NotNull name: Name, @NotNull source: SourceElement): JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.JavaMethodDescriptor[JavaMethodDescriptor]

'ownerDescriptor' @ [113:17] ==> protected abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'annotations' @ [113:34] ==> val annotations: Annotations defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'method' @ [113:47] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'name' @ [113:54] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'c' @ [113:60] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'components' @ [113:62] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'sourceElementFactory' @ [113:73] ==> public final val sourceElementFactory: JavaSourceElementFactory defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'source' @ [113:94] ==> public abstract fun source(javaElement: JavaElement): JavaSourceElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElementFactory[SimpleFunctionDescriptorImpl]

'method' @ [113:101] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'c' @ [116:17] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'childForMethod' @ [116:19] ==> public fun LazyJavaResolverContext.childForMethod(containingDeclaration: DeclarationDescriptor, typeParameterOwner: JavaTypeParameterListOwner, typeParametersIndexOffset: Int = ...): LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy in file context.kt[SimpleFunctionDescriptorImpl]

'functionDescriptorImpl' @ [116:34] ==> val functionDescriptorImpl: JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'method' @ [116:58] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'method' @ [118:36] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'typeParameters' @ [118:43] ==> public abstract val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'map' @ [118:58] ==> public inline fun <T, R> Iterable<JavaTypeParameter>.map(transform: (JavaTypeParameter) -> TypeParameterDescriptor): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeParameter
    <R> -> TypeParameterDescriptor

'c' @ [118:69] ==> val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'typeParameterResolver' @ [118:71] ==> public final val typeParameterResolver: TypeParameterResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'resolveTypeParameter' @ [118:93] ==> public abstract fun resolveTypeParameter(javaTypeParameter: JavaTypeParameter): TypeParameterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.TypeParameterResolver[SimpleFunctionDescriptorImpl]

'p' @ [118:114] ==> value-parameter p: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'resolveValueParameters' @ [119:31] ==> protected final fun resolveValueParameters(c: LazyJavaResolverContext, function: FunctionDescriptor, jValueParameters: List<JavaValueParameter>): LazyJavaScope.ResolvedValueParameters defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'c' @ [119:54] ==> val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'functionDescriptorImpl' @ [119:57] ==> val functionDescriptorImpl: JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'method' @ [119:81] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [119:88] ==> public abstract val valueParameters: List<JavaValueParameter> defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'computeMethodReturnType' @ [121:26] ==> protected final fun computeMethodReturnType(method: JavaMethod, c: LazyJavaResolverContext): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'method' @ [121:50] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'c' @ [121:58] ==> val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'resolveMethodSignature' @ [123:34] ==> protected abstract fun resolveMethodSignature(method: JavaMethod, methodTypeParameters: List<TypeParameterDescriptor>, returnType: KotlinType, valueParameters: List<ValueParameterDescriptor>): LazyJavaScope.MethodSignatureData defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'method' @ [123:57] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'methodTypeParameters' @ [123:65] ==> val methodTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'returnType' @ [123:87] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'valueParameters' @ [123:99] ==> val valueParameters: LazyJavaScope.ResolvedValueParameters defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'descriptors' @ [123:115] ==> public final val descriptors: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters[PropertyDescriptorImpl]

'functionDescriptorImpl' @ [125:9] ==> val functionDescriptorImpl: JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'initialize' @ [125:32] ==> @NotNull @Override public open fun initialize(@Nullable receiverParameterType: KotlinType?, @Nullable dispatchReceiverParameter: ReceiverParameterDescriptor?, @NotNull typeParameters: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull unsubstitutedValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable unsubstitutedReturnType: KotlinType?, @Nullable modality: Modality?, @NotNull visibility: Visibility, @Nullable userData: (MutableMap<out (FunctionDescriptor.UserDataKey<*>..FunctionDescriptor.UserDataKey<*>?), *>?..Map<out (FunctionDescriptor.UserDataKey<*>..FunctionDescriptor.UserDataKey<*>?), *>?)): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.load.java.descriptors.JavaMethodDescriptor[JavaMethodDescriptor]

'effectiveSignature' @ [126:17] ==> val effectiveSignature: LazyJavaScope.MethodSignatureData defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'receiverType' @ [126:36] ==> public final val receiverType: KotlinType? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData[PropertyDescriptorImpl]

'getDispatchReceiverParameter' @ [127:17] ==> protected abstract fun getDispatchReceiverParameter(): ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'effectiveSignature' @ [128:17] ==> val effectiveSignature: LazyJavaScope.MethodSignatureData defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'typeParameters' @ [128:36] ==> public final val typeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData[PropertyDescriptorImpl]

'effectiveSignature' @ [129:17] ==> val effectiveSignature: LazyJavaScope.MethodSignatureData defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'valueParameters' @ [129:36] ==> public final val valueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData[PropertyDescriptorImpl]

'effectiveSignature' @ [130:17] ==> val effectiveSignature: LazyJavaScope.MethodSignatureData defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'returnType' @ [130:36] ==> public final val returnType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData[PropertyDescriptorImpl]

'convertFromFlags' @ [131:26] ==> public final fun convertFromFlags(abstract: Boolean, open: Boolean): Modality defined in org.jetbrains.kotlin.descriptors.Modality.Companion[SimpleFunctionDescriptorImpl]

'method' @ [131:43] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'isAbstract' @ [131:50] ==> public abstract val isAbstract: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'!' @ [131:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [131:63] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'isFinal' @ [131:70] ==> public abstract val isFinal: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'method' @ [132:17] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[ValueParameterDescriptorImpl]

'visibility' @ [132:24] ==> public abstract val visibility: Visibility defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'if (effectiveSignature.receiverType != null)
                    mapOf(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER to valueParameters.descriptors.first())
                else
                    emptyMap<FunctionDescriptor.UserDataKey<ValueParameterDescriptor>, ValueParameterDescriptor>()' @ [133:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<(FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>..FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>?), ValueParameterDescriptor>, elseBranch: Map<(FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>..FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>?), ValueParameterDescriptor>): Map<(FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>..FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>?), ValueParameterDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<(org.jetbrains.kotlin.descriptors.FunctionDescriptor.UserDataKey<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)>..org.jetbrains.kotlin.descriptors.FunctionDescriptor.UserDataKey<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)>?), ValueParameterDescriptor>

'effectiveSignature' @ [133:21] ==> val effectiveSignature: LazyJavaScope.MethodSignatureData defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'receiverType' @ [133:40] ==> public final val receiverType: KotlinType? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData[PropertyDescriptorImpl]

'mapOf' @ [134:21] ==> public fun <K, V> mapOf(pair: Pair<(FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>..FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>?), ValueParameterDescriptor>): Map<(FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>..FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>?), ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor.UserDataKey<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)>..org.jetbrains.kotlin.descriptors.FunctionDescriptor.UserDataKey<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)>?)
    <V> -> ValueParameterDescriptor

'to' @ [134:27] ==> public infix fun <A, B> (FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>..FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>?).to(that: ValueParameterDescriptor): Pair<(FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>..FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>?), ValueParameterDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor.UserDataKey<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)>..org.jetbrains.kotlin.descriptors.FunctionDescriptor.UserDataKey<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)>?)
    <B> -> ValueParameterDescriptor

'ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER' @ [134:48] ==> public final val ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER: (FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>..FunctionDescriptor.UserDataKey<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.load.java.descriptors.JavaMethodDescriptor[JavaPropertyDescriptor]

'valueParameters' @ [134:99] ==> val valueParameters: LazyJavaScope.ResolvedValueParameters defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'descriptors' @ [134:115] ==> public final val descriptors: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters[PropertyDescriptorImpl]

'first' @ [134:127] ==> public fun <T> List<ValueParameterDescriptor>.first(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'emptyMap' @ [136:21] ==> public fun <K, V> emptyMap(): Map<FunctionDescriptor.UserDataKey<ValueParameterDescriptor>, ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> UserDataKey<ValueParameterDescriptor>
    <V> -> ValueParameterDescriptor

'functionDescriptorImpl' @ [139:9] ==> val functionDescriptorImpl: JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'setParameterNamesStatus' @ [139:32] ==> public open fun setParameterNamesStatus(hasStableParameterNames: Boolean, hasSynthesizedParameterNames: Boolean): Unit defined in org.jetbrains.kotlin.load.java.descriptors.JavaMethodDescriptor[JavaMethodDescriptor]

'effectiveSignature' @ [139:56] ==> val effectiveSignature: LazyJavaScope.MethodSignatureData defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'hasStableParameterNames' @ [139:75] ==> public final val hasStableParameterNames: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData[PropertyDescriptorImpl]

'valueParameters' @ [139:100] ==> val valueParameters: LazyJavaScope.ResolvedValueParameters defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'hasSynthesizedNames' @ [139:116] ==> public final val hasSynthesizedNames: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters[PropertyDescriptorImpl]

'effectiveSignature' @ [141:13] ==> val effectiveSignature: LazyJavaScope.MethodSignatureData defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'errors' @ [141:32] ==> public final val errors: List<String> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData[PropertyDescriptorImpl]

'isNotEmpty' @ [141:39] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'c' @ [142:13] ==> val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'components' @ [142:15] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'signaturePropagator' @ [142:26] ==> public final val signaturePropagator: SignaturePropagator defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'reportSignatureErrors' @ [142:46] ==> public abstract fun reportSignatureErrors(@NotNull descriptor: CallableMemberDescriptor, @NotNull signatureErrors: (MutableList<(String..String?)>..List<(String..String?)>)): Unit defined in org.jetbrains.kotlin.load.java.components.SignaturePropagator[JavaMethodDescriptor]

'functionDescriptorImpl' @ [142:68] ==> val functionDescriptorImpl: JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'effectiveSignature' @ [142:92] ==> val effectiveSignature: LazyJavaScope.MethodSignatureData defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'errors' @ [142:111] ==> public final val errors: List<String> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData[PropertyDescriptorImpl]

'functionDescriptorImpl' @ [145:16] ==> val functionDescriptorImpl: JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveMethodToFunctionDescriptor[LocalVariableDescriptor]

'method' @ [149:32] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeMethodReturnType[ValueParameterDescriptorImpl]

'containingClass' @ [149:39] ==> public abstract val containingClass: JavaClass defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'isAnnotationType' @ [149:55] ==> public abstract val isAnnotationType: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'toAttributes' @ [150:48] ==> public fun TypeUsage.toAttributes(isForAnnotationParameter: Boolean = ..., upperBoundForTypeParameter: TypeParameterDescriptor? = ...): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[SimpleFunctionDescriptorImpl]

'annotationMethod' @ [151:44] ==> val annotationMethod: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeMethodReturnType[LocalVariableDescriptor]

'c' @ [153:16] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeMethodReturnType[ValueParameterDescriptorImpl]

'typeResolver' @ [153:18] ==> public final val typeResolver: JavaTypeResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'transformJavaType' @ [153:31] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'method' @ [153:49] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeMethodReturnType[ValueParameterDescriptorImpl]

'returnType' @ [153:56] ==> public abstract val returnType: JavaType defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'returnTypeAttrs' @ [153:68] ==> val returnTypeAttrs: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeMethodReturnType[LocalVariableDescriptor]

'jValueParameters' @ [164:27] ==> value-parameter jValueParameters: List<JavaValueParameter> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[ValueParameterDescriptorImpl]

'withIndex' @ [164:44] ==> public fun <T> Iterable<JavaValueParameter>.withIndex(): Iterable<IndexedValue<JavaValueParameter>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaValueParameter

'map' @ [164:56] ==> public inline fun <T, R> Iterable<IndexedValue<JavaValueParameter>>.map(transform: (IndexedValue<JavaValueParameter>) -> ValueParameterDescriptorImpl): List<ValueParameterDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<JavaValueParameter>
    <R> -> ValueParameterDescriptorImpl

'component1' @ [165:18] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [165:25] ==> public final operator fun component2(): JavaValueParameter defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'pair' @ [165:42] ==> value-parameter pair: IndexedValue<JavaValueParameter> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [167:31] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[ValueParameterDescriptorImpl]

'resolveAnnotations' @ [167:33] ==> public fun LazyJavaResolverContext.resolveAnnotations(annotationsOwner: JavaAnnotationOwner): Annotations defined in org.jetbrains.kotlin.load.java.lazy in file LazyJavaAnnotations.kt[SimpleFunctionDescriptorImpl]

'javaParameter' @ [167:52] ==> val javaParameter: JavaValueParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'toAttributes' @ [168:46] ==> public fun TypeUsage.toAttributes(isForAnnotationParameter: Boolean = ..., upperBoundForTypeParameter: TypeParameterDescriptor? = ...): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[SimpleFunctionDescriptorImpl]

'component1' @ [169:18] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [169:27] ==> public final operator fun component2(): KotlinType? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (javaParameter.isVararg) {
                        val paramType = javaParameter.type as? JavaArrayType
                                        ?: throw AssertionError("Vararg parameter should be an array: $javaParameter")
                        val outType = c.typeResolver.transformArrayType(paramType, typeUsage, true)
                        outType to c.module.builtIns.getArrayElementType(outType)
                    }
                    else {
                        c.typeResolver.transformJavaType(javaParameter.type, typeUsage) to null
                    }' @ [170:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<KotlinType, KotlinType?>, elseBranch: Pair<KotlinType, KotlinType?>): Pair<KotlinType, KotlinType?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<KotlinType, KotlinType?>

'javaParameter' @ [170:25] ==> val javaParameter: JavaValueParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'isVararg' @ [170:39] ==> public abstract val isVararg: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaValueParameter[PropertyDescriptorImpl]

'javaParameter' @ [171:41] ==> val javaParameter: JavaValueParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'type' @ [171:55] ==> public abstract val type: JavaType defined in org.jetbrains.kotlin.load.java.structure.JavaValueParameter[PropertyDescriptorImpl]

'AssertionError' @ [172:50] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'javaParameter' @ [172:104] ==> val javaParameter: JavaValueParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'c' @ [173:39] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[ValueParameterDescriptorImpl]

'typeResolver' @ [173:41] ==> public final val typeResolver: JavaTypeResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'transformArrayType' @ [173:54] ==> public final fun transformArrayType(arrayType: JavaArrayType, attr: JavaTypeAttributes, isVararg: Boolean = ...): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'paramType' @ [173:73] ==> val paramType: JavaArrayType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'typeUsage' @ [173:84] ==> val typeUsage: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'outType' @ [174:25] ==> val outType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'c' @ [174:36] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[ValueParameterDescriptorImpl]

'module' @ [174:38] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [174:45] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'getArrayElementType' @ [174:54] ==> @NotNull public open fun getArrayElementType(@NotNull arrayType: KotlinType): KotlinType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'outType' @ [174:74] ==> val outType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'c' @ [177:25] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[ValueParameterDescriptorImpl]

'typeResolver' @ [177:27] ==> public final val typeResolver: JavaTypeResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'transformJavaType' @ [177:40] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaParameter' @ [177:58] ==> val javaParameter: JavaValueParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'type' @ [177:72] ==> public abstract val type: JavaType defined in org.jetbrains.kotlin.load.java.structure.JavaValueParameter[PropertyDescriptorImpl]

'typeUsage' @ [177:78] ==> val typeUsage: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'if (function.name.asString() == "equals" &&
                           jValueParameters.size == 1 &&
                           c.module.builtIns.nullableAnyType == outType) {
                // This is a hack to prevent numerous warnings on Kotlin classes that inherit Java classes: if you override "equals" in such
                // class without this hack, you'll be warned that in the superclass the name is "p0" (regardless of the fact that it's
                // "other" in Any)
                // TODO: fix Java parameter name loading logic somehow (don't always load "p0", "p1", etc.)
                Name.identifier("other")
            }
            else {
                // TODO: parameter names may be drawn from attached sources, which is slow; it's better to make them lazy
                val javaName = javaParameter.name
                if (javaName == null) synthesizedNames = true
                javaName ?: Name.identifier("p$index")
            }' @ [180:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name, elseBranch: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name

'function' @ [180:28] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[ValueParameterDescriptorImpl]

'name' @ [180:37] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [180:42] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'jValueParameters' @ [181:28] ==> value-parameter jValueParameters: List<JavaValueParameter> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[ValueParameterDescriptorImpl]

'size' @ [181:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'c' @ [182:28] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[ValueParameterDescriptorImpl]

'module' @ [182:30] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [182:37] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'nullableAnyType' @ [182:46] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'outType' @ [182:65] ==> val outType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'identifier' @ [187:22] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'javaParameter' @ [191:32] ==> val javaParameter: JavaValueParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'name' @ [191:46] ==> public abstract val name: Name? defined in org.jetbrains.kotlin.load.java.structure.JavaValueParameter[PropertyDescriptorImpl]

'javaName' @ [192:21] ==> val javaName: Name? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'synthesizedNames' @ [192:39] ==> var synthesizedNames: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[LocalVariableDescriptor]

'javaName' @ [193:17] ==> val javaName: Name? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'identifier' @ [193:34] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'index' @ [193:48] ==> val index: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'ValueParameterDescriptorImpl' @ [196:13] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[ClassConstructorDescriptorImpl]

'function' @ [197:21] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[ValueParameterDescriptorImpl]

'index' @ [199:21] ==> val index: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'annotations' @ [200:21] ==> val annotations: Annotations defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'name' @ [201:21] ==> val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'outType' @ [202:21] ==> val outType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'varargElementType' @ [206:21] ==> val varargElementType: KotlinType? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'c' @ [207:21] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[ValueParameterDescriptorImpl]

'components' @ [207:23] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'sourceElementFactory' @ [207:34] ==> public final val sourceElementFactory: JavaSourceElementFactory defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'source' @ [207:55] ==> public abstract fun source(javaElement: JavaElement): JavaSourceElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElementFactory[SimpleFunctionDescriptorImpl]

'javaParameter' @ [207:62] ==> val javaParameter: JavaValueParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters.<anonymous>[LocalVariableDescriptor]

'toList' @ [209:11] ==> public fun <T> Iterable<ValueParameterDescriptorImpl>.toList(): List<ValueParameterDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptorImpl

'ResolvedValueParameters' @ [210:16] ==> public constructor ResolvedValueParameters(descriptors: List<ValueParameterDescriptor>, hasSynthesizedNames: Boolean) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters[ClassConstructorDescriptorImpl]

'descriptors' @ [210:40] ==> val descriptors: List<ValueParameterDescriptorImpl> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[LocalVariableDescriptor]

'synthesizedNames' @ [210:53] ==> var synthesizedNames: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveValueParameters[LocalVariableDescriptor]

'c' @ [213:38] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'storageManager' @ [213:40] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [213:55] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Set<Name>): NotNullLazyValue<Set<Name>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Set<Name>

'computeFunctionNames' @ [213:73] ==> protected abstract fun computeFunctionNames(kindFilter: DescriptorKindFilter, nameFilter: ((Name) -> Boolean)?): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'FUNCTIONS' @ [213:115] ==> @JvmField public final val FUNCTIONS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'c' @ [214:38] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'storageManager' @ [214:40] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [214:55] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Set<Name>): NotNullLazyValue<Set<Name>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Set<Name>

'computePropertyNames' @ [214:73] ==> protected abstract fun computePropertyNames(kindFilter: DescriptorKindFilter, nameFilter: ((Name) -> Boolean)?): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'VARIABLES' @ [214:115] ==> @JvmField public final val VARIABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'functionNamesLazy' @ [216:39] ==> private final val functionNamesLazy: Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'propertyNamesLazy' @ [217:39] ==> private final val propertyNamesLazy: Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'name' @ [220:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getContributedFunctions[ValueParameterDescriptorImpl]

'getFunctionNames' @ [220:22] ==> public open fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'emptyList' @ [220:49] ==> public fun <T> emptyList(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'invoke' @ [221:16] ==> public abstract fun invoke(p1: Name): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [221:26] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getContributedFunctions[ValueParameterDescriptorImpl]

'c' @ [230:30] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'storageManager' @ [230:32] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createMemoizedFunction' @ [230:47] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (Name) -> List<PropertyDescriptor>): MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Name
    <V : Any> -> List<PropertyDescriptor>

'ArrayList' @ [232:26] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PropertyDescriptor

'invoke' @ [234:21] ==> public abstract fun invoke(): DeclaredMemberIndex defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'findFieldByName' @ [234:43] ==> public abstract fun findFieldByName(name: Name): JavaField? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.DeclaredMemberIndex[SimpleFunctionDescriptorImpl]

'name' @ [234:59] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.properties.<anonymous>[ValueParameterDescriptorImpl]

'field' @ [235:13] ==> val field: JavaField? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.properties.<anonymous>[LocalVariableDescriptor]

'!' @ [235:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'field' @ [235:31] ==> val field: JavaField? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.properties.<anonymous>[LocalVariableDescriptor]

'isEnumEntry' @ [235:37] ==> public abstract val isEnumEntry: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'properties' @ [236:13] ==> val properties: ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.properties.<anonymous>[LocalVariableDescriptor]

'add' @ [236:24] ==> public open fun add(element: PropertyDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'resolveProperty' @ [236:28] ==> private final fun resolveProperty(field: JavaField): PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'field' @ [236:44] ==> val field: JavaField? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.properties.<anonymous>[LocalVariableDescriptor]

'computeNonDeclaredProperties' @ [239:9] ==> protected abstract fun computeNonDeclaredProperties(name: Name, result: MutableCollection<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'name' @ [239:38] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.properties.<anonymous>[ValueParameterDescriptorImpl]

'properties' @ [239:44] ==> val properties: ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.properties.<anonymous>[LocalVariableDescriptor]

'if (DescriptorUtils.isAnnotationClass(ownerDescriptor))
            properties.toList()
        else
            c.components.signatureEnhancement.enhanceSignatures(c, properties).toList()' @ [241:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<PropertyDescriptor>, elseBranch: List<PropertyDescriptor>): List<PropertyDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<PropertyDescriptor>

'isAnnotationClass' @ [241:29] ==> public open fun isAnnotationClass(@Nullable descriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'ownerDescriptor' @ [241:47] ==> protected abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'properties' @ [242:13] ==> val properties: ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.properties.<anonymous>[LocalVariableDescriptor]

'toList' @ [242:24] ==> public fun <T> Iterable<PropertyDescriptor>.toList(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'c' @ [244:13] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'components' @ [244:15] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'signatureEnhancement' @ [244:26] ==> public final val signatureEnhancement: SignatureEnhancement defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'enhanceSignatures' @ [244:47] ==> public final fun <D : CallableMemberDescriptor> enhanceSignatures(c: LazyJavaResolverContext, platformSignatures: Collection<PropertyDescriptor>): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> PropertyDescriptor

'c' @ [244:65] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'properties' @ [244:68] ==> val properties: ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.properties.<anonymous>[LocalVariableDescriptor]

'toList' @ [244:80] ==> public fun <T> Iterable<PropertyDescriptor>.toList(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'createPropertyDescriptor' @ [248:34] ==> private final fun createPropertyDescriptor(field: JavaField): PropertyDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'field' @ [248:59] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [249:9] ==> val propertyDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[LocalVariableDescriptor]

'initialize' @ [249:28] ==> public open fun initialize(@Nullable getter: PropertyGetterDescriptorImpl?, @Nullable setter: PropertySetterDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'getPropertyType' @ [251:28] ==> private final fun getPropertyType(field: JavaField): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'field' @ [251:44] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [253:9] ==> val propertyDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[LocalVariableDescriptor]

'setType' @ [253:28] ==> public open fun setType(@NotNull outType: KotlinType, @ReadOnly @NotNull typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @Nullable dispatchReceiverParameter: ReceiverParameterDescriptor?, @Nullable receiverType: KotlinType?): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'propertyType' @ [253:36] ==> val propertyType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[LocalVariableDescriptor]

'listOf' @ [253:50] ==> @InlineOnly public inline fun <T> listOf(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'getDispatchReceiverParameter' @ [253:60] ==> protected abstract fun getDispatchReceiverParameter(): ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'shouldRecordInitializerForProperty' @ [255:29] ==> public open fun shouldRecordInitializerForProperty(@NotNull variable: VariableDescriptor, @NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'propertyDescriptor' @ [255:64] ==> val propertyDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[LocalVariableDescriptor]

'propertyDescriptor' @ [255:84] ==> val propertyDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[LocalVariableDescriptor]

'type' @ [255:103] ==> public final val PropertyDescriptorImpl.type: KotlinType[MyPropertyDescriptor]

'propertyDescriptor' @ [256:13] ==> val propertyDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[LocalVariableDescriptor]

'setCompileTimeInitializer' @ [256:32] ==> public open fun setCompileTimeInitializer(@NotNull compileTimeInitializer: NullableLazyValue<(ConstantValue<*>..ConstantValue<*>?)>): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'c' @ [257:21] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'storageManager' @ [257:23] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createNullableLazyValue' @ [257:38] ==> public abstract fun <T : Any> createNullableLazyValue(computable: () -> ConstantValue<*>?): NullableLazyValue<ConstantValue<*>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ConstantValue<*>

'c' @ [258:25] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'components' @ [258:27] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'javaPropertyInitializerEvaluator' @ [258:38] ==> public final val javaPropertyInitializerEvaluator: JavaPropertyInitializerEvaluator defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'getInitializerConstant' @ [258:71] ==> public abstract fun getInitializerConstant(field: JavaField, descriptor: PropertyDescriptor): ConstantValue<*>? defined in org.jetbrains.kotlin.load.java.components.JavaPropertyInitializerEvaluator[SimpleFunctionDescriptorImpl]

'field' @ [258:94] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [258:101] ==> val propertyDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[LocalVariableDescriptor]

'c' @ [262:9] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'components' @ [262:11] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'javaResolverCache' @ [262:22] ==> public final val javaResolverCache: JavaResolverCache defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'recordField' @ [262:40] ==> public abstract fun recordField(@NotNull field: JavaField, @NotNull descriptor: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.load.java.components.JavaResolverCache[JavaMethodDescriptor]

'field' @ [262:52] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [262:59] ==> val propertyDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[LocalVariableDescriptor]

'propertyDescriptor' @ [264:16] ==> val propertyDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.resolveProperty[LocalVariableDescriptor]

'!' @ [268:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'field' @ [268:22] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.createPropertyDescriptor[ValueParameterDescriptorImpl]

'isFinal' @ [268:28] ==> public abstract val isFinal: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'c' @ [269:27] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'resolveAnnotations' @ [269:29] ==> public fun LazyJavaResolverContext.resolveAnnotations(annotationsOwner: JavaAnnotationOwner): Annotations defined in org.jetbrains.kotlin.load.java.lazy in file LazyJavaAnnotations.kt[SimpleFunctionDescriptorImpl]

'field' @ [269:48] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.createPropertyDescriptor[ValueParameterDescriptorImpl]

'create' @ [271:39] ==> @NotNull public open fun create(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull annotations: Annotations, @NotNull modality: Modality, @NotNull visibility: Visibility, isVar: Boolean, @NotNull name: Name, @NotNull source: SourceElement, isStaticFinal: Boolean): JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.JavaPropertyDescriptor[JavaMethodDescriptor]

'ownerDescriptor' @ [272:17] ==> protected abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'annotations' @ [272:34] ==> val annotations: Annotations defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.createPropertyDescriptor[LocalVariableDescriptor]

'FINAL' @ [272:56] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'field' @ [272:63] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.createPropertyDescriptor[ValueParameterDescriptorImpl]

'visibility' @ [272:69] ==> public abstract val visibility: Visibility defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'isVar' @ [272:81] ==> val isVar: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.createPropertyDescriptor[LocalVariableDescriptor]

'field' @ [272:88] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.createPropertyDescriptor[ValueParameterDescriptorImpl]

'name' @ [272:94] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'c' @ [273:17] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'components' @ [273:19] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'sourceElementFactory' @ [273:30] ==> public final val sourceElementFactory: JavaSourceElementFactory defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'source' @ [273:51] ==> public abstract fun source(javaElement: JavaElement): JavaSourceElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElementFactory[SimpleFunctionDescriptorImpl]

'field' @ [273:58] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.createPropertyDescriptor[ValueParameterDescriptorImpl]

'field' @ [273:82] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.createPropertyDescriptor[ValueParameterDescriptorImpl]

'isFinalStatic' @ [273:88] ==> private final val JavaField.isFinalStatic: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'isFinal' @ [278:17] ==> public abstract val isFinal: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'isStatic' @ [278:28] ==> public abstract val isStatic: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'!' @ [283:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'field' @ [283:31] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getPropertyType[ValueParameterDescriptorImpl]

'isFinalStatic' @ [283:37] ==> private final val JavaField.isFinalStatic: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'field' @ [283:54] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getPropertyType[ValueParameterDescriptorImpl]

'hasConstantNotNullInitializer' @ [283:60] ==> public abstract val hasConstantNotNullInitializer: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'c' @ [284:28] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'typeResolver' @ [284:30] ==> public final val typeResolver: JavaTypeResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'transformJavaType' @ [284:43] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'field' @ [285:17] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getPropertyType[ValueParameterDescriptorImpl]

'type' @ [285:23] ==> public abstract val type: JavaType defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'toAttributes' @ [286:34] ==> public fun TypeUsage.toAttributes(isForAnnotationParameter: Boolean = ..., upperBoundForTypeParameter: TypeParameterDescriptor? = ...): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[SimpleFunctionDescriptorImpl]

'!' @ [288:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNotNullable' @ [288:14] ==> val isNotNullable: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getPropertyType[LocalVariableDescriptor]

'makeNotNullable' @ [289:30] ==> @NotNull public open fun makeNotNullable(@NotNull type: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'propertyType' @ [289:46] ==> val propertyType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getPropertyType[LocalVariableDescriptor]

'propertyType' @ [292:16] ==> val propertyType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getPropertyType[LocalVariableDescriptor]

'name' @ [296:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getContributedVariables[ValueParameterDescriptorImpl]

'getVariableNames' @ [296:22] ==> public open fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'emptyList' @ [296:49] ==> public fun <T> emptyList(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'invoke' @ [297:16] ==> public abstract fun invoke(p1: Name): List<PropertyDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [297:27] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.getContributedVariables[ValueParameterDescriptorImpl]

'invoke' @ [300:111] ==> public abstract fun invoke(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'LinkedHashSet' @ [307:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'kindFilter' @ [309:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'acceptsKinds' @ [309:24] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[SimpleFunctionDescriptorImpl]

'CLASSIFIERS_MASK' @ [309:58] ==> public final val CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'computeClassNames' @ [310:26] ==> protected abstract fun computeClassNames(kindFilter: DescriptorKindFilter, nameFilter: ((Name) -> Boolean)?): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [310:44] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [310:56] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'invoke' @ [311:21] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [311:32] ==> val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[LocalVariableDescriptor]

'result' @ [313:21] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[LocalVariableDescriptor]

'addIfNotNull' @ [313:28] ==> public fun <T : Any> MutableCollection<DeclarationDescriptor>.addIfNotNull(t: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'getContributedClassifier' @ [313:41] ==> public open fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'name' @ [313:66] ==> val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[LocalVariableDescriptor]

'location' @ [313:72] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'kindFilter' @ [318:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'acceptsKinds' @ [318:24] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[SimpleFunctionDescriptorImpl]

'FUNCTIONS_MASK' @ [318:58] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'!' @ [318:77] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [318:78] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'excludes' @ [318:89] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'contains' @ [318:98] ==> public abstract fun contains(element: DescriptorKindExclude): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'NonExtensions' @ [318:107] ==> public object NonExtensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'computeFunctionNames' @ [319:26] ==> protected abstract fun computeFunctionNames(kindFilter: DescriptorKindFilter, nameFilter: ((Name) -> Boolean)?): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [319:47] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [319:59] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'invoke' @ [320:21] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [320:32] ==> val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[LocalVariableDescriptor]

'result' @ [321:21] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[LocalVariableDescriptor]

'addAll' @ [321:28] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getContributedFunctions' @ [321:35] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'name' @ [321:59] ==> val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[LocalVariableDescriptor]

'location' @ [321:65] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'kindFilter' @ [326:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'acceptsKinds' @ [326:24] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[SimpleFunctionDescriptorImpl]

'VARIABLES_MASK' @ [326:58] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'!' @ [326:77] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [326:78] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'excludes' @ [326:89] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'contains' @ [326:98] ==> public abstract fun contains(element: DescriptorKindExclude): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'NonExtensions' @ [326:107] ==> public object NonExtensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'computePropertyNames' @ [327:26] ==> protected abstract fun computePropertyNames(kindFilter: DescriptorKindFilter, nameFilter: ((Name) -> Boolean)?): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [327:47] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [327:59] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'invoke' @ [328:21] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [328:32] ==> val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[LocalVariableDescriptor]

'result' @ [329:21] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[LocalVariableDescriptor]

'addAll' @ [329:28] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getContributedVariables' @ [329:35] ==> public open fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'name' @ [329:59] ==> val name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[LocalVariableDescriptor]

'location' @ [329:65] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[ValueParameterDescriptorImpl]

'result' @ [334:16] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.computeDescriptors[LocalVariableDescriptor]

'toList' @ [334:23] ==> public fun <T> Iterable<DeclarationDescriptor>.toList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'ownerDescriptor' @ [339:48] ==> protected abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'p' @ [342:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [342:11] ==> @NotNull public open fun println(vararg objects: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [342:19] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[LazyClassReceiverParameterDescriptor]

'java' @ [342:31] ==> public val <T> KClass<out LazyJavaScope>.java: Class<out LazyJavaScope> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out LazyJavaScope)

'simpleName' @ [342:36] ==> public final val <T : (Any..Any?)> Class<out LazyJavaScope>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out LazyJavaScope)

'p' @ [343:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.printScopeStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [343:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [345:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [345:11] ==> @NotNull public open fun println(vararg objects: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'ownerDescriptor' @ [345:44] ==> protected abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[PropertyDescriptorImpl]

'p' @ [347:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.printScopeStructure[ValueParameterDescriptorImpl]

'popIndent' @ [347:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [348:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [348:11] ==> @NotNull public open fun println(vararg objects: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

