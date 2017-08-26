'PsiPolyVariantReferenceBase<T>' @ [42:65] ==> public constructor PsiPolyVariantReferenceBase<T : (PsiElement..PsiElement?)>(p0: (T..T?)) defined in com.intellij.psi.PsiPolyVariantReferenceBase[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> T

'element' @ [42:96] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.<init>[ValueParameterDescriptorImpl]

'element' @ [44:17] ==> public final val <T : KtElement> AbstractKtReference<T>.element: (T..T?)[MyPropertyDescriptor]
Inferred types:
    <T : KtElement> -> T

'Suppress' @ [47:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'KOTLIN_RESOLVER' @ [48:30] ==> public final val KOTLIN_RESOLVER: AbstractKtReference.Companion.KotlinReferenceResolver defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion[PropertyDescriptorImpl]

'getInstance' @ [49:29] ==> public open fun getInstance(p0: (Project..Project?)): (ResolveCache..ResolveCache?) defined in com.intellij.psi.impl.source.resolve.ResolveCache[JavaMethodDescriptor]

'expression' @ [49:41] ==> public final val expression: T defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[PropertyDescriptorImpl]

'project' @ [49:52] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'resolveWithCaching' @ [49:61] ==> @NotNull public open fun <T : (PsiPolyVariantReference..PsiPolyVariantReference?)> resolveWithCaching(@NotNull p0: AbstractKtReference<T>, @NotNull p1: ResolveCache.PolyVariantResolver<(AbstractKtReference<T>..AbstractKtReference<T>?)>, p2: Boolean, p3: Boolean): (Array<(ResolveResult..ResolveResult?)>..Array<out (ResolveResult..ResolveResult?)>) defined in com.intellij.psi.impl.source.resolve.ResolveCache[JavaMethodDescriptor]
Inferred types:
    <T : (PsiPolyVariantReference..PsiPolyVariantReference?)> -> AbstractKtReference<T>

'this' @ [49:80] ==> <this> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[LazyClassReceiverParameterDescriptor]

'kotlinResolver' @ [49:86] ==> val kotlinResolver: ResolveCache.PolyVariantResolver<AbstractKtReference<T>> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.multiResolve[LocalVariableDescriptor]

'incompleteCode' @ [49:109] ==> value-parameter incompleteCode: Boolean defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.multiResolve[ValueParameterDescriptorImpl]

'element' @ [53:16] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.isReferenceTo[ValueParameterDescriptorImpl]

'matchesTarget' @ [53:35] ==> public fun PsiReference.matchesTarget(candidateTarget: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'element' @ [53:49] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.isReferenceTo[ValueParameterDescriptorImpl]

'IncorrectOperationException' @ [59:84] ==> public constructor IncorrectOperationException() defined in com.intellij.util.IncorrectOperationException[JavaClassConstructorDescriptor]

'IncorrectOperationException' @ [61:73] ==> public constructor IncorrectOperationException() defined in com.intellij.util.IncorrectOperationException[JavaClassConstructorDescriptor]

'Suppress' @ [63:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'EMPTY_ARRAY' @ [64:59] ==> public final val EMPTY_ARRAY: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>?) defined in com.intellij.psi.PsiReference[JavaPropertyDescriptor]

'getTargetDescriptors' @ [69:16] ==> protected abstract fun getTargetDescriptors(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[SimpleFunctionDescriptorImpl]

'bindingContext' @ [69:37] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.resolveToDescriptors[ValueParameterDescriptorImpl]

'this' @ [74:31] ==> <this> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[LazyClassReceiverParameterDescriptor]

'java' @ [74:43] ==> public val <T> KClass<out AbstractKtReference<T>>.java: Class<out AbstractKtReference<T>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbstractKtReference<T>

'simpleName' @ [74:48] ==> public final val <T : (Any..Any?)> Class<out AbstractKtReference<T>>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AbstractKtReference<T>

'expression' @ [74:68] ==> public final val expression: T defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[PropertyDescriptorImpl]

'text' @ [74:79] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'PsiElementResolveResult' @ [78:62] ==> public constructor PsiElementResolveResult(@NotNull p0: PsiElement) defined in com.intellij.psi.PsiElementResolveResult[JavaClassConstructorDescriptor]

'element' @ [78:86] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.KotlinResolveResult.<init>[ValueParameterDescriptorImpl]

'ref' @ [81:38] ==> value-parameter ref: AbstractKtReference<KtElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'expression' @ [81:42] ==> public final val expression: KtElement defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[PropertyDescriptorImpl]

'analyze' @ [81:53] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_WITH_DIAGNOSTICS' @ [81:77] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'resolveToPsiElements' @ [82:24] ==> private final fun resolveToPsiElements(ref: AbstractKtReference<KtElement>, context: BindingContext, targetDescriptors: Collection<DeclarationDescriptor>): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver[SimpleFunctionDescriptorImpl]

'ref' @ [82:45] ==> value-parameter ref: AbstractKtReference<KtElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'bindingContext' @ [82:50] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[LocalVariableDescriptor]

'ref' @ [82:66] ==> value-parameter ref: AbstractKtReference<KtElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'getTargetDescriptors' @ [82:70] ==> protected abstract fun getTargetDescriptors(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[SimpleFunctionDescriptorImpl]

'bindingContext' @ [82:91] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[LocalVariableDescriptor]

'targetDescriptors' @ [86:21] ==> value-parameter targetDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'isNotEmpty' @ [86:39] ==> @InlineOnly public inline fun <T> Collection<DeclarationDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'targetDescriptors' @ [87:28] ==> value-parameter targetDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'flatMap' @ [87:46] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.flatMap(transform: (DeclarationDescriptor) -> Iterable<PsiElement>): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> PsiElement

'resolveToPsiElements' @ [87:66] ==> private final fun resolveToPsiElements(ref: AbstractKtReference<KtElement>, targetDescriptor: DeclarationDescriptor): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver[SimpleFunctionDescriptorImpl]

'ref' @ [87:87] ==> value-parameter ref: AbstractKtReference<KtElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'target' @ [87:92] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [87:102] ==> public fun <T> Iterable<PsiElement>.toSet(): Set<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getLabelTargets' @ [90:36] ==> private final fun getLabelTargets(ref: AbstractKtReference<KtElement>, context: BindingContext): Collection<PsiElement>? defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver[SimpleFunctionDescriptorImpl]

'ref' @ [90:52] ==> value-parameter ref: AbstractKtReference<KtElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'context' @ [90:57] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'labelTargets' @ [91:21] ==> val labelTargets: Collection<PsiElement>? defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[LocalVariableDescriptor]

'labelTargets' @ [92:28] ==> val labelTargets: Collection<PsiElement>? defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[LocalVariableDescriptor]

'emptySet' @ [95:36] ==> public final fun <T : (Any..Any?)> emptySet(): (MutableSet<(PsiElement..PsiElement?)>..Set<(PsiElement..PsiElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElement

'if (targetDescriptor is PackageViewDescriptor) {
                    val psiFacade = JavaPsiFacade.getInstance(ref.expression.project)
                    val fqName = targetDescriptor.fqName.asString()
                    listOfNotNull(psiFacade.findPackage(fqName))
                }
                else {
                    DescriptorToSourceUtilsIde.getAllDeclarations(ref.expression.project, targetDescriptor, ref.expression.resolveScope)
                }' @ [99:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<PsiElement>, elseBranch: Collection<PsiElement>): Collection<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<PsiElement>

'targetDescriptor' @ [99:28] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'getInstance' @ [100:51] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'ref' @ [100:63] ==> value-parameter ref: AbstractKtReference<KtElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'expression' @ [100:67] ==> public final val expression: KtElement defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[PropertyDescriptorImpl]

'project' @ [100:78] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'targetDescriptor' @ [101:34] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'fqName' @ [101:51] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'asString' @ [101:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'listOfNotNull' @ [102:21] ==> public fun <T : Any> listOfNotNull(element: PsiPackage?): List<PsiPackage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiPackage

'psiFacade' @ [102:35] ==> val psiFacade: (JavaPsiFacade..JavaPsiFacade?) defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[LocalVariableDescriptor]

'findPackage' @ [102:45] ==> @Nullable public abstract fun findPackage(@NonNls @NotNull p0: String): PsiPackage? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'fqName' @ [102:57] ==> val fqName: String defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[LocalVariableDescriptor]

'DescriptorToSourceUtilsIde' @ [105:21] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight in file DescriptorToSourceUtilsIde.kt[FakeCallableDescriptorForObject]

'getAllDeclarations' @ [105:48] ==> public final fun getAllDeclarations(project: Project, targetDescriptor: DeclarationDescriptor, builtInsSearchScope: GlobalSearchScope? = ...): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[SimpleFunctionDescriptorImpl]

'ref' @ [105:67] ==> value-parameter ref: AbstractKtReference<KtElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'expression' @ [105:71] ==> public final val expression: KtElement defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[PropertyDescriptorImpl]

'project' @ [105:82] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'targetDescriptor' @ [105:91] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'ref' @ [105:109] ==> value-parameter ref: AbstractKtReference<KtElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolveToPsiElements[ValueParameterDescriptorImpl]

'expression' @ [105:113] ==> public final val expression: KtElement defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[PropertyDescriptorImpl]

'resolveScope' @ [105:124] ==> public final val KtElement.resolveScope: GlobalSearchScope[MyPropertyDescriptor]

'ref' @ [110:33] ==> value-parameter ref: AbstractKtReference<KtElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.getLabelTargets[ValueParameterDescriptorImpl]

'expression' @ [110:37] ==> public final val expression: KtElement defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[PropertyDescriptorImpl]

'context' @ [111:35] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.getLabelTargets[ValueParameterDescriptorImpl]

'LABEL_TARGET' @ [111:58] ==> public final val LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'reference' @ [111:72] ==> val reference: KtReferenceExpression defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.getLabelTargets[LocalVariableDescriptor]

'labelTarget' @ [112:21] ==> val labelTarget: PsiElement? defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.getLabelTargets[LocalVariableDescriptor]

'listOf' @ [113:28] ==> public fun <T> listOf(element: PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'labelTarget' @ [113:35] ==> val labelTarget: PsiElement? defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.getLabelTargets[LocalVariableDescriptor]

'context' @ [115:24] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.getLabelTargets[ValueParameterDescriptorImpl]

'AMBIGUOUS_LABEL_TARGET' @ [115:47] ==> public final val AMBIGUOUS_LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (MutableCollection<out (PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (MutableCollection<out (PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'reference' @ [115:71] ==> val reference: KtReferenceExpression defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.getLabelTargets[LocalVariableDescriptor]

'resolveToPsiElements' @ [119:44] ==> private final fun resolveToPsiElements(ref: AbstractKtReference<KtElement>): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver[SimpleFunctionDescriptorImpl]

'ref' @ [119:65] ==> value-parameter ref: AbstractKtReference<KtElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolve[ValueParameterDescriptorImpl]

'resolveToPsiElements' @ [120:24] ==> val resolveToPsiElements: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolve[LocalVariableDescriptor]

'map' @ [120:45] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> AbstractKtReference.Companion.KotlinReferenceResolver.KotlinResolveResult): List<AbstractKtReference.Companion.KotlinReferenceResolver.KotlinResolveResult> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KotlinResolveResult

'KotlinResolveResult' @ [120:51] ==> public constructor KotlinResolveResult(element: PsiElement) defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.KotlinResolveResult[ClassConstructorDescriptorImpl]

'it' @ [120:71] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver.resolve.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [120:77] ==> public inline fun <reified T> Collection<ResolveResult>.toTypedArray(): Array<ResolveResult> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> ResolveResult

'KotlinReferenceResolver' @ [124:31] ==> public constructor KotlinReferenceResolver() defined in org.jetbrains.kotlin.idea.references.AbstractKtReference.Companion.KotlinReferenceResolver[ClassConstructorDescriptorImpl]

'AbstractKtReference<T>' @ [128:78] ==> public constructor AbstractKtReference<T : KtElement>(element: T) defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtElement> -> T

'expression' @ [128:101] ==> value-parameter expression: T defined in org.jetbrains.kotlin.idea.references.KtSimpleReference.<init>[ValueParameterDescriptorImpl]

'expression' @ [129:66] ==> public final val expression: T defined in org.jetbrains.kotlin.idea.references.KtSimpleReference[PropertyDescriptorImpl]

'getReferenceTargets' @ [129:77] ==> public fun KtExpression.getReferenceTargets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [129:97] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.references.KtSimpleReference.getTargetDescriptors[ValueParameterDescriptorImpl]

'AbstractKtReference<T>' @ [132:65] ==> public constructor AbstractKtReference<T : KtElement>(element: T) defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtElement> -> T

'expression' @ [132:88] ==> value-parameter expression: T defined in org.jetbrains.kotlin.idea.references.KtMultiReference.<init>[ValueParameterDescriptorImpl]

