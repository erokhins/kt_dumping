'c' @ [46:28] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.DeclarationResolver.resolveAnnotationsOnFiles[ValueParameterDescriptorImpl]

'files' @ [46:30] ==> public final val TopDownAnalysisContext.files: (Collection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)[MyPropertyDescriptor]

'keysToMap' @ [46:36] ==> public fun <K, V> Iterable<(KtFile..KtFile?)>.keysToMap(value: ((KtFile..KtFile?)) -> LexicalScope): Map<(KtFile..KtFile?), LexicalScope> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)
    <V> -> LexicalScope

'scopeProvider' @ [46:48] ==> value-parameter scopeProvider: FileScopeProvider defined in org.jetbrains.kotlin.resolve.DeclarationResolver.resolveAnnotationsOnFiles[ValueParameterDescriptorImpl]

'getFileResolutionScope' @ [46:62] ==> public open fun getFileResolutionScope(file: KtFile): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider[SimpleFunctionDescriptorImpl]

'it' @ [46:85] ==> value-parameter it: (KtFile..KtFile?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.resolveAnnotationsOnFiles.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [47:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtFile..KtFile?), LexicalScope>.component1(): (KtFile..KtFile?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)
    <V> -> LexicalScope

'component2' @ [47:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtFile..KtFile?), LexicalScope>.component2(): LexicalScope defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)
    <V> -> LexicalScope

'filesToScope' @ [47:35] ==> val filesToScope: Map<(KtFile..KtFile?), LexicalScope> defined in org.jetbrains.kotlin.resolve.DeclarationResolver.resolveAnnotationsOnFiles[LocalVariableDescriptor]

'annotationResolver' @ [48:13] ==> private final val annotationResolver: AnnotationResolver defined in org.jetbrains.kotlin.resolve.DeclarationResolver[PropertyDescriptorImpl]

'resolveAnnotationsWithArguments' @ [48:32] ==> public final fun resolveAnnotationsWithArguments(scope: LexicalScope, annotationEntries: @JvmSuppressWildcards List<KtAnnotationEntry>, trace: BindingTrace): Annotations defined in org.jetbrains.kotlin.resolve.AnnotationResolver[SimpleFunctionDescriptorImpl]

'fileScope' @ [48:64] ==> val fileScope: LexicalScope defined in org.jetbrains.kotlin.resolve.DeclarationResolver.resolveAnnotationsOnFiles[LocalVariableDescriptor]

'file' @ [48:75] ==> val file: (KtFile..KtFile?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.resolveAnnotationsOnFiles[LocalVariableDescriptor]

'annotationEntries' @ [48:80] ==> public final val KtFile.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'trace' @ [48:99] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationResolver[PropertyDescriptorImpl]

'annotationResolver' @ [49:13] ==> private final val annotationResolver: AnnotationResolver defined in org.jetbrains.kotlin.resolve.DeclarationResolver[PropertyDescriptorImpl]

'resolveAnnotationsWithArguments' @ [49:32] ==> public final fun resolveAnnotationsWithArguments(scope: LexicalScope, annotationEntries: @JvmSuppressWildcards List<KtAnnotationEntry>, trace: BindingTrace): Annotations defined in org.jetbrains.kotlin.resolve.AnnotationResolver[SimpleFunctionDescriptorImpl]

'fileScope' @ [49:64] ==> val fileScope: LexicalScope defined in org.jetbrains.kotlin.resolve.DeclarationResolver.resolveAnnotationsOnFiles[LocalVariableDescriptor]

'file' @ [49:75] ==> val file: (KtFile..KtFile?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.resolveAnnotationsOnFiles[LocalVariableDescriptor]

'danglingAnnotations' @ [49:80] ==> public final val KtFile.danglingAnnotations: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'trace' @ [49:101] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationResolver[PropertyDescriptorImpl]

'c' @ [54:33] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarations[ValueParameterDescriptorImpl]

'declaredClasses' @ [54:35] ==> public final val TopDownAnalysisContext.declaredClasses: (MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>?)[MyPropertyDescriptor]

'values' @ [54:51] ==> public abstract val values: MutableCollection<(ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'create' @ [55:46] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (HashMultimap<(Name..Name?), (DeclarationDescriptor..DeclarationDescriptor?)>..HashMultimap<(Name..Name?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Name
    <V : (Any..Any?)> -> DeclarationDescriptor

'classDescriptor' @ [56:26] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarations[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [56:42] ==> public final val ClassDescriptorWithResolutionScopes.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [56:67] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'desc' @ [57:21] ==> val desc: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarations[LocalVariableDescriptor]

'desc' @ [57:53] ==> val desc: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarations[LocalVariableDescriptor]

'descriptorMap' @ [58:21] ==> val descriptorMap: (HashMultimap<(Name..Name?), (DeclarationDescriptor..DeclarationDescriptor?)>..HashMultimap<(Name..Name?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarations[LocalVariableDescriptor]

'put' @ [58:35] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: Name?, @Nullable p1: DeclarationDescriptor?): Boolean defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]

'desc' @ [58:39] ==> val desc: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarations[LocalVariableDescriptor]

'name' @ [58:44] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'desc' @ [58:50] ==> val desc: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarations[LocalVariableDescriptor]

'reportRedeclarationsWithClassifiers' @ [62:13] ==> private final fun reportRedeclarationsWithClassifiers(descriptorMap: Multimap<Name, DeclarationDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationResolver[SimpleFunctionDescriptorImpl]

'descriptorMap' @ [62:49] ==> val descriptorMap: (HashMultimap<(Name..Name?), (DeclarationDescriptor..DeclarationDescriptor?)>..HashMultimap<(Name..Name?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarations[LocalVariableDescriptor]

'descriptorMap' @ [67:22] ==> value-parameter descriptorMap: Multimap<Name, DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationResolver.reportRedeclarationsWithClassifiers[ValueParameterDescriptorImpl]

'keySet' @ [67:36] ==> public abstract fun keySet(): (MutableSet<(Name..Name?)>..Set<(Name..Name?)>?) defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'descriptorMap' @ [68:31] ==> value-parameter descriptorMap: Multimap<Name, DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationResolver.reportRedeclarationsWithClassifiers[ValueParameterDescriptorImpl]

'name' @ [68:45] ==> val name: (Name..Name?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.reportRedeclarationsWithClassifiers[LocalVariableDescriptor]

'descriptors' @ [69:17] ==> val descriptors: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.reportRedeclarationsWithClassifiers[LocalVariableDescriptor]

'size' @ [69:29] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'descriptors' @ [69:41] ==> val descriptors: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.reportRedeclarationsWithClassifiers[LocalVariableDescriptor]

'any' @ [69:53] ==> public inline fun <T> Iterable<(DeclarationDescriptor..DeclarationDescriptor?)>.any(predicate: ((DeclarationDescriptor..DeclarationDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'it' @ [69:59] ==> value-parameter it: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.reportRedeclarationsWithClassifiers.<anonymous>[ValueParameterDescriptorImpl]

'descriptors' @ [70:36] ==> val descriptors: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.reportRedeclarationsWithClassifiers[LocalVariableDescriptor]

'reportOnDeclaration' @ [71:21] ==> public inline fun reportOnDeclaration(trace: BindingTrace, descriptor: DeclarationDescriptor, what: (PsiElement) -> Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics in file diagnosticUtils.kt[SimpleFunctionDescriptorImpl]

'trace' @ [71:41] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationResolver[PropertyDescriptorImpl]

'descriptor' @ [71:48] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.reportRedeclarationsWithClassifiers[LocalVariableDescriptor]

'REDECLARATION' @ [71:62] ==> public final val REDECLARATION: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [71:76] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>)): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [71:79] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.DeclarationResolver.reportRedeclarationsWithClassifiers.<anonymous>[ValueParameterDescriptorImpl]

'descriptors' @ [71:83] ==> val descriptors: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.reportRedeclarationsWithClassifiers[LocalVariableDescriptor]

'component1' @ [78:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(FqName..FqName?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>.component1(): (FqName..FqName?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>?)

'component2' @ [78:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(FqName..FqName?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>.component2(): (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>?)

'topLevelFqNames' @ [78:59] ==> value-parameter topLevelFqNames: Multimap<FqName, KtElement> defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[ValueParameterDescriptorImpl]

'asMap' @ [78:75] ==> public abstract fun asMap(): (MutableMap<(FqName..FqName?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>..Map<(FqName..FqName?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>?) defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'fqName' @ [79:17] ==> val fqName: (FqName..FqName?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[LocalVariableDescriptor]

'isRoot' @ [79:24] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'component1' @ [82:18] ==> public final operator fun component1(): List<DeclarationDescriptor> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [82:26] ==> public final operator fun component2(): List<DeclarationDescriptor> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getTopLevelDescriptorsByFqName' @ [83:21] ==> private final fun getTopLevelDescriptorsByFqName(topLevelDescriptorProvider: TopLevelDescriptorProvider, fqName: FqName, location: LookupLocation): Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationResolver[SimpleFunctionDescriptorImpl]

'topLevelDescriptorProvider' @ [83:52] ==> value-parameter topLevelDescriptorProvider: TopLevelDescriptorProvider defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[ValueParameterDescriptorImpl]

'fqName' @ [83:80] ==> val fqName: (FqName..FqName?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[LocalVariableDescriptor]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [83:105] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'partition' @ [84:22] ==> public inline fun <T> Iterable<DeclarationDescriptor>.partition(predicate: (DeclarationDescriptor) -> Boolean): Pair<List<DeclarationDescriptor>, List<DeclarationDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [84:34] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [84:60] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages.<anonymous>[ValueParameterDescriptorImpl]

'isHeader' @ [84:63] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'listOf' @ [86:33] ==> public fun <T> listOf(vararg elements: List<DeclarationDescriptor>): List<List<DeclarationDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<DeclarationDescriptor>

'header' @ [86:40] ==> val header: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[LocalVariableDescriptor]

'impl' @ [86:48] ==> val impl: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[LocalVariableDescriptor]

'descriptors' @ [87:21] ==> val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[LocalVariableDescriptor]

'size' @ [87:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'declarationsOrPackageDirectives' @ [88:39] ==> val declarationsOrPackageDirectives: (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[LocalVariableDescriptor]

'?:' @ [89:40] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'directive' @ [89:41] ==> val directive: (KtElement..KtElement?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[LocalVariableDescriptor]

'nameIdentifier' @ [89:76] ==> public final val KtPackageDirective.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'directive' @ [89:94] ==> val directive: (KtElement..KtElement?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[LocalVariableDescriptor]

'trace' @ [90:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DeclarationResolver[PropertyDescriptorImpl]

'report' @ [90:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'PACKAGE_OR_CLASSIFIER_REDECLARATION' @ [90:45] ==> public final val PACKAGE_OR_CLASSIFIER_REDECLARATION: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [90:81] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportAt' @ [90:84] ==> val reportAt: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[LocalVariableDescriptor]

'fqName' @ [90:94] ==> val fqName: (FqName..FqName?) defined in org.jetbrains.kotlin.resolve.DeclarationResolver.checkRedeclarationsInPackages[LocalVariableDescriptor]

'shortName' @ [90:101] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [90:113] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'HashSet' @ [98:27] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'descriptors' @ [100:9] ==> val descriptors: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationResolver.getTopLevelDescriptorsByFqName[LocalVariableDescriptor]

'addIfNotNull' @ [100:21] ==> public fun <T : Any> MutableCollection<DeclarationDescriptor>.addIfNotNull(t: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'topLevelDescriptorProvider' @ [100:34] ==> value-parameter topLevelDescriptorProvider: TopLevelDescriptorProvider defined in org.jetbrains.kotlin.resolve.DeclarationResolver.getTopLevelDescriptorsByFqName[ValueParameterDescriptorImpl]

'getPackageFragment' @ [100:61] ==> public abstract fun getPackageFragment(fqName: FqName): LazyPackageDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.TopLevelDescriptorProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [100:80] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.resolve.DeclarationResolver.getTopLevelDescriptorsByFqName[ValueParameterDescriptorImpl]

'descriptors' @ [101:9] ==> val descriptors: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationResolver.getTopLevelDescriptorsByFqName[LocalVariableDescriptor]

'addAll' @ [101:21] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'topLevelDescriptorProvider' @ [101:28] ==> value-parameter topLevelDescriptorProvider: TopLevelDescriptorProvider defined in org.jetbrains.kotlin.resolve.DeclarationResolver.getTopLevelDescriptorsByFqName[ValueParameterDescriptorImpl]

'getTopLevelClassifierDescriptors' @ [101:55] ==> public abstract fun getTopLevelClassifierDescriptors(fqName: FqName, location: LookupLocation): Collection<ClassifierDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.TopLevelDescriptorProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [101:88] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.resolve.DeclarationResolver.getTopLevelDescriptorsByFqName[ValueParameterDescriptorImpl]

'location' @ [101:96] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.DeclarationResolver.getTopLevelDescriptorsByFqName[ValueParameterDescriptorImpl]

'descriptors' @ [102:16] ==> val descriptors: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DeclarationResolver.getTopLevelDescriptorsByFqName[LocalVariableDescriptor]

