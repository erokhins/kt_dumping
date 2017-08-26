'FqName' @ [44:47] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'FqName' @ [45:44] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'FqName' @ [49:40] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'Transient' @ [49:47] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'java' @ [49:64] ==> public val <T> KClass<Transient>.java: Class<Transient> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Transient

'canonicalName' @ [49:69] ==> public final val <T : (Any..Any?)> Class<Transient>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Transient

'when (descriptor) {
            is ClassDescriptor -> checkParcelableClass(descriptor, declaration, diagnosticHolder, bindingContext)
            is SimpleFunctionDescriptor -> {
                val containingClass = descriptor.containingDeclaration as? ClassDescriptor
                val ktFunction = declaration as? KtFunction
                if (containingClass != null && ktFunction != null) {
                    checkParcelableClassMethod(descriptor, containingClass, ktFunction, diagnosticHolder)
                }
            }
            is PropertyDescriptor -> {
                val containingClass = descriptor.containingDeclaration as? ClassDescriptor
                val ktProperty = declaration as? KtProperty
                if (containingClass != null && ktProperty != null) {
                    checkParcelableClassProperty(descriptor, containingClass, ktProperty, diagnosticHolder, bindingContext)
                }
            }
        }' @ [58:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [58:15] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'checkParcelableClass' @ [59:35] ==> private final fun checkParcelableClass(descriptor: ClassDescriptor, declaration: KtDeclaration, diagnosticHolder: DiagnosticSink, bindingContext: BindingContext): Unit defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [59:56] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [59:68] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [59:81] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'bindingContext' @ [59:99] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [61:39] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'containingDeclaration' @ [61:50] ==> public final val SimpleFunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'declaration' @ [62:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'containingClass' @ [63:21] ==> val containingClass: ClassDescriptor? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[LocalVariableDescriptor]

'ktFunction' @ [63:48] ==> val ktFunction: KtFunction? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[LocalVariableDescriptor]

'checkParcelableClassMethod' @ [64:21] ==> private final fun checkParcelableClassMethod(method: SimpleFunctionDescriptor, containingClass: ClassDescriptor, declaration: KtFunction, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [64:48] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'containingClass' @ [64:60] ==> val containingClass: ClassDescriptor? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[LocalVariableDescriptor]

'ktFunction' @ [64:77] ==> val ktFunction: KtFunction? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[LocalVariableDescriptor]

'diagnosticHolder' @ [64:89] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [68:39] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'containingDeclaration' @ [68:50] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'declaration' @ [69:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'containingClass' @ [70:21] ==> val containingClass: ClassDescriptor? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[LocalVariableDescriptor]

'ktProperty' @ [70:48] ==> val ktProperty: KtProperty? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[LocalVariableDescriptor]

'checkParcelableClassProperty' @ [71:21] ==> private final fun checkParcelableClassProperty(property: PropertyDescriptor, containingClass: ClassDescriptor, declaration: KtProperty, diagnosticHolder: DiagnosticSink, bindingContext: BindingContext): Unit defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [71:50] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'containingClass' @ [71:62] ==> val containingClass: ClassDescriptor? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[LocalVariableDescriptor]

'ktProperty' @ [71:79] ==> val ktProperty: KtProperty? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[LocalVariableDescriptor]

'diagnosticHolder' @ [71:91] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'bindingContext' @ [71:109] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.check[ValueParameterDescriptorImpl]

'!' @ [83:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [83:14] ==> value-parameter containingClass: ClassDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassMethod[ValueParameterDescriptorImpl]

'isParcelize' @ [83:30] ==> internal val ClassDescriptor.isParcelize: Boolean defined in org.jetbrains.kotlin.android.parcel in file ParcelableResolveExtension.kt[PropertyDescriptorImpl]

'method' @ [85:13] ==> value-parameter method: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassMethod[ValueParameterDescriptorImpl]

'isWriteToParcel' @ [85:20] ==> internal fun SimpleFunctionDescriptor.isWriteToParcel(): Boolean defined in org.jetbrains.kotlin.android.parcel in file ParcelableResolveExtension.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [85:41] ==> value-parameter declaration: KtFunction defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassMethod[ValueParameterDescriptorImpl]

'hasModifier' @ [85:53] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [85:74] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [86:33] ==> value-parameter declaration: KtFunction defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassMethod[ValueParameterDescriptorImpl]

'modifierList' @ [86:45] ==> public final val KtFunction.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [86:59] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [86:80] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [86:101] ==> value-parameter declaration: KtFunction defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassMethod[ValueParameterDescriptorImpl]

'nameIdentifier' @ [86:113] ==> public final val KtFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [86:131] ==> value-parameter declaration: KtFunction defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassMethod[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [87:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassMethod[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [87:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'OVERRIDING_WRITE_TO_PARCEL_IS_NOT_ALLOWED' @ [87:61] ==> public final val OVERRIDING_WRITE_TO_PARCEL_IS_NOT_ALLOWED: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [87:103] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [87:106] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassMethod[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [87:122] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'containingClass' @ [98:13] ==> value-parameter containingClass: ClassDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'isParcelize' @ [98:29] ==> internal val ClassDescriptor.isParcelize: Boolean defined in org.jetbrains.kotlin.android.parcel in file ParcelableResolveExtension.kt[PropertyDescriptorImpl]

'declaration' @ [99:21] ==> value-parameter declaration: KtProperty defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'hasDelegate' @ [99:33] ==> public open fun hasDelegate(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'bindingContext' @ [99:50] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'BACKING_FIELD_REQUIRED' @ [99:80] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'property' @ [99:104] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'!' @ [100:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'property' @ [100:21] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'annotations' @ [100:30] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[DeserializedPropertyDescriptor]

'hasAnnotation' @ [100:42] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'TRANSIENT_FQNAME' @ [100:56] ==> private final val TRANSIENT_FQNAME: FqName defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.Companion[PropertyDescriptorImpl]

'declaration' @ [102:33] ==> value-parameter declaration: KtProperty defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'nameIdentifier' @ [102:45] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [102:63] ==> value-parameter declaration: KtProperty defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [103:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [103:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PROPERTY_WONT_BE_SERIALIZED' @ [103:61] ==> public final val PROPERTY_WONT_BE_SERIALIZED: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [103:89] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [103:92] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [103:108] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'property' @ [107:13] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'name' @ [107:22] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [107:27] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'property' @ [107:54] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'findJvmFieldAnnotation' @ [107:63] ==> public fun DeclarationDescriptor.findJvmFieldAnnotation(): AnnotationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.annotations[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [107:99] ==> value-parameter containingClass: ClassDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'isCompanionObject' @ [107:115] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'containingClass' @ [108:30] ==> value-parameter containingClass: ClassDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'containingDeclaration' @ [108:46] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'outerClass' @ [109:17] ==> val outerClass: ClassDescriptor? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'outerClass' @ [109:39] ==> val outerClass: ClassDescriptor? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'isParcelize' @ [109:50] ==> internal val ClassDescriptor.isParcelize: Boolean defined in org.jetbrains.kotlin.android.parcel in file ParcelableResolveExtension.kt[PropertyDescriptorImpl]

'declaration' @ [110:37] ==> value-parameter declaration: KtProperty defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'nameIdentifier' @ [110:49] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [110:67] ==> value-parameter declaration: KtProperty defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [111:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [111:34] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'CREATOR_DEFINITION_IS_NOT_ALLOWED' @ [111:65] ==> public final val CREATOR_DEFINITION_IS_NOT_ALLOWED: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [111:99] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [111:102] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [111:118] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'!' @ [122:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [122:14] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'isParcelize' @ [122:25] ==> internal val ClassDescriptor.isParcelize: Boolean defined in org.jetbrains.kotlin.android.parcel in file ParcelableResolveExtension.kt[PropertyDescriptorImpl]

'declaration' @ [124:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'declaration' @ [124:41] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'isAnnotation' @ [124:53] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'declaration' @ [124:71] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'isInterface' @ [124:83] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'?:' @ [125:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'declaration' @ [125:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'nameIdentifier' @ [125:68] ==> public final val KtClassOrObject.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [125:86] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [126:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [126:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PARCELABLE_SHOULD_BE_CLASS' @ [126:61] ==> public final val PARCELABLE_SHOULD_BE_CLASS: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [126:88] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [126:91] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [126:107] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'declaration' @ [130:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'isEnum' @ [130:25] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'?:' @ [131:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'declaration' @ [131:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'nameIdentifier' @ [131:60] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [131:78] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [132:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [132:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PARCELABLE_SHOULD_BE_CLASS' @ [132:61] ==> public final val PARCELABLE_SHOULD_BE_CLASS: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [132:88] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [132:91] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [132:107] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'declaration' @ [136:32] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'modifierList' @ [136:44] ==> public final val KtClass.modifierList: KtModifierList?[MyPropertyDescriptor]

'let' @ [136:58] ==> @InlineOnly public inline fun <T, R> KtModifierList.let(block: (KtModifierList) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierList
    <R> -> PsiElement?

'it' @ [136:64] ==> value-parameter it: KtModifierList defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass.<anonymous>[ValueParameterDescriptorImpl]

'getModifier' @ [136:67] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [136:88] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'it' @ [136:109] ==> value-parameter it: KtModifierList defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass.<anonymous>[ValueParameterDescriptorImpl]

'getModifier' @ [136:112] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'SEALED_KEYWORD' @ [136:133] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'sealedOrAbstract' @ [137:13] ==> val sealedOrAbstract: PsiElement? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'diagnosticHolder' @ [138:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [138:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PARCELABLE_SHOULD_BE_INSTANTIABLE' @ [138:61] ==> public final val PARCELABLE_SHOULD_BE_INSTANTIABLE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [138:95] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'sealedOrAbstract' @ [138:98] ==> val sealedOrAbstract: PsiElement? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [138:117] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'declaration' @ [141:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'isInner' @ [141:25] ==> public final fun isInner(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'declaration' @ [142:33] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'modifierList' @ [142:45] ==> public final val KtClass.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [142:59] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'INNER_KEYWORD' @ [142:80] ==> public final val INNER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [142:98] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'nameIdentifier' @ [142:110] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [142:128] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [143:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [143:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PARCELABLE_CANT_BE_INNER_CLASS' @ [143:61] ==> public final val PARCELABLE_CANT_BE_INNER_CLASS: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [143:92] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [143:95] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [143:111] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'declaration' @ [146:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'isLocal' @ [146:25] ==> public final val KtClass.isLocal: Boolean[MyPropertyDescriptor]

'declaration' @ [147:33] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'nameIdentifier' @ [147:45] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [147:63] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [148:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [148:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PARCELABLE_CANT_BE_LOCAL_CLASS' @ [148:61] ==> public final val PARCELABLE_CANT_BE_LOCAL_CLASS: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [148:92] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [148:95] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [148:111] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'getAllSupertypes' @ [151:36] ==> @NotNull public open fun getAllSupertypes(@NotNull p0: KotlinType): (MutableSet<(KotlinType..KotlinType?)>..Set<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'descriptor' @ [151:53] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'defaultType' @ [151:64] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'superTypes' @ [152:13] ==> val superTypes: (MutableSet<(KotlinType..KotlinType?)>..Set<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'none' @ [152:24] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.none(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'it' @ [152:31] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [152:34] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [152:46] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameSafe' @ [152:69] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'ANDROID_PARCELABLE_CLASS_FQNAME' @ [152:83] ==> private val ANDROID_PARCELABLE_CLASS_FQNAME: FqName defined in org.jetbrains.kotlin.android.parcel in file ParcelableDeclarationChecker.kt[PropertyDescriptorImpl]

'declaration' @ [153:33] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'nameIdentifier' @ [153:45] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [153:63] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [154:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [154:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'NO_PARCELABLE_SUPERTYPE' @ [154:61] ==> public final val NO_PARCELABLE_SUPERTYPE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [154:85] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [154:88] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [154:104] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'declaration' @ [157:32] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [157:44] ==> public final val KtClass.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'supertypeEntry' @ [158:13] ==> val supertypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'supertypeEntry' @ [159:38] ==> val supertypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'delegateExpression' @ [159:53] ==> public final val KtDelegatedSuperTypeEntry.delegateExpression: KtExpression?[MyPropertyDescriptor]

'bindingContext' @ [160:24] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'TYPE' @ [160:54] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'supertypeEntry' @ [160:60] ==> val supertypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'typeReference' @ [160:75] ==> public final val KtDelegatedSuperTypeEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'type' @ [161:17] ==> val type: KotlinType defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'isParcelable' @ [161:22] ==> internal fun KotlinType.isParcelable(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers[SimpleFunctionDescriptorImpl]

'supertypeEntry' @ [162:37] ==> val supertypeEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'byKeywordNode' @ [162:52] ==> public final val KtDelegatedSuperTypeEntry.byKeywordNode: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'psi' @ [162:67] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'delegateExpression' @ [162:74] ==> val delegateExpression: KtExpression defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'diagnosticHolder' @ [163:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [163:34] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PARCELABLE_DELEGATE_IS_NOT_ALLOWED' @ [163:65] ==> public final val PARCELABLE_DELEGATE_IS_NOT_ALLOWED: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [163:100] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [163:103] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [163:119] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'declaration' @ [167:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'primaryConstructor' @ [167:46] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'if (primaryConstructor == null && declaration.secondaryConstructors.isNotEmpty()) {
            val reportElement = declaration.nameIdentifier ?: declaration
            diagnosticHolder.reportFromPlugin(ErrorsAndroid.PARCELABLE_SHOULD_HAVE_PRIMARY_CONSTRUCTOR.on(reportElement), DefaultErrorMessagesAndroid)
        } else if (primaryConstructor != null && primaryConstructor.valueParameters.isEmpty()) {
            val reportElement = declaration.nameIdentifier ?: declaration
            diagnosticHolder.reportFromPlugin(ErrorsAndroid.PARCELABLE_PRIMARY_CONSTRUCTOR_IS_EMPTY.on(reportElement), DefaultErrorMessagesAndroid)
        }' @ [168:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'primaryConstructor' @ [168:13] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'declaration' @ [168:43] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'secondaryConstructors' @ [168:55] ==> public final val KtClass.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'isNotEmpty' @ [168:77] ==> @InlineOnly public inline fun <T> Collection<KtSecondaryConstructor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSecondaryConstructor

'declaration' @ [169:33] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'nameIdentifier' @ [169:45] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [169:63] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [170:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [170:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PARCELABLE_SHOULD_HAVE_PRIMARY_CONSTRUCTOR' @ [170:61] ==> public final val PARCELABLE_SHOULD_HAVE_PRIMARY_CONSTRUCTOR: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [170:104] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [170:107] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [170:123] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'primaryConstructor' @ [171:20] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'primaryConstructor' @ [171:50] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'valueParameters' @ [171:69] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'isEmpty' @ [171:85] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'declaration' @ [172:33] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'nameIdentifier' @ [172:45] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'declaration' @ [172:63] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [173:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [173:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PARCELABLE_PRIMARY_CONSTRUCTOR_IS_EMPTY' @ [173:61] ==> public final val PARCELABLE_PRIMARY_CONSTRUCTOR_IS_EMPTY: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [173:101] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [173:104] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [173:120] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'KotlinTypeMapper' @ [176:26] ==> public constructor KotlinTypeMapper(@NotNull p0: BindingContext, @NotNull p1: ClassBuilderMode, @NotNull p2: JvmFileClassesProvider, @NotNull p3: IncompatibleClassTracker, @NotNull p4: String, p5: Boolean, p6: Boolean) defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaClassConstructorDescriptor]

'bindingContext' @ [177:17] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'full' @ [178:34] ==> public open fun full(p0: Boolean): (ClassBuilderMode..ClassBuilderMode?) defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaMethodDescriptor]

'NoResolveFileClassesProvider' @ [179:17] ==> public object NoResolveFileClassesProvider : JvmFileClassesProvider defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'DoNothing' @ [180:42] ==> public object DoNothing : IncompatibleClassTracker defined in org.jetbrains.kotlin.codegen.state.IncompatibleClassTracker[FakeCallableDescriptorForObject]

'descriptor' @ [181:17] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'module' @ [181:28] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'name' @ [181:35] ==> public final val ModuleDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [181:40] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'primaryConstructor' @ [185:27] ==> val primaryConstructor: KtPrimaryConstructor? defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'valueParameters' @ [185:47] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'orEmpty' @ [185:63] ==> @InlineOnly public inline fun <T> List<(KtParameter..KtParameter?)>?.orEmpty(): List<(KtParameter..KtParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'checkParcelableClassProperty' @ [186:13] ==> private final fun checkParcelableClassProperty(parameter: KtParameter, diagnosticHolder: DiagnosticSink, typeMapper: KotlinTypeMapper): Unit defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker[SimpleFunctionDescriptorImpl]

'parameter' @ [186:42] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'diagnosticHolder' @ [186:53] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[ValueParameterDescriptorImpl]

'typeMapper' @ [186:71] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClass[LocalVariableDescriptor]

'!' @ [191:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [191:14] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'hasValOrVar' @ [191:24] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'parameter' @ [192:33] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'nameIdentifier' @ [192:43] ==> public final val KtParameter.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'parameter' @ [192:61] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [193:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [193:30] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PARCELABLE_CONSTRUCTOR_PARAMETER_SHOULD_BE_VAL_OR_VAR' @ [194:35] ==> public final val PARCELABLE_CONSTRUCTOR_PARAMETER_SHOULD_BE_VAL_OR_VAR: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [194:89] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [194:92] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [194:108] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

'typeMapper' @ [197:26] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'bindingContext' @ [197:37] ==> public final val KotlinTypeMapper.bindingContext: BindingContext[MyPropertyDescriptor]

'PRIMARY_CONSTRUCTOR_PARAMETER' @ [197:67] ==> public final val PRIMARY_CONSTRUCTOR_PARAMETER: (WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameter' @ [197:98] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'descriptor' @ [198:20] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'type' @ [198:31] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'!' @ [200:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [200:14] ==> val type: KotlinType defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'isError' @ [200:19] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'typeMapper' @ [201:27] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'mapType' @ [201:38] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'type' @ [201:46] ==> val type: KotlinType defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'ParcelSerializer' @ [204:17] ==> public companion object defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer[FakeCallableDescriptorForObject]

'get' @ [204:34] ==> public final fun get(type: KotlinType, asmType: Type, typeMapper: KotlinTypeMapper, forceBoxed: Boolean = ..., strict: Boolean = ...): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [204:38] ==> val type: KotlinType defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'asmType' @ [204:44] ==> val asmType: Type defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'typeMapper' @ [204:53] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'parameter' @ [208:37] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'typeReference' @ [208:47] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'parameter' @ [208:64] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'nameIdentifier' @ [208:74] ==> public final val KtParameter.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'parameter' @ [208:92] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [209:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[ValueParameterDescriptorImpl]

'reportFromPlugin' @ [209:34] ==> public fun <D : Diagnostic> DiagnosticSink.reportFromPlugin(diagnostic: SimpleDiagnostic<(PsiElement..PsiElement?)>, ext: DefaultErrorMessages.Extension): Unit defined in org.jetbrains.kotlin.diagnostics[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : Diagnostic> -> SimpleDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'PARCELABLE_TYPE_NOT_SUPPORTED' @ [209:65] ==> public final val PARCELABLE_TYPE_NOT_SUPPORTED: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.android.synthetic.diagnostic.ErrorsAndroid[JavaPropertyDescriptor]

'on' @ [209:95] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportElement' @ [209:98] ==> val reportElement: PsiElement defined in org.jetbrains.kotlin.android.parcel.ParcelableDeclarationChecker.checkParcelableClassProperty[LocalVariableDescriptor]

'DefaultErrorMessagesAndroid' @ [209:114] ==> public object DefaultErrorMessagesAndroid : DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.android.synthetic.diagnostic in file DefaultErrorMessagesAndroid.kt[FakeCallableDescriptorForObject]

