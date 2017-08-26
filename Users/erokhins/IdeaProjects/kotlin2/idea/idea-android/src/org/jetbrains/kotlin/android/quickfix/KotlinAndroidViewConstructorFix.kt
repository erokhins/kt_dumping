'KotlinQuickFixAction<KtSuperTypeEntry>' @ [41:68] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtSuperTypeEntry) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtSuperTypeEntry

'element' @ [41:107] ==> value-parameter element: KtSuperTypeEntry defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.<init>[ValueParameterDescriptorImpl]

'text' @ [44:36] ==> public final val KotlinAndroidViewConstructorFix.text: String[MyPropertyDescriptor]

'==' @ [47:13] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'getInstance' @ [47:26] ==> @Nullable public open fun getInstance(@NotNull p0: PsiElement): AndroidFacet? defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'file' @ [47:38] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.isAvailable[ValueParameterDescriptorImpl]

'super' @ [48:16] ==> <this> defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [48:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [48:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [48:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [48:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [52:23] ==> protected final val element: KtSuperTypeEntry? defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix[PropertyDescriptorImpl]

'element' @ [53:23] ==> val element: KtSuperTypeEntry defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'containingClass' @ [53:31] ==> public fun KtElement.containingClass(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [55:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [55:36] ==> val element: KtSuperTypeEntry defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'factory' @ [57:37] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'createDeclarationByPattern' @ [57:45] ==> public fun <TDeclaration : KtDeclaration> KtPsiFactory.createDeclarationByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtClass defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtClass

'factory' @ [59:17] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'createParameter' @ [59:25] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'factory' @ [60:17] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'createParameter' @ [60:25] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'factory' @ [61:17] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'createParameter' @ [61:25] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'primaryConstructor' @ [62:11] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'ktClass' @ [64:34] ==> val ktClass: KtClass defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'createPrimaryConstructorIfAbsent' @ [64:42] ==> public fun KtClass.createPrimaryConstructorIfAbsent(): KtPrimaryConstructor defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'replaced' @ [64:77] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtPrimaryConstructor): KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtPrimaryConstructor

'newPrimaryConstructor' @ [64:86] ==> val newPrimaryConstructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'primaryConstructor' @ [65:9] ==> val primaryConstructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'valueParameterList' @ [65:28] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'let' @ [65:48] ==> @InlineOnly public inline fun <T, R> KtParameterList.let(block: (KtParameterList) -> KtElement): KtElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameterList
    <R> -> KtElement

'ShortenReferences' @ [65:54] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [65:72] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [65:80] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'it' @ [65:88] ==> value-parameter it: KtParameterList defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'primaryConstructor' @ [67:9] ==> val primaryConstructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'addAnnotation' @ [67:28] ==> public fun KtModifierListOwner.addAnnotation(annotationFqName: FqName, annotationInnerText: String? = ..., whiteSpaceText: String = ..., addToExistingAnnotation: ((KtAnnotationEntry) -> Boolean)? = ...): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'fqNameAnnotation' @ [67:42] ==> private final val fqNameAnnotation: FqName defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory[PropertyDescriptorImpl]

'element' @ [69:9] ==> val element: KtSuperTypeEntry defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'replace' @ [69:17] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSuperTypeEntry[JavaMethodDescriptor]

'factory' @ [69:25] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'createSuperTypeCallEntry' @ [69:33] ==> public final fun createSuperTypeCallEntry(text: String): KtSuperTypeCallEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [69:58] ==> val element: KtSuperTypeEntry defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.invoke[LocalVariableDescriptor]

'text' @ [69:66] ==> public final val KtSuperTypeEntry.text: (String..String?)[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [72:32] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'FqName' @ [74:40] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'listOf' @ [77:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'SUPERTYPE_NOT_INITIALIZED' @ [80:34] ==> public final val SUPERTYPE_NOT_INITIALIZED: (DiagnosticFactory0<(KtSuperTypeEntry..KtSuperTypeEntry?)>..DiagnosticFactory0<(KtSuperTypeEntry..KtSuperTypeEntry?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [80:60] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): SimpleDiagnostic<(KtSuperTypeEntry..KtSuperTypeEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'diagnostic' @ [80:65] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [80:77] ==> public final val <E : (PsiElement..PsiElement?)> SimpleDiagnostic<(KtSuperTypeEntry..KtSuperTypeEntry?)>.psiElement: KtSuperTypeEntry[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtSuperTypeEntry..org.jetbrains.kotlin.psi.KtSuperTypeEntry?)

'superTypeEntry' @ [82:27] ==> val superTypeEntry: KtSuperTypeEntry defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[LocalVariableDescriptor]

'containingClass' @ [82:42] ==> public fun KtElement.containingClass(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'ktClass' @ [83:17] ==> val ktClass: KtClass defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[LocalVariableDescriptor]

'primaryConstructor' @ [83:25] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'superTypeEntry' @ [85:27] ==> val superTypeEntry: KtSuperTypeEntry defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[LocalVariableDescriptor]

'analyze' @ [85:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'superTypeEntry' @ [86:24] ==> val superTypeEntry: KtSuperTypeEntry defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[LocalVariableDescriptor]

'typeReference' @ [86:39] ==> public final val KtSuperTypeEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [86:54] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> KotlinType?

'context' @ [86:60] ==> val context: BindingContext defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[LocalVariableDescriptor]

'TYPE' @ [86:83] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [86:89] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [88:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [88:18] ==> val type: KotlinType defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[LocalVariableDescriptor]

'isAndroidView' @ [88:23] ==> private final fun KotlinType.isAndroidView(): Boolean defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory[SimpleFunctionDescriptorImpl]

'type' @ [88:42] ==> val type: KotlinType defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[LocalVariableDescriptor]

'supertypes' @ [88:47] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'none' @ [88:60] ==> public inline fun <T> Iterable<KotlinType>.none(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [88:67] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction.<anonymous>[ValueParameterDescriptorImpl]

'isAndroidView' @ [88:70] ==> private final fun KotlinType.isAndroidView(): Boolean defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory[SimpleFunctionDescriptorImpl]

'type' @ [90:25] ==> val type: KotlinType defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[LocalVariableDescriptor]

'constructorParameters' @ [90:30] ==> private final fun KotlinType.constructorParameters(): List<List<String?>>? defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory[SimpleFunctionDescriptorImpl]

'requiredConstructorParameterTypes' @ [91:17] ==> private final val requiredConstructorParameterTypes: List<String> defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory[PropertyDescriptorImpl]

'names' @ [91:55] ==> val names: List<List<String?>> defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[LocalVariableDescriptor]

'KotlinAndroidViewConstructorFix' @ [93:20] ==> public constructor KotlinAndroidViewConstructorFix(element: KtSuperTypeEntry) defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix[ClassConstructorDescriptorImpl]

'superTypeEntry' @ [93:52] ==> val superTypeEntry: KtSuperTypeEntry defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.createAction[LocalVariableDescriptor]

'constructor' @ [96:54] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [96:66] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameUnsafe' @ [96:89] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [96:103] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'getFqNameAsString' @ [98:50] ==> private final fun KotlinType.getFqNameAsString(): String? defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory[SimpleFunctionDescriptorImpl]

'constructor' @ [101:35] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [101:47] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classDescriptor' @ [102:20] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.constructorParameters[LocalVariableDescriptor]

'constructors' @ [102:36] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'map' @ [102:49] ==> public inline fun <T, R> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.map(transform: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> List<String?>): List<List<String?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)
    <R> -> List<String?>

'it' @ [103:17] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.constructorParameters.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [103:20] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [103:36] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> String?

'it' @ [103:42] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory.constructorParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [103:45] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'getFqNameAsString' @ [103:50] ==> private final fun KotlinType.getFqNameAsString(): String? defined in org.jetbrains.kotlin.android.quickfix.KotlinAndroidViewConstructorFix.Factory[SimpleFunctionDescriptorImpl]

