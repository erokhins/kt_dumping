'getNotNull' @ [37:74] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> getNotNull(@NotNull p0: BindingContext, @NotNull p1: ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>, @NotNull p2: PsiElement): ClassDescriptor defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> ClassDescriptor

'bindingContext' @ [37:85] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'CLASS' @ [37:116] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [37:123] ==> protected final val declaration: KtClassOrObject defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'generateComponentFunctionsForDataClasses' @ [40:9] ==> private final fun generateComponentFunctionsForDataClasses(): Unit defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'generateCopyFunctionForDataClasses' @ [42:9] ==> private final fun generateCopyFunctionForDataClasses(constructorParameters: List<KtParameter>): Unit defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'primaryConstructorParameters' @ [42:44] ==> private final val primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'dataProperties' @ [44:26] ==> private final val dataProperties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'properties' @ [45:13] ==> val properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generate[LocalVariableDescriptor]

'isNotEmpty' @ [45:24] ==> @InlineOnly public inline fun <T> Collection<PropertyDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'generateDataClassToStringIfNeeded' @ [46:13] ==> private final fun generateDataClassToStringIfNeeded(properties: List<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'properties' @ [46:47] ==> val properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generate[LocalVariableDescriptor]

'generateDataClassHashCodeIfNeeded' @ [47:13] ==> private final fun generateDataClassHashCodeIfNeeded(properties: List<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'properties' @ [47:47] ==> val properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generate[LocalVariableDescriptor]

'generateDataClassEqualsIfNeeded' @ [48:13] ==> private final fun generateDataClassEqualsIfNeeded(properties: List<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'properties' @ [48:45] ==> val properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generate[LocalVariableDescriptor]

'classDescriptor' @ [65:27] ==> protected final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'unsubstitutedPrimaryConstructor' @ [65:43] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'constructor' @ [67:27] ==> val constructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateComponentFunctionsForDataClasses[LocalVariableDescriptor]

'valueParameters' @ [67:39] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'bindingContext' @ [68:28] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'get' @ [68:43] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>..ReadOnlySlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>?), p1: (ValueParameterDescriptor..ValueParameterDescriptor?)): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueParameterDescriptor
    <V : (Any..Any?)> -> FunctionDescriptor

'DATA_CLASS_COMPONENT_FUNCTION' @ [68:62] ==> public final val DATA_CLASS_COMPONENT_FUNCTION: (WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>..WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameter' @ [68:93] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateComponentFunctionsForDataClasses[LocalVariableDescriptor]

'function' @ [69:17] ==> val function: FunctionDescriptor? defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateComponentFunctionsForDataClasses[LocalVariableDescriptor]

'generateComponentFunction' @ [70:17] ==> protected abstract fun generateComponentFunction(function: FunctionDescriptor, parameter: ValueParameterDescriptor): Unit defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'function' @ [70:43] ==> val function: FunctionDescriptor? defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateComponentFunctionsForDataClasses[LocalVariableDescriptor]

'parameter' @ [70:53] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateComponentFunctionsForDataClasses[LocalVariableDescriptor]

'bindingContext' @ [76:28] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'get' @ [76:43] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(ClassDescriptor..ClassDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>..ReadOnlySlice<(ClassDescriptor..ClassDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>?), p1: (ClassDescriptor..ClassDescriptor?)): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassDescriptor
    <V : (Any..Any?)> -> FunctionDescriptor

'DATA_CLASS_COPY_FUNCTION' @ [76:62] ==> public final val DATA_CLASS_COPY_FUNCTION: (WritableSlice<(ClassDescriptor..ClassDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>..WritableSlice<(ClassDescriptor..ClassDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'classDescriptor' @ [76:88] ==> protected final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'generateCopyFunction' @ [77:9] ==> protected abstract fun generateCopyFunction(function: FunctionDescriptor, constructorParameters: List<KtParameter>): Unit defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'copyFunction' @ [77:30] ==> val copyFunction: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateCopyFunctionForDataClasses[LocalVariableDescriptor]

'constructorParameters' @ [77:44] ==> value-parameter constructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateCopyFunctionForDataClasses[ValueParameterDescriptorImpl]

'getMemberToGenerate' @ [81:24] ==> public final fun getMemberToGenerate(classDescriptor: ClassDescriptor, name: String, isReturnTypeOk: (KotlinType) -> Boolean, areParametersOk: (List<ValueParameterDescriptor>) -> Boolean): FunctionDescriptor? defined in org.jetbrains.kotlin.backend.common.CodegenUtil[FunctionImportedFromObject]

'classDescriptor' @ [81:44] ==> protected final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'KotlinBuiltIns' @ [82:44] ==> protected/*protected and package*/ constructor KotlinBuiltIns(@NotNull p0: StorageManager) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaClassConstructorDescriptor]

'List' @ [82:70] ==> @SinceKotlin @InlineOnly public inline fun <T> List(size: Int, init: (index: Int) -> Nothing): List<Nothing> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing

'generateToStringMethod' @ [83:9] ==> protected abstract fun generateToStringMethod(function: FunctionDescriptor, properties: List<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'function' @ [83:32] ==> val function: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateDataClassToStringIfNeeded[LocalVariableDescriptor]

'properties' @ [83:42] ==> value-parameter properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateDataClassToStringIfNeeded[ValueParameterDescriptorImpl]

'getMemberToGenerate' @ [87:24] ==> public final fun getMemberToGenerate(classDescriptor: ClassDescriptor, name: String, isReturnTypeOk: (KotlinType) -> Boolean, areParametersOk: (List<ValueParameterDescriptor>) -> Boolean): FunctionDescriptor? defined in org.jetbrains.kotlin.backend.common.CodegenUtil[FunctionImportedFromObject]

'classDescriptor' @ [87:44] ==> protected final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'KotlinBuiltIns' @ [88:44] ==> protected/*protected and package*/ constructor KotlinBuiltIns(@NotNull p0: StorageManager) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaClassConstructorDescriptor]

'List' @ [88:67] ==> @SinceKotlin @InlineOnly public inline fun <T> List(size: Int, init: (index: Int) -> Nothing): List<Nothing> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing

'generateHashCodeMethod' @ [89:9] ==> protected abstract fun generateHashCodeMethod(function: FunctionDescriptor, properties: List<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'function' @ [89:32] ==> val function: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateDataClassHashCodeIfNeeded[LocalVariableDescriptor]

'properties' @ [89:42] ==> value-parameter properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateDataClassHashCodeIfNeeded[ValueParameterDescriptorImpl]

'getMemberToGenerate' @ [93:24] ==> public final fun getMemberToGenerate(classDescriptor: ClassDescriptor, name: String, isReturnTypeOk: (KotlinType) -> Boolean, areParametersOk: (List<ValueParameterDescriptor>) -> Boolean): FunctionDescriptor? defined in org.jetbrains.kotlin.backend.common.CodegenUtil[FunctionImportedFromObject]

'classDescriptor' @ [93:44] ==> protected final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'KotlinBuiltIns' @ [94:44] ==> protected/*protected and package*/ constructor KotlinBuiltIns(@NotNull p0: StorageManager) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaClassConstructorDescriptor]

'parameters' @ [95:13] ==> value-parameter parameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateDataClassEqualsIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [95:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'isNullableAny' @ [95:52] ==> public open fun isNullableAny(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'parameters' @ [95:66] ==> value-parameter parameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateDataClassEqualsIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [95:77] ==> public fun <T> List<ValueParameterDescriptor>.first(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'type' @ [95:85] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'generateEqualsMethod' @ [97:9] ==> protected abstract fun generateEqualsMethod(function: FunctionDescriptor, properties: List<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'function' @ [97:30] ==> val function: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateDataClassEqualsIfNeeded[LocalVariableDescriptor]

'properties' @ [97:40] ==> value-parameter properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.generateDataClassEqualsIfNeeded[ValueParameterDescriptorImpl]

'primaryConstructorParameters' @ [101:17] ==> private final val primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'filter' @ [102:18] ==> public inline fun <T> Iterable<KtParameter>.filter(predicate: (KtParameter) -> Boolean): List<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'it' @ [102:27] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.<get-dataProperties>.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [102:30] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'map' @ [103:18] ==> public inline fun <T, R> Iterable<KtParameter>.map(transform: (KtParameter) -> PropertyDescriptor): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <R> -> PropertyDescriptor

'bindingContext' @ [103:24] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'get' @ [103:39] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?), p1: (PsiElement..PsiElement?)): PropertyDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> PropertyDescriptor

'PRIMARY_CONSTRUCTOR_PARAMETER' @ [103:58] ==> public final val PRIMARY_CONSTRUCTOR_PARAMETER: (WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [103:89] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator.<get-dataProperties>.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [106:18] ==> protected final val declaration: KtClassOrObject defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[PropertyDescriptorImpl]

'primaryConstructorParameters' @ [106:44] ==> public final val KtClass.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'orEmpty' @ [106:73] ==> @InlineOnly public inline fun <T> List<KtParameter>?.orEmpty(): List<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

