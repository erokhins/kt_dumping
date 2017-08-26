'IconProvider' @ [35:28] ==> public constructor IconProvider() defined in com.intellij.ide.IconProvider[JavaClassConstructorDescriptor]

'psiElement' @ [37:13] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[ValueParameterDescriptorImpl]

'getMainClass' @ [38:29] ==> public final fun getMainClass(file: KtFile): KtClassOrObject? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion[SimpleFunctionDescriptorImpl]

'psiElement' @ [38:42] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[ValueParameterDescriptorImpl]

'if (mainClass != null && psiElement.declarations.size == 1) getIcon(mainClass, flags) else KotlinIcons.FILE' @ [39:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Icon?, elseBranch: Icon?): Icon?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Icon?

'mainClass' @ [39:24] ==> val mainClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[LocalVariableDescriptor]

'psiElement' @ [39:45] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[ValueParameterDescriptorImpl]

'declarations' @ [39:56] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'size' @ [39:69] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getIcon' @ [39:80] ==> public open fun getIcon(psiElement: PsiElement, flags: Int): Icon? defined in org.jetbrains.kotlin.idea.KotlinIconProvider[SimpleFunctionDescriptorImpl]

'mainClass' @ [39:88] ==> val mainClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[LocalVariableDescriptor]

'flags' @ [39:99] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[ValueParameterDescriptorImpl]

'FILE' @ [39:123] ==> public final val FILE: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'psiElement' @ [42:22] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[ValueParameterDescriptorImpl]

'getBaseIcon' @ [42:33] ==> public final fun PsiElement.getBaseIcon(): Icon? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion[SimpleFunctionDescriptorImpl]

'flags' @ [43:13] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[ValueParameterDescriptorImpl]

'ICON_FLAG_VISIBILITY' @ [43:32] ==> public const final val ICON_FLAG_VISIBILITY: Int defined in com.intellij.openapi.util.Iconable[JavaPropertyDescriptor]

'result' @ [43:60] ==> val result: Icon? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[LocalVariableDescriptor]

'psiElement' @ [43:79] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[ValueParameterDescriptorImpl]

'psiElement' @ [43:116] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[ValueParameterDescriptorImpl]

'psiElement' @ [44:24] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[ValueParameterDescriptorImpl]

'modifierList' @ [44:35] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'createRowIcon' @ [45:20] ==> private final fun createRowIcon(baseIcon: Icon, visibilityIcon: Icon): RowIcon defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion[SimpleFunctionDescriptorImpl]

'result' @ [45:34] ==> val result: Icon? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[LocalVariableDescriptor]

'getVisibilityIcon' @ [45:42] ==> public final fun getVisibilityIcon(list: KtModifierList?): Icon defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion[SimpleFunctionDescriptorImpl]

'list' @ [45:60] ==> val list: KtModifierList? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[LocalVariableDescriptor]

'result' @ [47:16] ==> val result: Icon? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.getIcon[LocalVariableDescriptor]

'KotlinIconProvider' @ [52:24] ==> public constructor KotlinIconProvider() defined in org.jetbrains.kotlin.idea.KotlinIconProvider[ClassConstructorDescriptorImpl]

'file' @ [55:27] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getMainClass[ValueParameterDescriptorImpl]

'declarations' @ [55:32] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'filterIsInstance' @ [55:45] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'classes' @ [56:17] ==> val classes: List<KtClassOrObject> defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getMainClass[LocalVariableDescriptor]

'size' @ [56:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'==' @ [56:38] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getPackageName' @ [56:49] ==> @NotNull @Contract public open fun getPackageName(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'file' @ [56:64] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getMainClass[ValueParameterDescriptorImpl]

'name' @ [56:69] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'classes' @ [56:78] ==> val classes: List<KtClassOrObject> defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getMainClass[LocalVariableDescriptor]

'name' @ [56:89] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

'classes' @ [57:24] ==> val classes: List<KtClassOrObject> defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getMainClass[LocalVariableDescriptor]

'RowIcon' @ [63:27] ==> public constructor RowIcon(p0: Int) defined in com.intellij.ui.RowIcon[JavaClassConstructorDescriptor]

'rowIcon' @ [64:13] ==> val rowIcon: RowIcon defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.createRowIcon[LocalVariableDescriptor]

'setIcon' @ [64:21] ==> public open fun setIcon(p0: (Icon..Icon?), p1: Int): Unit defined in com.intellij.ui.RowIcon[JavaMethodDescriptor]

'baseIcon' @ [64:29] ==> value-parameter baseIcon: Icon defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.createRowIcon[ValueParameterDescriptorImpl]

'rowIcon' @ [65:13] ==> val rowIcon: RowIcon defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.createRowIcon[LocalVariableDescriptor]

'setIcon' @ [65:21] ==> public open fun setIcon(p0: (Icon..Icon?), p1: Int): Unit defined in com.intellij.ui.RowIcon[JavaMethodDescriptor]

'visibilityIcon' @ [65:29] ==> value-parameter visibilityIcon: Icon defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.createRowIcon[ValueParameterDescriptorImpl]

'rowIcon' @ [66:20] ==> val rowIcon: RowIcon defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.createRowIcon[LocalVariableDescriptor]

'list' @ [70:17] ==> value-parameter list: KtModifierList? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getVisibilityIcon[ValueParameterDescriptorImpl]

'list' @ [71:21] ==> value-parameter list: KtModifierList? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getVisibilityIcon[ValueParameterDescriptorImpl]

'hasModifier' @ [71:26] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [71:47] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PRIVATE_ICON' @ [72:42] ==> public final val PRIVATE_ICON: (Icon..Icon?) defined in com.intellij.util.PlatformIcons[JavaPropertyDescriptor]

'list' @ [74:21] ==> value-parameter list: KtModifierList? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getVisibilityIcon[ValueParameterDescriptorImpl]

'hasModifier' @ [74:26] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'PROTECTED_KEYWORD' @ [74:47] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROTECTED_ICON' @ [75:42] ==> public final val PROTECTED_ICON: (Icon..Icon?) defined in com.intellij.util.PlatformIcons[JavaPropertyDescriptor]

'list' @ [77:21] ==> value-parameter list: KtModifierList? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getVisibilityIcon[ValueParameterDescriptorImpl]

'hasModifier' @ [77:26] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'INTERNAL_KEYWORD' @ [77:47] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PACKAGE_LOCAL_ICON' @ [78:42] ==> public final val PACKAGE_LOCAL_ICON: (Icon..Icon?) defined in com.intellij.util.PlatformIcons[JavaPropertyDescriptor]

'PUBLIC_ICON' @ [82:34] ==> public final val PUBLIC_ICON: (Icon..Icon?) defined in com.intellij.util.PlatformIcons[JavaPropertyDescriptor]

'when(this) {
            is KtPackageDirective -> PlatformIcons.PACKAGE_ICON
            is KtLightClassForFacade -> KotlinIcons.FILE
            is KtLightClassForDecompiledDeclaration -> {
                val origin = kotlinOrigin
                //TODO (light classes for decompiled files): correct presentation
                if (origin != null) origin.getBaseIcon() else KotlinIcons.CLASS
            }
            is KtLightClassForSourceDeclaration -> navigationElement.getBaseIcon()
            is KtNamedFunction -> when {
                receiverTypeReference != null ->
                    if (KtPsiUtil.isAbstract(this)) KotlinIcons.ABSTRACT_EXTENSION_FUNCTION else KotlinIcons.EXTENSION_FUNCTION
                getStrictParentOfType<KtNamedDeclaration>() is KtClass ->
                    if (KtPsiUtil.isAbstract(this)) PlatformIcons.ABSTRACT_METHOD_ICON else PlatformIcons.METHOD_ICON
                else ->
                    KotlinIcons.FUNCTION
            }
            is KtFunctionLiteral -> KotlinIcons.LAMBDA
            is KtClass -> when {
                isInterface() -> KotlinIcons.INTERFACE
                isEnum() -> KotlinIcons.ENUM
                isAnnotation() -> KotlinIcons.ANNOTATION
                this is KtEnumEntry && getPrimaryConstructorParameterList() == null -> KotlinIcons.ENUM
                else -> if (isAbstract()) KotlinIcons.ABSTRACT_CLASS else KotlinIcons.CLASS
            }
            is KtObjectDeclaration -> KotlinIcons.OBJECT
            is KtParameter -> {
                if (KtPsiUtil.getClassIfParameterIsProperty(this) != null) {
                    if (isMutable) KotlinIcons.FIELD_VAR else KotlinIcons.FIELD_VAL
                }
                else
                    KotlinIcons.PARAMETER
            }
            is KtProperty -> if (isVar) KotlinIcons.FIELD_VAR else KotlinIcons.FIELD_VAL
            is KtClassInitializer -> KotlinIcons.CLASS_INITIALIZER
            is KtTypeAlias -> KotlinIcons.TYPE_ALIAS
            else -> null
        }' @ [85:47] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Icon?, entry1: Icon?, entry2: Icon?, entry3: Icon?, entry4: Icon?, entry5: Icon?, entry6: Icon?, entry7: Icon?, entry8: Icon?, entry9: Icon?, entry10: Icon?, entry11: Icon?, entry12: Icon?): Icon?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Icon?

'this' @ [85:52] ==> <this> defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getBaseIcon[ReceiverParameterDescriptorImpl]

'PACKAGE_ICON' @ [86:52] ==> public final val PACKAGE_ICON: (Icon..Icon?) defined in com.intellij.util.PlatformIcons[JavaPropertyDescriptor]

'FILE' @ [87:53] ==> public final val FILE: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'kotlinOrigin' @ [89:30] ==> public open val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'if (origin != null) origin.getBaseIcon() else KotlinIcons.CLASS' @ [91:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Icon?, elseBranch: Icon?): Icon?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Icon?

'origin' @ [91:21] ==> val origin: KtClassOrObject? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getBaseIcon[LocalVariableDescriptor]

'origin' @ [91:37] ==> val origin: KtClassOrObject? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getBaseIcon[LocalVariableDescriptor]

'getBaseIcon' @ [91:44] ==> public final fun PsiElement.getBaseIcon(): Icon? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion[SimpleFunctionDescriptorImpl]

'CLASS' @ [91:75] ==> public final val CLASS: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'navigationElement' @ [93:52] ==> public final var KtLightClassForSourceDeclaration.navigationElement: PsiElement[MyPropertyDescriptor]

'getBaseIcon' @ [93:70] ==> public final fun PsiElement.getBaseIcon(): Icon? defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion[SimpleFunctionDescriptorImpl]

'when {
                receiverTypeReference != null ->
                    if (KtPsiUtil.isAbstract(this)) KotlinIcons.ABSTRACT_EXTENSION_FUNCTION else KotlinIcons.EXTENSION_FUNCTION
                getStrictParentOfType<KtNamedDeclaration>() is KtClass ->
                    if (KtPsiUtil.isAbstract(this)) PlatformIcons.ABSTRACT_METHOD_ICON else PlatformIcons.METHOD_ICON
                else ->
                    KotlinIcons.FUNCTION
            }' @ [94:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Icon..Icon?), entry1: (Icon..Icon?), entry2: (Icon..Icon?)): (Icon..Icon?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javax.swing.Icon..javax.swing.Icon?)

'receiverTypeReference' @ [95:17] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'if (KtPsiUtil.isAbstract(this)) KotlinIcons.ABSTRACT_EXTENSION_FUNCTION else KotlinIcons.EXTENSION_FUNCTION' @ [96:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Icon..Icon?), elseBranch: (Icon..Icon?)): (Icon..Icon?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javax.swing.Icon..javax.swing.Icon?)

'isAbstract' @ [96:35] ==> public open fun isAbstract(@NotNull p0: KtDeclarationWithBody): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [96:46] ==> <this> defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getBaseIcon[ReceiverParameterDescriptorImpl]

'ABSTRACT_EXTENSION_FUNCTION' @ [96:65] ==> public final val ABSTRACT_EXTENSION_FUNCTION: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'EXTENSION_FUNCTION' @ [96:110] ==> public final val EXTENSION_FUNCTION: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'getStrictParentOfType' @ [97:17] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'if (KtPsiUtil.isAbstract(this)) PlatformIcons.ABSTRACT_METHOD_ICON else PlatformIcons.METHOD_ICON' @ [98:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Icon..Icon?), elseBranch: (Icon..Icon?)): (Icon..Icon?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javax.swing.Icon..javax.swing.Icon?)

'isAbstract' @ [98:35] ==> public open fun isAbstract(@NotNull p0: KtDeclarationWithBody): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [98:46] ==> <this> defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getBaseIcon[ReceiverParameterDescriptorImpl]

'ABSTRACT_METHOD_ICON' @ [98:67] ==> public final val ABSTRACT_METHOD_ICON: (Icon..Icon?) defined in com.intellij.util.PlatformIcons[JavaPropertyDescriptor]

'METHOD_ICON' @ [98:107] ==> public final val METHOD_ICON: (Icon..Icon?) defined in com.intellij.util.PlatformIcons[JavaPropertyDescriptor]

'FUNCTION' @ [100:33] ==> public final val FUNCTION: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'LAMBDA' @ [102:49] ==> public final val LAMBDA: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'when {
                isInterface() -> KotlinIcons.INTERFACE
                isEnum() -> KotlinIcons.ENUM
                isAnnotation() -> KotlinIcons.ANNOTATION
                this is KtEnumEntry && getPrimaryConstructorParameterList() == null -> KotlinIcons.ENUM
                else -> if (isAbstract()) KotlinIcons.ABSTRACT_CLASS else KotlinIcons.CLASS
            }' @ [103:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Icon..Icon?), entry1: (Icon..Icon?), entry2: (Icon..Icon?), entry3: (Icon..Icon?), entry4: (Icon..Icon?)): (Icon..Icon?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javax.swing.Icon..javax.swing.Icon?)

'isInterface' @ [104:17] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'INTERFACE' @ [104:46] ==> public final val INTERFACE: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'isEnum' @ [105:17] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'ENUM' @ [105:41] ==> public final val ENUM: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'isAnnotation' @ [106:17] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'ANNOTATION' @ [106:47] ==> public final val ANNOTATION: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'this' @ [107:17] ==> <this> defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getBaseIcon[ReceiverParameterDescriptorImpl]

'getPrimaryConstructorParameterList' @ [107:40] ==> public final fun getPrimaryConstructorParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.KtEnumEntry[DeserializedSimpleFunctionDescriptor]

'ENUM' @ [107:100] ==> public final val ENUM: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'if (isAbstract()) KotlinIcons.ABSTRACT_CLASS else KotlinIcons.CLASS' @ [108:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Icon..Icon?), elseBranch: (Icon..Icon?)): (Icon..Icon?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javax.swing.Icon..javax.swing.Icon?)

'isAbstract' @ [108:29] ==> public fun KtClass.isAbstract(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'ABSTRACT_CLASS' @ [108:55] ==> public final val ABSTRACT_CLASS: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'CLASS' @ [108:87] ==> public final val CLASS: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'OBJECT' @ [110:51] ==> public final val OBJECT: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'if (KtPsiUtil.getClassIfParameterIsProperty(this) != null) {
                    if (isMutable) KotlinIcons.FIELD_VAR else KotlinIcons.FIELD_VAL
                }
                else
                    KotlinIcons.PARAMETER' @ [112:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Icon..Icon?), elseBranch: (Icon..Icon?)): (Icon..Icon?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javax.swing.Icon..javax.swing.Icon?)

'!=' @ [112:21] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'getClassIfParameterIsProperty' @ [112:31] ==> @Nullable public open fun getClassIfParameterIsProperty(@NotNull p0: KtParameter): KtClassOrObject? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [112:61] ==> <this> defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion.getBaseIcon[ReceiverParameterDescriptorImpl]

'if (isMutable) KotlinIcons.FIELD_VAR else KotlinIcons.FIELD_VAL' @ [113:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Icon..Icon?), elseBranch: (Icon..Icon?)): (Icon..Icon?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javax.swing.Icon..javax.swing.Icon?)

'isMutable' @ [113:25] ==> public final val KtParameter.isMutable: Boolean[MyPropertyDescriptor]

'FIELD_VAR' @ [113:48] ==> public final val FIELD_VAR: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'FIELD_VAL' @ [113:75] ==> public final val FIELD_VAL: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'PARAMETER' @ [116:33] ==> public final val PARAMETER: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'if (isVar) KotlinIcons.FIELD_VAR else KotlinIcons.FIELD_VAL' @ [118:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Icon..Icon?), elseBranch: (Icon..Icon?)): (Icon..Icon?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javax.swing.Icon..javax.swing.Icon?)

'isVar' @ [118:34] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'FIELD_VAR' @ [118:53] ==> public final val FIELD_VAR: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'FIELD_VAL' @ [118:80] ==> public final val FIELD_VAL: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'CLASS_INITIALIZER' @ [119:50] ==> public final val CLASS_INITIALIZER: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'TYPE_ALIAS' @ [120:43] ==> public final val TYPE_ALIAS: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

