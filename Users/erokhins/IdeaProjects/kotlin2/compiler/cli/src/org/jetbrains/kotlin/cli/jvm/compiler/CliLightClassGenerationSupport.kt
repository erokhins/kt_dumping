'LightClassGenerationSupport' @ [62:58] ==> public constructor LightClassGenerationSupport() defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[DeserializedClassConstructorDescriptor]

'getInstance' @ [63:41] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [63:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.<init>[ValueParameterDescriptorImpl]

'Delegates' @ [64:51] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [64:61] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, BindingContext> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> BindingContext

'Delegates' @ [65:45] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [65:55] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, ModuleDescriptor> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ModuleDescriptor

'this' @ [69:9] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[LazyClassReceiverParameterDescriptor]

'bindingContext' @ [69:14] ==> private final var bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'trace' @ [69:31] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.initialize[ValueParameterDescriptorImpl]

'bindingContext' @ [69:37] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'this' @ [70:9] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[LazyClassReceiverParameterDescriptor]

'module' @ [70:14] ==> private final var module: ModuleDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'module' @ [70:23] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.initialize[ValueParameterDescriptorImpl]

'trace' @ [72:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.initialize[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [73:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CliBindingTrace' @ [73:90] ==> @TestOnly public constructor CliBindingTrace() defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[ClassConstructorDescriptorImpl]

'java' @ [73:113] ==> public val <T> KClass<CliLightClassGenerationSupport.CliBindingTrace>.java: Class<CliLightClassGenerationSupport.CliBindingTrace> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CliBindingTrace

'simpleName' @ [73:118] ==> public final val <T : (Any..Any?)> Class<CliLightClassGenerationSupport.CliBindingTrace>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CliBindingTrace

'trace' @ [76:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.initialize[ValueParameterDescriptorImpl]

'setKotlinCodeAnalyzer' @ [76:15] ==> public final fun setKotlinCodeAnalyzer(kotlinCodeAnalyzer: KotlinCodeAnalyzer): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[SimpleFunctionDescriptorImpl]

'codeAnalyzer' @ [76:37] ==> value-parameter codeAnalyzer: KotlinCodeAnalyzer defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.initialize[ValueParameterDescriptorImpl]

'bindingContext' @ [83:9] ==> private final var bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'get' @ [83:24] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'CLASS' @ [83:43] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'classOrObject' @ [83:50] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.createDataHolderForClass[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [83:66] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'component1' @ [85:14] ==> public final operator fun component1(): PsiJavaFileStub defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[DeserializedSimpleFunctionDescriptor]

'component2' @ [85:20] ==> public final operator fun component2(): BindingContext defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[DeserializedSimpleFunctionDescriptor]

'component3' @ [85:36] ==> public final operator fun component3(): Diagnostics defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[DeserializedSimpleFunctionDescriptor]

'invoke' @ [85:51] ==> public abstract operator fun invoke(p1: LightClassConstructionContext): LightClassBuilderResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'getContext' @ [85:59] ==> private final fun getContext(): LightClassConstructionContext defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'bindingContext' @ [87:9] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.createDataHolderForClass[LocalVariableDescriptor]

'get' @ [87:24] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'CLASS' @ [87:43] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'classOrObject' @ [87:50] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.createDataHolderForClass[ValueParameterDescriptorImpl]

'InvalidLightClassDataHolder' @ [87:75] ==> public object InvalidLightClassDataHolder : LightClassDataHolder.ForClass defined in org.jetbrains.kotlin.asJava.builder[FakeCallableDescriptorForObject]

'LightClassDataHolderImpl' @ [89:16] ==> public constructor LightClassDataHolderImpl(javaFileStub: PsiJavaFileStub, extraDiagnostics: Diagnostics) defined in org.jetbrains.kotlin.asJava.builder.LightClassDataHolderImpl[DeserializedClassConstructorDescriptor]

'stub' @ [90:17] ==> val stub: PsiJavaFileStub defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.createDataHolderForClass[LocalVariableDescriptor]

'diagnostics' @ [91:17] ==> val diagnostics: Diagnostics defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.createDataHolderForClass[LocalVariableDescriptor]

'LightClassConstructionContext' @ [96:16] ==> public constructor LightClassConstructionContext(bindingContext: BindingContext, module: ModuleDescriptor) defined in org.jetbrains.kotlin.asJava.builder.LightClassConstructionContext[DeserializedClassConstructorDescriptor]

'bindingContext' @ [96:46] ==> private final var bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'module' @ [96:62] ==> private final var module: ModuleDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'getClassDescriptorsByFqName' @ [100:36] ==> @NotNull public open fun getClassDescriptorsByFqName(@NotNull p0: ModuleDescriptor, @NotNull p1: FqName): (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>) defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'module' @ [100:64] ==> private final var module: ModuleDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'fqName' @ [100:72] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarations[ValueParameterDescriptorImpl]

'mapNotNull' @ [100:80] ==> public inline fun <T, R : Any> Iterable<(ClassDescriptor..ClassDescriptor?)>.mapNotNull(transform: ((ClassDescriptor..ClassDescriptor?)) -> KtClassOrObject?): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)
    <R : Any> -> KtClassOrObject

'DescriptorToSourceUtils' @ [101:27] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [101:51] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [101:75] ==> value-parameter it: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'if (element is KtClassOrObject && PsiSearchScopeUtil.isInScope(searchScope, element)) {
                element
            }
            else null' @ [102:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtClassOrObject?, elseBranch: KtClassOrObject?): KtClassOrObject?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtClassOrObject?

'element' @ [102:17] ==> val element: PsiElement? defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarations.<anonymous>[LocalVariableDescriptor]

'isInScope' @ [102:66] ==> public open fun isInScope(@NotNull p0: GlobalSearchScope, @NotNull p1: PsiElement): Boolean defined in com.intellij.psi.search.PsiSearchScopeUtil[JavaMethodDescriptor]

'searchScope' @ [102:76] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarations[ValueParameterDescriptorImpl]

'element' @ [102:89] ==> val element: PsiElement? defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarations.<anonymous>[LocalVariableDescriptor]

'element' @ [103:17] ==> val element: PsiElement? defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarations.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [110:16] ==> private final var bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'get' @ [110:31] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(FqName..FqName?), (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)>..ReadOnlySlice<(FqName..FqName?), (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)>?), p1: (FqName..FqName?)): (MutableCollection<(KtFile..KtFile?)>?..Collection<(KtFile..KtFile?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <V : (Any..Any?)> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>?)

'PACKAGE_TO_FILES' @ [110:50] ==> public final val PACKAGE_TO_FILES: (WritableSlice<(FqName..FqName?), (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)>..WritableSlice<(FqName..FqName?), (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'fqName' @ [110:68] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findFilesForPackage[ValueParameterDescriptorImpl]

'filter' @ [110:77] ==> public inline fun <T> Iterable<(KtFile..KtFile?)>.filter(predicate: ((KtFile..KtFile?)) -> Boolean): List<(KtFile..KtFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)

'isInScope' @ [111:32] ==> public open fun isInScope(@NotNull p0: GlobalSearchScope, @NotNull p1: PsiElement): Boolean defined in com.intellij.psi.search.PsiSearchScopeUtil[JavaMethodDescriptor]

'searchScope' @ [111:42] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findFilesForPackage[ValueParameterDescriptorImpl]

'it' @ [111:55] ==> value-parameter it: (KtFile..KtFile?) defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findFilesForPackage.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [112:14] ==> public fun <T> emptyList(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'findFilesForPackage' @ [117:21] ==> public open fun findFilesForPackage(fqName: FqName, searchScope: GlobalSearchScope): Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'packageFqName' @ [117:41] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarationsInPackage[ValueParameterDescriptorImpl]

'searchScope' @ [117:56] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarationsInPackage[ValueParameterDescriptorImpl]

'SmartList' @ [118:22] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtClassOrObject

'files' @ [119:22] ==> val files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarationsInPackage[LocalVariableDescriptor]

'file' @ [120:33] ==> val file: KtFile defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarationsInPackage[LocalVariableDescriptor]

'declarations' @ [120:38] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'declaration' @ [121:21] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarationsInPackage[LocalVariableDescriptor]

'result' @ [122:21] ==> val result: SmartList<KtClassOrObject> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarationsInPackage[LocalVariableDescriptor]

'add' @ [122:28] ==> public open fun add(element: (KtClassOrObject..KtClassOrObject?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'declaration' @ [122:32] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarationsInPackage[LocalVariableDescriptor]

'result' @ [126:16] ==> val result: SmartList<KtClassOrObject> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findClassOrObjectDeclarationsInPackage[LocalVariableDescriptor]

'!' @ [130:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'module' @ [130:17] ==> private final var module: ModuleDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'getPackage' @ [130:24] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'fqName' @ [130:35] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.packageExists[ValueParameterDescriptorImpl]

'isEmpty' @ [130:43] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedSimpleFunctionDescriptor]

'module' @ [134:27] ==> private final var module: ModuleDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'getPackage' @ [134:34] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'fqn' @ [134:45] ==> value-parameter fqn: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getSubPackages[ValueParameterDescriptorImpl]

'packageView' @ [135:23] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getSubPackages[LocalVariableDescriptor]

'memberScope' @ [135:35] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [135:47] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'PACKAGES' @ [135:94] ==> @field:JvmField public final val PACKAGES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'ALL_NAME_FILTER' @ [135:116] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[DeserializedPropertyDescriptor]

'mapNotNull' @ [136:30] ==> @NotNull @Contract public open fun <T : (Any..Any?), V : (Any..Any?)> mapNotNull(@NotNull p0: (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>), @NotNull p1: Function<(DeclarationDescriptor..DeclarationDescriptor?), (FqName..FqName?)>): (MutableList<(FqName..FqName?)>..List<(FqName..FqName?)>) defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'members' @ [136:41] ==> val members: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getSubPackages[LocalVariableDescriptor]

'member' @ [138:21] ==> value-parameter member: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getSubPackages.<no name provided>.`fun`[ValueParameterDescriptorImpl]

'member' @ [139:28] ==> value-parameter member: DeclarationDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getSubPackages.<no name provided>.`fun`[ValueParameterDescriptorImpl]

'fqName' @ [139:35] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'KtLightClassForSourceDeclaration' @ [147:16] ==> public companion object defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForSourceDeclaration[FakeCallableDescriptorForObject]

'create' @ [147:49] ==> public final fun create(classOrObject: KtClassOrObject): KtLightClassForSourceDeclaration? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForSourceDeclaration.Companion[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [147:56] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getLightClass[ValueParameterDescriptorImpl]

'bindingContext' @ [151:16] ==> private final var bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'get' @ [151:31] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'DECLARATION_TO_DESCRIPTOR' @ [151:50] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [151:77] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.resolveToDescriptor[ValueParameterDescriptorImpl]

'bindingContext' @ [154:48] ==> private final var bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'bindingContext' @ [156:53] ==> private final var bindingContext: BindingContext defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'findFilesForFacade' @ [159:30] ==> public open fun findFilesForFacade(facadeFqName: FqName, scope: GlobalSearchScope): Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'facadeFqName' @ [159:49] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClasses[ValueParameterDescriptorImpl]

'scope' @ [159:63] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClasses[ValueParameterDescriptorImpl]

'filesForFacade' @ [160:13] ==> val filesForFacade: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClasses[LocalVariableDescriptor]

'isEmpty' @ [160:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [160:46] ==> public fun <T> emptyList(): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'listOfNotNull' @ [162:16] ==> public fun <T : Any> listOfNotNull(element: PsiClass?): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiClass

'createForFacade' @ [163:39] ==> public final fun createForFacade(manager: PsiManager, facadeClassFqName: FqName, searchScope: GlobalSearchScope, files: Collection<KtFile>): KtLightClassForFacade defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory[DeserializedSimpleFunctionDescriptor]

'psiManager' @ [163:55] ==> private final val psiManager: PsiManager defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'facadeFqName' @ [163:67] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClasses[ValueParameterDescriptorImpl]

'scope' @ [163:81] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClasses[ValueParameterDescriptorImpl]

'filesForFacade' @ [163:88] ==> val filesForFacade: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClasses[LocalVariableDescriptor]

'emptyList' @ [168:16] ==> public fun <T> emptyList(): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'facadeFqName' @ [172:13] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findFilesForFacade[ValueParameterDescriptorImpl]

'isRoot' @ [172:26] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'emptyList' @ [172:41] ==> public fun <T> emptyList(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'PackagePartClassUtils' @ [174:16] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'getFilesWithCallables' @ [174:38] ==> @JvmStatic public final fun getFilesWithCallables(files: Collection<KtFile>): List<KtFile> defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'findFilesForPackage' @ [174:60] ==> public open fun findFilesForPackage(fqName: FqName, searchScope: GlobalSearchScope): Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'facadeFqName' @ [174:80] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findFilesForFacade[ValueParameterDescriptorImpl]

'parent' @ [174:93] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'scope' @ [174:103] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findFilesForFacade[ValueParameterDescriptorImpl]

'filter' @ [174:111] ==> public inline fun <T> Iterable<KtFile>.filter(predicate: (KtFile) -> Boolean): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'JvmFileClassUtil' @ [175:13] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'getFileClassInfoNoResolve' @ [175:30] ==> @JvmStatic public final fun getFileClassInfoNoResolve(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [175:56] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findFilesForFacade.<anonymous>[ValueParameterDescriptorImpl]

'facadeClassFqName' @ [175:60] ==> public abstract val facadeClassFqName: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[DeserializedPropertyDescriptor]

'facadeFqName' @ [175:81] ==> value-parameter facadeFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.findFilesForFacade[ValueParameterDescriptorImpl]

'component1' @ [180:14] ==> public final operator fun component1(): PsiJavaFileStub defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[DeserializedSimpleFunctionDescriptor]

'component2' @ [180:20] ==> public final operator fun component2(): BindingContext defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[DeserializedSimpleFunctionDescriptor]

'component3' @ [180:23] ==> public final operator fun component3(): Diagnostics defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[DeserializedSimpleFunctionDescriptor]

'invoke' @ [180:38] ==> public abstract operator fun invoke(p1: LightClassConstructionContext): LightClassBuilderResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'getContext' @ [180:46] ==> private final fun getContext(): LightClassConstructionContext defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'LightClassDataHolderImpl' @ [181:16] ==> public constructor LightClassDataHolderImpl(javaFileStub: PsiJavaFileStub, extraDiagnostics: Diagnostics) defined in org.jetbrains.kotlin.asJava.builder.LightClassDataHolderImpl[DeserializedClassConstructorDescriptor]

'stub' @ [181:41] ==> val stub: PsiJavaFileStub defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.createDataHolderForFacade[LocalVariableDescriptor]

'diagnostics' @ [181:47] ==> val diagnostics: Diagnostics defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.createDataHolderForFacade[LocalVariableDescriptor]

'NoScopeRecordCliBindingTrace' @ [185:16] ==> public constructor NoScopeRecordCliBindingTrace() defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace[ClassConstructorDescriptorImpl]

'CliBindingTrace' @ [189:42] ==> @TestOnly public constructor CliBindingTrace() defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[ClassConstructorDescriptorImpl]

'slice' @ [191:17] ==> value-parameter slice: WritableSlice<K, V> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace.record[ValueParameterDescriptorImpl]

'LEXICAL_SCOPE' @ [191:42] ==> public final val LEXICAL_SCOPE: (WritableSlice<(KtElement..KtElement?), (LexicalScope..LexicalScope?)>..WritableSlice<(KtElement..KtElement?), (LexicalScope..LexicalScope?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'slice' @ [191:59] ==> value-parameter slice: WritableSlice<K, V> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace.record[ValueParameterDescriptorImpl]

'DATA_FLOW_INFO_BEFORE' @ [191:83] ==> public final val DATA_FLOW_INFO_BEFORE: (WritableSlice<(KtExpression..KtExpression?), (DataFlowInfo..DataFlowInfo?)>..WritableSlice<(KtExpression..KtExpression?), (DataFlowInfo..DataFlowInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'super' @ [195:13] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace[LazyClassReceiverParameterDescriptor]

'record' @ [195:19] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> record(p0: (WritableSlice<(K..K?), (V..V?)>..WritableSlice<(K..K?), (V..V?)>?), p1: (K..K?), p2: (V..V?)): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [195:26] ==> value-parameter slice: WritableSlice<K, V> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace.record[ValueParameterDescriptorImpl]

'key' @ [195:33] ==> value-parameter key: K defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace.record[ValueParameterDescriptorImpl]

'value' @ [195:38] ==> value-parameter value: V defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace.record[ValueParameterDescriptorImpl]

'NoScopeRecordCliBindingTrace' @ [199:20] ==> public constructor NoScopeRecordCliBindingTrace() defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace[ClassConstructorDescriptorImpl]

'java' @ [199:56] ==> public val <T> KClass<CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace>.java: Class<CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NoScopeRecordCliBindingTrace

'name' @ [199:61] ==> public final val <T : (Any..Any?)> Class<CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NoScopeRecordCliBindingTrace

'TestOnly' @ [203:32] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'BindingTraceContext' @ [203:58] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'CliBindingTrace' @ [207:20] ==> @TestOnly public constructor CliBindingTrace() defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[ClassConstructorDescriptorImpl]

'java' @ [207:43] ==> public val <T> KClass<CliLightClassGenerationSupport.CliBindingTrace>.java: Class<CliLightClassGenerationSupport.CliBindingTrace> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CliBindingTrace

'name' @ [207:48] ==> public final val <T : (Any..Any?)> Class<CliLightClassGenerationSupport.CliBindingTrace>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CliBindingTrace

'this' @ [211:13] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[LazyClassReceiverParameterDescriptor]

'kotlinCodeAnalyzer' @ [211:18] ==> private final var kotlinCodeAnalyzer: KotlinCodeAnalyzer? defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[PropertyDescriptorImpl]

'kotlinCodeAnalyzer' @ [211:39] ==> value-parameter kotlinCodeAnalyzer: KotlinCodeAnalyzer defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.setKotlinCodeAnalyzer[ValueParameterDescriptorImpl]

'super' @ [215:25] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[LazyClassReceiverParameterDescriptor]

'get' @ [215:31] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(K..K?), (V..V?)>..ReadOnlySlice<(K..K?), (V..V?)>?), p1: (K..K?)): V? defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [215:35] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[ValueParameterDescriptorImpl]

'key' @ [215:42] ==> value-parameter key: K defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[ValueParameterDescriptorImpl]

'value' @ [217:17] ==> val value: V? defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[LocalVariableDescriptor]

'FUNCTION' @ [218:36] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'slice' @ [218:49] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[ValueParameterDescriptorImpl]

'VARIABLE' @ [218:73] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'slice' @ [218:86] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[ValueParameterDescriptorImpl]

'key' @ [219:25] ==> value-parameter key: K defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[ValueParameterDescriptorImpl]

'!' @ [220:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [220:40] ==> public open fun isLocal(@NotNull p0: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'key' @ [220:48] ==> value-parameter key: K defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[ValueParameterDescriptorImpl]

'kotlinCodeAnalyzer' @ [221:29] ==> private final var kotlinCodeAnalyzer: KotlinCodeAnalyzer? defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[PropertyDescriptorImpl]

'resolveToDescriptor' @ [221:50] ==> @NotNull public abstract fun resolveToDescriptor(@NotNull p0: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.KotlinCodeAnalyzer[JavaMethodDescriptor]

'key' @ [221:70] ==> value-parameter key: K defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[ValueParameterDescriptorImpl]

'super' @ [222:36] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[LazyClassReceiverParameterDescriptor]

'get' @ [222:42] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(K..K?), (V..V?)>..ReadOnlySlice<(K..K?), (V..V?)>?), p1: (K..K?)): V? defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'slice' @ [222:52] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[ValueParameterDescriptorImpl]

'key' @ [222:59] ==> value-parameter key: K defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[ValueParameterDescriptorImpl]

'value' @ [228:20] ==> val value: V? defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace.get[LocalVariableDescriptor]

'PackagePartClassUtils' @ [233:16] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'getFilesWithCallables' @ [233:38] ==> @JvmStatic public final fun getFilesWithCallables(files: Collection<KtFile>): List<KtFile> defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'findFilesForPackage' @ [233:60] ==> public open fun findFilesForPackage(fqName: FqName, searchScope: GlobalSearchScope): Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'packageFqName' @ [233:80] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClassesInPackage[ValueParameterDescriptorImpl]

'scope' @ [233:95] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClassesInPackage[ValueParameterDescriptorImpl]

'groupBy' @ [233:103] ==> public inline fun <T, K> Iterable<KtFile>.groupBy(keySelector: (KtFile) -> FqName): Map<FqName, List<KtFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <K> -> FqName

'JvmFileClassUtil' @ [234:13] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'getFileClassInfoNoResolve' @ [234:30] ==> @JvmStatic public final fun getFileClassInfoNoResolve(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [234:56] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClassesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'facadeClassFqName' @ [234:60] ==> public abstract val facadeClassFqName: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[DeserializedPropertyDescriptor]

'mapNotNull' @ [235:11] ==> public inline fun <K, V, R : Any> Map<out FqName, List<KtFile>>.mapNotNull(transform: (Map.Entry<FqName, List<KtFile>>) -> KtLightClassForFacade?): List<KtLightClassForFacade> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> List<KtFile>
    <R : Any> -> KtLightClassForFacade

'KtLightClassForFacade' @ [235:24] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[FakeCallableDescriptorForObject]

'createForFacade' @ [235:46] ==> public final fun createForFacade(manager: PsiManager, facadeClassFqName: FqName, searchScope: GlobalSearchScope, files: Collection<KtFile>): KtLightClassForFacade defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade.Factory[DeserializedSimpleFunctionDescriptor]

'psiManager' @ [235:62] ==> private final val psiManager: PsiManager defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[PropertyDescriptorImpl]

'it' @ [235:74] ==> value-parameter it: Map.Entry<FqName, List<KtFile>> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClassesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [235:77] ==> public abstract val key: FqName defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'scope' @ [235:82] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClassesInPackage[ValueParameterDescriptorImpl]

'it' @ [235:89] ==> value-parameter it: Map.Entry<FqName, List<KtFile>> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeClassesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [235:92] ==> public abstract val value: List<KtFile> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'PackagePartClassUtils' @ [239:16] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'getFilesWithCallables' @ [239:38] ==> @JvmStatic public final fun getFilesWithCallables(files: Collection<KtFile>): List<KtFile> defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'findFilesForPackage' @ [239:60] ==> public open fun findFilesForPackage(fqName: FqName, searchScope: GlobalSearchScope): Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'packageFqName' @ [239:80] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeNames[ValueParameterDescriptorImpl]

'scope' @ [239:95] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeNames[ValueParameterDescriptorImpl]

'map' @ [239:103] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> String

'JvmFileClassUtil' @ [240:13] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'getFileClassInfoNoResolve' @ [240:30] ==> @JvmStatic public final fun getFileClassInfoNoResolve(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [240:56] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.getFacadeNames.<anonymous>[ValueParameterDescriptorImpl]

'facadeClassFqName' @ [240:60] ==> public abstract val facadeClassFqName: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[DeserializedPropertyDescriptor]

'shortName' @ [240:78] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [240:90] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

