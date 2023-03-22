package com.zennyel.saodark.utils;

import com.zennyel.saodark.config.MessagesFileManager;

public class GuildMessages {
    private MessagesFileManager manager;

    private String guild_name_too_short;
    private String guild_name_too_long;
    private String guild_created_successfully;
    private String guild_creation_failed;
    private String guild_successfully_disbanded;
    private String guild_disband_failure;
    private String guild_invite_no_valid_player;
    private String guild_invite_not_guild_owner;
    private String guild_invite_self_error;
    private String guild_invitee_not_found;
    private String guild_invite_invited_already_in_guild;
    private String guild_invite_max_size_reached;
    private String guild_invite_successful;
    private String guild_invite_failed;
    private String guild_invited_player_invite_pending;
    private String guild_join_successful;
    private String guild_join_failed;
    private String guild_join_failed_no_valid_guild;
    private String guild_join_failed_no_invite;
    private String failed_guild_owner;
    private String guild_leave_successful;
    private String guild_leave_failed;
    private String guild_member_kick_successful;
    private String guild_kicked_player_message;
    private String targeted_player_is_not_in_your_guild;
    private String could_not_find_specified_player;
    private String must_be_owner_to_kick;
    private String incorrect_kick_command_usage;
    private String failed_cannot_kick_yourself;
    private String guild_prefix_change_successful;
    private String guild_prefix_too_long;
    private String guild_prefix_too_short;
    private String guild_invalid_prefix;
    private String must_be_owner_to_change_prefix;
    private String no_guilds_to_list;
    private String guilds_list_header;
    private String guilds_list_footer;
    private String guild_info_header;
    private String guild_info_owner_online;
    private String guild_info_owner_offline;
    private String guild_info_members_header;
    private String guild_info_members_online;
    private String guild_info_members_offline;
    private String guild_info_allies_header;
    private String guild_ally_members;
    private String guild_pvp_status_enabled;
    private String guild_pvp_status_disabled;
    private String guild_home_set_true;
    private String guild_home_set_false;
    private String guild_info_footer;
    private String not_in_guild;
    private String enabled_friendly_fire;
    private String disabled_friendly_fire;
    private String failed_not_in_Guild;
    private String friendly_fire_is_disabled;
    private String successfully_set_Guild_home;
    private String cool_down_timer_wait;
    private String successfully_teleported_to_home;
    private String failed_no_home_set;
    private String failed_tp_not_in_Guild;
    private String Guild_must_be_owner;
    private String function_disabled;
    private String plugin_reload_successful;
    private String incorrect_command_usage;
    private String player_only_command;
    private String saving_Guilds_start;
    private String save_completed;
    private String auto_save_started;
    private String auto_save_complete;

    public GuildMessages(MessagesFileManager manager){
        this.manager = manager;
        setMessages();
    }

    public void setMessages(){
        setGuild_name_too_short(manager.getMessagesConfig().getString("guild-name-too-short"));
        setGuild_name_too_long(manager.getMessagesConfig().getString("guild-name-too-long"));
        setGuild_created_successfully(manager.getMessagesConfig().getString("guild-created-successfully"));
        setGuild_creation_failed(manager.getMessagesConfig().getString("guild-creation-failed"));
        setGuild_successfully_disbanded(manager.getMessagesConfig().getString("guild-successfully-disbanded"));
        setGuild_disband_failure(manager.getMessagesConfig().getString("guild-disband-failure"));
        setGuild_invite_no_valid_player(manager.getMessagesConfig().getString("guild-invite-no-valid-player"));
        setGuild_invite_not_guild_owner(manager.getMessagesConfig().getString("guild-invite-not-guild-owner"));
        setGuild_invite_self_error(manager.getMessagesConfig().getString("guild-invite-self-error"));
        setGuild_invitee_not_found(manager.getMessagesConfig().getString("guild-invitee-not-found"));
        setGuild_invite_invited_already_in_guild(manager.getMessagesConfig().getString("guild-invite-invited-already-in-guild"));
        setGuild_invite_max_size_reached(manager.getMessagesConfig().getString("guild-invite-max-size-reached"));
        setGuild_invite_successful(manager.getMessagesConfig().getString("guild-invite-successful"));
        setGuild_invite_failed(manager.getMessagesConfig().getString("guild-invite-failed"));
        setGuild_invited_player_invite_pending(manager.getMessagesConfig().getString("guild-invited-player-invite-pending"));
        setGuild_join_successful(manager.getMessagesConfig().getString("guild-join-successful"));
        setGuild_join_failed(manager.getMessagesConfig().getString("guild-join-failed"));
        setGuild_join_failed_no_valid_guild(manager.getMessagesConfig().getString("guild-join-failed-no-valid-guild"));
        setGuild_join_failed_no_invite(manager.getMessagesConfig().getString("guild-join-failed-no-invite"));
        setFailed_guild_owner(manager.getMessagesConfig().getString("failed-guild-owner"));
        setGuild_leave_successful(manager.getMessagesConfig().getString("guild-leave-successful"));
        setGuild_leave_failed(manager.getMessagesConfig().getString("guild-leave-failed"));
        setGuild_member_kick_successful(manager.getMessagesConfig().getString("guild-member-kick-successful"));
        setGuild_kicked_player_message(manager.getMessagesConfig().getString("guild-kicked-player-message"));
        setTargeted_player_is_not_in_your_guild(manager.getMessagesConfig().getString("targeted-player-is-not-in-your-guild"));
        setCould_not_find_specified_player(manager.getMessagesConfig().getString("could-not-find-specified-player"));
        setMust_be_owner_to_kick(manager.getMessagesConfig().getString("must-be-owner-to-kick"));
        setIncorrect_kick_command_usage(manager.getMessagesConfig().getString("incorrect-kick-command-usage"));
        setFailed_cannot_kick_yourself(manager.getMessagesConfig().getString("failed-cannot-kick-yourself"));
        setGuild_prefix_change_successful(manager.getMessagesConfig().getString("guild-prefix-change-successful"));
        setGuild_prefix_too_long(manager.getMessagesConfig().getString("guild-prefix-too-long"));
        setGuild_prefix_too_short(manager.getMessagesConfig().getString("guild-prefix-too-short"));
        setGuild_invalid_prefix(manager.getMessagesConfig().getString("guild-invalid-prefix"));
        setMust_be_owner_to_change_prefix(manager.getMessagesConfig().getString("must-be-owner-to-change-prefix"));
        setNo_guilds_to_list(manager.getMessagesConfig().getString("no-guilds-to-list"));
        setGuilds_list_header(manager.getMessagesConfig().getString("guilds-list-header"));
        setGuilds_list_footer(manager.getMessagesConfig().getString("guilds-list-footer"));
        setGuild_info_header(manager.getMessagesConfig().getString("guild-info-header"));
        setGuild_info_owner_online(manager.getMessagesConfig().getString("guild-info-owner-online"));
        setGuild_info_owner_offline(manager.getMessagesConfig().getString("guild-info-owner-offline"));
        setGuild_info_members_header(manager.getMessagesConfig().getString("guild-info-members-header"));
        setGuild_info_members_online(manager.getMessagesConfig().getString("guild-info-members-online"));
        setGuild_info_members_offline(manager.getMessagesConfig().getString("guild-info-members-offline"));
        setGuild_info_allies_header(manager.getMessagesConfig().getString("guild-info-allies-header"));
        setGuild_ally_members(manager.getMessagesConfig().getString("guild-ally-members"));
        setGuild_pvp_status_enabled(manager.getMessagesConfig().getString("guild-pvp-status-enabled"));
        setGuild_pvp_status_disabled(manager.getMessagesConfig().getString("guild-pvp-status-disabled"));
        setGuild_home_set_true(manager.getMessagesConfig().getString("guild-home-set-true"));
        setGuild_home_set_false(manager.getMessagesConfig().getString("guild-home-set-false"));
        setGuild_info_footer(manager.getMessagesConfig().getString("guild-info-footer"));
        setNot_in_guild(manager.getMessagesConfig().getString("not-in-guild"));
        setEnabled_friendly_fire(manager.getMessagesConfig().getString("enabled-friendly-fire"));
        setDisabled_friendly_fire(manager.getMessagesConfig().getString("disabled-friendly-fire"));
        setFailed_not_in_Guild(manager.getMessagesConfig().getString("failed-not-in-Guild"));
        setFriendly_fire_is_disabled(manager.getMessagesConfig().getString("friendly-fire-is-disabled"));
        setSuccessfully_set_Guild_home(manager.getMessagesConfig().getString("successfully-set-Guild-home"));
        setCool_down_timer_wait(manager.getMessagesConfig().getString("cool-down-timer-wait"));
        setSuccessfully_teleported_to_home(manager.getMessagesConfig().getString("successfully-teleported-to-home"));
        setFailed_no_home_set(manager.getMessagesConfig().getString("failed-no-home-set"));
        setFailed_tp_not_in_Guild(manager.getMessagesConfig().getString("failed-tp-not-in-Guild"));
        setGuild_must_be_owner(manager.getMessagesConfig().getString("Guild-must-be-owner"));
        setFunction_disabled(manager.getMessagesConfig().getString("function-disabled"));
        setPlugin_reload_successful(manager.getMessagesConfig().getString("plugin-reload-successful"));
        setIncorrect_command_usage(manager.getMessagesConfig().getString("incorrect-command-usage"));
        setPlayer_only_command(manager.getMessagesConfig().getString("player-only-command"));
        setSaving_Guilds_start(manager.getMessagesConfig().getString("saving-Guilds-start"));
        setSave_completed(manager.getMessagesConfig().getString("save-completed"));
        setAuto_save_started(manager.getMessagesConfig().getString("auto-save-started"));
        setAuto_save_complete(manager.getMessagesConfig().getString("auto-save-complete"));
    }

    public MessagesFileManager getManager() {
        return manager;
    }

    public void setManager(MessagesFileManager manager) {
        this.manager = manager;
    }

    public String getGuild_name_too_short() {
        return guild_name_too_short;
    }

    public void setGuild_name_too_short(String guild_name_too_short) {
        this.guild_name_too_short = guild_name_too_short;
    }

    public String getGuild_name_too_long() {
        return guild_name_too_long;
    }

    public void setGuild_name_too_long(String guild_name_too_long) {
        this.guild_name_too_long = guild_name_too_long;
    }

    public String getGuild_created_successfully() {
        return guild_created_successfully;
    }

    public void setGuild_created_successfully(String guild_created_successfully) {
        this.guild_created_successfully = guild_created_successfully;
    }

    public String getGuild_creation_failed() {
        return guild_creation_failed;
    }

    public void setGuild_creation_failed(String guild_creation_failed) {
        this.guild_creation_failed = guild_creation_failed;
    }

    public String getGuild_successfully_disbanded() {
        return guild_successfully_disbanded;
    }

    public void setGuild_successfully_disbanded(String guild_successfully_disbanded) {
        this.guild_successfully_disbanded = guild_successfully_disbanded;
    }

    public String getGuild_disband_failure() {
        return guild_disband_failure;
    }

    public void setGuild_disband_failure(String guild_disband_failure) {
        this.guild_disband_failure = guild_disband_failure;
    }

    public String getGuild_invite_no_valid_player() {
        return guild_invite_no_valid_player;
    }

    public void setGuild_invite_no_valid_player(String guild_invite_no_valid_player) {
        this.guild_invite_no_valid_player = guild_invite_no_valid_player;
    }

    public String getGuild_invite_not_guild_owner() {
        return guild_invite_not_guild_owner;
    }

    public void setGuild_invite_not_guild_owner(String guild_invite_not_guild_owner) {
        this.guild_invite_not_guild_owner = guild_invite_not_guild_owner;
    }

    public String getGuild_invite_self_error() {
        return guild_invite_self_error;
    }

    public void setGuild_invite_self_error(String guild_invite_self_error) {
        this.guild_invite_self_error = guild_invite_self_error;
    }

    public String getGuild_invitee_not_found() {
        return guild_invitee_not_found;
    }

    public void setGuild_invitee_not_found(String guild_invitee_not_found) {
        this.guild_invitee_not_found = guild_invitee_not_found;
    }

    public String getGuild_invite_invited_already_in_guild() {
        return guild_invite_invited_already_in_guild;
    }

    public void setGuild_invite_invited_already_in_guild(String guild_invite_invited_already_in_guild) {
        this.guild_invite_invited_already_in_guild = guild_invite_invited_already_in_guild;
    }

    public String getGuild_invite_max_size_reached() {
        return guild_invite_max_size_reached;
    }

    public void setGuild_invite_max_size_reached(String guild_invite_max_size_reached) {
        this.guild_invite_max_size_reached = guild_invite_max_size_reached;
    }

    public String getGuild_invite_successful() {
        return guild_invite_successful;
    }

    public void setGuild_invite_successful(String guild_invite_successful) {
        this.guild_invite_successful = guild_invite_successful;
    }

    public String getGuild_invite_failed() {
        return guild_invite_failed;
    }

    public void setGuild_invite_failed(String guild_invite_failed) {
        this.guild_invite_failed = guild_invite_failed;
    }

    public String getGuild_invited_player_invite_pending() {
        return guild_invited_player_invite_pending;
    }

    public void setGuild_invited_player_invite_pending(String guild_invited_player_invite_pending) {
        this.guild_invited_player_invite_pending = guild_invited_player_invite_pending;
    }

    public String getGuild_join_successful() {
        return guild_join_successful;
    }

    public void setGuild_join_successful(String guild_join_successful) {
        this.guild_join_successful = guild_join_successful;
    }

    public String getGuild_join_failed() {
        return guild_join_failed;
    }

    public void setGuild_join_failed(String guild_join_failed) {
        this.guild_join_failed = guild_join_failed;
    }

    public String getGuild_join_failed_no_valid_guild() {
        return guild_join_failed_no_valid_guild;
    }

    public void setGuild_join_failed_no_valid_guild(String guild_join_failed_no_valid_guild) {
        this.guild_join_failed_no_valid_guild = guild_join_failed_no_valid_guild;
    }

    public String getGuild_join_failed_no_invite() {
        return guild_join_failed_no_invite;
    }

    public void setGuild_join_failed_no_invite(String guild_join_failed_no_invite) {
        this.guild_join_failed_no_invite = guild_join_failed_no_invite;
    }

    public String getFailed_guild_owner() {
        return failed_guild_owner;
    }

    public void setFailed_guild_owner(String failed_guild_owner) {
        this.failed_guild_owner = failed_guild_owner;
    }

    public String getGuild_leave_successful() {
        return guild_leave_successful;
    }

    public void setGuild_leave_successful(String guild_leave_successful) {
        this.guild_leave_successful = guild_leave_successful;
    }

    public String getGuild_leave_failed() {
        return guild_leave_failed;
    }

    public void setGuild_leave_failed(String guild_leave_failed) {
        this.guild_leave_failed = guild_leave_failed;
    }

    public String getGuild_member_kick_successful() {
        return guild_member_kick_successful;
    }

    public void setGuild_member_kick_successful(String guild_member_kick_successful) {
        this.guild_member_kick_successful = guild_member_kick_successful;
    }

    public String getGuild_kicked_player_message() {
        return guild_kicked_player_message;
    }

    public void setGuild_kicked_player_message(String guild_kicked_player_message) {
        this.guild_kicked_player_message = guild_kicked_player_message;
    }

    public String getTargeted_player_is_not_in_your_guild() {
        return targeted_player_is_not_in_your_guild;
    }

    public void setTargeted_player_is_not_in_your_guild(String targeted_player_is_not_in_your_guild) {
        this.targeted_player_is_not_in_your_guild = targeted_player_is_not_in_your_guild;
    }

    public String getCould_not_find_specified_player() {
        return could_not_find_specified_player;
    }

    public void setCould_not_find_specified_player(String could_not_find_specified_player) {
        this.could_not_find_specified_player = could_not_find_specified_player;
    }

    public String getMust_be_owner_to_kick() {
        return must_be_owner_to_kick;
    }

    public void setMust_be_owner_to_kick(String must_be_owner_to_kick) {
        this.must_be_owner_to_kick = must_be_owner_to_kick;
    }

    public String getIncorrect_kick_command_usage() {
        return incorrect_kick_command_usage;
    }

    public void setIncorrect_kick_command_usage(String incorrect_kick_command_usage) {
        this.incorrect_kick_command_usage = incorrect_kick_command_usage;
    }

    public String getFailed_cannot_kick_yourself() {
        return failed_cannot_kick_yourself;
    }

    public void setFailed_cannot_kick_yourself(String failed_cannot_kick_yourself) {
        this.failed_cannot_kick_yourself = failed_cannot_kick_yourself;
    }

    public String getGuild_prefix_change_successful() {
        return guild_prefix_change_successful;
    }

    public void setGuild_prefix_change_successful(String guild_prefix_change_successful) {
        this.guild_prefix_change_successful = guild_prefix_change_successful;
    }

    public String getGuild_prefix_too_long() {
        return guild_prefix_too_long;
    }

    public void setGuild_prefix_too_long(String guild_prefix_too_long) {
        this.guild_prefix_too_long = guild_prefix_too_long;
    }

    public String getGuild_prefix_too_short() {
        return guild_prefix_too_short;
    }

    public void setGuild_prefix_too_short(String guild_prefix_too_short) {
        this.guild_prefix_too_short = guild_prefix_too_short;
    }

    public String getGuild_invalid_prefix() {
        return guild_invalid_prefix;
    }

    public void setGuild_invalid_prefix(String guild_invalid_prefix) {
        this.guild_invalid_prefix = guild_invalid_prefix;
    }

    public String getMust_be_owner_to_change_prefix() {
        return must_be_owner_to_change_prefix;
    }

    public void setMust_be_owner_to_change_prefix(String must_be_owner_to_change_prefix) {
        this.must_be_owner_to_change_prefix = must_be_owner_to_change_prefix;
    }

    public String getNo_guilds_to_list() {
        return no_guilds_to_list;
    }

    public void setNo_guilds_to_list(String no_guilds_to_list) {
        this.no_guilds_to_list = no_guilds_to_list;
    }

    public String getGuilds_list_header() {
        return guilds_list_header;
    }

    public void setGuilds_list_header(String guilds_list_header) {
        this.guilds_list_header = guilds_list_header;
    }

    public String getGuilds_list_footer() {
        return guilds_list_footer;
    }

    public void setGuilds_list_footer(String guilds_list_footer) {
        this.guilds_list_footer = guilds_list_footer;
    }

    public String getGuild_info_header() {
        return guild_info_header;
    }

    public void setGuild_info_header(String guild_info_header) {
        this.guild_info_header = guild_info_header;
    }

    public String getGuild_info_owner_online() {
        return guild_info_owner_online;
    }

    public void setGuild_info_owner_online(String guild_info_owner_online) {
        this.guild_info_owner_online = guild_info_owner_online;
    }

    public String getGuild_info_owner_offline() {
        return guild_info_owner_offline;
    }

    public void setGuild_info_owner_offline(String guild_info_owner_offline) {
        this.guild_info_owner_offline = guild_info_owner_offline;
    }

    public String getGuild_info_members_header() {
        return guild_info_members_header;
    }

    public void setGuild_info_members_header(String guild_info_members_header) {
        this.guild_info_members_header = guild_info_members_header;
    }

    public String getGuild_info_members_online() {
        return guild_info_members_online;
    }

    public void setGuild_info_members_online(String guild_info_members_online) {
        this.guild_info_members_online = guild_info_members_online;
    }

    public String getGuild_info_members_offline() {
        return guild_info_members_offline;
    }

    public void setGuild_info_members_offline(String guild_info_members_offline) {
        this.guild_info_members_offline = guild_info_members_offline;
    }

    public String getGuild_info_allies_header() {
        return guild_info_allies_header;
    }

    public void setGuild_info_allies_header(String guild_info_allies_header) {
        this.guild_info_allies_header = guild_info_allies_header;
    }

    public String getGuild_ally_members() {
        return guild_ally_members;
    }

    public void setGuild_ally_members(String guild_ally_members) {
        this.guild_ally_members = guild_ally_members;
    }

    public String getGuild_pvp_status_enabled() {
        return guild_pvp_status_enabled;
    }

    public void setGuild_pvp_status_enabled(String guild_pvp_status_enabled) {
        this.guild_pvp_status_enabled = guild_pvp_status_enabled;
    }

    public String getGuild_pvp_status_disabled() {
        return guild_pvp_status_disabled;
    }

    public void setGuild_pvp_status_disabled(String guild_pvp_status_disabled) {
        this.guild_pvp_status_disabled = guild_pvp_status_disabled;
    }

    public String getGuild_home_set_true() {
        return guild_home_set_true;
    }

    public void setGuild_home_set_true(String guild_home_set_true) {
        this.guild_home_set_true = guild_home_set_true;
    }

    public String getGuild_home_set_false() {
        return guild_home_set_false;
    }

    public void setGuild_home_set_false(String guild_home_set_false) {
        this.guild_home_set_false = guild_home_set_false;
    }

    public String getGuild_info_footer() {
        return guild_info_footer;
    }

    public void setGuild_info_footer(String guild_info_footer) {
        this.guild_info_footer = guild_info_footer;
    }

    public String getNot_in_guild() {
        return not_in_guild;
    }

    public void setNot_in_guild(String not_in_guild) {
        this.not_in_guild = not_in_guild;
    }

    public String getEnabled_friendly_fire() {
        return enabled_friendly_fire;
    }

    public void setEnabled_friendly_fire(String enabled_friendly_fire) {
        this.enabled_friendly_fire = enabled_friendly_fire;
    }

    public String getDisabled_friendly_fire() {
        return disabled_friendly_fire;
    }

    public void setDisabled_friendly_fire(String disabled_friendly_fire) {
        this.disabled_friendly_fire = disabled_friendly_fire;
    }

    public String getFailed_not_in_Guild() {
        return failed_not_in_Guild;
    }

    public void setFailed_not_in_Guild(String failed_not_in_Guild) {
        this.failed_not_in_Guild = failed_not_in_Guild;
    }

    public String getFriendly_fire_is_disabled() {
        return friendly_fire_is_disabled;
    }

    public void setFriendly_fire_is_disabled(String friendly_fire_is_disabled) {
        this.friendly_fire_is_disabled = friendly_fire_is_disabled;
    }

    public String getSuccessfully_set_Guild_home() {
        return successfully_set_Guild_home;
    }

    public void setSuccessfully_set_Guild_home(String successfully_set_Guild_home) {
        this.successfully_set_Guild_home = successfully_set_Guild_home;
    }

    public String getCool_down_timer_wait() {
        return cool_down_timer_wait;
    }

    public void setCool_down_timer_wait(String cool_down_timer_wait) {
        this.cool_down_timer_wait = cool_down_timer_wait;
    }

    public String getSuccessfully_teleported_to_home() {
        return successfully_teleported_to_home;
    }

    public void setSuccessfully_teleported_to_home(String successfully_teleported_to_home) {
        this.successfully_teleported_to_home = successfully_teleported_to_home;
    }

    public String getFailed_no_home_set() {
        return failed_no_home_set;
    }

    public void setFailed_no_home_set(String failed_no_home_set) {
        this.failed_no_home_set = failed_no_home_set;
    }

    public String getFailed_tp_not_in_Guild() {
        return failed_tp_not_in_Guild;
    }

    public void setFailed_tp_not_in_Guild(String failed_tp_not_in_Guild) {
        this.failed_tp_not_in_Guild = failed_tp_not_in_Guild;
    }

    public String getGuild_must_be_owner() {
        return Guild_must_be_owner;
    }

    public void setGuild_must_be_owner(String guild_must_be_owner) {
        Guild_must_be_owner = guild_must_be_owner;
    }

    public String getFunction_disabled() {
        return function_disabled;
    }

    public void setFunction_disabled(String function_disabled) {
        this.function_disabled = function_disabled;
    }

    public String getPlugin_reload_successful() {
        return plugin_reload_successful;
    }

    public void setPlugin_reload_successful(String plugin_reload_successful) {
        this.plugin_reload_successful = plugin_reload_successful;
    }

    public String getIncorrect_command_usage() {
        return incorrect_command_usage;
    }

    public void setIncorrect_command_usage(String incorrect_command_usage) {
        this.incorrect_command_usage = incorrect_command_usage;
    }

    public String getPlayer_only_command() {
        return player_only_command;
    }

    public void setPlayer_only_command(String player_only_command) {
        this.player_only_command = player_only_command;
    }

    public String getSaving_Guilds_start() {
        return saving_Guilds_start;
    }

    public void setSaving_Guilds_start(String saving_Guilds_start) {
        this.saving_Guilds_start = saving_Guilds_start;
    }

    public String getSave_completed() {
        return save_completed;
    }

    public void setSave_completed(String save_completed) {
        this.save_completed = save_completed;
    }

    public String getAuto_save_started() {
        return auto_save_started;
    }

    public void setAuto_save_started(String auto_save_started) {
        this.auto_save_started = auto_save_started;
    }

    public String getAuto_save_complete() {
        return auto_save_complete;
    }

    public void setAuto_save_complete(String auto_save_complete) {
        this.auto_save_complete = auto_save_complete;
    }
}
