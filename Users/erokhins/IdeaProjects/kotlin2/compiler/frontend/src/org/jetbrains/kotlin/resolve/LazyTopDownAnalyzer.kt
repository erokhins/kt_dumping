'DataFlowInfo' @ [56:47] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[FakeCallableDescriptorForObject]

'EMPTY' @ [56:60] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[PropertyDescriptorImpl]

'TopDownAnalysisContext' @ [58:17] ==> public constructor TopDownAnalysisContext(@NotNull topDownAnalysisMode: TopDownAnalysisMode, @NotNull outerDataFlowInfo: DataFlowInfo, @NotNull declarationScopeProvider: DeclarationScopeProvider) defined in org.jetbrains.kotlin.resolve.TopDownAnalysisContext[JavaClassConstructorDescriptor]

'topDownAnalysisMode' @ [58:40] ==> value-parameter topDownAnalysisMode: TopDownAnalysisMode defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[ValueParameterDescriptorImpl]

'outerDataFlowInfo' @ [58:61] ==> value-parameter outerDataFlowInfo: DataFlowInfo = ... defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[ValueParameterDescriptorImpl]

'declarationScopeProvider' @ [58:80] ==> private final val declarationScopeProvider: DeclarationScopeProvider defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'create' @ [60:44] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>..HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>?) defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FqName
    <V : (Any..Any?)> -> KtElement

'ArrayList' @ [62:26] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtProperty

'ArrayList' @ [63:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedFunction

'ArrayList' @ [64:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtTypeAlias

'ArrayList' @ [65:41] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtDestructuringDeclaration

'declarations' @ [68:29] ==> value-parameter declarations: Collection<PsiElement> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[ValueParameterDescriptorImpl]

'visitor' @ [71:13] ==> var visitor: KtVisitorVoid? defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'ExceptionWrappingKtVisitorVoid' @ [71:23] ==> public constructor ExceptionWrappingKtVisitorVoid(delegate: KtVisitorVoid) defined in org.jetbrains.kotlin.resolve.ExceptionWrappingKtVisitorVoid[ClassConstructorDescriptorImpl]

'KtVisitorVoid' @ [71:63] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'declarations' @ [73:44] ==> value-parameter declarations: List<KtDeclaration> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.registerDeclarations[ValueParameterDescriptorImpl]

'jetDeclaration' @ [74:25] ==> val jetDeclaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.registerDeclarations[LocalVariableDescriptor]

'accept' @ [74:40] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'visitor' @ [74:47] ==> var visitor: KtVisitorVoid? defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'IllegalArgumentException' @ [79:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [79:52] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'dcl' @ [79:82] ==> value-parameter dcl: KtDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'dcl' @ [79:94] ==> value-parameter dcl: KtDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'text' @ [79:98] ==> public final val KtDeclaration.text: (String..String?)[MyPropertyDescriptor]

'c' @ [83:21] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'scripts' @ [83:23] ==> public final val TopDownAnalysisContext.scripts: MutableMap<(KtScript..KtScript?), (LazyScriptDescriptor..LazyScriptDescriptor?)>[MyPropertyDescriptor]

'put' @ [83:31] ==> public abstract fun put(key: (KtScript..KtScript?), value: (LazyScriptDescriptor..LazyScriptDescriptor?)): LazyScriptDescriptor? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'script' @ [84:29] ==> value-parameter script: KtScript defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitScript[ValueParameterDescriptorImpl]

'lazyDeclarationResolver' @ [85:29] ==> private final val lazyDeclarationResolver: LazyDeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'getScriptDescriptor' @ [85:53] ==> @NotNull public open fun getScriptDescriptor(@NotNull script: KtScript, @NotNull location: LookupLocation): ScriptDescriptor defined in org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver[JavaMethodDescriptor]

'script' @ [85:73] ==> value-parameter script: KtScript defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitScript[ValueParameterDescriptorImpl]

'KotlinLookupLocation' @ [85:81] ==> public constructor KotlinLookupLocation(element: KtElement) defined in org.jetbrains.kotlin.incremental.KotlinLookupLocation[ClassConstructorDescriptorImpl]

'script' @ [85:102] ==> value-parameter script: KtScript defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitScript[ValueParameterDescriptorImpl]

'registerDeclarations' @ [87:21] ==> private final fun registerDeclarations(declarations: List<KtDeclaration>): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'script' @ [87:42] ==> value-parameter script: KtScript defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitScript[ValueParameterDescriptorImpl]

'declarations' @ [87:49] ==> public final val KtScript.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'registerFileInPackage' @ [91:40] ==> public open fun registerFileInPackage(@NotNull trace: BindingTrace, @NotNull file: KtFile): Unit defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'trace' @ [91:62] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'file' @ [91:69] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitKtFile[ValueParameterDescriptorImpl]

'registerDeclarations' @ [92:21] ==> private final fun registerDeclarations(declarations: List<KtDeclaration>): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'file' @ [92:42] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitKtFile[ValueParameterDescriptorImpl]

'declarations' @ [92:47] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'file' @ [93:44] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitKtFile[ValueParameterDescriptorImpl]

'packageDirective' @ [93:49] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'assert' @ [94:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'file' @ [94:28] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitKtFile[ValueParameterDescriptorImpl]

'isScript' @ [94:33] ==> public final val KtFile.isScript: Boolean[MyPropertyDescriptor]

'packageDirective' @ [94:45] ==> val packageDirective: KtPackageDirective? defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitKtFile[LocalVariableDescriptor]

'+' @ [94:73] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'file' @ [94:111] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitKtFile[ValueParameterDescriptorImpl]

'packageDirective' @ [95:21] ==> val packageDirective: KtPackageDirective? defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitKtFile[LocalVariableDescriptor]

'accept' @ [95:39] ==> @Override public final fun accept(@NotNull visitor: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtPackageDirective[JavaMethodDescriptor]

'this' @ [95:46] ==> <this> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>[LazyClassReceiverParameterDescriptor]

'c' @ [96:21] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'addFile' @ [96:23] ==> public open fun addFile(@NotNull file: KtFile): Unit defined in org.jetbrains.kotlin.resolve.TopDownAnalysisContext[JavaMethodDescriptor]

'file' @ [96:31] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitKtFile[ValueParameterDescriptorImpl]

'topLevelFqNames' @ [97:21] ==> val topLevelFqNames: (HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>..HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'put' @ [97:37] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: FqName?, @Nullable p1: KtElement?): Boolean defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]

'file' @ [97:41] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitKtFile[ValueParameterDescriptorImpl]

'packageFqName' @ [97:46] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'packageDirective' @ [97:61] ==> val packageDirective: KtPackageDirective? defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitKtFile[LocalVariableDescriptor]

'directive' @ [101:21] ==> value-parameter directive: KtPackageDirective defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitPackageDirective[ValueParameterDescriptorImpl]

'packageNames' @ [101:31] ==> public final val KtPackageDirective.packageNames: (MutableList<(KtSimpleNameExpression..KtSimpleNameExpression?)>..List<(KtSimpleNameExpression..KtSimpleNameExpression?)>)[MyPropertyDescriptor]

'forEach' @ [101:44] ==> @HidesMembers public inline fun <T> Iterable<(KtSimpleNameExpression..KtSimpleNameExpression?)>.forEach(action: ((KtSimpleNameExpression..KtSimpleNameExpression?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtSimpleNameExpression..org.jetbrains.kotlin.psi.KtSimpleNameExpression?)

'identifierChecker' @ [101:54] ==> private final val identifierChecker: IdentifierChecker defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'checkIdentifier' @ [101:72] ==> public abstract fun checkIdentifier(identifier: PsiElement?, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.IdentifierChecker[SimpleFunctionDescriptorImpl]

'it' @ [101:88] ==> value-parameter it: (KtSimpleNameExpression..KtSimpleNameExpression?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitPackageDirective.<anonymous>[ValueParameterDescriptorImpl]

'getIdentifier' @ [101:91] ==> public abstract fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'trace' @ [101:108] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'qualifiedExpressionResolver' @ [102:21] ==> private final val qualifiedExpressionResolver: QualifiedExpressionResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'resolvePackageHeader' @ [102:49] ==> public final fun resolvePackageHeader(packageDirective: KtPackageDirective, module: ModuleDescriptor, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver[SimpleFunctionDescriptorImpl]

'directive' @ [102:70] ==> value-parameter directive: KtPackageDirective defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitPackageDirective[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [102:81] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'trace' @ [102:99] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'fileScopeProvider' @ [106:42] ==> private final val fileScopeProvider: FileScopeProvider defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'getImportResolver' @ [106:60] ==> public open fun getImportResolver(file: KtFile): ImportResolver defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider[SimpleFunctionDescriptorImpl]

'importDirective' @ [106:78] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitImportDirective[ValueParameterDescriptorImpl]

'containingKtFile' @ [106:94] ==> public final val KtImportDirective.containingKtFile: KtFile[MyPropertyDescriptor]

'importResolver' @ [107:21] ==> val importResolver: ImportResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitImportDirective[LocalVariableDescriptor]

'forceResolveImport' @ [107:36] ==> public abstract fun forceResolveImport(importDirective: KtImportDirective): Unit defined in org.jetbrains.kotlin.resolve.lazy.ImportResolver[SimpleFunctionDescriptorImpl]

'importDirective' @ [107:55] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitImportDirective[ValueParameterDescriptorImpl]

'if (classOrObject.isTopLevel()) KotlinLookupLocation(classOrObject) else NoLookupLocation.WHEN_RESOLVE_DECLARATION' @ [111:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LookupLocation, elseBranch: LookupLocation): LookupLocation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LookupLocation

'classOrObject' @ [111:40] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'isTopLevel' @ [111:54] ==> public final fun isTopLevel(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'KotlinLookupLocation' @ [111:68] ==> public constructor KotlinLookupLocation(element: KtElement) defined in org.jetbrains.kotlin.incremental.KotlinLookupLocation[ClassConstructorDescriptorImpl]

'classOrObject' @ [111:89] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'WHEN_RESOLVE_DECLARATION' @ [111:126] ==> enum entry WHEN_RESOLVE_DECLARATION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'lazyDeclarationResolver' @ [112:38] ==> private final val lazyDeclarationResolver: LazyDeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'getClassDescriptor' @ [112:62] ==> @NotNull public open fun getClassDescriptor(@NotNull classOrObject: KtClassOrObject, @NotNull location: LookupLocation): ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver[JavaMethodDescriptor]

'classOrObject' @ [112:81] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'location' @ [112:96] ==> val location: LookupLocation defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'c' @ [114:21] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'declaredClasses' @ [114:23] ==> public final val TopDownAnalysisContext.declaredClasses: (MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..MutableMap<(KtClassOrObject..KtClassOrObject?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>?)[MyPropertyDescriptor]

'put' @ [114:39] ==> public abstract fun put(key: (KtClassOrObject..KtClassOrObject?), value: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)): ClassDescriptorWithResolutionScopes? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [114:43] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'descriptor' @ [114:58] ==> val descriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'registerDeclarations' @ [115:21] ==> private final fun registerDeclarations(declarations: List<KtDeclaration>): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'classOrObject' @ [115:42] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'declarations' @ [115:56] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'registerTopLevelFqName' @ [116:21] ==> private final fun registerTopLevelFqName(topLevelFqNames: Multimap<FqName, KtElement>, declaration: KtNamedDeclaration, descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'topLevelFqNames' @ [116:44] ==> val topLevelFqNames: (HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>..HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'classOrObject' @ [116:61] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'descriptor' @ [116:76] ==> val descriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'checkClassOrObjectDeclarations' @ [118:21] ==> private final fun checkClassOrObjectDeclarations(classOrObject: KtClassOrObject, classDescriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'classOrObject' @ [118:52] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'descriptor' @ [118:67] ==> val descriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'classOrObject' @ [123:44] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[ValueParameterDescriptorImpl]

'declarations' @ [123:58] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'if (jetDeclaration is KtObjectDeclaration && jetDeclaration.isCompanion()) {
                            if (companionObjectAlreadyFound) {
                                trace.report(MANY_COMPANION_OBJECTS.on(jetDeclaration))
                            }
                            companionObjectAlreadyFound = true
                        }
                        else if (jetDeclaration is KtSecondaryConstructor) {
                            if (DescriptorUtils.isSingletonOrAnonymousObject(classDescriptor)) {
                                trace.report(CONSTRUCTOR_IN_OBJECT.on(jetDeclaration))
                            }
                            else if (classDescriptor.kind == ClassKind.INTERFACE) {
                                trace.report(CONSTRUCTOR_IN_INTERFACE.on(jetDeclaration))
                            }
                        }' @ [124:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'jetDeclaration' @ [124:29] ==> val jetDeclaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[LocalVariableDescriptor]

'jetDeclaration' @ [124:70] ==> val jetDeclaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[LocalVariableDescriptor]

'isCompanion' @ [124:85] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'companionObjectAlreadyFound' @ [125:33] ==> var companionObjectAlreadyFound: Boolean defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[LocalVariableDescriptor]

'trace' @ [126:33] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'report' @ [126:39] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MANY_COMPANION_OBJECTS' @ [126:46] ==> public final val MANY_COMPANION_OBJECTS: (DiagnosticFactory0<(KtObjectDeclaration..KtObjectDeclaration?)>..DiagnosticFactory0<(KtObjectDeclaration..KtObjectDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [126:69] ==> @NotNull public open fun on(@NotNull element: KtObjectDeclaration): SimpleDiagnostic<(KtObjectDeclaration..KtObjectDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'jetDeclaration' @ [126:72] ==> val jetDeclaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[LocalVariableDescriptor]

'companionObjectAlreadyFound' @ [128:29] ==> var companionObjectAlreadyFound: Boolean defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[LocalVariableDescriptor]

'jetDeclaration' @ [130:34] ==> val jetDeclaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[LocalVariableDescriptor]

'if (DescriptorUtils.isSingletonOrAnonymousObject(classDescriptor)) {
                                trace.report(CONSTRUCTOR_IN_OBJECT.on(jetDeclaration))
                            }
                            else if (classDescriptor.kind == ClassKind.INTERFACE) {
                                trace.report(CONSTRUCTOR_IN_INTERFACE.on(jetDeclaration))
                            }' @ [131:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isSingletonOrAnonymousObject' @ [131:49] ==> public open fun isSingletonOrAnonymousObject(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [131:78] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[ValueParameterDescriptorImpl]

'trace' @ [132:33] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'report' @ [132:39] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CONSTRUCTOR_IN_OBJECT' @ [132:46] ==> public final val CONSTRUCTOR_IN_OBJECT: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [132:68] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'jetDeclaration' @ [132:71] ==> val jetDeclaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[LocalVariableDescriptor]

'classDescriptor' @ [134:38] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[ValueParameterDescriptorImpl]

'kind' @ [134:54] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [134:72] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'trace' @ [135:33] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'report' @ [135:39] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CONSTRUCTOR_IN_INTERFACE' @ [135:46] ==> public final val CONSTRUCTOR_IN_INTERFACE: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [135:71] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'jetDeclaration' @ [135:74] ==> val jetDeclaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.checkClassOrObjectDeclarations[LocalVariableDescriptor]

'visitClassOrObject' @ [142:21] ==> public open fun visitClassOrObject(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'klass' @ [142:40] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClass[ValueParameterDescriptorImpl]

'registerPrimaryConstructorParameters' @ [143:21] ==> private final fun registerPrimaryConstructorParameters(klass: KtClass): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'klass' @ [143:58] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitClass[ValueParameterDescriptorImpl]

'klass' @ [147:42] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.registerPrimaryConstructorParameters[ValueParameterDescriptorImpl]

'primaryConstructorParameters' @ [147:48] ==> public final val KtClass.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'jetParameter' @ [148:29] ==> val jetParameter: KtParameter defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.registerPrimaryConstructorParameters[LocalVariableDescriptor]

'hasValOrVar' @ [148:42] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'c' @ [149:29] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'primaryConstructorParameterProperties' @ [149:31] ==> public final val TopDownAnalysisContext.primaryConstructorParameterProperties: (MutableMap<(KtParameter..KtParameter?), (PropertyDescriptor..PropertyDescriptor?)>..Map<(KtParameter..KtParameter?), (PropertyDescriptor..PropertyDescriptor?)>?)[MyPropertyDescriptor]

'put' @ [149:69] ==> public abstract fun put(key: (KtParameter..KtParameter?), value: (PropertyDescriptor..PropertyDescriptor?)): PropertyDescriptor? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'jetParameter' @ [149:73] ==> val jetParameter: KtParameter defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.registerPrimaryConstructorParameters[LocalVariableDescriptor]

'lazyDeclarationResolver' @ [149:87] ==> private final val lazyDeclarationResolver: LazyDeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'resolveToDescriptor' @ [149:111] ==> @NotNull public open fun resolveToDescriptor(@NotNull declaration: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver[JavaMethodDescriptor]

'jetParameter' @ [149:131] ==> val jetParameter: KtParameter defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.registerPrimaryConstructorParameters[LocalVariableDescriptor]

'c' @ [155:21] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'secondaryConstructors' @ [155:23] ==> public final val TopDownAnalysisContext.secondaryConstructors: (MutableMap<(KtSecondaryConstructor..KtSecondaryConstructor?), (ClassConstructorDescriptor..ClassConstructorDescriptor?)>..MutableMap<(KtSecondaryConstructor..KtSecondaryConstructor?), (ClassConstructorDescriptor..ClassConstructorDescriptor?)>?)[MyPropertyDescriptor]

'put' @ [155:45] ==> public abstract fun put(key: (KtSecondaryConstructor..KtSecondaryConstructor?), value: (ClassConstructorDescriptor..ClassConstructorDescriptor?)): ClassConstructorDescriptor? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'constructor' @ [155:49] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'lazyDeclarationResolver' @ [155:62] ==> private final val lazyDeclarationResolver: LazyDeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'resolveToDescriptor' @ [155:86] ==> @NotNull public open fun resolveToDescriptor(@NotNull declaration: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver[JavaMethodDescriptor]

'constructor' @ [155:106] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'visitClassOrObject' @ [159:21] ==> public open fun visitClassOrObject(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'enumEntry' @ [159:40] ==> value-parameter enumEntry: KtEnumEntry defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitEnumEntry[ValueParameterDescriptorImpl]

'visitClassOrObject' @ [163:21] ==> public open fun visitClassOrObject(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'declaration' @ [163:40] ==> value-parameter declaration: KtObjectDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitObjectDeclaration[ValueParameterDescriptorImpl]

'lazyDeclarationResolver' @ [167:47] ==> private final val lazyDeclarationResolver: LazyDeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'resolveToDescriptor' @ [167:71] ==> @NotNull public open fun resolveToDescriptor(@NotNull declaration: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver[JavaMethodDescriptor]

'initializer' @ [167:91] ==> value-parameter initializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'containingDeclaration' @ [167:103] ==> public abstract val containingDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[PropertyDescriptorImpl]

'c' @ [168:21] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'anonymousInitializers' @ [168:23] ==> public final val TopDownAnalysisContext.anonymousInitializers: (MutableMap<(KtAnonymousInitializer..KtAnonymousInitializer?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..MutableMap<(KtAnonymousInitializer..KtAnonymousInitializer?), (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>?)[MyPropertyDescriptor]

'put' @ [168:45] ==> public abstract fun put(key: (KtAnonymousInitializer..KtAnonymousInitializer?), value: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)): ClassDescriptorWithResolutionScopes? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'initializer' @ [168:49] ==> value-parameter initializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'containerDescriptor' @ [168:62] ==> val containerDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitAnonymousInitializer[LocalVariableDescriptor]

'destructuringDeclaration' @ [172:25] ==> value-parameter destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'containingKtFile' @ [172:50] ==> public final val KtDestructuringDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'isScript' @ [172:67] ==> public final val KtFile.isScript: Boolean[MyPropertyDescriptor]

'destructuringDeclarations' @ [173:25] ==> val destructuringDeclarations: ArrayList<KtDestructuringDeclaration> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'add' @ [173:51] ==> public open fun add(element: KtDestructuringDeclaration): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'destructuringDeclaration' @ [173:55] ==> value-parameter destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'functions' @ [178:21] ==> val functions: ArrayList<KtNamedFunction> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'add' @ [178:31] ==> public open fun add(element: KtNamedFunction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'function' @ [178:35] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'properties' @ [182:21] ==> val properties: ArrayList<KtProperty> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'add' @ [182:32] ==> public open fun add(element: KtProperty): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'property' @ [182:36] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'typeAliases' @ [186:21] ==> val typeAliases: ArrayList<KtTypeAlias> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'add' @ [186:33] ==> public open fun add(element: KtTypeAlias): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'typeAlias' @ [186:37] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations.<no name provided>.visitTypeAlias[ValueParameterDescriptorImpl]

'declaration' @ [190:13] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'accept' @ [190:25] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'visitor' @ [190:32] ==> var visitor: KtVisitorVoid? defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'createFunctionDescriptors' @ [193:9] ==> private final fun createFunctionDescriptors(c: TopDownAnalysisContext, functions: List<KtNamedFunction>): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'c' @ [193:35] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'functions' @ [193:38] ==> val functions: ArrayList<KtNamedFunction> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'createPropertyDescriptors' @ [195:9] ==> private final fun createPropertyDescriptors(c: TopDownAnalysisContext, topLevelFqNames: Multimap<FqName, KtElement>, properties: List<KtProperty>): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'c' @ [195:35] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'topLevelFqNames' @ [195:38] ==> val topLevelFqNames: (HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>..HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'properties' @ [195:55] ==> val properties: ArrayList<KtProperty> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'createPropertiesFromDestructuringDeclarations' @ [197:9] ==> private final fun createPropertiesFromDestructuringDeclarations(c: TopDownAnalysisContext, topLevelFqNames: Multimap<FqName, KtElement>, destructuringDeclarations: List<KtDestructuringDeclaration>): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'c' @ [197:55] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'topLevelFqNames' @ [197:58] ==> val topLevelFqNames: (HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>..HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'destructuringDeclarations' @ [197:75] ==> val destructuringDeclarations: ArrayList<KtDestructuringDeclaration> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'createTypeAliasDescriptors' @ [199:9] ==> private final fun createTypeAliasDescriptors(c: TopDownAnalysisContext, topLevelFqNames: Multimap<FqName, KtElement>, typeAliases: List<KtTypeAlias>): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'c' @ [199:36] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'topLevelFqNames' @ [199:39] ==> val topLevelFqNames: (HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>..HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'typeAliases' @ [199:56] ==> val typeAliases: ArrayList<KtTypeAlias> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'resolveAllHeadersInClasses' @ [201:9] ==> private final fun resolveAllHeadersInClasses(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'c' @ [201:36] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'declarationResolver' @ [203:9] ==> private final val declarationResolver: DeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'checkRedeclarationsInPackages' @ [203:29] ==> public final fun checkRedeclarationsInPackages(topLevelDescriptorProvider: TopLevelDescriptorProvider, topLevelFqNames: Multimap<FqName, KtElement>): Unit defined in org.jetbrains.kotlin.resolve.DeclarationResolver[SimpleFunctionDescriptorImpl]

'topLevelDescriptorProvider' @ [203:59] ==> private final val topLevelDescriptorProvider: TopLevelDescriptorProvider defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'topLevelFqNames' @ [203:87] ==> val topLevelFqNames: (HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>..HashMultimap<(FqName..FqName?), (KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'declarationResolver' @ [204:9] ==> private final val declarationResolver: DeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'checkRedeclarations' @ [204:29] ==> public final fun checkRedeclarations(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.DeclarationResolver[SimpleFunctionDescriptorImpl]

'c' @ [204:49] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'overrideResolver' @ [206:9] ==> private final val overrideResolver: OverrideResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'check' @ [206:26] ==> public final fun check(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver[SimpleFunctionDescriptorImpl]

'c' @ [206:32] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'varianceChecker' @ [208:9] ==> private final val varianceChecker: VarianceChecker defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'check' @ [208:25] ==> public final fun check(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.VarianceChecker[SimpleFunctionDescriptorImpl]

'c' @ [208:31] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'declarationResolver' @ [210:9] ==> private final val declarationResolver: DeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'resolveAnnotationsOnFiles' @ [210:29] ==> public final fun resolveAnnotationsOnFiles(c: TopDownAnalysisContext, scopeProvider: FileScopeProvider): Unit defined in org.jetbrains.kotlin.resolve.DeclarationResolver[SimpleFunctionDescriptorImpl]

'c' @ [210:55] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'fileScopeProvider' @ [210:58] ==> private final val fileScopeProvider: FileScopeProvider defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'overloadResolver' @ [212:9] ==> private final val overloadResolver: OverloadResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'checkOverloads' @ [212:26] ==> public final fun checkOverloads(c: BodiesResolveContext): Unit defined in org.jetbrains.kotlin.resolve.OverloadResolver[SimpleFunctionDescriptorImpl]

'c' @ [212:41] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'bodyResolver' @ [214:9] ==> private final val bodyResolver: BodyResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'resolveBodies' @ [214:22] ==> public open fun resolveBodies(@NotNull c: BodiesResolveContext): Unit defined in org.jetbrains.kotlin.resolve.BodyResolver[JavaMethodDescriptor]

'c' @ [214:36] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'resolveImportsInAllFiles' @ [216:9] ==> private final fun resolveImportsInAllFiles(c: TopDownAnalysisContext): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'c' @ [216:34] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'ClassifierUsageChecker' @ [218:9] ==> public companion object defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker[FakeCallableDescriptorForObject]

'check' @ [218:32] ==> public final fun check(declarations: Collection<PsiElement>, trace: BindingTrace, languageVersionSettings: LanguageVersionSettings, checkers: Iterable<ClassifierUsageChecker>): Unit defined in org.jetbrains.kotlin.resolve.checkers.ClassifierUsageChecker.Companion[SimpleFunctionDescriptorImpl]

'declarations' @ [218:38] ==> value-parameter declarations: Collection<PsiElement> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[ValueParameterDescriptorImpl]

'trace' @ [218:52] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'languageVersionSettings' @ [218:59] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'classifierUsageCheckers' @ [218:84] ==> private final val classifierUsageCheckers: Iterable<ClassifierUsageChecker> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'c' @ [220:16] ==> val c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations[LocalVariableDescriptor]

'c' @ [224:33] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.resolveAllHeadersInClasses[ValueParameterDescriptorImpl]

'allClasses' @ [224:35] ==> public final val TopDownAnalysisContext.allClasses: (MutableCollection<(ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>..Collection<(ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?)>)[MyPropertyDescriptor]

'classDescriptor' @ [225:14] ==> val classDescriptor: (ClassDescriptorWithResolutionScopes..ClassDescriptorWithResolutionScopes?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.resolveAllHeadersInClasses[LocalVariableDescriptor]

'resolveMemberHeaders' @ [225:54] ==> public open fun resolveMemberHeaders(): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassDescriptor[JavaMethodDescriptor]

'c' @ [230:22] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.resolveImportsInAllFiles[ValueParameterDescriptorImpl]

'files' @ [230:24] ==> public final val TopDownAnalysisContext.files: (Collection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)[MyPropertyDescriptor]

'c' @ [230:32] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.resolveImportsInAllFiles[ValueParameterDescriptorImpl]

'scripts' @ [230:34] ==> public final val TopDownAnalysisContext.scripts: MutableMap<(KtScript..KtScript?), (LazyScriptDescriptor..LazyScriptDescriptor?)>[MyPropertyDescriptor]

'keys' @ [230:42] ==> public abstract val keys: MutableSet<(KtScript..KtScript?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'map' @ [230:47] ==> public inline fun <T, R> Iterable<(KtScript..KtScript?)>.map(transform: ((KtScript..KtScript?)) -> KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtScript..org.jetbrains.kotlin.psi.KtScript?)
    <R> -> KtFile

'it' @ [230:53] ==> value-parameter it: (KtScript..KtScript?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.resolveImportsInAllFiles.<anonymous>[ValueParameterDescriptorImpl]

'containingKtFile' @ [230:56] ==> public final val KtScript.containingKtFile: KtFile[MyPropertyDescriptor]

'fileScopeProvider' @ [231:13] ==> private final val fileScopeProvider: FileScopeProvider defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'getImportResolver' @ [231:31] ==> public open fun getImportResolver(file: KtFile): ImportResolver defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider[SimpleFunctionDescriptorImpl]

'file' @ [231:49] ==> val file: (KtFile..KtFile?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.resolveImportsInAllFiles[LocalVariableDescriptor]

'forceResolveAllImports' @ [231:55] ==> public abstract fun forceResolveAllImports(): Unit defined in org.jetbrains.kotlin.resolve.lazy.ImportResolver[SimpleFunctionDescriptorImpl]

'typeAliases' @ [236:27] ==> value-parameter typeAliases: List<KtTypeAlias> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createTypeAliasDescriptors[ValueParameterDescriptorImpl]

'lazyDeclarationResolver' @ [237:30] ==> private final val lazyDeclarationResolver: LazyDeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'resolveToDescriptor' @ [237:54] ==> @NotNull public open fun resolveToDescriptor(@NotNull declaration: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver[JavaMethodDescriptor]

'typeAlias' @ [237:74] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createTypeAliasDescriptors[LocalVariableDescriptor]

'c' @ [239:13] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createTypeAliasDescriptors[ValueParameterDescriptorImpl]

'typeAliases' @ [239:15] ==> public final val TopDownAnalysisContext.typeAliases: (MutableMap<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>..MutableMap<(KtTypeAlias..KtTypeAlias?), (TypeAliasDescriptor..TypeAliasDescriptor?)>?)[MyPropertyDescriptor]

'typeAlias' @ [239:27] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createTypeAliasDescriptors[LocalVariableDescriptor]

'descriptor' @ [239:40] ==> val descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createTypeAliasDescriptors[LocalVariableDescriptor]

'forceResolveAllContents' @ [240:30] ==> public open fun forceResolveAllContents(@NotNull annotations: Annotations): Unit defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'descriptor' @ [240:54] ==> val descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createTypeAliasDescriptors[LocalVariableDescriptor]

'annotations' @ [240:65] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'registerTopLevelFqName' @ [241:13] ==> private final fun registerTopLevelFqName(topLevelFqNames: Multimap<FqName, KtElement>, declaration: KtNamedDeclaration, descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'topLevelFqNames' @ [241:36] ==> value-parameter topLevelFqNames: Multimap<FqName, KtElement> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createTypeAliasDescriptors[ValueParameterDescriptorImpl]

'typeAlias' @ [241:53] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createTypeAliasDescriptors[LocalVariableDescriptor]

'descriptor' @ [241:64] ==> val descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createTypeAliasDescriptors[LocalVariableDescriptor]

'properties' @ [246:26] ==> value-parameter properties: List<KtProperty> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertyDescriptors[ValueParameterDescriptorImpl]

'lazyDeclarationResolver' @ [247:30] ==> private final val lazyDeclarationResolver: LazyDeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'resolveToDescriptor' @ [247:54] ==> @NotNull public open fun resolveToDescriptor(@NotNull declaration: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver[JavaMethodDescriptor]

'property' @ [247:74] ==> val property: KtProperty defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertyDescriptors[LocalVariableDescriptor]

'c' @ [249:13] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertyDescriptors[ValueParameterDescriptorImpl]

'properties' @ [249:15] ==> public final val TopDownAnalysisContext.properties: (MutableMap<(KtProperty..KtProperty?), (PropertyDescriptor..PropertyDescriptor?)>..MutableMap<(KtProperty..KtProperty?), (PropertyDescriptor..PropertyDescriptor?)>?)[MyPropertyDescriptor]

'put' @ [249:26] ==> public abstract fun put(key: (KtProperty..KtProperty?), value: (PropertyDescriptor..PropertyDescriptor?)): PropertyDescriptor? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'property' @ [249:30] ==> val property: KtProperty defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertyDescriptors[LocalVariableDescriptor]

'descriptor' @ [249:40] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertyDescriptors[LocalVariableDescriptor]

'forceResolveAllContents' @ [250:30] ==> public open fun forceResolveAllContents(@NotNull annotations: Annotations): Unit defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'descriptor' @ [250:54] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertyDescriptors[LocalVariableDescriptor]

'annotations' @ [250:65] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[DeserializedPropertyDescriptor]

'registerTopLevelFqName' @ [251:13] ==> private final fun registerTopLevelFqName(topLevelFqNames: Multimap<FqName, KtElement>, declaration: KtNamedDeclaration, descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'topLevelFqNames' @ [251:36] ==> value-parameter topLevelFqNames: Multimap<FqName, KtElement> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertyDescriptors[ValueParameterDescriptorImpl]

'property' @ [251:53] ==> val property: KtProperty defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertyDescriptors[LocalVariableDescriptor]

'descriptor' @ [251:63] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertyDescriptors[LocalVariableDescriptor]

'functions' @ [256:26] ==> value-parameter functions: List<KtNamedFunction> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createFunctionDescriptors[ValueParameterDescriptorImpl]

'lazyDeclarationResolver' @ [257:44] ==> private final val lazyDeclarationResolver: LazyDeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'resolveToDescriptor' @ [257:68] ==> @NotNull public open fun resolveToDescriptor(@NotNull declaration: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver[JavaMethodDescriptor]

'function' @ [257:88] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createFunctionDescriptors[LocalVariableDescriptor]

'c' @ [258:13] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createFunctionDescriptors[ValueParameterDescriptorImpl]

'functions' @ [258:15] ==> public final val TopDownAnalysisContext.functions: (MutableMap<(KtNamedFunction..KtNamedFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..MutableMap<(KtNamedFunction..KtNamedFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?)[MyPropertyDescriptor]

'put' @ [258:25] ==> public abstract fun put(key: (KtNamedFunction..KtNamedFunction?), value: (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)): SimpleFunctionDescriptor? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'function' @ [258:29] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createFunctionDescriptors[LocalVariableDescriptor]

'simpleFunctionDescriptor' @ [258:39] ==> val simpleFunctionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createFunctionDescriptors[LocalVariableDescriptor]

'forceResolveAllContents' @ [259:30] ==> public open fun forceResolveAllContents(@NotNull annotations: Annotations): Unit defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'simpleFunctionDescriptor' @ [259:54] ==> val simpleFunctionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createFunctionDescriptors[LocalVariableDescriptor]

'annotations' @ [259:79] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[DeserializedPropertyDescriptor]

'simpleFunctionDescriptor' @ [260:41] ==> val simpleFunctionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createFunctionDescriptors[LocalVariableDescriptor]

'valueParameters' @ [260:66] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forceResolveAllContents' @ [261:34] ==> public open fun forceResolveAllContents(@NotNull annotations: Annotations): Unit defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'parameterDescriptor' @ [261:58] ==> val parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createFunctionDescriptors[LocalVariableDescriptor]

'annotations' @ [261:78] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'destructuringDeclarations' @ [270:42] ==> value-parameter destructuringDeclarations: List<KtDestructuringDeclaration> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertiesFromDestructuringDeclarations[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [271:27] ==> val destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertiesFromDestructuringDeclarations[LocalVariableDescriptor]

'entries' @ [271:52] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'lazyDeclarationResolver' @ [272:34] ==> private final val lazyDeclarationResolver: LazyDeclarationResolver defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[PropertyDescriptorImpl]

'resolveToDescriptor' @ [272:58] ==> @NotNull public open fun resolveToDescriptor(@NotNull declaration: KtDeclaration): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver[JavaMethodDescriptor]

'entry' @ [272:78] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertiesFromDestructuringDeclarations[LocalVariableDescriptor]

'c' @ [274:17] ==> value-parameter c: TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertiesFromDestructuringDeclarations[ValueParameterDescriptorImpl]

'destructuringDeclarationEntries' @ [274:19] ==> public final val TopDownAnalysisContext.destructuringDeclarationEntries: (MutableMap<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (PropertyDescriptor..PropertyDescriptor?)>..MutableMap<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (PropertyDescriptor..PropertyDescriptor?)>?)[MyPropertyDescriptor]

'entry' @ [274:51] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertiesFromDestructuringDeclarations[LocalVariableDescriptor]

'descriptor' @ [274:60] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertiesFromDestructuringDeclarations[LocalVariableDescriptor]

'forceResolveAllContents' @ [275:34] ==> public open fun forceResolveAllContents(@NotNull annotations: Annotations): Unit defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]

'descriptor' @ [275:58] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertiesFromDestructuringDeclarations[LocalVariableDescriptor]

'annotations' @ [275:69] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[DeserializedPropertyDescriptor]

'registerTopLevelFqName' @ [276:17] ==> private final fun registerTopLevelFqName(topLevelFqNames: Multimap<FqName, KtElement>, declaration: KtNamedDeclaration, descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'topLevelFqNames' @ [276:40] ==> value-parameter topLevelFqNames: Multimap<FqName, KtElement> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertiesFromDestructuringDeclarations[ValueParameterDescriptorImpl]

'entry' @ [276:57] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertiesFromDestructuringDeclarations[LocalVariableDescriptor]

'descriptor' @ [276:64] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.createPropertiesFromDestructuringDeclarations[LocalVariableDescriptor]

'isTopLevelDeclaration' @ [282:29] ==> public open fun isTopLevelDeclaration(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [282:51] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.registerTopLevelFqName[ValueParameterDescriptorImpl]

'declaration' @ [283:26] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.registerTopLevelFqName[ValueParameterDescriptorImpl]

'fqName' @ [283:38] ==> public final val KtNamedDeclaration.fqName: FqName?[MyPropertyDescriptor]

'fqName' @ [284:17] ==> val fqName: FqName? defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.registerTopLevelFqName[LocalVariableDescriptor]

'topLevelFqNames' @ [285:17] ==> value-parameter topLevelFqNames: Multimap<FqName, KtElement> defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.registerTopLevelFqName[ValueParameterDescriptorImpl]

'put' @ [285:33] ==> @CanIgnoreReturnValue public abstract fun put(@Nullable p0: FqName?, @Nullable p1: KtElement?): Boolean defined in com.google.common.collect.Multimap[JavaMethodDescriptor]

'fqName' @ [285:37] ==> val fqName: FqName? defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.registerTopLevelFqName[LocalVariableDescriptor]

'declaration' @ [285:45] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.registerTopLevelFqName[ValueParameterDescriptorImpl]

