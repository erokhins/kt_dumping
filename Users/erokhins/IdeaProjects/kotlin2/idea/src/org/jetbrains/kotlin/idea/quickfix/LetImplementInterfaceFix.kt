'KotlinQuickFixAction<KtClassOrObject>' @ [41:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtClassOrObject) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtClassOrObject

'element' @ [41:43] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [43:44] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [43:67] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [43:100] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [43:111] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.renderShort[ReceiverParameterDescriptorImpl]

'with' @ [51:37] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinType, block: KotlinType.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'expectedType' @ [51:43] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[ValueParameterDescriptorImpl]

'isInterface' @ [52:9] ==> public fun KotlinType.isInterface(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [53:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsStarProjections' @ [53:10] ==> public fun KotlinType.containsStarProjections(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [54:9] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getAllSupertypes' @ [54:35] ==> @NotNull public open fun getAllSupertypes(@NotNull p0: KotlinType): (MutableSet<(KotlinType..KotlinType?)>..Set<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expressionType' @ [54:52] ==> value-parameter expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[ValueParameterDescriptorImpl]

'map' @ [54:68] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> TypeConstructor): List<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> TypeConstructor

'KotlinType' @ [54:72] ==> private constructor KotlinType() defined in org.jetbrains.kotlin.types.KotlinType[DeserializedClassConstructorDescriptor]

'constructor' @ [54:84] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'makeNotNullable' @ [58:49] ==> @NotNull public open fun makeNotNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedType' @ [58:65] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[ValueParameterDescriptorImpl]

'expectedTypeName' @ [59:9] ==> private final val expectedTypeName: String defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[PropertyDescriptorImpl]

'expectedTypeNotNullable' @ [59:28] ==> val expectedTypeNotNullable: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[LocalVariableDescriptor]

'renderShort' @ [59:52] ==> private final fun KotlinType.renderShort(): String defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[SimpleFunctionDescriptorImpl]

'expectedTypeNameSourceCode' @ [60:9] ==> private final val expectedTypeNameSourceCode: String defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[PropertyDescriptorImpl]

'IdeDescriptorRenderers' @ [60:38] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [60:61] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [60:73] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'expectedTypeNotNullable' @ [60:84] ==> val expectedTypeNotNullable: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[LocalVariableDescriptor]

'if (expressionType.isInterface()) "extend" else "implement"' @ [62:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'expressionType' @ [62:24] ==> value-parameter expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[ValueParameterDescriptorImpl]

'isInterface' @ [62:39] ==> public fun KotlinType.isInterface(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'if (element.isObjectLiteral()) "the anonymous object" else "'${expressionType.renderShort()}'"' @ [63:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'element' @ [63:35] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[ValueParameterDescriptorImpl]

'isObjectLiteral' @ [63:43] ==> public fun KtClassOrObject.isObjectLiteral(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'expressionType' @ [63:94] ==> value-parameter expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[ValueParameterDescriptorImpl]

'renderShort' @ [63:109] ==> private final fun KotlinType.renderShort(): String defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[SimpleFunctionDescriptorImpl]

'prefix' @ [64:9] ==> private final val prefix: String defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[PropertyDescriptorImpl]

'typeDescription' @ [64:24] ==> val typeDescription: String defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[LocalVariableDescriptor]

'verb' @ [64:41] ==> val verb: String defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.<init>[LocalVariableDescriptor]

'prefix' @ [69:32] ==> private final val prefix: String defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[PropertyDescriptorImpl]

'expectedTypeName' @ [69:51] ==> private final val expectedTypeName: String defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[PropertyDescriptorImpl]

'super' @ [72:13] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [72:19] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [72:31] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [72:40] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [72:48] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.isAvailable[ValueParameterDescriptorImpl]

'validExpectedType' @ [72:57] ==> private final val validExpectedType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[PropertyDescriptorImpl]

'element' @ [77:23] ==> protected final val element: KtClassOrObject? defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [78:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [78:43] ==> val element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[LocalVariableDescriptor]

'createSuperTypeEntry' @ [78:52] ==> public final fun createSuperTypeEntry(text: String): KtSuperTypeEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expectedTypeNameSourceCode' @ [78:73] ==> private final val expectedTypeNameSourceCode: String defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[PropertyDescriptorImpl]

'runWriteAction' @ [79:9] ==> public fun <T> runWriteAction(action: () -> KtElement): KtElement defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'element' @ [80:32] ==> val element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[LocalVariableDescriptor]

'addSuperTypeListEntry' @ [80:40] ==> public final fun addSuperTypeListEntry(superTypeListEntry: KtSuperTypeListEntry): KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'superTypeEntry' @ [80:62] ==> val superTypeEntry: KtSuperTypeEntry defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[LocalVariableDescriptor]

'ShortenReferences' @ [81:13] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [81:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [81:39] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'entryElement' @ [81:47] ==> val entryElement: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke.<anonymous>[LocalVariableDescriptor]

'ImplementMembersHandler' @ [84:39] ==> public constructor ImplementMembersHandler() defined in org.jetbrains.kotlin.idea.core.overrideImplement.ImplementMembersHandler[DeserializedClassConstructorDescriptor]

'implementMembersHandler' @ [85:13] ==> val implementMembersHandler: ImplementMembersHandler defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[LocalVariableDescriptor]

'collectMembersToGenerate' @ [85:37] ==> public final fun collectMembersToGenerate(classOrObject: KtClassOrObject): Collection<OverrideMemberChooserObject> defined in org.jetbrains.kotlin.idea.core.overrideImplement.ImplementMembersHandler[DeserializedSimpleFunctionDescriptor]

'element' @ [85:62] ==> val element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[LocalVariableDescriptor]

'isEmpty' @ [85:71] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'editor' @ [87:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[ValueParameterDescriptorImpl]

'editor' @ [88:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [88:20] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [88:31] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'element' @ [88:44] ==> val element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[LocalVariableDescriptor]

'textRange' @ [88:52] ==> public final val KtClassOrObject.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [88:62] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'element' @ [89:34] ==> val element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[LocalVariableDescriptor]

'containingFile' @ [89:42] ==> public final val KtClassOrObject.containingFile: PsiFile[MyPropertyDescriptor]

'getInstance' @ [90:31] ==> public open fun getInstance(@NotNull p0: Project): (FileEditorManager..FileEditorManager?) defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'project' @ [90:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[ValueParameterDescriptorImpl]

'openFile' @ [90:52] ==> @NotNull public abstract fun openFile(@NotNull p0: VirtualFile, p1: Boolean): (Array<(FileEditor..FileEditor?)>..Array<out (FileEditor..FileEditor?)>) defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'containingFile' @ [90:61] ==> val containingFile: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[LocalVariableDescriptor]

'virtualFile' @ [90:76] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'implementMembersHandler' @ [91:13] ==> val implementMembersHandler: ImplementMembersHandler defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[LocalVariableDescriptor]

'invoke' @ [91:37] ==> public open fun invoke(project: Project, editor: Editor, file: PsiFile): Unit defined in org.jetbrains.kotlin.idea.core.overrideImplement.ImplementMembersHandler[DeserializedSimpleFunctionDescriptor]

'project' @ [91:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[ValueParameterDescriptorImpl]

'editor' @ [91:53] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[ValueParameterDescriptorImpl]

'containingFile' @ [91:61] ==> val containingFile: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix.invoke[LocalVariableDescriptor]

