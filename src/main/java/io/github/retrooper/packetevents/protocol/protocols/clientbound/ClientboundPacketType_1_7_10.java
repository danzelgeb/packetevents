/*
 * This file is part of packetevents - https://github.com/retrooper/packetevents
 * Copyright (C) 2021 retrooper and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.retrooper.packetevents.protocol.protocols.clientbound;

public enum ClientboundPacketType_1_7_10 {
    KEEP_ALIVE,
    JOIN_GAME,
    CHAT_MESSAGE,
    TIME_UPDATE,
    ENTITY_EQUIPMENT,
    SPAWN_POSITION,
    UPDATE_HEALTH,
    RESPAWN,
    PLAYER_POSITION_AND_LOOK,
    HELD_ITEM_CHANGE,
    USE_BED,
    ANIMATION,
    SPAWN_PLAYER,
    COLLECT_ITEM,
    SPAWN_OBJECT,
    SPAWN_MOB,
    SPAWN_PAINTING,
    SPAWN_EXPERIENCE_ORB,
    ENTITY_VELOCITY,
    DESTROY_ENTITIES,
    ENTITY,
    ENTITY_RELATIVE_MOVE,
    ENTITY_LOOK,
    ENTITY_LOOK_AND_RELATIVE_MOVE,
    ENTITY_TELEPORT,
    ENTITY_HEAD_LOOK,
    ENTITY_STATUS,
    ATTACH_ENTITY,
    ENTITY_METADATA,
    ENTITY_EFFECT,
    REMOVE_ENTITY_EFFECT,
    SET_EXPERIENCE,
    ENTITY_PROPERTIES,
    CHUNK_DATA,
    MULTI_BLOCK_CHANGE,
    BLOCK_CHANGE,
    BLOCK_ACTION,
    BLOCK_BREAK_ANIMATION,
    MAP_CHUNK_BULK,
    EXPLOSION,
    EFFECT,
    SOUND_EFFECT,
    PARTICLE,
    CHANGE_GAME_STATE,
    SPAWN_GLOBAL_ENTITY,
    OPEN_WINDOW,
    CLOSE_WINDOW,
    SET_SLOT,
    WINDOW_ITEMS,
    WINDOW_PROPERTY,
    CONFIRM_TRANSACTION,
    UPDATE_SIGN,
    MAPS,
    UPDATE_BLOCK_ENTITY,
    SIGN_EDITOR_OPEN,
    STATISTICS,
    PLAYER_LIST_ITEM,
    PLAYER_ABILITIES,
    TAB_COMPLETE,
    SCOREBOARD_OBJECTIVE,
    UPDATE_SCORE,
    DISPLAY_SCOREBOARD,
    TEAMS,
    PLUGIN_MESSAGE,
    DISCONNECT
}
