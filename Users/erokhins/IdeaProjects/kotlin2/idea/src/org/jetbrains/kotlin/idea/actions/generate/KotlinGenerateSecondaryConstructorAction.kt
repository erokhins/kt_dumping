'KotlinGenerateMemberActionBase<KotlinGenerateSecondaryConstructorAction.Info>' @ [54:50] ==> public constructor KotlinGenerateMemberActionBase<Info : Any>() defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase[ClassConstructorDescriptorImpl]
Inferred types:
    <Info : Any> -> Info

'targetClass' @ [62:16] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.isValidForClass[ValueParameterDescriptorImpl]

'targetClass' @ [63:20] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.isValidForClass[ValueParameterDescriptorImpl]

'!' @ [64:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [64:21] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.isValidForClass[ValueParameterDescriptorImpl]

'isInterface' @ [64:33] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'!' @ [65:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [65:21] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.isValidForClass[ValueParameterDescriptorImpl]

'isAnnotation' @ [65:33] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'!' @ [66:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [66:21] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.isValidForClass[ValueParameterDescriptorImpl]

'hasExplicitPrimaryConstructor' @ [66:33] ==> public open fun hasExplicitPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'element' @ [69:56] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.shouldPreselect[ValueParameterDescriptorImpl]

'!' @ [69:81] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [69:82] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.shouldPreselect[ValueParameterDescriptorImpl]

'isVar' @ [69:90] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'klass' @ [72:23] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors[ValueParameterDescriptorImpl]

'project' @ [72:29] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'classDescriptor' @ [73:36] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors[ValueParameterDescriptorImpl]

'getSuperClassNotAny' @ [73:52] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [73:84] ==> public fun <T> emptyList(): List<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorMemberChooserObject

'superClassDescriptor' @ [74:26] ==> val superClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors[LocalVariableDescriptor]

'constructors' @ [74:47] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'filter' @ [75:18] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.filter(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [75:27] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors.<anonymous>[ValueParameterDescriptorImpl]

'isVisible' @ [75:30] ==> public fun DeclarationDescriptorWithVisibility.isVisible(from: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [75:40] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors[ValueParameterDescriptorImpl]

'map' @ [76:18] ==> public inline fun <T, R> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.map(transform: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> DescriptorMemberChooserObject): List<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)
    <R> -> DescriptorMemberChooserObject

'DescriptorMemberChooserObject' @ [76:24] ==> public constructor DescriptorMemberChooserObject(psiElement: PsiElement, descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[DeserializedClassConstructorDescriptor]

'DescriptorToSourceUtilsIde' @ [76:54] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [76:81] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [76:99] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors[LocalVariableDescriptor]

'it' @ [76:108] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors.<anonymous>[ValueParameterDescriptorImpl]

'klass' @ [76:115] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors[ValueParameterDescriptorImpl]

'it' @ [76:122] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors.<anonymous>[ValueParameterDescriptorImpl]

'getApplication' @ [77:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [77:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'candidates' @ [77:67] ==> val candidates: List<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors[LocalVariableDescriptor]

'size' @ [77:78] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'candidates' @ [77:96] ==> val candidates: List<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors[LocalVariableDescriptor]

'with' @ [79:16] ==> @InlineOnly public inline fun <T, R> with(receiver: MemberChooser<DescriptorMemberChooserObject>, block: MemberChooser<DescriptorMemberChooserObject>.() -> List<DescriptorMemberChooserObject>): List<DescriptorMemberChooserObject> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberChooser<DescriptorMemberChooserObject>
    <R> -> List<DescriptorMemberChooserObject>

'MemberChooser' @ [79:21] ==> public constructor MemberChooser<T : (ClassMember..ClassMember?)>(p0: (Array<(DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>..Array<out (DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>?), p1: Boolean, p2: Boolean, @NotNull p3: Project) defined in com.intellij.ide.util.MemberChooser[JavaClassConstructorDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> DescriptorMemberChooserObject

'candidates' @ [79:35] ==> val candidates: List<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors[LocalVariableDescriptor]

'toTypedArray' @ [79:46] ==> public inline fun <reified T> Collection<DescriptorMemberChooserObject>.toTypedArray(): Array<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> DescriptorMemberChooserObject

'klass' @ [79:75] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.chooseSuperConstructors[ValueParameterDescriptorImpl]

'project' @ [79:81] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'title' @ [80:13] ==> public final var <T : (ClassMember..ClassMember?)> MemberChooser<DescriptorMemberChooserObject>.title: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> DescriptorMemberChooserObject

'message' @ [80:39] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.codeInsight.CodeInsightBundle[JavaMethodDescriptor]

'setCopyJavadocVisible' @ [81:13] ==> public open fun setCopyJavadocVisible(p0: Boolean): Unit defined in com.intellij.ide.util.MemberChooser[JavaMethodDescriptor]

'show' @ [82:13] ==> public open fun show(): Unit defined in com.intellij.ide.util.MemberChooser[JavaMethodDescriptor]

'selectedElements' @ [84:13] ==> public final val <T : (ClassMember..ClassMember?)> MemberChooser<DescriptorMemberChooserObject>.selectedElements: (MutableList<(DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>?..List<(DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> DescriptorMemberChooserObject

'emptyList' @ [84:33] ==> public fun <T> emptyList(): List<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorMemberChooserObject

'klass' @ [89:26] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize[ValueParameterDescriptorImpl]

'declarations' @ [89:32] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [90:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtProperty

'filter' @ [91:18] ==> public inline fun <T> Iterable<KtProperty>.filter(predicate: (KtProperty) -> Boolean): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'it' @ [91:27] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize.<anonymous>[ValueParameterDescriptorImpl]

'isVar' @ [91:30] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'context' @ [91:39] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize[ValueParameterDescriptorImpl]

'diagnostics' @ [91:47] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [91:59] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'it' @ [91:70] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [91:74] ==> public inline fun <T> Iterable<Diagnostic>.any(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [91:80] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [91:83] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'MUST_BE_INITIALIZED_DIAGNOSTICS' @ [91:101] ==> public final val MUST_BE_INITIALIZED_DIAGNOSTICS: (ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>..ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'map' @ [92:18] ==> public inline fun <T, R> Iterable<KtProperty>.map(transform: (KtProperty) -> PropertyDescriptor): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty
    <R> -> PropertyDescriptor

'context' @ [92:24] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize[ValueParameterDescriptorImpl]

'get' @ [92:32] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?), p1: (PsiElement..PsiElement?)): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> VariableDescriptor

'VARIABLE' @ [92:51] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [92:61] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [93:18] ==> public inline fun <T, R> Iterable<PropertyDescriptor>.map(transform: (PropertyDescriptor) -> DescriptorMemberChooserObject): List<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <R> -> DescriptorMemberChooserObject

'DescriptorMemberChooserObject' @ [93:24] ==> public constructor DescriptorMemberChooserObject(psiElement: PsiElement, descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[DeserializedClassConstructorDescriptor]

'it' @ [93:54] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [93:57] ==> public final val PropertyDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [93:64] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'it' @ [93:76] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize.<anonymous>[ValueParameterDescriptorImpl]

'getApplication' @ [94:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [94:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'candidates' @ [94:67] ==> val candidates: List<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize[LocalVariableDescriptor]

'isEmpty' @ [94:78] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'candidates' @ [94:96] ==> val candidates: List<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize[LocalVariableDescriptor]

'with' @ [96:16] ==> @InlineOnly public inline fun <T, R> with(receiver: MemberChooser<DescriptorMemberChooserObject>, block: MemberChooser<DescriptorMemberChooserObject>.() -> List<DescriptorMemberChooserObject>): List<DescriptorMemberChooserObject> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberChooser<DescriptorMemberChooserObject>
    <R> -> List<DescriptorMemberChooserObject>

'MemberChooser' @ [96:21] ==> public constructor MemberChooser<T : (ClassMember..ClassMember?)>(p0: (Array<(DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>..Array<out (DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>?), p1: Boolean, p2: Boolean, @NotNull p3: Project, p4: Boolean, @Nullable p5: JComponent?) defined in com.intellij.ide.util.MemberChooser[JavaClassConstructorDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> DescriptorMemberChooserObject

'candidates' @ [96:35] ==> val candidates: List<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize[LocalVariableDescriptor]

'toTypedArray' @ [96:46] ==> public inline fun <reified T> Collection<DescriptorMemberChooserObject>.toTypedArray(): Array<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> DescriptorMemberChooserObject

'klass' @ [96:74] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize[ValueParameterDescriptorImpl]

'project' @ [96:80] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'title' @ [97:13] ==> public final var <T : (ClassMember..ClassMember?)> MemberChooser<DescriptorMemberChooserObject>.title: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> DescriptorMemberChooserObject

'setCopyJavadocVisible' @ [98:13] ==> public open fun setCopyJavadocVisible(p0: Boolean): Unit defined in com.intellij.ide.util.MemberChooser[JavaMethodDescriptor]

'selectElements' @ [99:13] ==> public open fun selectElements(p0: (Array<(ClassMember..ClassMember?)>..Array<out (ClassMember..ClassMember?)>?)): Unit defined in com.intellij.ide.util.MemberChooser[JavaMethodDescriptor]

'candidates' @ [99:28] ==> val candidates: List<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize[LocalVariableDescriptor]

'filter' @ [99:39] ==> public inline fun <T> Iterable<DescriptorMemberChooserObject>.filter(predicate: (DescriptorMemberChooserObject) -> Boolean): List<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorMemberChooserObject

'shouldPreselect' @ [99:48] ==> private final fun shouldPreselect(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction[SimpleFunctionDescriptorImpl]

'it' @ [99:64] ==> value-parameter it: DescriptorMemberChooserObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.choosePropertiesToInitialize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [99:67] ==> public final val DescriptorMemberChooserObject.element: PsiElement[MyPropertyDescriptor]

'toTypedArray' @ [99:78] ==> public inline fun <reified T> Collection<DescriptorMemberChooserObject>.toTypedArray(): Array<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> DescriptorMemberChooserObject

'show' @ [100:13] ==> public open fun show(): Unit defined in com.intellij.ide.util.MemberChooser[JavaMethodDescriptor]

'selectedElements' @ [102:13] ==> public final val <T : (ClassMember..ClassMember?)> MemberChooser<DescriptorMemberChooserObject>.selectedElements: (MutableList<(DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>?..List<(DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> DescriptorMemberChooserObject

'emptyList' @ [102:33] ==> public fun <T> emptyList(): List<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorMemberChooserObject

'klass' @ [107:23] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'analyzeFully' @ [107:29] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [108:31] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo[LocalVariableDescriptor]

'get' @ [108:39] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> ClassDescriptor

'CLASS' @ [108:58] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'klass' @ [108:65] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'chooseSuperConstructors' @ [109:33] ==> private final fun chooseSuperConstructors(klass: KtClassOrObject, classDescriptor: ClassDescriptor): List<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction[SimpleFunctionDescriptorImpl]

'klass' @ [109:57] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'classDescriptor' @ [109:64] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo[LocalVariableDescriptor]

'map' @ [109:81] ==> public inline fun <T, R> Iterable<DescriptorMemberChooserObject>.map(transform: (DescriptorMemberChooserObject) -> ConstructorDescriptor): List<ConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorMemberChooserObject
    <R> -> ConstructorDescriptor

'it' @ [109:87] ==> value-parameter it: DescriptorMemberChooserObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [109:90] ==> public open val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[DeserializedPropertyDescriptor]

'choosePropertiesToInitialize' @ [110:38] ==> private final fun choosePropertiesToInitialize(klass: KtClassOrObject, context: BindingContext): List<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction[SimpleFunctionDescriptorImpl]

'klass' @ [110:67] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'context' @ [110:74] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo[LocalVariableDescriptor]

'map' @ [110:83] ==> public inline fun <T, R> Iterable<DescriptorMemberChooserObject>.map(transform: (DescriptorMemberChooserObject) -> PropertyDescriptor): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorMemberChooserObject
    <R> -> PropertyDescriptor

'it' @ [110:89] ==> value-parameter it: DescriptorMemberChooserObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [110:92] ==> public open val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[DeserializedPropertyDescriptor]

'Info' @ [111:16] ==> public constructor Info(propertiesToInitialize: List<PropertyDescriptor>, superConstructors: List<ConstructorDescriptor>, classDescriptor: ClassDescriptor) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.Info[ClassConstructorDescriptorImpl]

'propertiesToInitialize' @ [111:21] ==> val propertiesToInitialize: List<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo[LocalVariableDescriptor]

'superConstructors' @ [111:45] ==> val superConstructors: List<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo[LocalVariableDescriptor]

'classDescriptor' @ [111:64] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.prepareMembersInfo[LocalVariableDescriptor]

'info' @ [115:27] ==> value-parameter info: KotlinGenerateSecondaryConstructorAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers[ValueParameterDescriptorImpl]

'classDescriptor' @ [115:32] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.Info[PropertyDescriptorImpl]

'source' @ [115:48] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [115:55] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [115:86] ==> public fun <T> emptyList(): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'targetClass' @ [118:13] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers[LocalVariableDescriptor]

'declarations' @ [118:25] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'lastIsInstanceOrNull' @ [118:38] ==> public inline fun <reified T : Any> Iterable<*>.lastIsInstanceOrNull(): KtSecondaryConstructor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtSecondaryConstructor

'let' @ [118:86] ==> @InlineOnly public inline fun <T, R> KtSecondaryConstructor.let(block: (KtSecondaryConstructor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSecondaryConstructor
    <R> -> Nothing

'it' @ [118:99] ==> value-parameter it: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers.findAnchor.<anonymous>[ValueParameterDescriptorImpl]

'propertiesToInitialize' @ [119:44] ==> public final val propertiesToInitialize: List<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.Info[PropertyDescriptorImpl]

'lastOrNull' @ [119:67] ==> public fun <T> List<PropertyDescriptor>.lastOrNull(): PropertyDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'source' @ [119:81] ==> public final val PropertyDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [119:89] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'lastPropertyToInitialize' @ [120:37] ==> val lastPropertyToInitialize: PsiElement? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers.findAnchor[LocalVariableDescriptor]

'siblings' @ [120:63] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'filterIsInstance' @ [120:75] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtDeclaration> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtDeclaration

'targetClass' @ [120:112] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers[LocalVariableDescriptor]

'declarations' @ [120:124] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'asSequence' @ [120:137] ==> public fun <T> Iterable<KtDeclaration>.asSequence(): Sequence<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'declarationsAfter' @ [121:36] ==> val declarationsAfter: Sequence<KtDeclaration> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers.findAnchor[LocalVariableDescriptor]

'firstOrNull' @ [121:54] ==> public inline fun <T> Sequence<KtDeclaration>.firstOrNull(predicate: (KtDeclaration) -> Boolean): KtDeclaration? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [121:68] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers.findAnchor.<anonymous>[ValueParameterDescriptorImpl]

'firstNonProperty' @ [122:20] ==> val firstNonProperty: KtDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers.findAnchor[LocalVariableDescriptor]

'siblings' @ [122:37] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstIsInstanceOrNull' @ [122:63] ==> public inline fun <reified T : Any> Sequence<*>.firstIsInstanceOrNull(): KtProperty? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtProperty

'targetClass' @ [122:102] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers[LocalVariableDescriptor]

'getOrCreateBody' @ [122:114] ==> public fun KtClassOrObject.getOrCreateBody(): KtClassBody defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'lBrace' @ [122:132] ==> public final val lBrace: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassBody[DeserializedPropertyDescriptor]

'with' @ [125:16] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinGenerateSecondaryConstructorAction.Info, block: KotlinGenerateSecondaryConstructorAction.Info.() -> List<KtSecondaryConstructor>): List<KtSecondaryConstructor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Info
    <R> -> List<KtSecondaryConstructor>

'info' @ [125:21] ==> value-parameter info: KotlinGenerateSecondaryConstructorAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers[ValueParameterDescriptorImpl]

'if (superConstructors.isNotEmpty()) {
                superConstructors.mapNotNull { generateConstructor(classDescriptor, propertiesToInitialize, it) }
            } else {
                listOfNotNull(generateConstructor(classDescriptor, propertiesToInitialize, null))
            }' @ [126:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KtSecondaryConstructor>, elseBranch: List<KtSecondaryConstructor>): List<KtSecondaryConstructor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KtSecondaryConstructor>

'superConstructors' @ [126:34] ==> public final val superConstructors: List<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.Info[PropertyDescriptorImpl]

'isNotEmpty' @ [126:52] ==> @InlineOnly public inline fun <T> Collection<ConstructorDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'superConstructors' @ [127:17] ==> public final val superConstructors: List<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.Info[PropertyDescriptorImpl]

'mapNotNull' @ [127:35] ==> public inline fun <T, R : Any> Iterable<ConstructorDescriptor>.mapNotNull(transform: (ConstructorDescriptor) -> KtSecondaryConstructor?): List<KtSecondaryConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor
    <R : Any> -> KtSecondaryConstructor

'generateConstructor' @ [127:48] ==> private final fun generateConstructor(classDescriptor: ClassDescriptor, propertiesToInitialize: List<PropertyDescriptor>, superConstructor: ConstructorDescriptor?): KtSecondaryConstructor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [127:68] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.Info[PropertyDescriptorImpl]

'propertiesToInitialize' @ [127:85] ==> public final val propertiesToInitialize: List<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.Info[PropertyDescriptorImpl]

'it' @ [127:109] ==> value-parameter it: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'listOfNotNull' @ [129:17] ==> public fun <T : Any> listOfNotNull(element: KtSecondaryConstructor?): List<KtSecondaryConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtSecondaryConstructor

'generateConstructor' @ [129:31] ==> private final fun generateConstructor(classDescriptor: ClassDescriptor, propertiesToInitialize: List<PropertyDescriptor>, superConstructor: ConstructorDescriptor?): KtSecondaryConstructor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [129:51] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.Info[PropertyDescriptorImpl]

'propertiesToInitialize' @ [129:68] ==> public final val propertiesToInitialize: List<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.Info[PropertyDescriptorImpl]

'prototypes' @ [132:17] ==> val prototypes: List<KtSecondaryConstructor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [132:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'showErrorHint' @ [133:39] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'targetClass' @ [133:53] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers[LocalVariableDescriptor]

'project' @ [133:65] ==> public final val KtClass.project: Project[MyPropertyDescriptor]

'editor' @ [133:74] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers[ValueParameterDescriptorImpl]

'commandName' @ [133:112] ==> protected/*protected and package*/ for synthetic extension final val KotlinGenerateSecondaryConstructorAction.commandName: (String..String?)[MyPropertyDescriptor]

'emptyList' @ [134:24] ==> public fun <T> emptyList(): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'insertMembersAfter' @ [137:13] ==> public fun <T : KtDeclaration> insertMembersAfter(editor: Editor?, classOrObject: KtClassOrObject, members: Collection<KtSecondaryConstructor>, anchor: PsiElement? = ...): List<KtSecondaryConstructor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : KtDeclaration> -> KtSecondaryConstructor

'editor' @ [137:32] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers[ValueParameterDescriptorImpl]

'targetClass' @ [137:40] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers[LocalVariableDescriptor]

'prototypes' @ [137:53] ==> val prototypes: List<KtSecondaryConstructor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers.<anonymous>[LocalVariableDescriptor]

'findAnchor' @ [137:65] ==> local final fun KotlinGenerateSecondaryConstructorAction.Info.findAnchor(): PsiElement? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateMembers[SimpleFunctionDescriptorImpl]

'types1' @ [147:20] ==> value-parameter types1: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.equalTypes[ValueParameterDescriptorImpl]

'size' @ [147:27] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'types2' @ [147:35] ==> value-parameter types2: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.equalTypes[ValueParameterDescriptorImpl]

'size' @ [147:42] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'types1' @ [147:51] ==> value-parameter types1: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.equalTypes[ValueParameterDescriptorImpl]

'zip' @ [147:58] ==> public infix fun <T, R> Iterable<KotlinType>.zip(other: Iterable<KotlinType>): List<Pair<KotlinType, KotlinType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType

'types2' @ [147:62] ==> value-parameter types2: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.equalTypes[ValueParameterDescriptorImpl]

'all' @ [147:71] ==> public inline fun <T> Iterable<Pair<KotlinType, KotlinType>>.all(predicate: (Pair<KotlinType, KotlinType>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KotlinType, KotlinType>

'DEFAULT' @ [147:95] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [147:103] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'it' @ [147:114] ==> value-parameter it: Pair<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.equalTypes.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [147:117] ==> public final val first: KotlinType defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [147:124] ==> value-parameter it: Pair<KotlinType, KotlinType> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.equalTypes.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [147:127] ==> public final val second: KotlinType defined in kotlin.Pair[DeserializedPropertyDescriptor]

'propertiesToInitialize' @ [150:37] ==> value-parameter propertiesToInitialize: List<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'map' @ [150:60] ==> public inline fun <T, R> Iterable<PropertyDescriptor>.map(transform: (PropertyDescriptor) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <R> -> KotlinType

'it' @ [150:66] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [150:69] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'superConstructor' @ [151:18] ==> value-parameter superConstructor: ConstructorDescriptor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'valueParameters' @ [151:36] ==> public final val ConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [151:53] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [151:59] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [151:62] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [151:83] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [151:86] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'emptyList' @ [151:96] ==> public fun <T> emptyList(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'classDescriptor' @ [153:13] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'constructors' @ [153:29] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'any' @ [153:42] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.any(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [153:48] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [153:51] ==> public final val ClassConstructorDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [153:58] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'equalTypes' @ [154:20] ==> local final fun equalTypes(types1: Collection<KotlinType>, types2: Collection<KotlinType>): Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[SimpleFunctionDescriptorImpl]

'it' @ [154:31] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [154:34] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [154:50] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [154:56] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [154:59] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [154:80] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [154:83] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructorParamTypes' @ [154:91] ==> val constructorParamTypes: List<KotlinType> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'classDescriptor' @ [156:27] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'source' @ [156:43] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [156:50] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [157:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [157:39] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'CollectingNameValidator' @ [159:25] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'psiFactory' @ [161:27] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'createSecondaryConstructor' @ [161:38] ==> public final fun createSecondaryConstructor(decl: String): KtSecondaryConstructor defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'constructor' @ [162:29] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'valueParameterList' @ [162:41] ==> public final val KtSecondaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'superConstructor' @ [164:13] ==> value-parameter superConstructor: ConstructorDescriptor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'getTypeSubstitutor' @ [165:31] ==> public fun getTypeSubstitutor(baseType: KotlinType, derivedType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'superConstructor' @ [165:50] ==> value-parameter superConstructor: ConstructorDescriptor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [165:67] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'defaultType' @ [165:89] ==> public final val ClassifierDescriptorWithTypeParameters.defaultType: SimpleType[MyPropertyDescriptor]

'classDescriptor' @ [165:102] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'defaultType' @ [165:118] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'EMPTY' @ [166:40] ==> public final val EMPTY: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaPropertyDescriptor]

'ArrayList' @ [167:43] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'superConstructor' @ [168:31] ==> value-parameter superConstructor: ConstructorDescriptor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'valueParameters' @ [168:48] ==> public final val ConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'parameter' @ [169:32] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'varargElementType' @ [169:42] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'KotlinNameSuggester' @ [171:33] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [171:53] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'parameter' @ [171:71] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'name' @ [171:81] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [171:86] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'validator' @ [171:98] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'parameter' @ [173:33] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'varargElementType' @ [173:43] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameter' @ [173:64] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'type' @ [173:74] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'IdeDescriptorRenderers' @ [174:33] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [174:56] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [174:68] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [175:25] ==> val substitutor: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'substitute' @ [175:37] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'typeToUse' @ [175:48] ==> val typeToUse: KotlinType defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'INVARIANT' @ [175:68] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'classDescriptor' @ [175:82] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'builtIns' @ [175:98] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'anyType' @ [175:107] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'if (isVararg) "vararg " else ""' @ [178:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isVararg' @ [178:37] ==> val isVararg: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'parameterList' @ [180:17] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'addParameter' @ [180:31] ==> @NotNull public open fun addParameter(@NotNull p0: KtParameter): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'psiFactory' @ [180:44] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'createParameter' @ [180:55] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [180:73] ==> val modifiers: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'paramName' @ [180:83] ==> val paramName: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'paramType' @ [180:95] ==> val paramType: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'delegationCallArguments' @ [181:17] ==> val delegationCallArguments: ArrayList<String> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'add' @ [181:41] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'if (isVararg) "*$paramName" else paramName' @ [181:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isVararg' @ [181:49] ==> val isVararg: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'paramName' @ [181:62] ==> val paramName: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'paramName' @ [181:78] ==> val paramName: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'psiFactory' @ [184:34] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'creareDelegatedSuperTypeEntry' @ [184:45] ==> public final fun creareDelegatedSuperTypeEntry(text: String): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'delegationCallArguments' @ [184:75] ==> val delegationCallArguments: ArrayList<String> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'joinToString' @ [184:99] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'constructor' @ [185:13] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'replaceImplicitDelegationCallWithExplicit' @ [185:25] ==> public final fun replaceImplicitDelegationCallWithExplicit(isThis: Boolean): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'replace' @ [185:74] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtConstructorDelegationCall[JavaMethodDescriptor]

'delegationCall' @ [185:82] ==> val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'propertiesToInitialize' @ [188:13] ==> value-parameter propertiesToInitialize: List<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'isNotEmpty' @ [188:36] ==> @InlineOnly public inline fun <T> Collection<PropertyDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'psiFactory' @ [189:24] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'createEmptyBody' @ [189:35] ==> public final fun createEmptyBody(): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'propertiesToInitialize' @ [190:30] ==> value-parameter propertiesToInitialize: List<PropertyDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[ValueParameterDescriptorImpl]

'property' @ [191:36] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'name' @ [191:45] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'KotlinNameSuggester' @ [192:33] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [192:53] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'propertyName' @ [192:71] ==> val propertyName: Name defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'asString' @ [192:84] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'validator' @ [192:96] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'IdeDescriptorRenderers' @ [193:33] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [193:56] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [193:68] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'property' @ [193:79] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'type' @ [193:88] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'parameterList' @ [195:17] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'addParameter' @ [195:31] ==> @NotNull public open fun addParameter(@NotNull p0: KtParameter): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'psiFactory' @ [195:44] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'createParameter' @ [195:55] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'paramName' @ [195:73] ==> val paramName: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'paramType' @ [195:85] ==> val paramType: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'body' @ [196:17] ==> val body: KtBlockExpression defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'appendElement' @ [196:22] ==> public fun KtBlockExpression.appendElement(element: KtElement, addNewLine: Boolean = ...): KtElement defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [196:36] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'createExpression' @ [196:47] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'propertyName' @ [196:71] ==> val propertyName: Name defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'paramName' @ [196:87] ==> val paramName: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'constructor' @ [199:13] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'add' @ [199:25] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[JavaMethodDescriptor]

'body' @ [199:29] ==> val body: KtBlockExpression defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

'constructor' @ [202:16] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateSecondaryConstructorAction.generateConstructor[LocalVariableDescriptor]

