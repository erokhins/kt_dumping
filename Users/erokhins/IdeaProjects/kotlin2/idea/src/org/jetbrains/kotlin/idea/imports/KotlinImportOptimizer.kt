'file' @ [47:45] ==> value-parameter file: PsiFile? defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.supports[ValueParameterDescriptorImpl]

'Runnable' @ [49:48] ==> @FunctionalInterface public fun Runnable(function: () -> Unit): Runnable defined in java.lang[SamConstructorDescriptorImpl]

'OptimizeProcess' @ [50:9] ==> public constructor OptimizeProcess(file: KtFile) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.OptimizeProcess[ClassConstructorDescriptorImpl]

'file' @ [50:25] ==> value-parameter file: PsiFile? defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.processFile[ValueParameterDescriptorImpl]

'execute' @ [50:41] ==> public final fun execute(): Unit defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.OptimizeProcess[SimpleFunctionDescriptorImpl]

'file' @ [55:17] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.OptimizeProcess[PropertyDescriptorImpl]

'getNullableModuleInfo' @ [55:22] ==> public fun PsiElement.getNullableModuleInfo(): IdeaModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'file' @ [57:30] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.OptimizeProcess[PropertyDescriptorImpl]

'importDirectives' @ [57:35] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'oldImports' @ [58:17] ==> val oldImports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.OptimizeProcess.execute[LocalVariableDescriptor]

'isEmpty' @ [58:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'collectDescriptorsToImport' @ [62:39] ==> public final fun collectDescriptorsToImport(file: KtFile): OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion[SimpleFunctionDescriptorImpl]

'file' @ [62:66] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.OptimizeProcess[PropertyDescriptorImpl]

'prepareOptimizedImports' @ [64:27] ==> public final fun prepareOptimizedImports(file: KtFile, data: OptimizedImportsBuilder.InputData): List<ImportPath>? defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion[SimpleFunctionDescriptorImpl]

'file' @ [64:51] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.OptimizeProcess[PropertyDescriptorImpl]

'descriptorsToImport' @ [64:57] ==> val descriptorsToImport: OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.OptimizeProcess.execute[LocalVariableDescriptor]

'runWriteAction' @ [66:13] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'replaceImports' @ [66:30] ==> public final fun replaceImports(file: KtFile, imports: List<ImportPath>): Unit defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion[SimpleFunctionDescriptorImpl]

'file' @ [66:45] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.OptimizeProcess[PropertyDescriptorImpl]

'imports' @ [66:51] ==> val imports: List<ImportPath> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.OptimizeProcess.execute[LocalVariableDescriptor]

'KtVisitorVoid' @ [70:65] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'file' @ [71:42] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.<init>[ValueParameterDescriptorImpl]

'packageFqName' @ [71:47] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'HashSet' @ [72:43] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'ArrayList' @ [73:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AbstractReference

'OptimizedImportsBuilder' @ [76:21] ==> public companion object defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[FakeCallableDescriptorForObject]

'InputData' @ [76:45] ==> public constructor InputData(descriptorsToImport: Set<DeclarationDescriptor>, references: Collection<OptimizedImportsBuilder.AbstractReference>) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.InputData[DeserializedClassConstructorDescriptor]

'descriptorsToImport' @ [76:55] ==> private final val descriptorsToImport: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor[PropertyDescriptorImpl]

'abstractRefs' @ [76:76] ==> private final val abstractRefs: ArrayList<OptimizedImportsBuilder.AbstractReference> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor[PropertyDescriptorImpl]

'checkCanceled' @ [79:39] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressIndicatorProvider[JavaMethodDescriptor]

'element' @ [80:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [80:21] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'this' @ [80:36] ==> <this> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor[LazyClassReceiverParameterDescriptor]

'element' @ [90:31] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[ValueParameterDescriptorImpl]

'references' @ [90:39] ==> public final val KtElement.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'reference' @ [91:21] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'abstractRefs' @ [92:17] ==> private final val abstractRefs: ArrayList<OptimizedImportsBuilder.AbstractReference> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor[PropertyDescriptorImpl]

'add' @ [92:30] ==> public open fun add(element: OptimizedImportsBuilder.AbstractReference): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'AbstractReferenceImpl' @ [92:34] ==> public constructor AbstractReferenceImpl(reference: KtReference) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl[ClassConstructorDescriptorImpl]

'reference' @ [92:56] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'reference' @ [94:29] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'resolvesByNames' @ [94:39] ==> public abstract val resolvesByNames: Collection<Name> defined in org.jetbrains.kotlin.idea.references.KtReference[DeserializedPropertyDescriptor]

'element' @ [96:38] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[ValueParameterDescriptorImpl]

'analyze' @ [96:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'reference' @ [97:31] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'targets' @ [97:41] ==> private final fun KtReference.targets(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion[SimpleFunctionDescriptorImpl]

'bindingContext' @ [97:49] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'targets' @ [98:32] ==> val targets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'target' @ [99:48] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'getImportableDescriptor' @ [99:55] ==> public fun DeclarationDescriptor.getImportableDescriptor(): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'importableDescriptor' @ [100:25] ==> val importableDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'name' @ [100:46] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'names' @ [100:55] ==> val names: Collection<Name> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'target' @ [102:44] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'importableFqName' @ [102:51] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'importableFqName' @ [103:40] ==> val importableFqName: FqName defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'parent' @ [103:57] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'target' @ [104:25] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'parentFqName' @ [104:60] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'ROOT' @ [104:83] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'target' @ [105:25] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'parentFqName' @ [105:61] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'currentPackageName' @ [105:77] ==> private final val currentPackageName: FqName defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor[PropertyDescriptorImpl]

'!' @ [107:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'reference' @ [107:26] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'canBeResolvedViaImport' @ [107:36] ==> public fun KtReference.canBeResolvedViaImport(target: DeclarationDescriptor, bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'target' @ [107:59] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'bindingContext' @ [107:67] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'isAccessibleAsMember' @ [109:25] ==> private final fun isAccessibleAsMember(target: DeclarationDescriptor, place: KtElement, bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor[SimpleFunctionDescriptorImpl]

'importableDescriptor' @ [109:46] ==> val importableDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'element' @ [109:68] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[ValueParameterDescriptorImpl]

'bindingContext' @ [109:77] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'descriptorsToImport' @ [111:21] ==> private final val descriptorsToImport: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor[PropertyDescriptorImpl]

'add' @ [111:41] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'importableDescriptor' @ [111:45] ==> val importableDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[LocalVariableDescriptor]

'super' @ [115:13] ==> <this> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor[LazyClassReceiverParameterDescriptor]

'visitKtElement' @ [115:19] ==> public open fun visitKtElement(@NotNull p0: KtElement): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'element' @ [115:34] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.visitKtElement[ValueParameterDescriptorImpl]

'target' @ [119:17] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'containingDeclaration' @ [119:24] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'when (target) {
                    is FunctionDescriptor ->
                        scope.findFunction(target.name, NoLookupLocation.FROM_IDE) { it == target } != null

                    is PropertyDescriptor ->
                        scope.findVariable(target.name, NoLookupLocation.FROM_IDE) { it == target } != null

                    is ClassDescriptor ->
                        scope.findClassifier(target.name, NoLookupLocation.FROM_IDE) == target

                    else -> false
                }' @ [122:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'target' @ [122:30] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'scope' @ [124:25] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember.isInScope[ValueParameterDescriptorImpl]

'findFunction' @ [124:31] ==> public fun HierarchicalScope.findFunction(name: Name, location: LookupLocation, predicate: (FunctionDescriptor) -> Boolean = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'target' @ [124:44] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'name' @ [124:51] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [124:74] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'it' @ [124:86] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember.isInScope.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [124:92] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'scope' @ [127:25] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember.isInScope[ValueParameterDescriptorImpl]

'findVariable' @ [127:31] ==> public fun HierarchicalScope.findVariable(name: Name, location: LookupLocation, predicate: (VariableDescriptor) -> Boolean = ...): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'target' @ [127:44] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'name' @ [127:51] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [127:74] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'it' @ [127:86] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember.isInScope.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [127:92] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'scope' @ [130:25] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember.isInScope[ValueParameterDescriptorImpl]

'findClassifier' @ [130:31] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'target' @ [130:46] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'name' @ [130:53] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [130:76] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'target' @ [130:89] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'place' @ [136:35] ==> value-parameter place: KtElement defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'getResolutionScope' @ [136:41] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [136:60] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'place' @ [136:76] ==> value-parameter place: KtElement defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [136:82] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionScope' @ [137:34] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[LocalVariableDescriptor]

'replaceImportingScopes' @ [137:50] ==> public fun LexicalScope.replaceImportingScopes(importingScopeChain: ImportingScope?): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'isInScope' @ [139:17] ==> local final fun isInScope(scope: HierarchicalScope): Boolean defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[SimpleFunctionDescriptorImpl]

'noImportsScope' @ [139:27] ==> val noImportsScope: LexicalScope defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[LocalVariableDescriptor]

'target' @ [140:17] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[ValueParameterDescriptorImpl]

'resolutionScope' @ [141:21] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[LocalVariableDescriptor]

'getImplicitReceiversHierarchy' @ [141:37] ==> public fun LexicalScope.getImplicitReceiversHierarchy(): List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'any' @ [141:69] ==> public inline fun <T> Iterable<ReceiverParameterDescriptor>.any(predicate: (ReceiverParameterDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor

'isInScope' @ [141:75] ==> local final fun isInScope(scope: HierarchicalScope): Boolean defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember[SimpleFunctionDescriptorImpl]

'it' @ [141:85] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.isAccessibleAsMember.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [141:88] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'memberScope' @ [141:93] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'memberScopeAsImportingScope' @ [141:105] ==> @JvmOverloads public fun MemberScope.memberScopeAsImportingScope(parentScope: ImportingScope? = ...): ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'reference' @ [148:25] ==> private final val reference: KtReference defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl[PropertyDescriptorImpl]

'element' @ [148:35] ==> public final val KtReference.element: KtElement[MyPropertyDescriptor]

'reference' @ [152:43] ==> private final val reference: KtReference defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl[PropertyDescriptorImpl]

'resolvesByNames' @ [152:53] ==> public abstract val resolvesByNames: Collection<Name> defined in org.jetbrains.kotlin.idea.references.KtReference[DeserializedPropertyDescriptor]

'reference' @ [153:25] ==> private final val reference: KtReference defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl[PropertyDescriptorImpl]

'reference' @ [154:48] ==> private final val reference: KtReference defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl[PropertyDescriptorImpl]

'element' @ [154:58] ==> public final val KtInvokeFunctionReference.element: (KtCallExpression..KtCallExpression?)[MyPropertyDescriptor]

'calleeExpression' @ [154:66] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'mainReference' @ [154:115] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolvesByNames' @ [154:130] ==> public open val resolvesByNames: Collection<Name> defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'additionalNames' @ [155:29] ==> val additionalNames: Collection<Name>? defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl.<get-dependsOnNames>[LocalVariableDescriptor]

'resolvesByNames' @ [156:36] ==> val resolvesByNames: Collection<Name> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl.<get-dependsOnNames>[LocalVariableDescriptor]

'additionalNames' @ [156:54] ==> val additionalNames: Collection<Name>? defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl.<get-dependsOnNames>[LocalVariableDescriptor]

'resolvesByNames' @ [159:28] ==> val resolvesByNames: Collection<Name> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl.<get-dependsOnNames>[LocalVariableDescriptor]

'reference' @ [162:68] ==> private final val reference: KtReference defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl[PropertyDescriptorImpl]

'resolveToDescriptors' @ [162:78] ==> public abstract fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtReference[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [162:99] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl.resolve[ValueParameterDescriptorImpl]

'reference' @ [164:39] ==> private final val reference: KtReference defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor.AbstractReferenceImpl[PropertyDescriptorImpl]

'toString' @ [164:49] ==> public open fun toString(): String defined in org.jetbrains.kotlin.idea.references.KtReference[DeserializedSimpleFunctionDescriptor]

'CollectUsedDescriptorsVisitor' @ [170:27] ==> public constructor CollectUsedDescriptorsVisitor(file: KtFile) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor[ClassConstructorDescriptorImpl]

'file' @ [170:57] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.collectDescriptorsToImport[ValueParameterDescriptorImpl]

'file' @ [171:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.collectDescriptorsToImport[ValueParameterDescriptorImpl]

'accept' @ [171:18] ==> public open fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'visitor' @ [171:25] ==> val visitor: KotlinImportOptimizer.CollectUsedDescriptorsVisitor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.collectDescriptorsToImport[LocalVariableDescriptor]

'visitor' @ [172:20] ==> val visitor: KotlinImportOptimizer.CollectUsedDescriptorsVisitor defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.collectDescriptorsToImport[LocalVariableDescriptor]

'data' @ [172:28] ==> public final val data: OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.CollectUsedDescriptorsVisitor[PropertyDescriptorImpl]

'getInstance' @ [176:52] ==> public open fun getInstance(p0: (Project..Project?)): (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaMethodDescriptor]

'file' @ [176:64] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.prepareOptimizedImports[ValueParameterDescriptorImpl]

'project' @ [176:69] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'OptimizedImportsBuilder' @ [177:27] ==> public companion object defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[FakeCallableDescriptorForObject]

'Options' @ [177:51] ==> public constructor Options(nameCountToUseStarImport: Int, nameCountToUseStarImportForMembers: Int, isInPackagesToUseStarImport: (FqName) -> Boolean) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.Options[DeserializedClassConstructorDescriptor]

'settings' @ [178:21] ==> val settings: (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.prepareOptimizedImports[LocalVariableDescriptor]

'NAME_COUNT_TO_USE_STAR_IMPORT' @ [178:30] ==> public final var NAME_COUNT_TO_USE_STAR_IMPORT: Int defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'settings' @ [179:21] ==> val settings: (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.prepareOptimizedImports[LocalVariableDescriptor]

'NAME_COUNT_TO_USE_STAR_IMPORT_FOR_MEMBERS' @ [179:30] ==> public final var NAME_COUNT_TO_USE_STAR_IMPORT_FOR_MEMBERS: Int defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'fqName' @ [180:63] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.prepareOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [180:70] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'settings' @ [180:84] ==> val settings: (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.prepareOptimizedImports[LocalVariableDescriptor]

'PACKAGES_TO_USE_STAR_IMPORTS' @ [180:93] ==> public final val PACKAGES_TO_USE_STAR_IMPORTS: (PackageEntryTable..PackageEntryTable?) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'OptimizedImportsBuilder' @ [181:20] ==> public constructor OptimizedImportsBuilder(file: KtFile, data: OptimizedImportsBuilder.InputData, options: OptimizedImportsBuilder.Options) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[DeserializedClassConstructorDescriptor]

'file' @ [181:44] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.prepareOptimizedImports[ValueParameterDescriptorImpl]

'data' @ [181:50] ==> value-parameter data: OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.prepareOptimizedImports[ValueParameterDescriptorImpl]

'options' @ [181:56] ==> val options: OptimizedImportsBuilder.Options defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.prepareOptimizedImports[LocalVariableDescriptor]

'buildOptimizedImports' @ [181:65] ==> public final fun buildOptimizedImports(): List<ImportPath>? defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[DeserializedSimpleFunctionDescriptor]

'file' @ [185:30] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.replaceImports[ValueParameterDescriptorImpl]

'importList' @ [185:35] ==> public final val KtFile.importList: KtImportList?[MyPropertyDescriptor]

'importList' @ [186:30] ==> val importList: KtImportList defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.replaceImports[LocalVariableDescriptor]

'imports' @ [186:41] ==> public final val KtImportList.imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'KtPsiFactory' @ [187:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'file' @ [187:43] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.replaceImports[ValueParameterDescriptorImpl]

'project' @ [187:48] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'imports' @ [188:32] ==> value-parameter imports: List<ImportPath> defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.replaceImports[ValueParameterDescriptorImpl]

'importList' @ [189:17] ==> val importList: KtImportList defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.replaceImports[LocalVariableDescriptor]

'addBefore' @ [189:28] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtImportList[JavaMethodDescriptor]

'psiFactory' @ [189:38] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.replaceImports[LocalVariableDescriptor]

'createImportDirective' @ [189:49] ==> public final fun createImportDirective(importPath: ImportPath): KtImportDirective defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'importPath' @ [189:71] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.replaceImports[LocalVariableDescriptor]

'oldImports' @ [189:84] ==> val oldImports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.replaceImports[LocalVariableDescriptor]

'lastOrNull' @ [189:95] ==> public fun <T> List<(KtImportDirective..KtImportDirective?)>.lastOrNull(): KtImportDirective? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'oldImports' @ [193:28] ==> val oldImports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.replaceImports[LocalVariableDescriptor]

'import' @ [194:17] ==> val import: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.replaceImports[LocalVariableDescriptor]

'delete' @ [194:24] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtImportDirective[JavaMethodDescriptor]

'bindingContext' @ [200:20] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.targets[ValueParameterDescriptorImpl]

'SHORT_REFERENCE_TO_COMPANION_OBJECT' @ [200:50] ==> public final val SHORT_REFERENCE_TO_COMPANION_OBJECT: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [200:87] ==> public final val KtReference.element: KtElement[MyPropertyDescriptor]

'let' @ [200:123] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptorWithTypeParameters.let(block: (ClassifierDescriptorWithTypeParameters) -> List<ClassifierDescriptorWithTypeParameters>): List<ClassifierDescriptorWithTypeParameters> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters
    <R> -> List<ClassifierDescriptorWithTypeParameters>

'listOf' @ [200:129] ==> public fun <T> listOf(element: ClassifierDescriptorWithTypeParameters): List<ClassifierDescriptorWithTypeParameters> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'it' @ [200:136] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.targets.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptors' @ [201:23] ==> public abstract fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtReference[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [201:44] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion.targets[ValueParameterDescriptorImpl]

