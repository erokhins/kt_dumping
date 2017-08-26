'SelfTargetingRangeIntention<KtClass>' @ [41:43] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtClass>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtClass

'java' @ [41:95] ==> public val <T> KClass<KtClass>.java: Class<KtClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClass

'element' @ [43:30] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applicabilityRange[ValueParameterDescriptorImpl]

'nameIdentifier' @ [43:38] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'element' @ [44:29] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applicabilityRange[ValueParameterDescriptorImpl]

'modifierList' @ [44:37] ==> public final val KtClass.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [44:51] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'SEALED_KEYWORD' @ [44:72] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [46:31] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applicabilityRange[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [46:39] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [47:13] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applicabilityRange[LocalVariableDescriptor]

'getSuperClassNotAny' @ [47:29] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'TextRange' @ [49:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'sealedKeyword' @ [49:26] ==> val sealedKeyword: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applicabilityRange[LocalVariableDescriptor]

'startOffset' @ [49:40] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'nameIdentifier' @ [49:53] ==> val nameIdentifier: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applicabilityRange[LocalVariableDescriptor]

'endOffset' @ [49:68] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [53:23] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'project' @ [53:31] ==> public final val KtClass.project: Project[MyPropertyDescriptor]

'project' @ [55:26] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'runSynchronouslyWithProgress' @ [55:34] ==> public fun <T : Any> Project.runSynchronouslyWithProgress(progressTitle: String, canBeCanceled: Boolean, action: () -> List<PsiElement>): List<PsiElement>? defined in org.jetbrains.kotlin.idea[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> List<PsiElement>

'HierarchySearchRequest' @ [56:13] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: KtClass, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> KtClass

'element' @ [56:36] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [56:45] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'useScope' @ [56:53] ==> public final val KtClass.useScope: SearchScope[MyPropertyDescriptor]

'searchInheritors' @ [56:70] ==> public fun HierarchySearchRequest<*>.searchInheritors(): Query<PsiClass> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [56:89] ==> public inline fun <T, R : Any> Iterable<(PsiClass..PsiClass?)>.mapNotNull(transform: ((PsiClass..PsiClass?)) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)
    <R : Any> -> PsiElement

'it' @ [56:102] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [56:105] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'subclasses' @ [59:39] ==> val subclasses: List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'filter' @ [59:50] ==> public inline fun <T> Iterable<PsiElement>.filter(predicate: (PsiElement) -> Boolean): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [60:13] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [60:43] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [60:46] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [60:73] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'it' @ [60:84] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [60:87] ==> public final val KtObjectDeclaration.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'size' @ [60:108] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'inconvertibleSubclasses' @ [62:13] ==> val inconvertibleSubclasses: List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'isNotEmpty' @ [62:37] ==> @InlineOnly public inline fun <T> Collection<PsiElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'buildString' @ [63:27] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [64:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [65:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'inconvertibleSubclasses' @ [66:17] ==> val inconvertibleSubclasses: List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'joinTo' @ [66:41] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<PsiElement>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((PsiElement) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [66:48] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ReceiverParameterDescriptorImpl]

'getElementDescription' @ [66:79] ==> @NotNull public open fun getElementDescription(@NotNull p0: PsiElement, @NotNull p1: ElementDescriptionLocation): String defined in com.intellij.psi.ElementDescriptionUtil[JavaMethodDescriptor]

'it' @ [66:101] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'WITHOUT_PARENT' @ [66:136] ==> public final val WITHOUT_PARENT: (RefactoringDescriptionLocation..RefactoringDescriptionLocation?) defined in com.intellij.refactoring.util.RefactoringDescriptionLocation[JavaPropertyDescriptor]

'showErrorHint' @ [68:42] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [68:56] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'editor' @ [68:65] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'message' @ [68:73] ==> val message: String defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'text' @ [68:82] ==> public final var ConvertSealedClassToEnumIntention.text: String[MyPropertyDescriptor]

'element' @ [71:29] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'declarations' @ [71:37] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'size' @ [71:50] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'subclasses' @ [71:57] ==> val subclasses: List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'size' @ [71:68] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'KtPsiFactory' @ [73:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [73:39] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'psiFactory' @ [75:21] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'createComma' @ [75:32] ==> public final fun createComma(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [76:25] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'createSemicolon' @ [76:36] ==> public final fun createSemicolon(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [78:37] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'hasExplicitPrimaryConstructor' @ [78:45] ==> public open fun hasExplicitPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'element' @ [78:80] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'secondaryConstructors' @ [78:88] ==> public final val KtClass.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'isNotEmpty' @ [78:110] ==> @InlineOnly public inline fun <T> Collection<KtSecondaryConstructor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSecondaryConstructor

'subclasses' @ [79:28] ==> val subclasses: List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'mapIndexed' @ [79:39] ==> public inline fun <T, R> Iterable<PsiElement>.mapIndexed(transform: (index: Int, PsiElement) -> KtEnumEntry): List<KtEnumEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtEnumEntry

'subclass' @ [80:13] ==> value-parameter subclass: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'buildString' @ [82:29] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [83:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'subclass' @ [83:24] ==> value-parameter subclass: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [83:33] ==> public final val KtObjectDeclaration.name: String?[MyPropertyDescriptor]

'constructorCallNeeded' @ [84:21] ==> val constructorCallNeeded: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'append' @ [85:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'?:' @ [85:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'subclass' @ [85:29] ==> value-parameter subclass: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [85:38] ==> public final val KtObjectDeclaration.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'firstOrNull' @ [85:59] ==> public fun <T> List<KtSuperTypeListEntry>.firstOrNull(): KtSuperTypeListEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'valueArgumentList' @ [85:100] ==> public final val KtSuperTypeCallEntry.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'text' @ [85:119] ==> public final val KtValueArgumentList.text: (String..String?)[MyPropertyDescriptor]

'psiFactory' @ [88:25] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'createEnumEntry' @ [88:36] ==> public final fun createEnumEntry(text: String): KtEnumEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'entryText' @ [88:52] ==> val entryText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'subclass' @ [90:13] ==> value-parameter subclass: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'getBody' @ [90:22] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'let' @ [90:33] ==> @InlineOnly public inline fun <T, R> KtClassBody.let(block: (KtClassBody) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassBody
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'entry' @ [90:47] ==> val entry: KtEnumEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'add' @ [90:53] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtEnumEntry[JavaMethodDescriptor]

'body' @ [90:57] ==> value-parameter body: KtClassBody defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (i < subclasses.lastIndex) {
                entry.add(comma)
            }
            else if (needSemicolon) {
                entry.add(semicolon)
            }' @ [92:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'i' @ [92:17] ==> value-parameter i: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'subclasses' @ [92:21] ==> val subclasses: List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'lastIndex' @ [92:32] ==> public val <T> List<PsiElement>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiElement

'entry' @ [93:17] ==> val entry: KtEnumEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'add' @ [93:23] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtEnumEntry[JavaMethodDescriptor]

'comma' @ [93:27] ==> val comma: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'needSemicolon' @ [95:22] ==> val needSemicolon: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'entry' @ [96:17] ==> val entry: KtEnumEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'add' @ [96:23] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtEnumEntry[JavaMethodDescriptor]

'semicolon' @ [96:27] ==> val semicolon: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'entry' @ [99:13] ==> val entry: KtEnumEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'subclasses' @ [102:9] ==> val subclasses: List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'forEach' @ [102:20] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [102:30] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [102:33] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'element' @ [104:9] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'removeModifier' @ [104:17] ==> public open fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'SEALED_KEYWORD' @ [104:41] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [105:9] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'addModifier' @ [105:17] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'ENUM_KEYWORD' @ [105:38] ==> public final val ENUM_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (entriesToAdd.isNotEmpty()) {
            val firstEntry = entriesToAdd
                    .reversed()
                    .map { element.addDeclarationBefore(it, null) }
                    .last()
            // TODO: Add formatter rule
            firstEntry.parent.addBefore(psiFactory.createNewLine(), firstEntry)
        }
        else if (needSemicolon) {
            element.declarations.firstOrNull()?.let { anchor ->
                val delimiter = anchor.parent.addBefore(semicolon, anchor)
                CodeStyleManager.getInstance(project).reformat(delimiter)
            }
        }' @ [107:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'entriesToAdd' @ [107:13] ==> val entriesToAdd: List<KtEnumEntry> defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'isNotEmpty' @ [107:26] ==> @InlineOnly public inline fun <T> Collection<KtEnumEntry>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtEnumEntry

'entriesToAdd' @ [108:30] ==> val entriesToAdd: List<KtEnumEntry> defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'reversed' @ [109:22] ==> public fun <T> Iterable<KtEnumEntry>.reversed(): List<KtEnumEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtEnumEntry

'map' @ [110:22] ==> public inline fun <T, R> Iterable<KtEnumEntry>.map(transform: (KtEnumEntry) -> KtEnumEntry): List<KtEnumEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtEnumEntry
    <R> -> KtEnumEntry

'element' @ [110:28] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'addDeclarationBefore' @ [110:36] ==> public final inline fun <reified T : KtDeclaration> addDeclarationBefore(declaration: KtEnumEntry, anchor: PsiElement?): KtEnumEntry defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtEnumEntry

'it' @ [110:57] ==> value-parameter it: KtEnumEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [111:22] ==> public fun <T> List<KtEnumEntry>.last(): KtEnumEntry defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtEnumEntry

'firstEntry' @ [113:13] ==> val firstEntry: KtEnumEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'parent' @ [113:24] ==> public final val KtEnumEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addBefore' @ [113:31] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [113:41] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'createNewLine' @ [113:52] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'firstEntry' @ [113:69] ==> val firstEntry: KtEnumEntry defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'needSemicolon' @ [115:18] ==> val needSemicolon: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'element' @ [116:13] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[ValueParameterDescriptorImpl]

'declarations' @ [116:21] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'firstOrNull' @ [116:34] ==> public fun <T> List<KtDeclaration>.firstOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'let' @ [116:49] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> PsiElement): PsiElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> PsiElement

'anchor' @ [117:33] ==> value-parameter anchor: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [117:40] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addBefore' @ [117:47] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'semicolon' @ [117:57] ==> val semicolon: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'anchor' @ [117:68] ==> value-parameter anchor: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [118:34] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [118:46] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo[LocalVariableDescriptor]

'reformat' @ [118:55] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'delimiter' @ [118:64] ==> val delimiter: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ConvertSealedClassToEnumIntention.applyTo.<anonymous>[LocalVariableDescriptor]

