'PsiReferenceContributor' @ [25:53] ==> public constructor PsiReferenceContributor() defined in com.intellij.psi.PsiReferenceContributor[JavaClassConstructorDescriptor]

'DEFAULT_PRIORITY' @ [27:54] ==> public const final val DEFAULT_PRIORITY: Double defined in com.intellij.psi.PsiReferenceRegistrar[JavaPropertyDescriptor]

'registerMultiProvider' @ [30:9] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerMultiProvider(priority: Double = ..., crossinline factory: (E) -> Array<PsiReference>): Unit defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> E

'priority' @ [30:34] ==> value-parameter priority: Double = ... defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor.registerProvider[ValueParameterDescriptorImpl]

'invoke' @ [30:46] ==> public abstract operator fun invoke(p1: E): PsiReference? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [30:54] ==> value-parameter it: E defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor.registerProvider.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [30:59] ==> @InlineOnly public inline fun <T, R> PsiReference.let(block: (PsiReference) -> Array<PsiReference>): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference
    <R> -> Array<PsiReference>

'arrayOf' @ [30:65] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiReference): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'it' @ [30:73] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor.registerProvider.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'EMPTY_ARRAY' @ [30:95] ==> public final val EMPTY_ARRAY: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>?) defined in com.intellij.psi.PsiReference[JavaPropertyDescriptor]

'DEFAULT_PRIORITY' @ [34:54] ==> public const final val DEFAULT_PRIORITY: Double defined in com.intellij.psi.PsiReferenceRegistrar[JavaPropertyDescriptor]

'registerMultiProvider' @ [37:9] ==> protected final inline fun <E : KtElement> PsiReferenceRegistrar.registerMultiProvider(pattern: ElementPattern<(E..E?)>, priority: Double = ..., crossinline factory: ((E..E?)) -> Array<PsiReference>): Unit defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : KtElement> -> (E..E?)

'psiElement' @ [37:48] ==> public open fun <T : (PsiElement..PsiElement?)> psiElement(p0: (Class<(E..E?)>..Class<(E..E?)>?)): (PsiElementPattern.Capture<(E..E?)>..PsiElementPattern.Capture<(E..E?)>?) defined in com.intellij.patterns.PlatformPatterns[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (E..E?)

'java' @ [37:68] ==> public val <T> KClass<E>.java: Class<E> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> E

'priority' @ [37:75] ==> value-parameter priority: Double = ... defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor.registerMultiProvider[ValueParameterDescriptorImpl]

'factory' @ [37:85] ==> value-parameter crossinline factory: (E) -> Array<PsiReference> defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor.registerMultiProvider[ValueParameterDescriptorImpl]

'DEFAULT_PRIORITY' @ [42:54] ==> public const final val DEFAULT_PRIORITY: Double defined in com.intellij.psi.PsiReferenceRegistrar[JavaPropertyDescriptor]

'registerReferenceProvider' @ [45:9] ==> public abstract fun <T : (PsiElement..PsiElement?)> registerReferenceProvider(@NotNull p0: ElementPattern<(E..E?)>, @NotNull p1: PsiReferenceProvider, p2: Double): Unit defined in com.intellij.psi.PsiReferenceRegistrar[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (E..E?)

'pattern' @ [46:17] ==> value-parameter pattern: ElementPattern<E> defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor.registerMultiProvider[ValueParameterDescriptorImpl]

'PsiReferenceProvider' @ [47:26] ==> public constructor PsiReferenceProvider() defined in com.intellij.psi.PsiReferenceProvider[JavaClassConstructorDescriptor]

'Suppress' @ [49:25] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'invoke' @ [50:32] ==> public abstract operator fun invoke(p1: E): Array<PsiReference> defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [50:40] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor.registerMultiProvider.<no name provided>.getReferencesByElement[ValueParameterDescriptorImpl]

'priority' @ [53:17] ==> value-parameter priority: Double = ... defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor.registerMultiProvider[ValueParameterDescriptorImpl]

