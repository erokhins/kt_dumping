'State' @ [32:1] ==> public constructor State(name: String, storages: Array<Storage> = ..., reloadable: Boolean = ..., defaultStateAsResource: Boolean = ..., additionalExportFile: String = ..., presentableName: KClass<out (State.NameGetter..State.NameGetter?)> = ...) defined in com.intellij.openapi.components.State[JavaClassConstructorDescriptor]

'arrayOf' @ [32:52] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Storage): Array<Storage> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Storage

'Storage' @ [32:60] ==> public constructor Storage(value: String = ..., file: String = ..., deprecated: Boolean = ..., roamingType: RoamingType = ..., storageClass: KClass<out (StateStorage..StateStorage?)> = ..., stateSplitter: KClass<out (StateSplitter..StateSplitter?)> = ..., scheme: StorageScheme = ..., id: String = ..., exclusive: Boolean = ...) defined in com.intellij.openapi.components.Storage[JavaClassConstructorDescriptor]

'+' @ [32:75] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'APP_CONFIG' @ [32:93] ==> @Deprecated public const final val APP_CONFIG: String defined in com.intellij.openapi.components.StoragePathMacros[JavaPropertyDescriptor]

'XDebuggerSettings<KotlinDebuggerSettings>' @ [32:160] ==> protected/*protected and package*/ constructor XDebuggerSettings<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.xdebugger.settings.XDebuggerSettings[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinDebuggerSettings

'!!' @ [39:20] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinDebuggerSettings?): KotlinDebuggerSettings[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinDebuggerSettings

'getInstance' @ [39:34] ==> public open fun getInstance(): (XDebuggerUtil..XDebuggerUtil?) defined in com.intellij.xdebugger.XDebuggerUtil[JavaMethodDescriptor]

'getDebuggerSettings' @ [39:49] ==> public abstract fun <T : (XDebuggerSettings<*>..XDebuggerSettings<*>?)> getDebuggerSettings(p0: (Class<(KotlinDebuggerSettings..KotlinDebuggerSettings?)>..Class<(KotlinDebuggerSettings..KotlinDebuggerSettings?)>?)): (KotlinDebuggerSettings..KotlinDebuggerSettings?) defined in com.intellij.xdebugger.XDebuggerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (XDebuggerSettings<*>..XDebuggerSettings<*>?)> -> (org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings..org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings?)

'KotlinDebuggerSettings' @ [39:69] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings[FakeCallableDescriptorForObject]

'java' @ [39:99] ==> public val <T> KClass<KotlinDebuggerSettings>.java: Class<KotlinDebuggerSettings> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinDebuggerSettings

'when (category) {
            DebuggerSettingsCategory.STEPPING ->
                listOf(SimpleConfigurable.create(
                        "reference.idesettings.debugger.kotlin.stepping",
                        "Kotlin",
                        KotlinSteppingConfigurableUi::class.java,
                        this))
            DebuggerSettingsCategory.DATA_VIEWS ->
                listOf(SimpleConfigurable.create(
                        "reference.idesettings.debugger.kotlin.data.view",
                        "Kotlin",
                        KotlinDelegatedPropertyRendererConfigurableUi::class.java,
                        this))
            else -> listOf()
        }' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<Configurable?>, entry1: Collection<Configurable?>, entry2: Collection<Configurable?>): Collection<Configurable?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<Configurable?>

'category' @ [44:22] ==> value-parameter category: DebuggerSettingsCategory defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings.createConfigurables[ValueParameterDescriptorImpl]

'STEPPING' @ [45:38] ==> enum entry STEPPING defined in com.intellij.xdebugger.settings.DebuggerSettingsCategory[FakeCallableDescriptorForObject]

'listOf' @ [46:17] ==> public fun <T> listOf(element: (SimpleConfigurable<(KotlinSteppingConfigurableUi..KotlinSteppingConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>..SimpleConfigurable<(KotlinSteppingConfigurableUi..KotlinSteppingConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>?)): List<(SimpleConfigurable<(KotlinSteppingConfigurableUi..KotlinSteppingConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>..SimpleConfigurable<(KotlinSteppingConfigurableUi..KotlinSteppingConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.options.SimpleConfigurable<(org.jetbrains.kotlin.idea.debugger.stepping.KotlinSteppingConfigurableUi..org.jetbrains.kotlin.idea.debugger.stepping.KotlinSteppingConfigurableUi?), (org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings..org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings?)>..com.intellij.openapi.options.SimpleConfigurable<(org.jetbrains.kotlin.idea.debugger.stepping.KotlinSteppingConfigurableUi..org.jetbrains.kotlin.idea.debugger.stepping.KotlinSteppingConfigurableUi?), (org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings..org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings?)>?)

'create' @ [46:43] ==> public open fun <UI : (ConfigurableUi<(KotlinDebuggerSettings..KotlinDebuggerSettings?)>..ConfigurableUi<(KotlinDebuggerSettings..KotlinDebuggerSettings?)>?), S : (Any..Any?)> create(@NotNull p0: String, @NotNull p1: String, @NotNull p2: Class<(KotlinSteppingConfigurableUi..KotlinSteppingConfigurableUi?)>, @NotNull p3: Getter<(KotlinDebuggerSettings..KotlinDebuggerSettings?)>): (SimpleConfigurable<(KotlinSteppingConfigurableUi..KotlinSteppingConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>..SimpleConfigurable<(KotlinSteppingConfigurableUi..KotlinSteppingConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>?) defined in com.intellij.openapi.options.SimpleConfigurable[JavaMethodDescriptor]
Inferred types:
    <UI : (ConfigurableUi<(S..S?)>..ConfigurableUi<(S..S?)>?)> -> (org.jetbrains.kotlin.idea.debugger.stepping.KotlinSteppingConfigurableUi..org.jetbrains.kotlin.idea.debugger.stepping.KotlinSteppingConfigurableUi?)
    <S : (Any..Any?)> -> (org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings..org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings?)

'KotlinSteppingConfigurableUi' @ [49:25] ==> public constructor KotlinSteppingConfigurableUi() defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSteppingConfigurableUi[JavaClassConstructorDescriptor]

'java' @ [49:61] ==> public val <T> KClass<KotlinSteppingConfigurableUi>.java: Class<KotlinSteppingConfigurableUi> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinSteppingConfigurableUi

'this' @ [50:25] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings[LazyClassReceiverParameterDescriptor]

'DATA_VIEWS' @ [51:38] ==> enum entry DATA_VIEWS defined in com.intellij.xdebugger.settings.DebuggerSettingsCategory[FakeCallableDescriptorForObject]

'listOf' @ [52:17] ==> public fun <T> listOf(element: (SimpleConfigurable<(KotlinDelegatedPropertyRendererConfigurableUi..KotlinDelegatedPropertyRendererConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>..SimpleConfigurable<(KotlinDelegatedPropertyRendererConfigurableUi..KotlinDelegatedPropertyRendererConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>?)): List<(SimpleConfigurable<(KotlinDelegatedPropertyRendererConfigurableUi..KotlinDelegatedPropertyRendererConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>..SimpleConfigurable<(KotlinDelegatedPropertyRendererConfigurableUi..KotlinDelegatedPropertyRendererConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.options.SimpleConfigurable<(org.jetbrains.kotlin.idea.debugger.KotlinDelegatedPropertyRendererConfigurableUi..org.jetbrains.kotlin.idea.debugger.KotlinDelegatedPropertyRendererConfigurableUi?), (org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings..org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings?)>..com.intellij.openapi.options.SimpleConfigurable<(org.jetbrains.kotlin.idea.debugger.KotlinDelegatedPropertyRendererConfigurableUi..org.jetbrains.kotlin.idea.debugger.KotlinDelegatedPropertyRendererConfigurableUi?), (org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings..org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings?)>?)

'create' @ [52:43] ==> public open fun <UI : (ConfigurableUi<(KotlinDebuggerSettings..KotlinDebuggerSettings?)>..ConfigurableUi<(KotlinDebuggerSettings..KotlinDebuggerSettings?)>?), S : (Any..Any?)> create(@NotNull p0: String, @NotNull p1: String, @NotNull p2: Class<(KotlinDelegatedPropertyRendererConfigurableUi..KotlinDelegatedPropertyRendererConfigurableUi?)>, @NotNull p3: Getter<(KotlinDebuggerSettings..KotlinDebuggerSettings?)>): (SimpleConfigurable<(KotlinDelegatedPropertyRendererConfigurableUi..KotlinDelegatedPropertyRendererConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>..SimpleConfigurable<(KotlinDelegatedPropertyRendererConfigurableUi..KotlinDelegatedPropertyRendererConfigurableUi?), (KotlinDebuggerSettings..KotlinDebuggerSettings?)>?) defined in com.intellij.openapi.options.SimpleConfigurable[JavaMethodDescriptor]
Inferred types:
    <UI : (ConfigurableUi<(S..S?)>..ConfigurableUi<(S..S?)>?)> -> (org.jetbrains.kotlin.idea.debugger.KotlinDelegatedPropertyRendererConfigurableUi..org.jetbrains.kotlin.idea.debugger.KotlinDelegatedPropertyRendererConfigurableUi?)
    <S : (Any..Any?)> -> (org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings..org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings?)

'KotlinDelegatedPropertyRendererConfigurableUi' @ [55:25] ==> public constructor KotlinDelegatedPropertyRendererConfigurableUi() defined in org.jetbrains.kotlin.idea.debugger.KotlinDelegatedPropertyRendererConfigurableUi[JavaClassConstructorDescriptor]

'java' @ [55:78] ==> public val <T> KClass<KotlinDelegatedPropertyRendererConfigurableUi>.java: Class<KotlinDelegatedPropertyRendererConfigurableUi> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinDelegatedPropertyRendererConfigurableUi

'this' @ [56:25] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings[LazyClassReceiverParameterDescriptor]

'listOf' @ [57:21] ==> @InlineOnly public inline fun <T> listOf(): List<Configurable?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Configurable?

'this' @ [61:31] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings[LazyClassReceiverParameterDescriptor]

'this' @ [62:26] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings[LazyClassReceiverParameterDescriptor]

'state' @ [65:13] ==> value-parameter state: KotlinDebuggerSettings? defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings.loadState[ValueParameterDescriptorImpl]

'copyBean' @ [65:46] ==> public open fun <T : (Any..Any?)> copyBean(@NotNull p0: KotlinDebuggerSettings, @NotNull p1: KotlinDebuggerSettings): Unit defined in com.intellij.util.xmlb.XmlSerializerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinDebuggerSettings

'state' @ [65:79] ==> value-parameter state: KotlinDebuggerSettings? defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings.loadState[ValueParameterDescriptorImpl]

'this' @ [65:86] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings[LazyClassReceiverParameterDescriptor]

